package com.company;

public class Satnik {

    private String nazev;
    private Obleceni[] obleceni;
    private int pocetKusuObleceni;

    public Satnik(String nazev, Obleceni[] obleceni) {
        this.nazev = nazev;
        this.obleceni = obleceni;
        this.pocetKusuObleceni = 0;
    }

    public void vlozObleceni(Obleceni z){
        obleceni[pocetKusuObleceni] = z;
        pocetKusuObleceni++;
    }

    public void najdiNejdrazsi(){
        int nejdrazsi = 0;
        int index = 0;
        for (int i = 0; i < obleceni.length; i++){
            if(obleceni[i].getCena() > nejdrazsi){
                nejdrazsi = obleceni[i].getCena();
                index = i;
            }
        }
        System.out.println("Nejdrazsi je obleceni: " + obleceni[index].getNazev());
    }

    public void najdiObleceniPodleBarvy(String barva){
        for (int i = 0; i < obleceni.length; i++){
            if(barva == obleceni[i].getBarva()){
                System.out.println("Obleceni " + obleceni[i].getNazev() + " ma stejnou barvu.");
            }
        }
    }

    public void vypisObleceni(){
        for (int i = 0; i < obleceni.length; i++){
            System.out.print(obleceni[i].getNazev() + " ");
        }
        System.out.println();
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public Obleceni[] getObleceni() {
        return obleceni;
    }

    public void setObleceni(Obleceni[] obleceni) {
        this.obleceni = obleceni;
    }

    public int getPocetKusuObleceni() {
        return pocetKusuObleceni;
    }

    public void setPocetKusuObleceni(int pocetKusuObleceni) {
        this.pocetKusuObleceni = pocetKusuObleceni;
    }
}
