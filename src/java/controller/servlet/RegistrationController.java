/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.servlet;

import controller.filter.EnumAction;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.account.AccountDAO;
import model.account.RegistrationError;

/**
 *
 * @author ASUS
 */
public class RegistrationController extends HttpServlet {

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
        response.setCharacterEncoding("UTF-8");
        String url = EnumAction.REGISTER_JSP.getAction();
        RegistrationError error = new RegistrationError();
        try {
            String maTK = request.getParameter("accName");
            String tenKH = request.getParameter("name");
            String matKhau = request.getParameter("password");
            String soCMND = request.getParameter("ID");
            String email = request.getParameter("email");
            String gioiTinh = request.getParameter("gender");
            String ngaySinh = request.getParameter("birth_date");
            String maVung = request.getParameter("region");
            request.setAttribute("error", error);
            if (error.check(maTK, tenKH, matKhau, soCMND,
                    email, gioiTinh, ngaySinh, maVung)) {
                request.setAttribute("megg", "Try again!!!");
                request.setAttribute("error", error);
                log("1111111111");
            } else {
                AccountDAO dao = new AccountDAO();
                dao.insertNewAccount(maTK, tenKH, matKhau, soCMND, email, gioiTinh, ngaySinh, maVung);
                request.setAttribute("megg", "successful");
                log("22222222");
            }

        } catch (Exception e) {
            if (e.getMessage() != null) {
                if (e.getMessage().contains("PK__tblTaiKh__7A22625E2882E8EB")) {
                    error.setMaTK("Duplicated account!!! Try other!!!!");
                    request.setAttribute("error", error);
                }
                if (e.getMessage().contains("PK__tblKhach__C4EF4BE4ED13A232")) {
                    error.setSoCMND("ID card number already exists!!! Try other!!!!");
                    request.setAttribute("error", error);
                }
                if (e.getMessage().contains("UQ__tblTaiKh__AB6E6164E1D571DF")) {
                    error.setEmail("Email already register!!! Try other!!!");
                    request.setAttribute("error", error);
                }
                log(e.getMessage());
            }
            request.setAttribute("megg", "Try again!!!!!");

        } finally {

            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
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
