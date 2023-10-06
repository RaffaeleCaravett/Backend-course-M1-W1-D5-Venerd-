import elementoMultimediale.ElementoMultimediale;
import elementoMultimediale.tipi.Immagine;
import elementoMultimediale.tipi.RegistrazioneAudio;
import elementoMultimediale.tipi.Video;
import interfaces.playable;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        RegistrazioneAudio audio1 ;
        Video video1;
        Immagine immagine1 ;
        Video video2;
        RegistrazioneAudio audio2 ;


        ElementoMultimediale[] elementoMultimediales = new ElementoMultimediale[5];


        System.out.println("Ciao! Inserisci un audio con i seguenti parametri : titolo , durata e volume. Mi raccomando: uno per volta!");
        System.out.println("Titolo :");
        Scanner scanner = new Scanner(System.in);
        String titoloAudio = scanner.nextLine();
        System.out.println("Durata :");
        int durataAudio =  getNextNumber(scanner);
        System.out.println("Volume :");
        int volumeAudio = getNextNumber(scanner);
        audio1= new RegistrazioneAudio(titoloAudio,durataAudio,volumeAudio);
        scanner.nextLine();
        System.out.println("Ben fatto!");
        System.out.println("Adesso inserisci un altro audio con gli stessi parametri: titolo , durata e volume.");
        System.out.println("Titolo :");
        String titoloAudio1 = scanner.nextLine();
        System.out.println("Durata :");
        int durataAudio1 = getNextNumber(scanner);
        System.out.println("Volume :");
        int volumeAudio1 = getNextNumber(scanner);
        audio2= new RegistrazioneAudio(titoloAudio1,durataAudio1,volumeAudio1);
        scanner.nextLine();
        System.out.println("Inserisci un video con i  parametri: titolo , durata, volume e luminosità.");
        System.out.println("Titolo :");
        String titoloVideo1 = scanner.nextLine();
        System.out.println("Durata :");
        int durataVideo1 = getNextNumber(scanner);
        System.out.println("Volume :");
        int volumeVideo1 = getNextNumber(scanner);
        System.out.println("Luminosita :");
        int luminositaVideo1 = getNextNumber(scanner);
        video1= new Video(titoloVideo1,durataVideo1,volumeVideo1,luminositaVideo1);
        scanner.nextLine();
        System.out.println("Ben fatto! Mancano solo altri due elementi multimediali!");
        System.out.println("Inserisci un altro video con i  parametri: titolo , durata, volume e luminosità.");
        System.out.println("Titolo :");
        String titoloVideo2 = scanner.nextLine();
        System.out.println("Durata :");
        int durataVideo2 = getNextNumber(scanner);
        System.out.println("Volume :");
        int volumeVideo2 = getNextNumber(scanner);
        System.out.println("Luminosita :");
        int luminositaVideo2 = getNextNumber(scanner);
        video2= new Video(titoloVideo2,durataVideo2,volumeVideo2,luminositaVideo2);
        scanner.nextLine();
        System.out.println("Ben fatto!");
        System.out.println("Inserisci un'immagine con i  parametri: titolo e luminosità.");
        System.out.println("Titolo :");
        String titoloImmagine2 = scanner.nextLine();
        System.out.println("Luminosita :");
        int luminositaImmagine2 = getNextNumber(scanner);
        immagine1= new Immagine(titoloImmagine2,luminositaImmagine2);
        elementoMultimediales[0]=audio1;
        elementoMultimediales[1]=audio2;
        elementoMultimediales[2]=video1;
        elementoMultimediales[3]=video2;
        elementoMultimediales[4]=immagine1;
        scanner.nextLine();
        int number;
        System.out.println("Complimenti! Ecco di seguito gli elementi che hai inserito : ");
        do {
            printTitles(elementoMultimediales);
            System.out.println("Quale elemento vuoi eseguire? 1, 2, 3, 4 o 5? Se premi 0 lo scanner si chiuderà!");
            number = scanner.nextInt();
            scanner.nextLine();

            if (number >= 1 && number <= 5) {
                checkElement(number, elementoMultimediales);
            } else if (number != 0) {
                System.out.println("Input non valido. Devi inserire un numero tra 1 e 5 oppure 0 per uscire.");
            }
        } while (number != 0);

        scanner.close();
    }


    private static void checkElement(int number,ElementoMultimediale[] elementoMultimediales){

        ElementoMultimediale elementoMultimediale= elementoMultimediales[number-1];
                if(elementoMultimediale instanceof RegistrazioneAudio|| elementoMultimediale instanceof Video){
                    ((playable) elementoMultimediale).play();
                }else{
                    ((Immagine) elementoMultimediale).show();
                }
    }
private static void printTitles(ElementoMultimediale[] elementoMultimediales){
    for (int i = 0; i < elementoMultimediales.length; i++) {
        System.out.println((i + 1) + ": " + elementoMultimediales[i].getTitolo());
    }
}

    private static int getNextNumber(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Input non valido. Assicurati di inserire un numero intero valido superiore allo 0.");
                System.out.print("Riprova: ");
            }
        }
    }

}
