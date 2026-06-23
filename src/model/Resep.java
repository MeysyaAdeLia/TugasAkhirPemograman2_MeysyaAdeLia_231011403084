/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Resep {

    private int idResep;
    private String kodeKacamata;
    private String dokter;
    private String diagnosa;
    private String tanggalResep;

    public int getIdResep() {
        return idResep;
    }

    public void setIdResep(int idResep) {
        this.idResep = idResep;
    }

    public String getKodeKacamata() {
        return kodeKacamata;
    }

    public void setKodeKacamata(String kodeKacamata) {
        this.kodeKacamata = kodeKacamata;
    }

    public String getDokter() {
        return dokter;
    }

    public void setDokter(String dokter) {
        this.dokter = dokter;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    public String getTanggalResep() {
        return tanggalResep;
    }

    public void setTanggalResep(String tanggalResep) {
        this.tanggalResep = tanggalResep;
    }
}
