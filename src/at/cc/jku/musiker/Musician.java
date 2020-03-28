package at.cc.jku.musiker;

public class Musician extends Person {

    private Band band;
    private String mySound;

    public Musician(String name, int alter) {
        super(name, alter);
        this.mySound = "my default sound: OO Mmmmmmmmhhh, OO Mmmmmmmhhh!";
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public Band getBand() {
        return band;
    }

    public String getMySound() {
        return mySound;
    }

    public void setMySound(String mySound) {
        this.mySound = mySound;
    }

    public void makeMusic() {
        System.out.print("Ich mache Musik:\t");
        System.out.println(this.mySound);
    }

    public void printMusicianData() {
        super.printPersonData();
        this.band.printBandData();


    }

}
