package com.basics;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class UserID {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String summ = "";
		String arr[] = new String[2];
		String firstName = in.next();
		String lastName = in.next();
		int PINcode = in.nextInt();
		String x = ""+PINcode;
		int Num = in.nextInt();
		int i = 0,sum = 0,sad = 0;
		char a = 0,aa = 0;
		List <String> list = new ArrayList<>();
		 java.util.Collections.addAll(list,firstName,lastName);
		 java.util.Collections.sort(list);
		 for(String s:list)
		 {
			 arr[i] = s;
			 i++;
		 }
		 String first = arr[0];
		 String last = arr[1];
		 if(Num <= x.length())
		 {
		if(first.length() < last.length())
		{
			 a += first.charAt(first.length()-1);
			 summ += a + last;		
		}
		else if(first.length() > last.length())
		{
			 a += last.charAt(last.length()-1);
			 summ += a + first;		
		}
		else if(first.length() < last.length())
		{
			 a += first.charAt(first.length()-1);
			 summ += a + last;		
		}
		char[] p = summ.toCharArray();
		for(int j = 0;j < summ.length();j++)
		{
			aa = p[j];
			sad = (int)aa;
			if(sad >= 65 && sad<= 90)
			{
				sad = sad + 32;
				System.out.print((char)sad);
			}
			else
			{
				sad = sad - 32;
				System.out.print((char)sad);
			}
		}
		String s = ""+PINcode;
		char[] ch = s.toCharArray();
		System.out.print(ch[Num-1]);
		for(int j = 0;j < s.length();j++)
		{
			int rem = PINcode % 10;
			sum = (sum*10) + rem;
			PINcode = PINcode / 10;
		}
		String f = ""+sum;
		char[] ch1 = f.toCharArray();
		System.out.print(ch1[Num-1]);
		}
		 else
			System.out.print("ERROR");
	}
}

