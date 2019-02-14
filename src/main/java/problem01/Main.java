package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		String text = Integer.toString(number);
		int answer=0;
		for(int i=0; i<text.length();i++) {
			if(text.charAt(i)=='3'||text.charAt(i)=='6'||text.charAt(i)=='9') {
				answer++;
			}
		}
		return answer;
	}
}