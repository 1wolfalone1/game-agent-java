/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.game;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.naming.NamingException;
import utils.DBHelper;

/**
 *
 * @author ASUS
 */
public class GameDAO {
    public ArrayList<GameDTO> filterGameByName(String tenTC) throws SQLException, NamingException{
        ArrayList<GameDTO> list = new ArrayList<>();
        Connection con = DBHelper.makeConnectDB();
        if(con != null){
            String sql = "select maTC, tenTC, loaiTC, maNPH, maBST, giaTien, ngayXuatBan from tblTroChoi "
                    + "where tenTC like ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, "%" + tenTC + "%");
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                String maTC = rs.getString("maTC");
                tenTC = rs.getString("tenTC");
                String loaiTC = rs.getString("loaiTC");
                String maNPH = rs.getString("maNPH");
                String maBST = rs.getString("maBST");
                double giaTien = rs.getFloat("giaTien");
                Date ngayXuatBan = rs.getDate("ngayXuatBan");
                list.add(new GameDTO(maTC, tenTC, loaiTC, maNPH, maBST, giaTien, ngayXuatBan));
            }
            con.close();
        }
        return list;
    }
    
    public HashMap<GameDTO, Integer> filterGameByListID(HashMap<String, Integer> list) throws SQLException, NamingException{
        HashMap<GameDTO, Integer> result = new HashMap<>();
        if(list == null || list.isEmpty()){
            return null;
        }
        Connection con = DBHelper.makeConnectDB();
        
        try {
            String sql = "select maTC, tenTC, loaiTC, maNPH, maBST, giaTien, ngayXuatBan from tblTroChoi "
                    + "where maTC in (";
            for (int i = 0; i < list.size(); i++) {
                sql = sql + "?,";
            }
            sql = sql.substring(0, sql.length() - 1);
            sql = sql + ")";
            PreparedStatement stm = con.prepareStatement(sql);
            int count = 1;
            for (String key : list.keySet()) {
                stm.setString(count, key);
                count++;
            }
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                String maTC = rs.getString("maTC");
                String tenTC = rs.getString("tenTC");
                String loaiTC = rs.getString("loaiTC");
                String maNPH = rs.getString("maNPH");
                String maBST = rs.getString("maBST");
                double giaTien = rs.getFloat("giaTien");
                Date ngayXuatBan = rs.getDate("ngayXuatBan");
                int quantity = list.get(maTC);
                result.put(new GameDTO(maTC, tenTC, loaiTC, maNPH, maBST, giaTien, ngayXuatBan), quantity);
            }
        } finally {
            if(con != null){
                con.close();
            }
        }
        
        return result;
    }
}
