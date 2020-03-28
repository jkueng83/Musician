package at.cc.jku.musiker;

public class Trumpeter extends Musician {
    public Trumpeter(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void makeMusic() {
        System.out.println("Täterätetä täterätetä");
    }
}
