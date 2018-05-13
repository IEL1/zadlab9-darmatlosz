/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author Daria
 *
 */
public class Samochod {
    private String marka;
    private String nazwaSam;
    private int predkosc;
    private double cena;

   

    

    public String getMarka() {
        return marka;
    }

    public String getNazwaSam() {
        return nazwaSam;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public double getCena() {
        return cena;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setNazwaSam(String nazwaSam) {
        this.nazwaSam = nazwaSam;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    
    
}