package at.cc.jku.musiker;
/*
Beispiel aus Schrödinger Buch ab Seite 262
 */
public class Proberaum {
    public static void main(String[] args) {

        Vocalist vocalist = new Vocalist("Klaus",27);
        Bassist bassist = new Bassist("Johannes", 36);
        Drummer drummer=new Drummer("Johannes" , 36);
        Trumpeter trumpeter=new Trumpeter("Hans",30);
        BackgroundVocalist backgroundVocalist = new BackgroundVocalist("Beate",17);
        Guitarist guitarist = new Guitarist("Didi",40);

        Band band = new Band("Copyrigt", 1999);
        vocalist.setBand(band);
        bassist.setBand(band);
        drummer.setBand(band);
        trumpeter.setBand(band);
        backgroundVocalist.setBand(band);
        guitarist.setBand(band);

        makeMusic(vocalist,bassist,drummer,trumpeter,backgroundVocalist,guitarist);

        // Musik Kontest
        MusicContest musicContest = new MusicContest("Musik Kontest");

        Musician m1 = new Musician("Johannes" , 35);
        Musician m2 = new Musician("Paula",17);
        m1.setMySound("Aaaaaaaaah");
        m2.setMySound("EEEEEEEEEEEEEEEEEEEEEEEEeh");

        m1.setBand(band);
        m2.setBand(band);

        musicContest.addMusicians(m1);
        musicContest.addMusicians(m2);

        musicContest.addMusicians(vocalist);
        musicContest.addMusicians(bassist);
        musicContest.addMusicians(drummer);
        musicContest.addMusicians(trumpeter);
        musicContest.addMusicians(backgroundVocalist);
        musicContest.addMusicians(guitarist);

        musicContest.printAllMusicians();
        musicContest.theWinnerIs();

        // Gesangswettbewerb

        VoiceContest voiceContest = new VoiceContest("Voice of Austria");
        voiceContest.addMusicians(vocalist);

        Vocalist v1 = new Vocalist("Hanna" , 30);
        v1.setBand(band);

        Vocalist v2 = new Vocalist("Super Henne Hanna" , 5);
        v2.setBand(band);
        v2.setMySound("Gooooog, g g g Gooooooooooooooooooooooogkkkkk");

        voiceContest.addMusicians(v1);
        voiceContest.addMusicians(v1);

        voiceContest.theWinnerIs();
    }

    public static void makeMusic ( Musician ... gruppe){
        System.out.println("#### Die Band macht Musik ####");
        for (Musician musician : gruppe){
            musician.makeMusic();
        }
        System.out.println("--- Konzert beendet ---");
    }
}
