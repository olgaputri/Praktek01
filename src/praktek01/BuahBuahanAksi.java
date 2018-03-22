/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author ASUS
 */
public class BuahBuahanAksi {
    public static void main(String[] args) {
        BuahBuahan Mangga = new BuahBuahan();
        
        Mangga.bentuknya="Lonjong";
        Mangga.rasanya="Manis";
        Mangga.warnanya="Hijau";
        Mangga.ukurannya="Sedang";
        Mangga.kandungannya="Vitamin C";
        Mangga.caramenanamnya="Tanam Bijinya";
        Mangga.cetakInfo();
        
        BuahBuahan Pisang = new BuahBuahan();
        
         Pisang.bentuknya="Lonjong Memanjang";
        Pisang.rasanya="Manis";
        Pisang.warnanya="Kuning";
        Pisang.ukurannya="Kecil";
        Pisang.kandungannya="Vitamin B&C";
        Pisang.caramenanamnya="Tanam Bibitnya";
        Pisang.cetakInfo();
        BuahBuahan Kelapa = new BuahBuahan();
        
         Kelapa.bentuknya="Bundar";
        Kelapa.rasanya="Manis";
        Kelapa.warnanya="Hijau Daging Putih";
        Kelapa.ukurannya="Besar";
        Kelapa.kandungannya="Vitamin A,B&C";
        Kelapa.caramenanamnya="Tanam Tunasnya";
        Kelapa.cetakInfo();
    }
    
}
