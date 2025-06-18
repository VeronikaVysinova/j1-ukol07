package cz.czechitas.ukol07;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.List;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {

    public static void main(String[] args) throws IOException {

        KnihaSluzba knihaSluzba = new KnihaSluzba();

       knihaSluzba.vypisSeznamVsechKnih();


//TODO
        //vytvorit metodu main, v teto metode vytvorit instanci tridy KnihaSluzba

        //vypise celkovy pocet knih v databazi




 // knihaSluzba.knihyOdAutora("Josef Čapek");

        //vypsat do konzole nazvy vsech knizek, ktere napsal Karel Capek
        //vypsat vsechny knihy vydane poprve v roce 1845. Vypis bude ve tvaru jmeno autora: nazev knihy
    }

}

// BONUS dodelat viz.zadani ukolu