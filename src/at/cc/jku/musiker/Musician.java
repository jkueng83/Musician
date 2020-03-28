package at.cc.jku.musiker;

public class Musician extends Person {

    private Band band;

    public Musician(String name, int alter) {
        super(name, alter);
    }

    public void makeMusic(){
        System.out.println("OO Mmmmmmmmhhh, OO Mmmmmmmhhh!");
    }
}
