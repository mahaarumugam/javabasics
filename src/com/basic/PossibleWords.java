package com.basic.test;

import java.util.Scanner;

public class PossibleWords {
	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("input1");
         String input1=sc.next();
         System.out.println("input2");
         String input2=sc.next();
         String a[]=input1.split("_");
         String b[]=input2.split(":");
boolean c[]=new boolean[10];
           String d[]=new String[10];
         for(int i=0;i<b.length;i++)
         {
         c[i]=b[i].toLowerCase().startsWith(a[0].toLowerCase())&&b[i].toLowerCase().endsWith(a[1].toLowerCase());
         if(c[i]==true) {
          
           d[i]=b[i].toUpperCase();
           if(d[i].length()==input1.length())
           System.out.println(d[i]);
         }
       }
         }

}
