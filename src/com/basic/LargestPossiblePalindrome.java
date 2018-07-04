package com.basics;

import java.util.*;

public class LargestPossiblePalindrome {
public static void main(String[] args) {
      Scanner in=new Scanner(System.in);	
      String input = in.next();
      input = input.toUpperCase();
      int len = input.length();
      int freq[] = new int[26];
      char[] ch = input.toCharArray();
      for(int i = 0; i < len; i++)
       {
	     int a = ((int)(ch[i]))-64;
	     freq[a]++;
      }
     int count = 0;
     int count1 = 0;
     for(int j = 0; j < freq.length; j++)
      {
	
	     if(freq[j] == 1)
		 count1 = 1;
	
	else
	
		count = count + freq[j];
	}
	if(count == 0)
		System.out.println("-1");
	else if(count%2 == 1)
	    System.out.println(count);
	  else
	   System.out.println(count + count1);
	}
	
}


