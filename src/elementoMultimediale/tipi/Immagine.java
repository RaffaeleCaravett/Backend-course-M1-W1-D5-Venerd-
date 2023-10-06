package elementoMultimediale.tipi;

import elementoMultimediale.ElementoMultimediale;
import interfaces.brightness;

public class Immagine extends ElementoMultimediale implements brightness {


    public Immagine(String titolo) {
        super(titolo);

    }


    @Override
    public int getLuminosita() {
        return 0;
    }

    @Override
    public void abbassaLuminosita() {

    }

    @Override
    public void alzaLuminosita() {

    }
}
