import javax.swing.plaf.synth.SynthSpinnerUI;

public class CHP_2_B_strings_methods {
    public static void main(String[] args) {
        // to find the length of the string

        String name = "Shaikh";
        int val = name.length();
        System.out.println(val);

        //to convert all the letter to lower case

        String letter = "mantasha";
        String lowerstring = letter.toLowerCase();
        System.out.println(lowerstring);

        // to convert all the letter to upper case

        String upper = letter.toUpperCase();
        System.out.println(upper);

        //to trim extra spaces in a string

        String untrimmed = "    mussu     ";
        System.out.println(untrimmed);
        
        // this will trim the extra spaces
        String trim = untrimmed.trim();
        System.out.println(trim);

        // another way of writing the trim letter
        System.out.println(trim.trim());


        //-------to write the letter from a certain index


        String myself = "sarfaraz";
        System.out.println(myself.substring(2));   //this will write the letter from index 2 till last
        System.out.println(myself.substring(1 , 5));  //this will write the letter from 1 to 4 excluding 5

        // --------REPLACE

        System.out.println(myself.replace('a' , 'e'));
        System.out.println(myself.replace("ar", "f"));

        //----- STARTS WILTH AND ENDS WITH

        System.out.println(myself.startsWith("sar"));  //this will return bool if the char is present
        System.out.println(myself.endsWith("zz"));    //will return bool 

        // ------ return the character at a cerain index

        System.out.println(myself.charAt(6));

        // --- this will print the index of a string
        // is the charaacter are not present it will write (-1)
        String modifiesString = "shaikhmantasha";
        System.out.println(modifiesString.indexOf("ikh"));    // will print the index number of shaikh
        System.out.println(modifiesString.indexOf("man" , 4));   // will start searching from the index number 4

        System.out.println(modifiesString.lastIndexOf("sha"));  //starts searching fromt ht elast index
        System.out.println(modifiesString.lastIndexOf("man", 10)); // will start from a given value of last index

        System.out.println(modifiesString.equals("shaikhmantaha")); // will check if it is equal
        System.out.println(modifiesString.equalsIgnoreCase("shAikhManTAshA")); //will ignore the lower and upper case and look for the letter


        // ---------------- ESCAPE SEQUENCE CHARACTERS ---------------------
        // the cahracter that comes after a \

        System.out.println("my name is shaikh amnyasha //"); //will give /
        System.out.println("my name is shiakh \n");  // will make a line
        System.out.println("my nmae is shiaikh \t mantasha");  // will give taqb sapces
        System.out.println("shiakh mantasa \" shiakh mantasha ");  // will add quote

        //FOR MPORE ESCAPE SEQUENCES GO TO (JAVA ORACLE ESCAPE SEQUENCES)
    }
}
