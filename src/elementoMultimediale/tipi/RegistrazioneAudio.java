package elementoMultimediale.tipi;

import elementoMultimediale.ElementoMultimediale;
import interfaces.playable;

public class RegistrazioneAudio extends ElementoMultimediale implements playable {
    private int durata;
    private int volume;
    public RegistrazioneAudio(String titolo,int durata,int volume) {
        super(titolo);
        if (durata >= 0) {
            this.durata = durata;
        } else {
            System.out.println("La durata della registrazione è stata impostata a zero poichè il valore che hai inserito non è maggiore di 0.");
        }
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        } else {
            System.out.println("Il volume della registrazione è stato impostato a zero poichè il valore che hai inserito non è compreso fra 0 e 10.");
        }
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
            System.out.println("Il volume della registrazione è passato da " + this.getVolume());
            this.volume+=-1;
            System.out.println("a "+ this.getVolume());
        }else {
            System.out.println("Il volume della registrazione è già a zero");
        }
    }

    @Override
    public void alzaVolume() {
        if(this.volume<=9){
            System.out.println("Il volume della registrazione è passato da " + this.getVolume());
            this.volume+=1;
            System.out.println("a "+ this.getVolume());
        }else {
            System.out.println("Il volume della registrazione è già al massimo");
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
