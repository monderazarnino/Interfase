/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.anggimondera.interfase.interfes;

/**
 *
 * @author Solskjaer
 */
public class persegi implements bentuk{
    
    double luas;
    int sisi;
    
    public void sisi(int sisi){
        this.sisi=sisi;
    }

    @Override
    public void hitung() {
        luas = sisi*sisi;
        
    }

    @Override
    public void cetak() {
        System.out.println("Luas dari persegi :"+luas);
       
    }
    
    
}
