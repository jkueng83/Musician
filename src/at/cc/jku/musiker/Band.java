package at.cc.jku.musiker;

public class Band {
    private String bandName;
    private int foundingYear;

    public Band(String bandName, int foundingYear) {
        this.bandName = bandName;
        this.foundingYear = foundingYear;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    public void printBandData() {
        System.out.println("Band Name:\t\t\t" + this.bandName);
        System.out.println("Gründungsjahr:\t\t" + this.foundingYear);
    }

}
