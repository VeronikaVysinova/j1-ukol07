package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class KnihaSluzba {               //konstruktor
 private final List<Kniha> knihy;

 public KnihaSluzba() throws IOException {
     InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json");
     ObjectMapper objectMapper = new ObjectMapper();

     try(inputStream){
         knihy = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {});
     }

 }

 //pocet vsech knih v seznamu
 public int spocitejKnihy(){
   int pocetKnih = knihy.size();
   System.out.println("Počet knih v seznamu: " + pocetKnih);
   return pocetKnih;
 }

 //vypise seznam vsech knih v seznamu
 public void vypisSeznamVsechKnih(){
     System.out.println("Seznam všech knih: ");
   for(Kniha kniha : knihy){
       System.out.println("- " + kniha.getNazev() + ", autor: " + kniha.getAutor() + ", rok vydání: " + kniha.getRokVydani());
   }
 }


 //vypise knihy od zadaneho autora
 public List<Kniha> knihyOdZadanehoAutora(String autor) {
     List<Kniha> seznamKnih = new ArrayList<>();
     for (Kniha kniha : knihy) {
         if (kniha.getAutor().equalsIgnoreCase(autor)) {
             seznamKnih.add(kniha);
         }
     }
     if (seznamKnih.isEmpty()) {
         System.out.println("Nebyla nalezena zadna kniha od autora: " + autor);
     }else{
         System.out.println("Knihy od autora " + autor + ": ");
         for(Kniha kniha : seznamKnih){
             System.out.println("- " + kniha.getNazev() + " (rok: " + kniha.getRokVydani() + ")");
         }

     }
     return seznamKnih;
 }


 //vypise knihy v dannem roce vydani
    public List<Kniha> knihyVZadanemRoce(int rokVydani){
       List<Kniha> knihyZRoku = new ArrayList<>();
       System.out.println("Knihy z roku vydani " + rokVydani + ": ");

       for(Kniha kniha : knihy){
            if(kniha.getRokVydani() == rokVydani){
                System.out.println(kniha.getAutor() + " : " + kniha.getNazev());
                knihyZRoku.add(kniha);
            }
        } if (knihyZRoku.isEmpty()) {
            System.err.println("Nebyla nalezena žádná kniha v zadaném roce.");
        }
        return knihyZRoku;
    }

}
