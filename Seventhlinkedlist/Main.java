package Seventhlinkedlist;
import java.util.*;

public class Main {
    public static void addNode(Node head,int times,Scanner sc){
        Node current=head;
        for(int i=0;i<times;i++){
            System.out.println("Enter Value");
            int val=sc.nextInt();
            Node temp=new Node(val);
            current.next=temp;
            current=current.next;
        }
        current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String[] args) {
        //pointer
        // Scanner sc=new Scanner(System.in);
        // Node head=new Node(10);
        // addNode(head,2,sc);

        QuickSort qs=new QuickSort();
        qs.dorun();
    }
}
