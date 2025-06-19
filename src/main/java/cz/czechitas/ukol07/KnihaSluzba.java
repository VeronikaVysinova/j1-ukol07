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

 public void spocitejKnihy(){
     int pocetKnih = knihy.size();
     System.out.println("Počet knih: " + pocetKnih);

 }

 public void vypisSeznamVsechKnih(){
     System.out.println("Seznam všech knih: ");
   for(Kniha kniha : knihy){
       System.out.print("- " + kniha.getNazev());
       System.out.print(", autor: " + kniha.getAutor());
       System.out.println(", rok vydání: " + kniha.getRokVydani());
   }
 }

 public void knihyOdZadanehoAutora(String autor){
     boolean nalezeno = false;
     System.out.println("Knihy od autora: " + autor);
for(Kniha kniha : knihy){
    if(kniha.getAutor().equalsIgnoreCase(autor)){
        System.out.println(kniha.getNazev() + ", rok: " + kniha.getRokVydani());
        nalezeno = true;
    }
}
     if (!nalezeno) {
         System.err.println("Nebyla nalezena žádná kniha od zadaného autora.");
     }
 }

    public void knihyVZadanemRoce(int rokVydani){
        boolean nalezeno = false;
        System.out.println("Knihy z roku " + rokVydani + ":");
        for(Kniha kniha : knihy){
            if(kniha.getRokVydani() == rokVydani){
                System.out.println(kniha.getAutor() +" : " + kniha.getNazev());
                nalezeno = true;
            }
        }
        if (!nalezeno) {
            System.err.println("Nebyla nalezena žádná kniha v zadaném roce.");
        }
    }

}
