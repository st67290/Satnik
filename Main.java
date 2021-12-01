package com.company;

public class Main {

    public static void main(String[] args) {

        Satnik satnik = new Satnik("Satnik", );
        Obleceni boty = new Obleceni("Boty", 12, "modra");
        Obleceni dziny = new Obleceni("Dziny", 13, "modra");
        Obleceni triko = new Obleceni("Triko", 42, "cervena");
        Obleceni bunda = new Obleceni("Bunda", 55, "zluta");

        satnik.vlozObleceni(boty);
        satnik.vlozObleceni(dziny);
        satnik.vlozObleceni(triko);
        satnik.vlozObleceni(bunda);

        satnik.vypisObleceni();
        satnik.najdiNejdrazsi();
        satnik.najdiObleceniPodleBarvy("modra");
        satnik.najdiObleceniPodleBarvy("zelena");
        satnik.najdiObleceniPodleBarvy("zluta");

    }
}
