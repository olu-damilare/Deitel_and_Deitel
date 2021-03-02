public class Date {
	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year){
		this.month = month;
		this.day=day;
		this.year=year;
	}
	public void setMonth(int month){
		if (month >= 1 && month <= 12)
			this.month = month;
	}
	public int getMonth(){
		return month;
	}
	public boolean checkThirtyDayMonth(int month, int day){
		if((month == 4 || month == 6 || month == 9 || month == 11)){
			return true;
		}
		return false;
	}
	public boolean checkFebruary(int month, int day){
		if (month == 2 && day < 29){
			return true;
		}
		if(checkLeapYear(month,day,getYear())){
			return true;
		}
		return false;
	}

	public boolean checkLeapYear(int month, int day, int year){
		boolean isLeapYear = year % 4 == 0 && month == 2 && day <= 29;
		return isLeapYear;
	}
	public void setDay(int day){
		if(getMonth()!=2){
			if(checkThirtyDayMonth(getMonth(),getDay())&&day<31){
				this.day=day;
			}
			if(!checkThirtyDayMonth(getMonth(),getDay())&&day<32){
				this.day=day;
			}
		}
		if(checkFebruary(getMonth(), day)){
			this.day = day;
		}
	}
	public int getDay(){
		return day;
	}
	public void setYear(int year){
		if(year >= 1900 && year <2022)
			this.year = year;
	}
	public int getYear(){
		return year;
	}
	public String displayDate(){
		String newDate = month + "/" + day + "/" + year;
		return newDate;
	}
}
