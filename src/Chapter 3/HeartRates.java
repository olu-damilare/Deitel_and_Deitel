public class HeartRates{
	private String firstName;
	private String lastName;
	private int year;
	private int month;
	private int day;
	private int age;
	private int maximumHeartRate;
	
	public HeartRates(String firstName, String lastName, int dateOfBirth){};
	
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
	public void setDOB(int month, int day, int year){
		if(month >= 1 && month <=12 && day >= 1 && day <= 31 && year >= 1900 && year <= 2021)
			{this.year = year;
			this.month = month;
			this.day = day;}
	}
	public String getDateOfBirth(){
		String DOB = month + "/" + day + "/" + year;
		return  DOB;
	}
	public int calculateAge(){
		age = 2021 - year;
		return age;
		
	}
	public int calculateMHR(){
		maximumHeartRate = 220 - age;
		return maximumHeartRate; 
	}
	public String getTargetHeartRate(){
		double minimumTargetHeartRate = 0.5 * ((double) maximumHeartRate);
		double maximumTargetHeartRate = 0.85 * ((double) maximumHeartRate);
		String targetHeartRate = minimumTargetHeartRate + " - " +  maximumTargetHeartRate;
		return targetHeartRate;
	}



}