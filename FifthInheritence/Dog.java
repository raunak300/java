package FifthInheritence;

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    void canrun(){
        System.out.println(name+"can run");
    }
}