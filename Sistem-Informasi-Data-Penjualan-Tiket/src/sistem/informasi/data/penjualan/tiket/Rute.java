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
public class Rute {
    private Stasiun stasiun1;
    private Stasiun stasiun2;

    public Rute(Stasiun stasiun1, Stasiun stasiun2) {
        this.stasiun1 = stasiun1;
        this.stasiun2 = stasiun2;
    }

    public Stasiun getStasiun1() {
        return stasiun1;
    }

    public void setStasiun1(Stasiun stasiun1) {
        this.stasiun1 = stasiun1;
    }

    public Stasiun getStasiun2() {
        return stasiun2;
    }

    public void setStasiun2(Stasiun stasiun2) {
        this.stasiun2 = stasiun2;
    }
    
    
    
    
    
}
