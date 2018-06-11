package com.basic;

public class ClassGenerics<M,S,R> {
public ClassGenerics(){
}
public R getCustomer(M m,S s){
	return null;
}
public static void main(String[] args) {
	ClassGenerics<Double,Double,Integer> cs=new ClassGenerics<Double,Double,Integer>();
	Integer i=cs.getCustomer(84.4, 47.3);
}
}

