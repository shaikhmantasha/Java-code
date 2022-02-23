public class chp_2_Practice_set {
    public static void main(String[] args) {

        //QUESTION 1

        String name = "Shaikh Mantasha";
        name = name.toLowerCase();
        System.out.println(name);

        //QUESTION 2

        String replace = "My name is shaikh mantasha";
        replace = replace.replace(" ", "_");
        System.out.println(replace);

        //QUESTION 3

        String Name = "Dear <|name|>, thanks alot.";
        Name  = Name.replace("<|name|>", "mantasha ma\'am"); 
        System.out.println(Name);

        //QUESTION 4
        //will swearch for double spacese
        String spaces = "shaikh mantasha has double  faces ";
        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));

        //QUESTION 5
        String Letter = "Dear mantasha, \n\tthis java course is nice, \nthank you!";
        System.out.println(Letter);


    }   
    
}
