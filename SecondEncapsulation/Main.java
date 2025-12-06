package SecondEncapsulation;
import SecondEncapsulation.PrivateClass.Parent;
import SecondEncapsulation.PrivateClass.Data;
public class Main {
    public static void main(String[] args) {
        Parent p= new Parent("John",101);

        //first print the data wothout getter, surely it will give error
        //System.out.println(p.name);
        //using getter to get the daa
        Data d= p.getData();
        System.out.println("Name: "+d.name);

        //will now change the data using setter
        p.setData("ravi",105);
        Data d2=p.getData();
        System.out.println("Name"+d2.name);
    }
}
