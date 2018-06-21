package com.basics;
import java.util.Scanner;

public class WorldWideWeb {
	 public static void main (String args[]) {
         String input1;
         System.out.println("Enter the word");
            Scanner sc=new Scanner(System.in);
         input1=sc.nextLine();
         input1=input1.toUpperCase();
         String a[]=input1.split(" ");
         for(int i1=0;i1<a.length;i1++) {
         int sum=0;     
           for (int j = 0; j < a[i1].length()/2; j++) {
              char b1=a[i1].charAt(j);
              char b2=a[i1].charAt(a[i1].length()-1-j);
              int b=(int)b1-(int)b2;
             if(b<0)
             {
               b=-b;
             }sum =sum+b;
           }
                 if(a[i1].length()%2!=0)
                 {
                      int c=(a[i1].length()/2);
                      char d=a[i1].charAt(c);
                      int e=(int)d;
                      int f=e-64;
                     int f1=f+sum;
                   System.out.print(f1);            
                   }else
                   {
                     System.out.print(sum);
                   }            
                 }}
}
