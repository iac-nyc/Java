import java.util.Scanner;


public class StringBuilderApp {
	static	 Scanner skanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
        String s = skanner.nextLine();	
		StringBuilder sb = new StringBuilder(s);
		
        
		int vowelCount = 0;
	   
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			if( (c=='A') || (c=='a') 
				||	(c=='E') || (c=='e')
				||  (c=='I') || (c=='i')
				||  (c=='O') || (c=='o')
				||  (c=='U') || (c=='u') ) {
                
                sb.setCharAt(i, '*');
				vowelCount++;
			}
		}
		System.out.println();
		System.out.println(s);
		System.out.println(sb.toString());
		System.out.println("Total number of vowels: "+vowelCount);
	

	}

}
