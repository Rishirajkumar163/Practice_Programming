import java.util.*;
interface car{
    void rrun();
}
interface accelerate{
    void accelerate();
}
class Carr{
    static void run(){
        System.out.println("car is running");
    }

}
class bmw extends Carr implements car  {

 public  void  rrun(){
     System.out.println("car will run");

  }

    public void drive(){
        System.out.println("bmw is running");
    }
    public void runb(Carr r){
        r.run();
    }
    public static void run(){
        System.out.println("bmw car is fast run");
    }
}
public class SimpleTimeClient
{void audi(bmw r){
    r.run();
}


    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar=new GregorianCalendar(2016,03,0);
        System.out.println(gregorianCalendar.getTime());
        System.out.println( );
        Carr car1=new bmw();
        car1.run();
        Carr.run();
        car1.run();

    }
}
