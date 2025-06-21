package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.jupiter.api.Test;

import javax.management.StringValueExp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KnihaSluzbaTest {

    @Test
    void spocitejKnihy() throws IOException {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        assertEquals(14,knihaSluzba.spocitejKnihy());
        assertNotEquals(0,knihaSluzba.spocitejKnihy());
    }

    @Test
    void knihyOdZadanehoAutora() throws IOException {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<Kniha> vysledek = knihaSluzba.knihyOdZadanehoAutora("Karel Čapek");

        assertEquals(5, vysledek.size());
        assertNotEquals(0,vysledek.size());
        assertFalse(vysledek.size() == 0,"Seznam by mel byt prazdny.");
        assertFalse(vysledek.size()>5,"Seznam nemuze obsahovat vice nez 5 knih.");
    }

    @Test
    void knihyVZadanemRoce() throws IOException {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<Kniha> vysledek = knihaSluzba.knihyVZadanemRoce(1845);

        assertEquals(2, vysledek.size());
        assertFalse(vysledek.size() == 0,"Seznam by mel byt prazdny.");
        assertFalse(vysledek.size() > 2,"Seznam nemuze obsahovat vice nez 2 knihy.");

    }
}