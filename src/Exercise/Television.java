public class Television {
	private boolean isOn;
	private String name;
	private int volume;
	private int channel;
	private int volumeBeforeMute;
	private boolean mute;

	public Television(String name){
		this.name = name;
	}

	public void increaseVolume(){
		if(isOn == true){
			if (mute == true){
				muteVolume();
				volume = volumeBeforeMute;
				volume++;
			}
			if (volume  >= 0 && volume < 100){
				volume++;
			}
			else
				System.out.println("The volume cannot increase beyond 100");
		}
		else
		System.out.println("The television is switched off");
	}

	public void decreaseVolume(){
		if(isOn == true){
			if (mute == true){
				muteVolume();
				volume = volumeBeforeMute;
				volume--;
			}
			if (volume <= 100 && volume >= 1){	
				volume -= 1;
			}
			else
				System.out.println("The volume cannot decrease below 0");
			
		}
		else
			System.out.println("The television is switched off");
	}
	
	public void setVolume(int newVolume){
		if(isOn == true){
			if(newVolume >= 0 && newVolume <= 100)
			volume = newVolume;
			else
			System.out.println("invalid volume number");
		}
		else
		System.out.println("Television is switched off");
	}
	public int getVolume(){
		return volume;
	}
	public boolean isMute(){
		return mute;
	}
	
	public boolean isOn(){
		return isOn;
	}
	public void setOn(boolean switchOn){
		isOn = switchOn;
		if (isOn == true){
			channel = 1;
			volume = 50;
		}
		else
			System.out.println("Television is switched off");
	} 
	
	public String getName(){
		return name;
	}
	public void muteVolume(){
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
	public void setChannel(int newChannel){
		if(isOn == true){
			if(newChannel >=1 && newChannel <=150)
				channel = newChannel;
			else 
				System.out.println("Invalid channel number");
		}
		else
			System.out.println("Television is switched off");	
	}
	public void nextChannel(){
		if(isOn == true){
			if (channel > 0 && channel != 150){
				channel += 1;
			}
			if(channel == 150)
				channel = 1;
		}
		else
		System.out.println("The television is switched off");

	}
	
	
	public void previousChannel(){
		if(isOn == true){
			if (channel != 1 && channel <= 150){
				channel -= 1;
			}
			if(channel == 1)
				channel = 150;
		}
		else
		System.out.println("The television is switched off");

	}
	public int getChannel(){
		return channel;
	}

}