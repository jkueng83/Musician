package at.cc.jku.musiker;

public class Drummer extends Musician {
    public Drummer(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void makeMusic() {
        System.out.println("Tätsch Bum Päng");
    }
}
