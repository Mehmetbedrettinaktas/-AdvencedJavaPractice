package PraticeAdvencedJava.day09_practice.restourant;

public class Musteri {
    public static void main(String[] args) {

        // obje creat edilecek
        // main method
        // Siparis objesi creat edilecek
        // parametli const creat olacak

        Mutfak menu = new Mutfak();

        System.out.println("menu.toString() = " + menu.toString());

        /*

        menu.toString() = Mutfak{
        yemekler='adana kebab, urfa ciger, kusbasi, kusleme'
        araSicaklar='yaylacorbasi,mercimek , duguncorba, corba'
        tatlilar='baklava, sutlac, gullac, kazandibi, kunefe'
        icecekler='ayran, salgam, kola'}

         */
        System.out.println(" ");

        Mutfak siparis = new Mutfak("Adana kebab", "yaylacorbasi", "kunefe", "salgam");

        System.out.println("siparis = " + siparis);
        /*
        siparis = Mutfak{
        yemekler= Adana kebab
        araSicaklar= yaylacorbasi
        tatlilar= kunefe
        icecekler= salgam}
         */


    }
}
