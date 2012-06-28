/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.anggimondera.interfase.interfes;

/**
 *
 * @author Solskjaer
 */
public class segitiga implements bentuk{
    
    double alas;
    double tinggi;
    double luas ;
    
    public void alas(double alas){
       this.alas=alas;
    }
    
    public void tinggi(double tinggi){
        this.tinggi=tinggi;
    }
    
    @Override
    public void hitung() {
        luas = alas * tinggi;
    }

    @Override
    public void cetak() {
        System.out.println("Luas dari segitiga :"+luas);
        
    }
    
    
}
