
import java.util.*;

class Car{
    String name="kjh";
    String model;
    String color;
    Car(){}
        Car(String nam, String model){

            //int pricename="raushan";
            name =name;
            System.out.println(name);

    }
    int price1;

   public void price(int n){
          System.out.println(n);
    }
    public void run(){
        System.out.println("Car is running");}
    public void run(int i,int j){
       int a=10;
            if(i<=2 && j<60){
                System.out.println(" car is running at normal speed");
            }
            else if(i==0 && j==0){
                System.out.println("car at parking or stop");
            }
            else System.out.println("car at full speed");
        System.out.println(a);
    }


}

public class sample extends Car {
    public void run(){
        System.out.println("Car is running");}

    public static void main(String[] args) {
      Car car1 = new Car("hg","");
      //car1.name="Audi";
      car1.model="Audi-Q3";
      car1.color="white";
      int n=2086479359;
      car1.price(n);
      car1.run();
      Car car2=new Car();
      car2.name="BMW";
      car2.model="Axu";
      car2.price(n);
      String s="prince";
        car1.run(2,50);
        car1.price1=5554;
        System.out.println(car1.name);

        Calendar calendar=new GregorianCalendar();
    int nt=calendar.getActualMaximum(3);
    Date date=new Date();
        System.out.println(nt);
    }}
//malyalam,programming