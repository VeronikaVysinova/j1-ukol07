package cz.czechitas.ukol07;

import java.util.List;

public class Kniha {
    private String autor;
    private String nazev;
    private int rokVydani;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public void setRokVydani(int rokVydani) {
        this.rokVydani = rokVydani;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Kniha {");
        sb.append("autor:'").append(autor).append('\'');
        sb.append(", nazev:'").append(nazev).append('\'');
        sb.append(", rokVydani:").append(rokVydani);
        sb.append('}').append("\n");
        return sb.toString();
    }
}
