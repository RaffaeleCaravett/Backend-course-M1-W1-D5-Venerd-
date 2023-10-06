package elementoMultimediale.tipi;

import elementoMultimediale.ElementoMultimediale;
import interfaces.playable;

public class RegistrazioneAudio extends ElementoMultimediale implements playable {
    private int durata;
    private int volume;
    public RegistrazioneAudio(String titolo,int durata,int volume) {
        super(titolo);
        this.durata=durata;
        this.volume=volume;
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
            System.out.println("Il volume è passato da " + this.getVolume());
            this.volume+=-1;
            System.out.println("a "+ this.getVolume());
        }else {
            System.out.println("Il volume è già a zero");
        }
    }

    @Override
    public void alzaVolume() {
        if(this.volume<=9){
            System.out.println("Il volume è passato da " + this.getVolume());
            this.volume+=1;
            System.out.println("a "+ this.getVolume());
        }else {
            System.out.println("Il volume è già al massimo");
        }
    }
    @Override
    public void play() {
        StringBuilder puntoEsclamativo = new StringBuilder();
        for(int i=0;i<volume;i++) {
        puntoEsclamativo.append("!");
        }
        for(int i=0;i<durata;i++){
            System.out.println(this.getTitolo()+puntoEsclamativo);
        }
    }
}
