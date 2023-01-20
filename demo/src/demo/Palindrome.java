package demo;

public class Palindrome {

	public static void main(String[] args) {
		String name = "Mam";
		
        String result = "";
        
     
		
		for(int i=name.length()-1; i>=0; i--) {
			result+=name.charAt(i);
		}
		
		if(name.equals(result)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
