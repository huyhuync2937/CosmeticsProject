/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerProduct;

import DAO.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Model.*;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author DELL
 */
@WebServlet(name = "SearchProductByHearder", urlPatterns = {"/SearchProductByHearder"})

public class SearchProductByHearder extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        HttpSession ses = request.getSession();
        String type = ses.getAttribute("type").toString();
        ArrayList<Product> listProductSearch = new ArrayList<>();
        if (type.equals("0")) {
            String stringSearch = ses.getAttribute("stringSearch").toString();

            con.LoatProduct();

            for (Product pr : con.listProduct) {
                if (pr.getProductName().contains(stringSearch)) {
                    listProductSearch.add(pr);
                }
            }
            con.listProduct = listProductSearch;
//            con.LoatProductBySearch(stringSearch);
        } else {
//            String typeName = ses.getAttribute("typeName").toString().replaceAll(" ", "").trim();
            int typeId = Integer.parseInt(ses.getAttribute("typeID").toString());
            con.LoatProductHaveDetail();
            for (Product pr : con.listDetailProduct) {
                if (pr.getTypeID() == typeId) {
                    listProductSearch.add(pr);
                }

            }
            con.listProduct = listProductSearch;
//            con.LoatProductCategory(typeID);
        }

        int index = 1;
        if (request.getParameter("index") != null) {

            try {
                index = Integer.parseInt(request.getParameter("index"));
                if (index <= 0) {
                    index = 1;
                }
            } catch (Exception e) {
                index = 1;
            }
        }
        int numberRecordInPage = 6;
        if (request.getParameter("numberRecordInPage") != null) {
            try {
                numberRecordInPage = Integer.parseInt(request.getParameter("numberRecordInPage"));
                if (numberRecordInPage <= 0) {
                    numberRecordInPage = 6;

                }
            } catch (Exception e) {
                numberRecordInPage = 6;
            }
        }
        int totalPage = con.getListProduct().size() / numberRecordInPage
                + (con.getListProduct().size() % numberRecordInPage != 0 ? 1 : 0);
        if (index > totalPage) {
            index = 1;
        }
        int start = (index - 1) * numberRecordInPage;
        int end = index * numberRecordInPage - 1;
        if (end > con.getListProduct().size()) {
            end = con.getListProduct().size() - 1;
        }
        request.setAttribute("start", start);
        request.setAttribute("end", end);
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("nrip", numberRecordInPage);
        request.setAttribute("page", index);
        int pageStart = index - 2;
        int pageEnd = index + 2;
        if (pageStart <= 0) {
            pageStart = 1;
        }
        if (pageEnd > totalPage) {
            pageEnd = totalPage;
        }
        boolean first = true;
        boolean last = true;
        if (index == pageStart) {
            first = false;
        }
        if (index == pageEnd) {
            last = false;
        }
        request.setAttribute("first", first);
        request.setAttribute("last", last);

        request.setAttribute("pageStart", pageStart);
        request.setAttribute("pageEnd", pageEnd);
        request.setAttribute("productSearch", con);
        request.getRequestDispatcher("view/OurShop.jsp").forward(request, response);

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
