/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.region;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import utils.DBHelper;

/**
 *
 * @author ASUS
 */
public class RegionDAO {

    public List<RegionDTO> getAllRegion() throws SQLException, NamingException {
        List<RegionDTO> list = new ArrayList<>();
        Connection con = DBHelper.makeConnectDB();
        if (con != null) {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select maVung, tenVung, moTa from tblVung");
            while (rs.next()) {
                String maVung = rs.getString("maVung");
                String tenVung = rs.getString("tenVung");
                String moTa = rs.getString("moTa");
                list.add(new RegionDTO(maVung, tenVung, moTa));
            }
            con.close();

        }

        return list;
    }
}
