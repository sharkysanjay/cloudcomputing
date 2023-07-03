import java.util.Scanner;
public class multiples {
        public static void main(String args[]){
            int n,mul=1;
            Scanner sc=new Scanner(System.in);
            System.out.println("Multiplication of elements:-");
            System.out.print("Enter the size of array:");
            n=sc.nextInt();
            int arr[]=new int[n];
            System.out.print("Enter the elements:");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt(); 
                mul *=arr[i];
            } 
            System.out.print("Multiplication of an elements is "+mul);
        }
    }