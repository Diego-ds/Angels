package model;
public class Date{
	private int day;
	private String month;

public Date(int day,String month){//Constructor method
	this.day=day;
	this.month=month;
}
//Get methods

public int getDay(){
	return day;
}
public String getMonth(){
	return month;
}
//Set methods
public void setDay(int pday){
	this.day=pday;
}
public void setMonth(String pmonth){
	this.month=pmonth;
}
}