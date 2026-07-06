import java.util.Scanner;
public class intersection{
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int []a1= new int [n1];
        for(int i=0;i<a1.length;i++){
            a1[i]=scn.nextInt();
        }
        int n2 = scn.nextInt();
        int []a2= new int [n2];
        for(int i=0;i<a2.length;i++){
            a2[i]=scn.nextInt();
        }

        int[]vis = new int [n2];
        for(int i =0;i<a1.length;i++){

            for(int j =0;j<a2.length;j++){
                if(a1[i]== a2[j] && vis[j]==0){
                    System.out.print(a1[i]);
                    vis[j]=1;
                    break;
                }
            }
        }
    }
} 



//(m+n) complexity approach 
// public static void main(String[]args){
//         Scanner scn = new Scanner(System.in);
//         int n1= scn.nextInt();
//         int []a1= new int[n1];
//         for(int i =0;i<a1.length;i++){
//             a1[i]=scn.nextInt();
//         }
       
//         int n2 = scn.nextInt();
//         int []a2= new int[n2];
//         for(int i =0;i<a2.length;i++){
//             a2[i]=scn.nextInt();
//         }

//         int i =0;
//         int j =0;

//         while(i<a1.length && j<a2.length){

//             if(a1[i]==a2[j]){
//                 System.out.print(a1[i]);
//                 i++;
//                 j++;
//             }
//             else if(a1[i]>a2[j]){
//                 j++;
//             }
//             else{
//                 i++;
//             }
//         }
        
       
//     }

// }