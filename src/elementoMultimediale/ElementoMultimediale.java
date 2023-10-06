package elementoMultimediale;

public abstract class ElementoMultimediale {
    String titolo;
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }
    public String setTitolo(String titolo) {
        return this.titolo=titolo;
    }


}
