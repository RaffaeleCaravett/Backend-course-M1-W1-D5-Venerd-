import elementoMultimediale.tipi.Immagine;
import elementoMultimediale.tipi.RegistrazioneAudio;
import elementoMultimediale.tipi.Video;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        RegistrazioneAudio audio1 = new RegistrazioneAudio("audio1",-1,11);
        Video video1 = new Video("video1",13,10,0);
        Immagine immagine1 = new Immagine("immagine1",0);
        Video video2 = new Video("video2",15,2,5);
        RegistrazioneAudio audio2 = new RegistrazioneAudio("audio2",10,8);

    }
}
