/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.anggimondera.interfase;


import edu.anggimondera.interfase.interfes.*;
/**
 *
 * @author Solskjaer
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        donut d = new donut();
        d.jarijari(5);
        d.hitung();
        d.cetak();
        
        segitiga s = new segitiga();
        s.alas(2);
        s.tinggi(5);
        s.hitung();
        s.cetak();
        
        persegi p = new persegi();
        p.sisi(7);
        p.hitung();
        p.cetak();
        
        persegipanjang pp = new persegipanjang();
        pp.persegipanjang(5, 2);
        pp.hitung();
        pp.cetak();
        
    }
}
