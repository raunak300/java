package SecondEncapsulation.PrivateClass;

public class Parent {
    private String name;
    private String rollNo;

    public Parent(String name, int rollNo){
        this.name=name;
        this.rollNo= String.valueOf(rollNo);
    }

    public Data getData(){
        return new Data(name,rollNo);
    }

    public void setData(String name,int rollNo){
        this.name=name;
        this.rollNo=String.valueOf(rollNo);
    }
}
