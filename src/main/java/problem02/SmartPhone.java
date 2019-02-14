package problem02;

public class SmartPhone extends MusicPhone {
	
	@Override
	public void execute( String function ) {
		if(function.equals("통화")) {
			System.out.println(super.call());
		}
		if (function.equals("음악")) {
			System.out.println(playMusic());
			
		}
		if(function.equals("앱")) {
			System.out.println(runApp());
			
		}
	}
		
	public String runApp() {
		//return null;
		return "앱실행";
	}
	public String playMusic() {
		return "스트리밍";
	} 
}