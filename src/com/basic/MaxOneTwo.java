package com.basic;

public class MaxOneTwo {
	
public static void main(String[] args) {
   int max1=0,max2=0;
   int num[]={5,34,78,2,45,99,23};
for(int i=0;i<num.length;i++)
{
	
	if(max1<num[i]){
		max2=max1;
	
		max1=num[i];
	}
}
   System.out.println(max1+"  and "+max2);

}
}