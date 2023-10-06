package elementoMultimediale.tipi;

import elementoMultimediale.ElementoMultimediale;
import interfaces.playable;

public class RegistrazioneAudio extends ElementoMultimediale implements playable {

    public RegistrazioneAudio(String titolo) {
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
}
