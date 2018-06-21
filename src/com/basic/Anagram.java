package com.basic.test;
import java.util.Arrays;
public class Anagram {
public static void main(String[] args) {
	String s1 = "catch";
    String s2 = "tachc";
    boolean isAnagram = false;
   
        char[] s1AsChar = s1.toCharArray();
        char[] s2AsChar = s2.toCharArray();
        Arrays.sort(s1AsChar);
        Arrays.sort(s2AsChar);
        isAnagram = Arrays.equals(s1AsChar, s2AsChar);
        if (isAnagram){
        System.out.println(s1 + " and " + s2 + " are anagrams");  
        }else{
        System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }
    } 
}