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

        makeMusic(vocalist,bassist,drummer,trumpeter,backgroundVocalist,guitarist);


    }

    public static void makeMusic ( Musician ... gruppe){
        for (Musician musician : gruppe){
            musician.makeMusic();
        }
    }
}
