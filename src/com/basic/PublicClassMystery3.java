package com.basic;

public class PublicClassMystery3 {
public static void main(String []args)
{
	int row=10;
	int column;
	while(row>=1)
	{
		column=1;
		while(column<=10)
		{
			System.out.println(row %2==1?"<":">");
			++column;
		}
		--row;
		System.out.println();
		
	}
}
}
