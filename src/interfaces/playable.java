package interfaces;
//Creo l'interfaccia playable per tutti gli elementi multimediali che implementano gli stessi metodi.
public interface playable {
    int getDurata();
    int getVolume();

    void abbassaVolume();
    void alzaVolume();

    void play();
}
