package First;
// import java.util.*;
// import First.Car.Car;
import First.MoreCar.MoreCar;

class Main{
    public static void main (String[] args){
        System.out.println("Hello world");
        MoreCar car= new MoreCar();

        car.showMore();

        // System.out.println("accessing protected methods");   this will give error-> protected
        // myCar.displayInfo();
    }
}