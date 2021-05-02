package exercise2_4;

public class Main {

	public static void main(String[] args) {
		Video rick=new Video();
		
		rick.setDuration(212);
		rick.setQuality(1080);
		rick.setMute(true);
		rick.setPlay(true);
		rick.setPlaySpeed(1.25);
		
		rick.VideoDetail();
		
		rick.changePlaySpeed();
		
		rick.stopVideo();
		
		rick.remainDuration();
		
		
	}

}
