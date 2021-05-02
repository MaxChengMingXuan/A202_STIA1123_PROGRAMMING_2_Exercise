package exercise2_4;
import java.util.Scanner;
public class Video {
	Scanner scan=new Scanner(System.in);
	int duration;
	int quality;
	Boolean play;
	Boolean mute;
	Double playSpeed;
	
	//Create Setter
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public void setQuality(int quality) {
		this.quality=quality;
	}
	public void setPlay(Boolean play) {
		this.play=play;
	}
	public void setMute(Boolean mute) {
		this.mute=mute;
	}
	public void setPlaySpeed(double playSpeed) {
		this.playSpeed=playSpeed;
	}
	
	//Create Getter
	public Integer getDuration() {
	  return this.duration;
	}
  
	public Integer getQuality() {
	  return this.quality;
	}
  
	public Boolean getPlay() {
 	  return this.play;
	}
  
	public Boolean getMute() {
 	  return this.mute;
	}
  
	public Double getPlaySpeed() {
	  return this.playSpeed;
	}
	
	//Methods
	public void VideoDetail() {
		System.out.println("Video duration(s)   : "+duration);
		System.out.println("Video quality       : "+quality+"p");
		System.out.println("Is the video playing?"+play);
		System.out.println("Is the video muted  ?"+mute);
		System.out.println("Video play speed    : "+playSpeed);
	}
	
	public void remainDuration() {
		int remain=duration-60;
		System.out.println("The remain duration of the video after playing 1 minutes: "+remain+"s\n");
	}
	
	public void changePlaySpeed() {
		System.out.println("Insert the new play speed.\n"
						  +"Speed 1.0-1\n"
						  +"Speed 1.5-2\n"
						  +"Speed 2.0-3\n");
		int i=scan.nextInt();
		if(i==1) {
			playSpeed=1.0;
		}
		else if(i==2) {
			playSpeed=1.5;
		}
		else if(i==3) {
			playSpeed=2.0;
		}
		System.out.println("Play speed updated.\n");
	}
	
	public void stopVideo() {
		int  i;
		System.out.println("Stop video?\n"
						  +"yes-1\n"
						  +"no -2\n");
		i=scan.nextInt();
		if(i==0) {
			play=false;
			mute=true;
		}
	}
	
	
}
