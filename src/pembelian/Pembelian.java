/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembelian;
/**
 *
 * @author Anri
 */
public class Pembelian {

    String namabarang;
    int kode, harga, stok, jumlahbeli, subtotal;

    public void setKode(int kode) {
        this.kode = kode;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setJumlahbeli(int jumlahbeli) {
        this.jumlahbeli = jumlahbeli;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public int getKode() {
        return kode;
    }

    public int getHarga() {
        hitungsubtotal();
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public int getJumlahbeli() {
        hitungsubtotal();
        return jumlahbeli;
    }

    public int getSubtotal() {
        hitungsubtotal();
        return subtotal;
    }

    private void hitungsubtotal() {
        subtotal = harga - jumlahbeli;
    }

}

