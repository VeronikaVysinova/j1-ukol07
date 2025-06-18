package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Stream;


public class KnihaSluzba {

    private final List<Kniha> seznamKnih;

    public KnihaSluzba()throws IOException {
        InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try (inputStream) {
            seznamKnih = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {});
        }
    }

    public void vypisSeznamVsechKnih (){
       seznamKnih.stream();
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


