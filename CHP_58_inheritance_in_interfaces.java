
interface sampleInterface{
    // Void meth1();
    void meth2();
}

// NOTE: interface ko extend karke class nahi bana sakte..  but you can implement an interface in a class but cannot extend 
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    // public void meth1(){
    //     System.out.println("meth 1");
    // }
    public void meth2(){
        System.out.println("meth 2");
    }
    public void meth3(){
        System.out.println("meth 3");
    }
    public void meth4(){
        System.out.println("meth 4");
    }
}

public class CHP_58_inheritance_in_interfaces {
    
    public static void main(String[] args) {

        MySampleClass obj = new MySampleClass();
        // obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}

