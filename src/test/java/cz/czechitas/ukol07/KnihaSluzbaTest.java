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


    }

    @Test
    void knihyVZadanemRoce() throws IOException {
        KnihaSluzba knihaSluzba = new KnihaSluzba();


    }
}