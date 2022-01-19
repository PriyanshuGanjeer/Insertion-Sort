


import java.util.Scanner; 
import java.util.*;
public class Main   
{  
public static void main(String[] args)   
{  
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  
n=sc.nextInt();  
//creates an array in the memory of length 10  
int[] array = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
// accessing array elements using the for loop  
for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
} 
// Now Insertion-Sort Code start
int x,y,temp;
for(x=1;x<n;x++){
    temp=array[x];
    y=x-1;
    while(y>=0&&array[y]>temp){
        array[y+1]=array[y];
        y--;
    } array[y+1]=temp;}
    System.out.println("Sorted array is");
    System.out.println(Arrays.toString(array));
    

}  
}  