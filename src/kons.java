/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boss
 */
    public class kons {
        private int ker;
        private int szav;
        private String nev;
        private String knev;
        private String part;
    
    public kons(String adat[]) {
        this.ker = Integer.parseInt(adat[0]);
        this.szav = Integer.parseInt(adat[1]);
        this.nev = adat[2];
        this.knev = adat[3];
        this.part = adat[4];
    }
    public String getKnev() {
        return knev;
    }

    public void setKnev(String knev) {
        this.knev = knev;
    }
    public int getKer() {
        return ker;
    }

    public void setKer(int ker) {
        this.ker = ker;
    }

    public int getSzav() {
        return szav;
    }

    public void setSzav(int szav) {
        this.szav = szav;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }
}

