/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.penjualan.tiket;

/**
 *
 * @author Herica Bunga M (1301154572) IF-39-12
 */
public class Gerbong {
    private String kode;
    private String jenis;

    public Gerbong(String kode) {
        this.kode = kode;
    }

    public Gerbong(String kode, String jenis) {
        this.kode = kode;
        this.jenis = jenis;
        //gerbong = new ArrayList<>();
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String setJenis(String jenis) {
        if (jenis.equals("Exc")) {
            return ("Executive");
        }
        else if (jenis.equals("Bis")) {
            return ("Business");
        }
        else if (jenis.equals("Eco")) {
            return ("Economy");
        } else {
            return ("Jenis Gerbong Salah");
        }
    }

    @Override
    public String toString() {
        return "Info Gerbong: " + "\n Kode Gerbong: " + kode + "\n Jenis Gerbong: " + setJenis(jenis);
    }
    
}
