/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerProduct;

import DAO.ProductDAO;
import Model.Bill;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "DisplayCart", urlPatterns = {"/DisplayCart"})

public class DisplayCart extends HttpServlet {
    
    ProductDAO con;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        con = new ProductDAO();
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
        HttpSession ses = request.getSession();
        
        if (ses.getAttribute("customerId") == null) {
            request.getRequestDispatcher("LoginAccount").forward(request, response);
        } else {
            int customerId = Integer.parseInt(ses.getAttribute("customerId").toString());
            con.LoatBill();
            ArrayList<Bill> listBillToCart = new ArrayList<>();
            int priceBill = 0;
            for (Bill bill : con.listBill) {
                int totalBill = bill.getQuantity() * bill.getPrice();
                bill.setTotal(totalBill);
                if (bill.getCustomerID() == customerId) {
                    listBillToCart.add(bill);
                }
            }
            for (Bill bill : listBillToCart) {
                if (bill.getStatus() == false) {
                    priceBill = priceBill + (bill.getPrice() * bill.getQuantity());
                    
                }
            }
            request.setAttribute("priceBill", priceBill);
            request.setAttribute("listBill", listBillToCart);
            request.getRequestDispatcher("view/Cart.jsp").forward(request, response);
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
