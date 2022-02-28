public class CHP_9_A_access_modifiers {
    /** 
    ACCESSS MODIFIER SPECIFY WHERE A PROPERTY/METHOD IS ACCESSIBLE
    there are 4 different types of ACCESS MODIFIER IN JAVA

    1. PRIVATE
    2. DEFAULT
    3. PROTECTED
    4. PUBLIC


GETTERS AND SETTERS

GETTER - RETURNS THE VALUE [ACCESSORS]
SETTER - SETS/UPDATES THE CALUE [MUTATORS]

    **/
    
    
    
    class Employee{
// since it is private we can only access them by making them as a method    
        private int id;
        private String name;
    
    public String getName(){
        return name; 
    }

    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;

    }

    public void setId(int i){
        id = i;
    }


    
    }
}
