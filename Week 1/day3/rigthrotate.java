import java.util.Scanner;
//right roatate an array by k 
public class rigthrotate{
    public static void display(int[]a){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
     public static void reverse(int []a,int i, int j ){

        int li = i;
        int ri = j;
         
        while(li<ri){
            int temp = a[li];
            a[li]=a[ri];
            a[ri]=temp;

            li++;
            ri--;
        }

    }
        public static void rotate(int []a,int k ){

            k = k%a.length;
            if(k<0){
                k = k+a.length;
            }
            //part 1 
            reverse(a,0,a.length-k-1);
            reverse(a,a.length-k,a.length-1);
            reverse(a,0,a.length-1);
        }

   
    
     public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []a=new int [n];
        for(int i =0 ;i<a.length;i++){
            a[i]=scn.nextInt();
        }

       

        rotate(a,2);
        display(a);
        
    }


}






