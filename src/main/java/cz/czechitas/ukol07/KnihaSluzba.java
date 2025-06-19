package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class KnihaSluzba {
 private final List<Kniha> knihy;

 public KnihaSluzba() throws IOException {
     InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json");
     ObjectMapper objectMapper = new ObjectMapper();

     try(inputStream){
         knihy = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {});
     }

 }

 public void vypisSeznamVsechKnih(){

 }

}
