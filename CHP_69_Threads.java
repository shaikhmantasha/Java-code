// threading helpes in running the program that makes you wait
//func1()
//func2()

class Mythread extends Thread{
    @Override    // part of threading
    public void run(){
        int i =0 ;
        while (i < 400){
            System.out.println("I am cooking");
            System.out.println("cooking biryani");
            i++;
        }
    }
}

class Mythread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<400){
            System.out.println("i am writing project");
            System.out.println("AI project");
            i++;
        }
    }
}
public class CHP_69_Threads {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}
