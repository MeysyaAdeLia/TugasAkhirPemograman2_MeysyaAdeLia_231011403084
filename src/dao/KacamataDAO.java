/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Kacamata;

public class KacamataDAO {

    public boolean insert(Kacamata k){

        try{

            Connection conn =
                    Koneksi.getConnection();

            String sql =
            "INSERT INTO kacamata VALUES(?,?,?,?)";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1,k.getKode());
            ps.setString(2,k.getNama());
            ps.setString(3,k.getUkuranLensa());
            ps.setDouble(4,k.getHarga());

            return ps.executeUpdate()>0;

        }catch(SQLException e){

            System.out.println(e);

            return false;
        }
    }

    public boolean update(Kacamata k){

        try{

            Connection conn =
                    Koneksi.getConnection();

            String sql =
            "UPDATE kacamata "
            + "SET nama=?, ukuran_lensa=?, harga=? "
            + "WHERE kode=?";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1,k.getNama());
            ps.setString(2,k.getUkuranLensa());
            ps.setDouble(3,k.getHarga());
            ps.setString(4,k.getKode());

            return ps.executeUpdate()>0;

        }catch(SQLException e){

            System.out.println(e);

            return false;
        }
    }

    public boolean delete(String kode){

        try{

            Connection conn =
                    Koneksi.getConnection();

            String sql =
            "DELETE FROM kacamata "
            + "WHERE kode=?";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1,kode);

            return ps.executeUpdate()>0;

        }catch(SQLException e){

            System.out.println(e);

            return false;
        }
    }
}