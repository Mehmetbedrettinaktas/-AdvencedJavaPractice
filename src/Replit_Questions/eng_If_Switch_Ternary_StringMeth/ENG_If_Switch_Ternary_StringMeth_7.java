package Replit_Questions.eng_If_Switch_Ternary_StringMeth;

public class ENG_If_Switch_Ternary_StringMeth_7 {
    /*
    Create 2 words : name1 and name2
if the name1 has even numbers of characters,
then insert the second word in the middle of the first name
if the first word has odd numbers
Then print the “Name2 cannot be inserted in the name1”

e.g:
name1= mehmet

name2= ahmet

Print ==> mehahmetmet
     */
    public static void main(String[] args) {

        String name1="mehmet";
        String name2="ahmet";

        if (name1.length()%2== 0){
            System.out.println(name1.substring(0,name1.length()/2).concat(name2).
                    concat(name1.substring(name1.length()/2)) );
        }else{
            System.out.println("Name2 cannot be inserted in the name1");
        }

    }
}
