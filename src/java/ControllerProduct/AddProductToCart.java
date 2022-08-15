/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerProduct;

import DAO.ProductDAO;
import Model.Bill;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
@WebServlet(name = "AddProductToCart", urlPatterns = {"/AddProductToCart"})

public class AddProductToCart extends HttpServlet {

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
        int customerId;
        String type = request.getParameter("type");

        if (ses.getAttribute("customerId") == null) {
            request.getRequestDispatcher("LoginAccount").forward(request, response);
        }
        if (type != null && type.equals("1")) {
            customerId = Integer.parseInt(ses.getAttribute("customerId").toString());
            Date dateToday = new Date();

            int productId = Integer.parseInt(request.getParameter("AddCartProductID"));
//            Product product = con.LoatProduct(productId);
            con.LoatProduct();
            Product product = new Product();
            for (Product pr : con.listProduct) {
                if (pr.getProductID() == productId) {
                    product = pr;
                }
            }
            Bill newBill;
            String quantity = request.getParameter("quantity");
            if (quantity == null) {
                newBill = new Bill(customerId, product.getProductName(), productId, (int) product.getSellPrice(), 1, dateToday, false);
                
            } else {
                int quantityCart = Integer.parseInt(quantity);
                newBill = new Bill(customerId, product.getProductName(), productId, (int) product.getSellPrice(), quantityCart, dateToday, false);

            }

            con.AddProductToBill(newBill);
            response.sendRedirect("DisplayCart");
        }
        if (type != null && type.equals("0")) {
            int billID = Integer.parseInt(request.getParameter("billID"));
            con.DeleteProductCart(billID);

            response.sendRedirect("DisplayCart");

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
    ProductDAO con;

    @Override
    public void init(ServletConfig config) throws ServletException {
        con = new ProductDAO();
    }

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
