import elementoMultimediale.tipi.RegistrazioneAudio;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RegistrazioneAudio audio1 = new RegistrazioneAudio("audio1",20,5);
        audio1.abbassaVolume();
        audio1.alzaVolume();
        audio1.play();
    }
}
