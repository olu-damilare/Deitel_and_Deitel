public class MP3Player{
	private boolean isOn;
	private int volume;
	private int currentTrack;
	private boolean playTrack;
	private boolean pauseTrack;
	private int volumeBeforeMute;
	private boolean mute;

	public MP3Player(int currentTrack, int volume){
		this.currentTrack = currentTrack;
		this.volume = volume;
	}

	public void increaseVolume(){
		if(isOn == true){
			if (mute == true){
				muteTrack();
				volume = volumeBeforeMute;
				volume++;
			}

			if (volume >= 0 && volume < 50){
				volume += 1;
			}
			else
				System.out.println("The volume cannot increase beyond 50");
		}
		else
		System.out.println("The MP3 is switched off");
	}

	public void decreaseVolume(){
		if(isOn == true){
			if (mute == true){
				muteTrack();
				volume = volumeBeforeMute;
				volume--;
			}
			if (volume <= 50 && volume >= 1){	
				volume -= 1;
			}
			else
				System.out.println("The volume cannot decrease below 0");
			
		}
		else
			System.out.println("MP3 is switched off");
	}
	public int getVolume(){
		return volume;
	}
	public boolean isMute(){
		return mute;
	}
	public void muteTrack(){
		if(isOn == true && volume != 0){
			volumeBeforeMute = volume;
			volume = 0;
			mute = true;
		}
		else if (isOn == true && volume == 0){
			volume = volumeBeforeMute;
			mute = false;
		}
	}
	
	public boolean isOn(){
		return isOn;
	}
	public void setOn(boolean switchOn){
		isOn = switchOn;
		if (isOn == true){
			playTrack = true;
			currentTrack = 1;
			volume = 25;
		}
		else{
			playTrack = false;
			currentTrack = 0;
			volume = 0;
			System.out.println("MP3 is switched off");
		}
	}
	public void nextTrack(){
		if(isOn == true){
			if (currentTrack > 0 && currentTrack != 70)
				currentTrack += 1;
			if(currentTrack == 70)
				currentTrack = 1;
		}
		else
		System.out.println("MP3 is switched off");

	}
	public void previousTrack(){
		if(isOn == true){
			if (currentTrack != 1 && currentTrack <= 70){
				currentTrack -= 1;
			}
			if(currentTrack == 1)
				currentTrack = 70;
		}
		else
		System.out.println("MP3 is switched off");

	}
	public int getCurrentTrack(){
		return currentTrack;
	}
	public void pauseOrPlayTrack(){
		if(playTrack == false){
			playTrack = true;
			pauseTrack = false;
		}
		else if(playTrack == true){
			playTrack = false;
			pauseTrack = true;
		}
	}
	public boolean isTrackPlaying(){
		return playTrack;
	}
	public boolean isTrackPaused(){
		return pauseTrack;
	}

}