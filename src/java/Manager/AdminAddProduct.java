/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import DAO.ProductDAO;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author DELL
 */
@WebServlet(name = "AdminAddProduct", urlPatterns = {"/AdminAddProduct"})

public class AdminAddProduct extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("view/Admin_AddNewProduct.jsp").forward(request, response);
    }
    ProductDAO con;

    @Override
    public void init(ServletConfig config) throws ServletException {
        con = new ProductDAO();
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
        try {
            String productName = request.getParameter("name");
            int importPrice = Integer.parseInt(request.getParameter("ImportPrice"));
            int sellPrice = Integer.parseInt(request.getParameter("SellPrice"));
            SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
            Date dateAdd = format.parse(request.getParameter("dateAdd"));
            int number = Integer.parseInt(request.getParameter("stock"));

            Product newProduct = new Product(productName, importPrice, sellPrice, dateAdd, number);
            con.AddNewProduct(newProduct);
            con.LoatProduct();
            int newProductID = con.listProduct.get(con.listProduct.size() - 1).getProductID();

            String description = request.getParameter("description");
            String TypeName = request.getParameter("category");
            String brand = request.getParameter("Brand");
            String origin = request.getParameter("Origin");
            System.out.println(newProductID + " " + description + " " + TypeName + " " + brand + " " + origin);

            con.AddDetailNewProduct(newProductID, brand, origin, description, TypeName);

            request.getRequestDispatcher("view/Admin_AddNewProduct.jsp").forward(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(AdminAddProduct.class.getName()).log(Level.SEVERE, null, ex);
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
