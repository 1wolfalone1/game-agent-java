/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.account;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import model.user.UserDAO;
import utils.DBHelper;

/**
 *
 * @author ASUS
 */
public class AccountDAO {

    public AccountDTO getAccountByLogin(String username, String password) throws SQLException, NamingException {
        AccountDTO account = null;

        Connection con = DBHelper.makeConnectDB();
        if (con != null) {
            String sql = "select maTK, matKhau, ngayTao, email, soDu, soCMND, role from tblTaiKhoan "
                    + "where maTK = ? and matKhau = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                String maTK = rs.getString("maTK");
                String matKhau = rs.getString("matKhau");
                Date ngayTao = rs.getDate("ngayTao");
                String email = rs.getString("maTK");
                double soDu = rs.getFloat("soDu");
                String soCMND = rs.getString("soCMND");
                String role = rs.getString("role");
                account = new AccountDTO(maTK, matKhau, ngayTao, email, soDu, soCMND, role);
            }
        }

        return account;
    }

    public void insertNewAccount(String maTK, String tenKH, String matKhau, String soCMND,
            String email, String gioiTinh, String ngaySinh, String maVung) throws SQLException, NamingException {
        Connection con = DBHelper.makeConnectDB();
        try {
            con.setAutoCommit(false);
            UserDAO dao = new UserDAO();
            dao.insertUserWithAccount(con, soCMND, tenKH, ngaySinh, gioiTinh, maVung);
            String sql = "insert into tblTaiKhoan(maTK, matKhau, ngayTao, email, soDu, soCMND, role) values(?,?,getdate(),?,0,?,USER)";

            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, maTK);
            stm.setString(2, matKhau);
            stm.setString(3, email);
            stm.setString(4, soCMND);
            int count = stm.executeUpdate();

                con.commit();

        } catch (SQLException e) {
            con.rollback();
            throw e;
        } finally {
            if(con != null){
                con.close();
            }
        }
    }

}
