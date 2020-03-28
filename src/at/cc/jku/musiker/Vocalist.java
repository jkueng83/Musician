package at.cc.jku.musiker;

public class Vocalist extends Musician {

    public Vocalist(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void makeMusic() {
        System.out.println("Gänsel und Gretel verliefen sich im Wald");
    }
}
