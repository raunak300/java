package First.MoreCar;

import First.Car.Car;

public class MoreCar extends Car {


    public MoreCar(){
        System.out.println("Creating more cars");
    }

    public void showMore(){  // this method can access protected member of other class by inhertence 
        // Car.displayInfo() : ->error and can't be accessed like above
        System.out.println("Accessing protected things");
        displayInfo();
    }

}
