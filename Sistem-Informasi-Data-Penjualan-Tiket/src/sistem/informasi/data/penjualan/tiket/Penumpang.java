/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.penjualan.tiket;

import java.util.ArrayList;

/**
 *
 * @author KURNIA
 */
public class Penumpang {
    private String id_penumpang;
    private String nama;
    private ArrayList<Tiket> tiket;

    public Penumpang(String id_penumpang, String nama) {
        this.id_penumpang = id_penumpang;
        this.nama = nama;
        tiket = new ArrayList<>();
    }

    public String getId_penumpang() {
        return id_penumpang;
    }

    public void setId_penumpang(String id_penumpang) {
        this.id_penumpang = id_penumpang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Tiket getTiket(int x) {
        return tiket.get(x);
    }

    public void setTiket(Tiket tiket) {
        this.tiket.add(this.tiket.size(), tiket);
    }
}
