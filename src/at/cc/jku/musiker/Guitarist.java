package at.cc.jku.musiker;

public class Guitarist extends Musician {
    public Guitarist(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void makeMusic() {
        System.out.println("Gitarren schrumm schrumm schrumm");
    }
}
