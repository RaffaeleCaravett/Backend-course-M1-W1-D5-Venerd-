package elementoMultimediale.tipi;

import elementoMultimediale.ElementoMultimediale;
import interfaces.brightness;
import interfaces.playable;

public class Video extends ElementoMultimediale implements playable, brightness {
    private int durata;
    private int volume;
    public Video(String titolo,int durata,int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }


    @Override
    public int getDurata() {
        return this.durata;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void abbassaVolume() {
        if(this.volume>=1){
            this.volume+=-1;
        }else {
            System.out.println("Il volume è già a zero");
        }
    }

    @Override
    public void alzaVolume() {
        if(this.volume<=0){
            this.volume+=1;
        }else {
            System.out.println("Il volume è già al massimo");
        }
    }
    @Override
    public void play() {
        if(this.volume<=0){
            this.volume+=1;
        }else {
            System.out.println("Il volume è già al massimo");
        }
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
