package Seventhlinkedlist;

public class QuickSort {
    public static int find(int []Arr,int low,int high){
        int pivot=Arr[low];
        int st=low-1;
        int end=high+1;
        while(true){
            do{
                st++;
            }while(Arr[st]<pivot);
            do{
                end--;
            }while(Arr[end]>pivot);
            if(st>=end)return end;
            int temp=Arr[st];
            Arr[st]=Arr[end];
            Arr[end]=temp;
        }
    }
    public static void Quick(int[]Arr,int low,int high){
        if(low>=high)return;
        int pivot=find(Arr,low,high);
        Quick(Arr,low,pivot);
        Quick(Arr,pivot+1,high);
    }

    public void dorun(){
        int[] Arr= {5,3,4,1,4,7};
        for(int i=0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }
        System.out.println("Befor Sorting");
        Quick(Arr,0,Arr.length-1);
        System.out.println("After Sorting");
        for(int i=0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }

    }
    
}
