/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.anggimondera.interfase.interfes;

/**
 *
 * @author Solskjaer
 */
public class persegipanjang implements bentuk{
    
    int p, l;
    double luas;
    
    public void persegipanjang(int p, int l){
        this.p=p;
        this.l=l;
    }
    
    @Override
    public void hitung() {
        luas = p * l ;
    }

    @Override
    public void cetak() {
        System.out.println("Luas dari persegipanjang :"+luas);
    }
    
    
}
