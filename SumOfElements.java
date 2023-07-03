import java.util.Scanner;
public class SumOfElements {
        public static void main(String args[]){
            int n,sum=0;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size of array:");
            n=sc.nextInt();
            int arr[]=new int[n];
            System.out.print("Enter the elements:");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt(); 
                sum +=arr[i];
            } 
            System.out.print("Sum of the elements is "+sum);
        }
    }