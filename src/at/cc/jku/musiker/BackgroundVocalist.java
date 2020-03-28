package at.cc.jku.musiker;

public class BackgroundVocalist extends Musician {
    public BackgroundVocalist(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void makeMusic() {
        System.out.println("La Le Lu - Hu Hu Hu");
    }
}
