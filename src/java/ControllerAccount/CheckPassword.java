/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAccount;

import DAO.AccountDAO;
import Model.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
@WebServlet(name = "CheckPassword", urlPatterns = {"/CheckPassword"})
public class CheckPassword extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CheckPassword</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CheckPassword at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    AccountDAO con;

    @Override
    public void init(ServletConfig config) throws ServletException {
        con = new AccountDAO();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession ses = request.getSession();
        int customerId = Integer.parseInt(ses.getAttribute("customerId").toString());
        con.LoatCustomer();
        boolean check = false;
        String pass = request.getParameter("password");

        Account accountCheck = new Account();
        for (Account account : con.listAccount) {
            if (account.getCustomerId() == customerId) {
                accountCheck = account;
                break;
            }

        }
        String type = request.getParameter("type");

        System.out.println(type);

        if (type != null & type.equals("0")) {
            if (accountCheck.getPassAccount().equals(pass)) {
                check = true;
            }
            if (check == true) {

                request.setAttribute("account", accountCheck);
                request.getRequestDispatcher("view/Customer_DisplayEmail.jsp").forward(request, response);
            } else {
                request.setAttribute("type", "0");

                String email = request.getParameter("email");
                request.setAttribute("email", email);
                request.getRequestDispatcher("view/Customer_checkPassword.jsp").forward(request, response);

            }

        }
        if (type != null & type.equals("1")) {
            if (accountCheck.getPassAccount().equals(pass)) {
                check = true;
            }
            if (check == true) {
                request.setAttribute("account", accountCheck);
                request.getRequestDispatcher("view/Customer_DisplayPhone.jsp").forward(request, response);
            } else {
                String phone = request.getParameter("phone");
                request.setAttribute("type", "1");
                request.setAttribute("phone", phone);
                request.getRequestDispatcher("view/Customer_checkPassword.jsp").forward(request, response);

            }

        }

//       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
