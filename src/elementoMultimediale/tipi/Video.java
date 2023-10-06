package elementoMultimediale.tipi;

import elementoMultimediale.ElementoMultimediale;
import interfaces.brightness;
import interfaces.playable;
/*Creo una classe che estende la classe astratta ElementoMultimediale ed implementa l'interfaccia brightness
Utilizzo il super costruttore, l'override e faccio dei semplici check , per controllare che i valori mi arrivini in un dato range di numeri, per gli asterischi ed i punti esclamativi creo
dei cicli for, con i quali stabilisco il numero di relativi che mi serve
*/
public class Video extends ElementoMultimediale implements playable, brightness {
    private int durata;
    private int volume;
    private int luminosita;
    public Video(String titolo,int durata,int volume,int luminosita) {
        super(titolo);
        if (durata >= 0) {
            this.durata = durata;
        } else {
            System.out.println("La durata del video è stata impostata a zero poichè il valore che hai inserito non è maggiore di 0.");
        }
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        } else {
            System.out.println("Il volume del video è stato impostato a zero poichè il valore che hai inserito non è compreso fra 0 e 10.");
        }
        if (luminosita >= 0 && luminosita <= 10) {
            this.luminosita = luminosita;
        } else {
            System.out.println("La luminosità del video è stata impostata a zero poichè il valore che hai inserito non è compreso fra 0 e 10.");
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
            System.out.println("Il volume del video è passato da " + this.getVolume());
            this.volume+=-1;
            System.out.println("a "+ this.getVolume());
        }else {
            System.out.println("Il volume del video è già a zero");
        }
    }

    @Override
    public void alzaVolume() {
        if(this.volume<=9){
            System.out.println("Il volume del video è passato da " + this.getVolume());
            this.volume+=1;
            System.out.println("a "+ this.getVolume());
        }else {
            System.out.println("Il volume del video è già a zero");
        }
    }
    @Override
    public void play() {
        StringBuilder puntoEsclamativo = new StringBuilder();
        for (int i = 0; i < volume; i++) {
            puntoEsclamativo.append("!");
        }
        StringBuilder asterisco = new StringBuilder();
        for (int i = 0; i < luminosita; i++) {
            asterisco.append("*");
        }
        for (int i = 0; i < durata; i++) {
            System.out.println(this.getTitolo() + puntoEsclamativo + asterisco);
        }
    }

    @Override
    public int getLuminosita() {
        return this.luminosita;
    }

    @Override
    public void abbassaLuminosita() {
        if(this.luminosita>=1){
            System.out.println("La luminosità del video è passata da " + this.getLuminosita());
            this.luminosita+=-1;
            System.out.println("a "+ this.getLuminosita());
        }else {
            System.out.println("La luminosità del video è già a zero");
        }
    }

    @Override
    public void alzaLuminosita() {
        if(this.luminosita<=9){
            System.out.println("La luminosità del video è passata da " + this.getLuminosita());
            this.luminosita+=1;
            System.out.println("a "+ this.getLuminosita());
        }else {
            System.out.println("La luminosità del video è già al massimo");
        }
    }
}
