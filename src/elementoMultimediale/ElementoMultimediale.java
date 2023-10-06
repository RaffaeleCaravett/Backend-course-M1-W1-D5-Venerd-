package elementoMultimediale;

//Creo la classe astratta (che si estende alle sottoclassi, ma che non permette di istanziare oggetti direttamente) ElementoMultimediale
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
