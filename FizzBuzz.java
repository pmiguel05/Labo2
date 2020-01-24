public class FizzBuzz {
	public static void main (String [] args){
		int max = 100;
		for(int i= 1; 1 < max; i++){
			if (i% 3 == 0) System.out.print("Fizz");
				if ( i% 15 == 0)System.out.print("FizzBuzz");
				else if (i% 3 == 0) System.out.print("Fizz");
				else if (i% 5 == 0) System.out.print("Buzz");
				else System.out.print("");
			
			
		}
	}
}
