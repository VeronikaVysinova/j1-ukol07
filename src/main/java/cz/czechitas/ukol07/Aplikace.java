package cz.czechitas.ukol07;

import java.io.IOException;
import java.sql.SQLOutput;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {
    public static void main(String[] args) throws IOException {

        KnihaSluzba knihaSluzba = new KnihaSluzba(); // instance tridy

        knihaSluzba.spocitejKnihy();

        knihaSluzba.vypisSeznamVsechKnih();
        knihaSluzba.knihyOdZadanehoAutora("Karel Čapek");
        knihaSluzba.knihyVZadanemRoce(1845);

    }

}



