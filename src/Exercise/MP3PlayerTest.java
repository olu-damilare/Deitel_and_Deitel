public class MP3PlayerTest{

	public static void main (String... args){

	MP3Player myMusicPlayer = new MP3Player(15, 10);
	myMusicPlayer.setOn(true);
	
	System.out.println(myMusicPlayer.isOn());
	System.out.println("The volume is " + myMusicPlayer.getVolume());

	myMusicPlayer.decreaseVolume();
	System.out.println("The volume is " + myMusicPlayer.getVolume());
	myMusicPlayer.decreaseVolume();
	System.out.println("The volume is " + myMusicPlayer.getVolume());
	
	myMusicPlayer.increaseVolume();
	myMusicPlayer.increaseVolume();
	myMusicPlayer.increaseVolume();
	myMusicPlayer.increaseVolume();
	myMusicPlayer.increaseVolume();
	System.out.println("The volume is " + myMusicPlayer.getVolume());
	

	myMusicPlayer.previousTrack();
	System.out.println("Track " + myMusicPlayer.getCurrentTrack());

	myMusicPlayer.previousTrack();
	myMusicPlayer.previousTrack();
	myMusicPlayer.previousTrack();
	myMusicPlayer.previousTrack();

	myMusicPlayer.pauseOrPlayTrack();
	System.out.println(myMusicPlayer.isTrackPlaying());
	System.out.println(myMusicPlayer.isTrackPaused());
	System.out.println();

	myMusicPlayer.pauseOrPlayTrack();
	System.out.println(myMusicPlayer.isTrackPlaying());
	System.out.println(myMusicPlayer.isTrackPaused());
	System.out.println();

	System.out.println("Track " + myMusicPlayer.getCurrentTrack());

	myMusicPlayer.nextTrack();
	System.out.println("Track " + myMusicPlayer.getCurrentTrack());
	
	myMusicPlayer.muteTrack();
	System.out.println("volume is " + myMusicPlayer.getVolume());
	myMusicPlayer.decreaseVolume();
	myMusicPlayer.decreaseVolume();
	myMusicPlayer.decreaseVolume();
	//myMusicPlayer.muteTrack();
	System.out.println("volume is " + myMusicPlayer.getVolume());
	
	
	}



}