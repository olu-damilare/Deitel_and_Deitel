public class AirConditionerTest{

	public static void main (String... args){

	AirConditioner myAirConditioner = new AirConditioner();
	myAirConditioner.setOn(true);
	myAirConditioner.setProductName("Heir Thermocool");
	
	System.out.println(myAirConditioner.isOn());
	System.out.println(myAirConditioner.getTemperature());
	myAirConditioner.setTemperature(20);
	System.out.println("The temperature is " + myAirConditioner.getTemperature() + " degrees");
	System.out.println("This Air Conditioner is a " + myAirConditioner.getProductName() + " product.");

	myAirConditioner.decreaseTemperature();
	System.out.println("The temperature is " + myAirConditioner.getTemperature() + " degrees");

	myAirConditioner.setTemperature(26);
	System.out.println("The temperature is " + myAirConditioner.getTemperature() + " degrees");
	
	myAirConditioner.increaseTemperature();
	System.out.println("The temperature is " + myAirConditioner.getTemperature() + " degrees");
	
	myAirConditioner.setOn(true);
	System.out.println(myAirConditioner.isOn());

	myAirConditioner.setTemperature(26);
	System.out.println("The temperature is " + myAirConditioner.getTemperature() + " degrees");
	
	myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
myAirConditioner.decreaseTemperature();
	System.out.println("The temperature is " + myAirConditioner.getTemperature() + " degrees");

	myAirConditioner.setOn(false);
	System.out.println(myAirConditioner.isOn());
System.out.println("The temperature is " + myAirConditioner.getTemperature() + " degrees");

	
	}



}