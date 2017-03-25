/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.penjualan.tiket;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Stasiun {
    private String nama;
    private String alamat;
    private String daerah_beroperasi;
    private ArrayList<Kereta> kereta;

    public Stasiun(String nama, String alamat, String daerah_beroperasi) {
        this.nama = nama;
        this.alamat = alamat;
        this.daerah_beroperasi = daerah_beroperasi;
        kereta = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDaerah_beroperasi() {
        return daerah_beroperasi;
    }

    public void setDaerah_beroperasi(String daerah_beroperasi) {
        this.daerah_beroperasi = daerah_beroperasi;
    }

    public Kereta getKereta(int x) {
        return kereta.get(x);
    }

    public void setKereta(Kereta kereta) {
        this.kereta.add(this.kereta.size(), kereta);
    }
    
}


