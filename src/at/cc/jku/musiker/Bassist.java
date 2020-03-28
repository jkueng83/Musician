package at.cc.jku.musiker;

public class Bassist extends Musician {

    public Bassist(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void makeMusic() {
        //super.makeMusic();
        System.out.println("Bass : Schrumm Schrumm ");
    }





}
