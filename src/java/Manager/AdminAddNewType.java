/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import DAO.ProductDAO;
import Model.Category;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "AdminAddNewType", urlPatterns = {"/AdminAddNewType"})
public class AdminAddNewType extends HttpServlet {

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
        con.LoatCategory();
        ArrayList<Category> listType = new ArrayList<>();
        for (Category category : con.listCategory) {
            if (category.getParentId() == 0) {
                listType.add(category);
            }
        }
        request.setAttribute("listType", listType);
        request.getRequestDispatcher("view/Admin_AddNewCategory.jsp").forward(request, response);
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
        boolean check = true;

        String typeName = request.getParameter("typeNew");
        int parentId = Integer.parseInt(request.getParameter("categoryParent"));
        Category newType = new Category(typeName, parentId);
        con.LoatCategory();
        for (Category category : con.listCategory) {
            if (category.getTypeName().equals(typeName)) {
                check = false;
                break;
            }
        }
        if (check == true) {
            con.AddNewType(newType);
            doGet(request, response);

        } else {
            request.setAttribute("check2", false);

            request.setAttribute("mes2", "Type Exist");

            request.getRequestDispatcher("view/Admin_AddNewCategory.jsp").forward(request, response);

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
