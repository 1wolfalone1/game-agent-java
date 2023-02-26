/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;
import utils.DBHelper;
import utils.MyUtils;

/**
 *
 * @author ASUS
 */
public class UserDAO {

    public UserDTO getUserByCmnd(String CMND) throws SQLException, NamingException {
        UserDTO user = null;
        Connection con = DBHelper.makeConnectDB();
        if (con != null) {
            String sql = "select soCMND, tenKH, ngaySinh, gioiTinh, maVung from tblKhachHang "
                    + "where soCMND = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, CMND);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                String tenKH = rs.getString("tenKH");
                Date ngaySinh = rs.getDate("ngaySinh");
                String gioiTinh = rs.getString("soCMND");
                String maVung = rs.getString("maVung");
                user = new UserDTO(CMND, tenKH, ngaySinh, gioiTinh, maVung);
            }
            con.close();

        }
        return user;
    }

    public void insertUserWithAccount(Connection con, String soCMND, String tenKH, String ngaySinh, String gioiTinh, String maVung) throws SQLException, NamingException {
        boolean status = true;
        if (con != null) {
            con.setAutoCommit(false);
            status = false;
        } else {
            con = DBHelper.makeConnectDB();
        }
        if (con != null) {
            String sql = "insert into tblKhachHang(soCMND, tenKH, ngaySinh, gioiTinh, maVung)"
                    + " values(?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, soCMND);
            stm.setString(2, tenKH);
            stm.setDate(3, MyUtils.utilDateToSqlDate(MyUtils.convertToDate(ngaySinh, "yyyy-MM-dd")));
            stm.setString(4, gioiTinh);
            stm.setString(5, maVung);
            stm.executeUpdate();
            if (status) {
                con.close();
            }
        }

    }
}
