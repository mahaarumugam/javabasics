package com.basics;

public class DuplicateString {
	public static void main(String args[]) {
		String str = "ksr college";
        char[] ch = str.toCharArray();
        int i=0,j=0;
     
        for(i=0;i<ch.length;i++)
        {
        	 int count = 0 ;
            for( j = 0;j<ch.length;j++)
            {           
            	if(ch[i]==ch[j])                                            
                {
                    count++;
                }
            }
            if(count==1){
                	
                System.out.print(str.charAt(i));
            }
           }
        }

        }



    
