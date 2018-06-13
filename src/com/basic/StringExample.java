package com.basic;

public class StringExample {
public StringExample(){
}
public static void main(String[] args) {
String one="Good";//string literal
String oneObj=new String("Good");//string object
String two="Good";
System.out.println(one==two);
System.out.println(one.equals(two));
System.out.println(one.equalsIgnoreCase(oneObj));
System.out.println(one.hashCode());
one=one+"bad";
System.out.println(one);
System.out.println(one.hashCode());
String s="this,is,an,example";
String ss[]=s.split(",");
for(int i=0;i<ss.length;i++){
	System.out.println(ss[i]);
}
StringBuffer sb=new StringBuffer();
sb.append("ss");
sb.append("two");
sb.append("three");
System.out.println(sb);
StringBuilder sbuilder=new StringBuilder();
sbuilder.append("ss");
sbuilder.append("two");
sbuilder.append("three");
System.out.println(sbuilder);
}
}


