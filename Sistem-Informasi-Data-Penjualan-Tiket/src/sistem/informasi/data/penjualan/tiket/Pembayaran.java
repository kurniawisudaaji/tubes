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
public class Pembayaran {
    private String id_pembayaran;
    private ArrayList<Penumpang> penumpang;

    public Pembayaran(String id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
        penumpang = new ArrayList<>();
    }

    public String getId_pembayaran() {
        return id_pembayaran;
    }

    public void setId_pembayaran(String id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    public Penumpang getPenumpang(int x) {
        return penumpang.get(x);
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang.add(this.penumpang.size(), penumpang);
    }    

}
