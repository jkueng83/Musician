package at.cc.jku.musiker;

public class VoiceContest extends MusicContest {

    public VoiceContest(String nameOfContest) {
        super(nameOfContest);
    }

    @Override
    public void addMusicians(Musician musician) {
        super.addMusicians(musician);
    }

    @Override
    public Musician theWinnerIs() {
        return super.theWinnerIs();
    }
}
