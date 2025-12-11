package SixthInterfaces;

public class Animal implements Interface {
    @Override
    public void run(){
        System.out.println("Animal runs");
    }

    @Override
    public void sound(){ //if i did not add this method and partially implement interface method it will give error
        System.out.println("Animal makes a sound");
    }
}
