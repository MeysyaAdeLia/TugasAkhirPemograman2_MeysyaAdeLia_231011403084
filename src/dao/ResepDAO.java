/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Resep;

public class ResepDAO {

    public boolean insert(Resep r){

        try{

            Connection conn =
                    Koneksi.getConnection();

            String sql =
            "INSERT INTO resep "
            + "(kode_kacamata,dokter,diagnosa,tanggal_resep) "
            + "VALUES(?,?,?,?)";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1,r.getKodeKacamata());
            ps.setString(2,r.getDokter());
            ps.setString(3,r.getDiagnosa());
            ps.setString(4,r.getTanggalResep());

            return ps.executeUpdate()>0;

        }catch(SQLException e){

            e.printStackTrace();

            return false;
        }
    }

    public boolean update(Resep r){

        try{

            Connection conn =
                    Koneksi.getConnection();

            String sql =
            "UPDATE resep SET "
            + "kode_kacamata=?, "
            + "dokter=?, "
            + "diagnosa=?, "
            + "tanggal_resep=? "
            + "WHERE id_resep=?";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1,r.getKodeKacamata());
            ps.setString(2,r.getDokter());
            ps.setString(3,r.getDiagnosa());
            ps.setString(4,r.getTanggalResep());
            ps.setInt(5,r.getIdResep());

            return ps.executeUpdate()>0;

        }catch(SQLException e){

            e.printStackTrace();

            return false;
        }
    }

    public boolean delete(int id){

        try{

            Connection conn =
                    Koneksi.getConnection();

            String sql =
            "DELETE FROM resep "
            + "WHERE id_resep=?";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setInt(1,id);

            return ps.executeUpdate()>0;

        }catch(SQLException e){

            e.printStackTrace();

            return false;
        }
    }
}
