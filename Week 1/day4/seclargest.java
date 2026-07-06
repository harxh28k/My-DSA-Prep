import java.util.Scanner;
public class seclargest{


    public static int   secondLargest(int[]a){


        int max1=-1;
        int max2 =-1;

        if(a[0]>a[1]){
            max1=a[0];
            max2=a[1];
        }
        else if(a[1]>a[0]){
            max1=a[1];
            max2=a[0];
        }
        else{
            max1=a[0];
            max2=-1;
        }


        for(int i =2;i<a.length;i++){

            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2  &&  a[i]!=max1){
                max2=a[i];
            }
        }

        return max2;
    }

public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []a= new int[n];
    for(int i =0;i<a.length;i++){
        a[i]=scn.nextInt();
    }

    secondLargest(a);
    System.out.print(secondLargest(a));   
    
   
}
}