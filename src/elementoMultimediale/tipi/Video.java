package elementoMultimediale.tipi;

import elementoMultimediale.ElementoMultimediale;
import interfaces.brightness;
import interfaces.playable;

public class Video extends ElementoMultimediale implements playable, brightness {

    public Video(String titolo) {
        super(titolo);
    }

    @Override
    public int getDurata() {
        return 0;
    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public void abbassaVolume() {

    }

    @Override
    public void alzaVolume() {

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
