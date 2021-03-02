public class HealthProfile{
	private String firstName;
	private String lastName;
	private String gender;
	private double height;
	private double weight;
	private int maximumHeartRate;

        
	public HealthProfile(String firstName,String lastName, String gender, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	public int calculateAge(int year){
		int age = 2021 - year;
		return age;
	}
	public void setHeight(double height){
		if(height > 0)
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	public void setWeight(double weight){	
		if(weight > 0)
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
	public int calculateMHR(int year){
		int age = 2021 - year;
		maximumHeartRate = 220 - age;
		return maximumHeartRate; 
	}
	public String calculateTargetHeartRate(){
		double minimumTargetHeartRate = 0.5 * ((double) maximumHeartRate);
		double maximumTargetHeartRate = 0.85 * ((double) maximumHeartRate);
		String targetHeartRate = minimumTargetHeartRate + " - " +  maximumTargetHeartRate;
		return targetHeartRate;
	}
	public double calculateBMI(){
		double BodyMassIndex = (weight * 703)/(height * height);
		return BodyMassIndex;
	}
}