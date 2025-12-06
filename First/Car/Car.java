package First.Car;

public class Car {
    protected 
    String model="newXeno";
    int year=2025;

    public Car (){
        System.out.println("Creating a car");
    }
    // Car(String model,int year){   this is a parametarized constructor
    //     // constructor
    //     this.model=model;
    //     this.year=year;
    //     System.out.println("Creating a car");
    // }

    public void makeCar(){
        System.out.println("Making a car model:"  + model + " year: "+ year);
    }

    protected void displayInfo(){
        System.out.println("Car model"+ model);
    }


}
