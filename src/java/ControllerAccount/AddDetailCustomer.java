/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAccount;

import DAO.AccountDAO;
import Model.Account;
import Model.DetailCustomer;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "AddDetailCustomer", urlPatterns = {"/AddDetailCustomer"})

public class AddDetailCustomer extends HttpServlet {

    AccountDAO con;

    @Override
    public void init(ServletConfig config) throws ServletException {
        con = new AccountDAO();

    }

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
        request.getRequestDispatcher("view/AddDetailCustomer.jsp").forward(request, response);

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
        request.getRequestDispatcher("view/AddDetailCustomer.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");

            int customerId = Integer.parseInt(request.getParameter("customerId"));

            String name = request.getParameter("name");
            String address = request.getParameter("address");

            SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
            Date birthday = format.parse(request.getParameter("birthday"));
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            boolean checkPhone = true;
            boolean checkEmail = true;
            con.LoatCustomer();
            for (Account account : con.listAccount) {

                if (account.getPhone().equals(phone)) {
                    checkPhone = false;
                    break;
                }
                if (account.getEmail().equals(email)) {
                    checkEmail = false;
                    break;
                }

            }

            if (checkEmail == false) {
                request.setAttribute("checkEmail", checkEmail);
                request.setAttribute("messEmail", "Email Exist");

            } else if (checkPhone == false) {
                request.setAttribute("checkPhone", checkPhone);

                request.setAttribute("messPhone", "Phone Exist");

            } else {
                DetailCustomer detailCustomer = new DetailCustomer(customerId, name, address, birthday, phone, email);
                con.AddDetailCustomer(detailCustomer);
                HttpSession ses = request.getSession();
                ses.setAttribute("customerId", customerId);
                ses.setAttribute("customerName", name);
                response.sendRedirect("DisplayNewProduct");
            }

        } catch (ParseException ex) {
            Logger.getLogger(AddDetailCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

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
