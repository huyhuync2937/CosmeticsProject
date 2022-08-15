/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import DAO.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author DELL
 */
@WebServlet(name = "AdminUpdateProduct", urlPatterns = {"/AdminUpdateProduct"})

public class AdminUpdateProduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        con.LoatProductHaveDetail();
        Product product = new Product();
        int id = Integer.parseInt(request.getParameter("productIdUpdate"));
        System.out.println(id);
        for (Product pr : con.listDetailProduct) {
            if (pr.getProductID() == id) {
                product = pr;
            }
        }
        request.setAttribute("dateAdd", product.getDateAdd());

        request.setAttribute("productUpdate", product);
        request.getRequestDispatcher("view/Admin_UpdateProduct.jsp").forward(request, response);
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

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            int importPrice = Integer.parseInt(request.getParameter("ImportPrice"));
            int sellPrice = Integer.parseInt(request.getParameter("SellPrice"));
            int numberOfInvest = Integer.parseInt(request.getParameter("stock"));

            String date = request.getParameter("dateAdd");

            SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
            Date dateAdd = format.parse(request.getParameter("dateAdd"));

            String brand = request.getParameter("Brand");
            String origin = request.getParameter("Origin");
            String description = request.getParameter("description");
            String type = request.getParameter("category");
            Product product = new Product(id, name, importPrice, sellPrice, numberOfInvest, dateAdd, brand, origin, description, type);

            con.updateProduct(product,date);
            con.updateProductDetail(product);
            request.setAttribute("dateAdd", date);
            request.setAttribute("productUpdate", product);
            request.getRequestDispatcher("view/Admin_UpdateProduct.jsp").forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(AdminUpdateProduct.class.getName()).log(Level.SEVERE, null, ex);
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
