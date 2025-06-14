package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;



public class KnihaSluzba {

    private List<Kniha> knihy;

    public static void main(String[] args) throws IOException {
        List<Kniha> knihy = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json");

        knihy = objectMapper.readValue(inputStream,new TypeReference<ArrayList<Kniha>>(){});


        //field typu List<Kniha>. Obsah tohoto souboru naplnte v konstruktoru tridy.
        //pro nacteni pouzit ObjectMapper: InputStream vytvorim volani metody KnihaSluzba.class.getResourceAsStream("knihy.json").
        //InputStream se musi zavrit po dokonceni / pouzit konstrukci try-with-resources
        // pro samotne nacteni List pouzijte nasledujici konstrukci: objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>(){}

    }

    public void vypisSeznamVsechKnih(){
        System.out.println(knihy.toString());
    }
}




 /* public void vypisSeznamVsechKnih () {
     //TODO
     // vrati seznam vsech knih
 }

 public void knihyOdAutora (String autor){
        //TODO
     //vrati seznam knih od zadaneho autora, jmeno autora bude parametr. Vraceny seznam muze byt prazdny
 }

 public void knihyVZadanemRoce (int rokVydani){
        //TODO
     //vrati seznam vsech knih v zadanem roce. Rok bude parametr metody. Vraceny seznam muse byt prazdny
 }  */


