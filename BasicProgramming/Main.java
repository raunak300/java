package BasicProgramming;

import java.util.Arrays;

public class Main {
    public static void noofprime(int n){
        int count=0;
        boolean seive[]=new boolean[n+1];
        Arrays.fill(seive,true);
        seive[0]=false;
        seive[1]=false;
        for(int i=2;i*i<=n;i++){
            if(seive[i]==true ){
                for(int j=i*i;j<=n;j=j+=i){
                    seive[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(seive[i]==true)count++;
        }
        System.out.println(count);;
    }
    public static void ifPrime(int n){
        for(int i=2;i<= Math.ceil(Math.sqrt(n));i++  ){
            if(n%i==0){
                System.out.println("true");
                break;
            }
        }
        return;
    }

    public static void isleapyear(int year){
        if(year%400==0) System.out.println("leap year");
        else if(year%100==0) System.out.println("not leap year");
        else if(year%4==0)System.out.println("leap year");
        else System.out.println("not leap");
    }
    public static void main(String[] args) {
        ifPrime(114);
        noofprime(3);
    }
}
