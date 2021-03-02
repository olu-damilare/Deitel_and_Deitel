public class TelevisionTest{

	public static void main (String... args){

	Television myTelevision = new Television("LG");
	myTelevision.setOn(true);
	
	System.out.println(myTelevision.isOn());
	System.out.println("The volume is " + myTelevision.getVolume());
	System.out.println("This television is an " + myTelevision.getName() + " product.");

	myTelevision.setVolume(5);
	myTelevision.decreaseVolume();
	System.out.println("The volume is " + myTelevision.getVolume());
	myTelevision.decreaseVolume();
	System.out.println("The volume is " + myTelevision.getVolume());

	myTelevision.setVolume(96);
	System.out.println("The volume is " + myTelevision.getVolume());
	myTelevision.muteVolume();
	System.out.println("The volume is " + myTelevision.getVolume());
	myTelevision.muteVolume();
	myTelevision.increaseVolume();
	myTelevision.increaseVolume();
	myTelevision.increaseVolume();
	myTelevision.increaseVolume();
	myTelevision.increaseVolume();
	System.out.println("The volume is " + myTelevision.getVolume());
	
	myTelevision.decreaseVolume();
	System.out.println("The volume is " + myTelevision.getVolume());
	
	myTelevision.setChannel(1);
	System.out.println("Channel " + myTelevision.getChannel());

	myTelevision.previousChannel();
	System.out.println("channel " + myTelevision.getChannel());

	myTelevision.previousChannel();
	myTelevision.previousChannel();
	myTelevision.previousChannel();

	System.out.println("channel " + myTelevision.getChannel());


	myTelevision.setChannel(150);
	myTelevision.nextChannel();
	System.out.println("channel " + myTelevision.getChannel());
	
	
	
	
	}



}