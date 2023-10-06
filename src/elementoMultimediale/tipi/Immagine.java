package elementoMultimediale.tipi;

import elementoMultimediale.ElementoMultimediale;
import interfaces.brightness;

/*Creo una classe che estende la classe astratta ElementoMultimediale ed implementa l'interfaccia brightness
Utilizzo il super costruttore, l'override e faccio dei semplici check , per controllare che i valori mi arrivini in un dato range di numeri, per gli asterischi ed i punti esclamativi creo
dei cicli for, con i quali stabilisco il numero di relativi che mi serve
*/
public class Immagine extends ElementoMultimediale implements brightness {

    private int luminosita;
    public Immagine(String titolo,int luminosita) {
        super(titolo);
        if (luminosita >= 0 && luminosita <= 10) {
            this.luminosita = luminosita;
        } else {
            System.out.println("La luminosità dell'immagine è stata impostata a zero poichè il valore che hai inserito non è compreso fra 0 e 10.");
        }

    }


    @Override
    public int getLuminosita() {
        return this.luminosita;
    }

    @Override
    public void abbassaLuminosita() {
        if(this.luminosita>=1){
            System.out.println("La luminosità dell'immagine è passata da " + this.getLuminosita());
            this.luminosita+=-1;
            System.out.println("a "+ this.getLuminosita());
        }else {
            System.out.println("La luminosità dell'immagine è già a zero");
        }
    }

    @Override
    public void alzaLuminosita() {
        if(this.luminosita<=9){
            System.out.println("La luminosità dell'immagine è passata da " + this.getLuminosita());
            this.luminosita+=1;
            System.out.println("a "+ this.getLuminosita());
        }else {
            System.out.println("La luminosità dell'immagine è già al massimo");
        }
    }
    public void show() {
        StringBuilder asterisco = new StringBuilder();
        for (int i = 0; i < luminosita; i++) {
            asterisco.append("*");
        }
            System.out.println(this.getTitolo() + asterisco );
    }
}
