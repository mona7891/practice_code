import java.util.*;
class Array_reve
{
	public static void reverse(int arr[],int n)
        {
                int b[] = new int[n];
                int j = n;

                for(int i=0;i<n;i++)
                {
                        b[j-1] = arr[i];
                        j=j-1;
                }
                System.out.println("Reverse Array Are :");

                for(int k=0;k<n;k++)
                {
                        System.out.print(b[k]+" ");
                }
                System.out.println();
        }
        public static void main(String args[])
        {
                int arr[] = {10,20,30,40,50,60};

                reverse(arr,arr.length);
        }
}

