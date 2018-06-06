package com.basic;

import java.util.Scanner;

 class Sales {
	public static void main(String[] args) {
		
	
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int	count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int count9=0;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of Employes");
		int n=scan.nextInt();
		int employes[]=new int[n];
		System.out.println("Enter the Salesvalue");
		for(int  j=0;j<n;j++)
		{
			employes[j]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			employes[i]=200+((9*employes[i])/100);
			if(employes[i]>200 && employes[i]<300)
			{
				count1++;
			}
		if(employes[i]>300 && employes[i]<400)
		{
			count2++;
		}
	if(employes[i]>400 && employes[i]<500)
	{
					count3++;
			}
	if(employes[i]>500 && employes[i]<600)
	{
					count4++;
			}
	if(employes[i]>600 && employes[i]<700)
	{
					count5++;
			}
	if(employes[i]>700 && employes[i]<800)
	{
					count6++;
			}
	if(employes[i]>800 && employes[i]<900)
	{
					count7++;
			}
	if(employes[i]>900 && employes[i]<1000)
	{
					count8++;
			}
	if(employes[i]>1000 && employes[i]<1100)
	{
					count9++;
	}

		
		}
		System.out.println("value between 200 to 299 is "+count1);
		System.out.println("value between 300 to 399 is "+count2);
		System.out.println("value between 400 to 499 is "+count3);
		System.out.println("value between 500 to 599 is "+count4);
		System.out.println("value between 600 to 699 is "+count5);
		System.out.println("value between 700 to 799 is "+count6);
		System.out.println("value between 800 to 899 is "+count7);
		System.out.println("value between 900 to 999 is "+count8);
		System.out.println("value between 1000 to 1099 is "+count9);
		
	}
 }
	
	


