package PraticeAdvencedJava.day09_practice.restourant;

public class Mutfak {

    // yemekler
    // instance variable
    //Tatlilar
    // Arasicaklar
    // tatlilar
    // icecekler
    // toString

    // herzaman parametrli Constructor kullanacagimiz icin herzaman
    // parametresiz constructor olusturalim
    public String yemekler = "adana kebab, urfa ciger, kusbasi, kusleme";
    public String araSicaklar = "yaylacorbasi,mercimek , duguncorba, corba";
    public String tatlilar = "baklava, sutlac, gullac, kazandibi, kunefe";
    public String icecekler = "ayran, salgam, kola";

    public Mutfak(String yemekler, String araSicaklar, String tatlilar, String icecekler) {

        this.yemekler = yemekler;
        this.araSicaklar = araSicaklar;
        this.tatlilar = tatlilar;
        this.icecekler = icecekler;


    }


    public Mutfak() {

    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler= " + yemekler +
                "\naraSicaklar= " + araSicaklar +
                "\ntatlilar= " + tatlilar +
                "\nicecekler= " + icecekler +
                '}';
    }
}
