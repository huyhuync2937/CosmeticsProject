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
@WebServlet(name = "ChangeInformation", urlPatterns = {"/ChangeInformation"})
public class ChangeInformation extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String type = request.getParameter("type");
        HttpSession ses = request.getSession();
        int customerId = Integer.parseInt(ses.getAttribute("customerId").toString());

        if (type.equals("0")) {
            String email = request.getParameter("email");
            request.setAttribute("email", email);
        } else {
            String phone = request.getParameter("phone");
            request.setAttribute("phone", phone);

        }

        request.setAttribute("type", type);
        request.getRequestDispatcher("view/Customer_checkPassword.jsp").forward(request, response);

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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession ses = request.getSession();
        int customerId = Integer.parseInt(ses.getAttribute("customerId").toString());
        try {
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            String birthday = request.getParameter("birthday");

            String date = request.getParameter("birthday");

            SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
            Date birthdayUpdate = format.parse(request.getParameter("birthday"));
            Account updateAccount = new Account(name, address, birthdayUpdate, customerId);
            con.UpdateInformationCustomer(updateAccount, date);

            request.getRequestDispatcher("DisplayInformationCustomer").forward(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(ChangeInformation.class.getName()).log(Level.SEVERE, null, ex);
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
