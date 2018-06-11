package com.basic;

public class CloneExample implements Cloneable
{
	public CloneExample(){
		
	}
	public static void main(String[] args) {
		try
		{
			CloneExample ceOne=new CloneExample();
			CloneExample ceTwo=(CloneExample)ceOne.clone();
			System.out.println(ceOne.hashCode()+"==="+ceTwo.hashCode());
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		int i;
		int one[]={48,76,56,8,5,7};
		int two[]=new int[one.length];
		
		
		System.arraycopy(one, 0, two, 0, one.length);
			
		for(i=0;i<one.length;i++){
	
	System.out.println(two[i]);
		}
		
		}
			
	}


