/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerProduct;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ProcessSearchAndPaging", urlPatterns = {"/ProcessSearchAndPaging"})
public class ProcessSearchAndPaging extends HttpServlet {

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
//        response.setContentType("text/html;charset=UTF-8");
//        request.getRequestDispatcher("SearchProductByHearder").forward(request, response);
        HttpSession ses = request.getSession();
        String stringSearch = request.getParameter("stringSearch");
        String type = request.getParameter("type");
        String typeID = request.getParameter("typeID");
        if (type != null && type.equals("1")) {
            ses.setAttribute("type", type);
            ses.setAttribute("typeID", typeID);
            request.getRequestDispatcher("SearchProductByHearder").forward(request, response);

        } else {
            ses.setAttribute("type", "0");

            ses.setAttribute("stringSearch", stringSearch);
            request.getRequestDispatcher("SearchProductByHearder").forward(request, response);

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
        HttpSession ses = request.getSession();
        String stringSearch = request.getParameter("stringSearch");
        String type = request.getParameter("type");
        String typeName = request.getParameter("typeName");
        if (type != null && type.equals("1")) {
            ses.setAttribute("type", type);
            ses.setAttribute("stringSearch", typeName);
        } else {
            ses.setAttribute("type", "0");

            ses.setAttribute("stringSearch", stringSearch);
        }

        request.getRequestDispatcher("SearchProductByHearder").forward(request, response);
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
