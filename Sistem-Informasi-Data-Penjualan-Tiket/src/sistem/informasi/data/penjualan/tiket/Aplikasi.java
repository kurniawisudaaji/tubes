/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.penjualan.tiket;

import java.util.ArrayList;

/**
 *
 * @author Herica Bunga M (1301154572) IF-39-12
 */
public class Aplikasi {

    private ArrayList<Kereta> kereta;
    private ArrayList<Tiket> daftarTiket;
    private ArrayList<Gerbong> daftarGerbong;
    private ArrayList<Stasiun> daftarStasiun;
    private ArrayList<Rute> daftarRute;
    private ArrayList<Penumpang> daftarPenumpang;
    private ArrayList<Pembayaran> daftarPembayaran;

    public Aplikasi() {
        kereta = new ArrayList<>();
        daftarTiket = new ArrayList<>();
        daftarGerbong = new ArrayList<>();
        daftarStasiun = new ArrayList<>();
        daftarRute = new ArrayList<>();
        daftarPenumpang = new ArrayList<>();
        daftarPembayaran = new ArrayList<>();
    }
    
    

    public Kereta getKereta(int x) {
        return kereta.get(x);
    }

    public void setKereta(Kereta kereta) {
        this.kereta.add(this.kereta.size(), kereta);
    }

    public Tiket getDaftarTiket(int x) {
        return daftarTiket.get(x);
    }

    public void setDaftarTiket(Tiket daftarTiket) {
        this.daftarTiket.add(this.daftarTiket.size(), daftarTiket);
    }

    public Gerbong getDaftarGerbong(int x) {
        return daftarGerbong.get(x);
    }

    public void setDaftarGerbong(Gerbong daftarGerbong) {
        this.daftarGerbong.add(this.daftarGerbong.size(), daftarGerbong);
    }

    public Stasiun getDaftarStasiun(int x) {
        return daftarStasiun.get(x);
    }

    public void setDaftarStasiun(Stasiun daftarStasiun) {
        this.daftarStasiun.add(this.daftarStasiun.size(), daftarStasiun);
    }

    public Rute getDaftarRute(int x) {
        return daftarRute.get(x);
    }

    public void setDaftarRute(Rute daftarRute) {
        this.daftarRute.add(this.daftarRute.size(), daftarRute);
    }

    public Penumpang getDaftarPenumpang(int x) {
        return daftarPenumpang.get(x);
    }

    public void setDaftarPenumpang(Penumpang daftarPenumpang) {
        this.daftarPenumpang.add(this.daftarPenumpang.size(), daftarPenumpang);
    }

    public Pembayaran getDaftarPembayaran(int x) {
        return daftarPembayaran.get(x);
    }

    public void setDaftarPembayaran(Pembayaran daftarPembayaran) {
        this.daftarPembayaran.add(this.daftarPembayaran.size(), daftarPembayaran);
    }

    public void removeKereta(int k) {
        this.kereta.remove(k);
    }

    public void removeTiket(int t) {
        this.daftarTiket.remove(t);
    }

    public void removeStasiun(int s) {
        this.daftarStasiun.remove(s);
    }
    
    public void removeGerbong(int g) {
        this.daftarGerbong.remove(g);
    }
    
    public void removeRute(int r) {
        this.daftarRute.remove(r);
    }
    
    public void removePenumpang(int p) {
        this.daftarPenumpang.remove(p);
    }
}
