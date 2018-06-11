package com.basic;

public class ObjectExample {

	int count;
	String desc;
	public ObjectExample(){
		
	}
	/*@Override
	public String toString(){
		return count +","+desc;
	
	}*/
	public ObjectExample(int count,String desc){
		this.count=count;
		this.desc=desc;
	}

	@Override
	public String toString() {
		return "ObjectExample [count=" + count + ", desc=" + desc + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null){
			if(obj instanceof ObjectExample ){
				ObjectExample oe=(ObjectExample)obj;
				if(count==oe.count && desc.equals(oe.desc)){
					return true;
				}
				}
			}
		return false;
		}
	
public static void main(String[] args) {
	ObjectExample oe=new ObjectExample(100,"test");
	System.out.println(oe);
	System.out.println(oe.hashCode());
	Class clss=oe.getClass();
	Class cls=ObjectExample.class;
	ObjectExample oeOne=new ObjectExample(100,"test");
	System.out.println(oe.equals(oeOne));
}
@Override
protected void finalize()throws Throwable{
	System.out.println("finalize () called");
}
	}

