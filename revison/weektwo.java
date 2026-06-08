import java.util.Scanner;
public class weektwo{
  
  public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int []a= new int[n];
       for(int i =0;i<a.length;i++){
        a[i]=scn.nextInt();
       }
       int k = scn.nextInt();
        int l=0;
        int h = a.length-1;
        int fi =-1;

        while(l<=h){
            int mid = (l+h)/2;
            if(k>a[mid]){
                l= mid+1;
            }
             else if (k<a[mid]){
                h= mid-1;
            }
            else{
                fi=mid;
                h=mid-1;
            }
        }

        System.out.println(fi);
         l=0;
         h = a.length-1;
        int li =-1;

         while(l<=h){
            int mid = (l+h)/2;
            if(k>a[mid]){
                l= mid+1;
            }
             else if (k<a[mid]){
                h= mid-1;
            }
            else{
                li=mid;
                l=mid+1;
            }
        }
          System.out.println(li);

    }
}