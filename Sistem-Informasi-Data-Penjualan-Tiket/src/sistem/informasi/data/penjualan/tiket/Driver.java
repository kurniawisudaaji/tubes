/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.penjualan.tiket;

/**
 *
 * @author USER
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplikasi a = new Aplikasi();
        Gerbong g = new Gerbong("kode","jenis");
        g.getKode();
        Kereta k = new Kereta("nama", "jenis","jurusan");
        k.addDaftarGerbong(g);
        Stasiun s1 = new Stasiun("nama","alamat","daerah_operasi");
        s1.setKereta(k);
        Stasiun s2 = new Stasiun("nama","alamat","daerah_operasi");
        s2.setKereta(k);
        Rute r = new Rute(s1,s2);
        Tiket t = new Tiket("kode_tiket",k.getNama(),k.getJenis(),"tanggal",r,100000);
        Penumpang p = new Penumpang("id_penumpang","nama");
        p.setTiket(t);
        Pembayaran pe = new Pembayaran("id");
        pe.setPenumpang(p);
        
        a.setDaftarGerbong(g);
        a.setKereta(k);
        a.setDaftarStasiun(s1);
        a.setDaftarStasiun(s2);
        a.setDaftarRute(r);
        a.setDaftarTiket(t);
        a.setDaftarPenumpang(p);
        a.setDaftarPembayaran(pe);
        
    }
    
}
