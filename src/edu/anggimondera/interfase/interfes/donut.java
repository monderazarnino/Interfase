/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.anggimondera.interfase.interfes;



/**
 *
 * @author Solskjaer
 */
public class donut implements bentuk{
    
    double phr=3.14;
    double luas;
    double jarijari;
    
    public void jarijari(double jarijari){
        this.jarijari=jarijari;
    }
    
    @Override
    public void hitung() {
       luas = phr * jarijari*jarijari;
    }

    @Override
    public void cetak() {
        System.out.println("Luas dari lingkaran :"+luas);
        
    }


}
