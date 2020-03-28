package at.cc.jku.musiker;

import java.util.ArrayList;

public class MusicContest {

    String nameOfContest;
    ArrayList<Musician> musicians;

    public MusicContest(String nameOfContest) {
        this.nameOfContest = nameOfContest;
        this.musicians = new ArrayList<>();
    }

    public Musician theWinnerIs() {

        Musician musicianWinner = this.musicians.get(0);//new Musician("",0);
        for (int i = 0; i < musicians.size(); i++) {
            if (musicianWinner.getMySound().length() < this.musicians.get(i).getMySound().length()) { //der wo länger singt
                musicianWinner = musicians.get(i);
            }

        }
        System.out.println("###########################");
        System.out.println("#### Der Gewinner ist: ####");
        System.out.println("###########################");
        musicianWinner.printMusicianData();
        musicianWinner.makeMusic();

        return musicianWinner;
    }

    public void addMusicians(Musician  musician) {
        this.musicians.add(musician);
        System.out.println("Teilnehmer/in wurde zum Wettbewerg angemeldet:");
        musician.printPersonData();

        musician.makeMusic();


    }

    public void printAllMusicians() {
        System.out.println("###################################");
        System.out.println("#### Teilnehmer vom Wettbewerb ####");
        System.out.println("###################################");
        for (int i = 0; i < musicians.size(); i++) {
            System.out.println("Teilnehmer/in " + (i + 1) + ":");
            musicians.get(i).printPersonData();

        }
    }
}
