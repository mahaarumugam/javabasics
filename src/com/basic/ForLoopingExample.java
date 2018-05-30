package com.basic;

public class ForLoopingExample {
	public static void main(String []args)
	{
		int i;
		for(i=0;i<10;i++)
		{
			System.out.println("for loop "+i);
		}
		for(i=0;i<10;i++)
		{
			if(i==3){
				continue;
			}
			System.out.println("for loop break "+i);
			if(i==5){
				break;
			}
		}
	}

}
