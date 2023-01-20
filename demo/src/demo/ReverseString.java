package demo;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Mohit";
		String result = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			result+=name.charAt(i);
		}
		
		System.out.println(result);
		
	}

}
