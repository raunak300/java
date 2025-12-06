package FifthInheritence;

public class Animal {
    public String name;
    public Animal(String name){
        this.name=name;
        System.out.println("Animal name is: "+this.name);
    }

    public void walk(){
        System.out.println("can walk");
    }
    
}
