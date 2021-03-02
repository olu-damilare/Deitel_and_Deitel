public class AirConditioner {

	private boolean isOn;
	private String productName;
	private int temperature;

	public void decreaseTemperature(){
		if(isOn == true){
			if (temperature > 16 && temperature <= 30){	
				temperature -= 1;
			}
			else
				System.out.println("The temperature cannot decrease below 16 degrees");
			
		}
		else
			System.out.println("The Air Conditioner is switched off");
	}
	public String getProductName(){
		return productName;
	}
	public int getTemperature(){
		return temperature;
	}
	public void increaseTemperature(){
		if(isOn == true){
			if (temperature  >= 16 && temperature < 30){
				temperature += 1;
			}
			else
				System.out.println("The temperature cannot increase above 30 degrees");
		}
		else
		System.out.println("Air Conditioner is turned off");
	}
	public boolean isOn(){
		return isOn;
	}
	public void setOn(boolean switchOn){
		isOn = switchOn;
		if (isOn == true)
			temperature = 16;
	} 
	public void setProductName(String newProductName){
		productName = newProductName;
	}
	public void setTemperature(int newTemperature){
		if(isOn == true){
			if(newTemperature >= 16 && newTemperature <= 30)
			temperature = newTemperature;
			else
			System.out.println("kolework");
		}
		else
		System.out.println("Air Conditioner is switched off");
	}


}