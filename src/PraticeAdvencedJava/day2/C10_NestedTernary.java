package PraticeAdvencedJava.day2;

public class C10_NestedTernary {
    public static void main(String[] args) {
         /*
    Final notu tanimlayin, Nested Ternary(ic ice Ternaray) ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

        char finalNot='C';

        String result= finalNot=='A'? "Gayet Basarili": finalNot=='B'?"Basarili"
                : finalNot=='C'?"Ha gayret":"Digerleri ...";

        System.out.println("result = " + result);
    }
}
