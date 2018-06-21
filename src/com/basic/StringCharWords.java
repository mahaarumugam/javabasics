package com.basics;

public class StringCharWords {
	 public static void main(String args[])
	    {
		 String str = "Bread butter  bread";
	       
	        int count = 0 ;
	        String a=str.toLowerCase();
	        String[] ch=a.split(" ");
	        for(int i=0;i<ch.length;i++)
	        {
	           
	            for(int j = 0;j<ch.length;j++)
	            {           
	            	if(ch[i].equals(ch[j]) )                                           
	                {
	                    count++;
	                }else
	                	break;

	            }
	        }
	                	
	                System.out.println(count);
	            }
	       }
	 
	    

	    
