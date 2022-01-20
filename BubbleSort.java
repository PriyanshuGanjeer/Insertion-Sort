
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

import java.util.*;
public class BubbleSort
{
    public static void main(String[] args) {
        System.out.println("Ascending order sorting using Bubble Sort");
        int[] a={5,8,2,13,4,6};
        int n=a.length;
        int temp,i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    System.out.println(Arrays.toString(a));
    // Now Sort Descending Order 
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[j]>a[i]){
           // for Descending order only change Here < to >       
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Descending order Sorting Using Bubble Sort");
        System.out.println(Arrays.toString(a));
    }
    
}
