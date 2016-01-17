package モールス信号;

import java.io.*;

public class shingo {
	public static void main(String[] args) {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			char c = line.charAt(0);
			switch (c) {
				case'a':
				System.out.println("・ー");
					
				case'b':
					System.out.println("－・・・");
						
				case'c':
					System.out.println("－・－・");
					
				case'd':
					System.out.println("－・・");
						
				case'e':
					System.out.println("・");
					
				case'f':
					System.out.println("・・－・");
						
				case'g':
					System.out.println("－・・");
					
				case'h':
					System.out.println("・・・・");
					
				case'i':
					System.out.println("・・");
					
				case'j':
					System.out.println("・－－－");
					
				case'k':
					System.out.println("－・－");
					
				case'l':
					System.out.println("・－・・");
					
				case'm':
					System.out.println("－－");
					
				case'n':
					System.out.println("－・");
					
				case'o':
					System.out.println("－－－");
					
				case'p':
					System.out.println("・－－・");
					
				case'q':
					System.out.println("－－・－");
					
				case'r':
					System.out.println("・－・");
					
				case's':
					System.out.println("・・・");
					
				case't':
					System.out.println("－");
					
				case'u':
					System.out.println("・・－");
					
				case'v':
					System.out.println("・・・－");
					
				case'w':
					System.out.println("・－－");
					
				case'x':
					System.out.println("－・・－");
					
				case'y':
					System.out.println("－・－－");
					
				case'z':
					System.out.println("－－・・");
			
			}
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		
		
		
		
		}
}
