
public class Candle{
	private String color;
	private double size;
	private String essence;
	private int lightDegree;

public Candle(String color,double size,String essence,int lightDegree){//Method constructor
	this.color=color;
	this.size=size;
	this.essence=essence;
	this.lightDegree=lightDegree;
}

//Get methods
public String getColor(){
	return color;
}
public double getSize(){
	return size;
}
public String getEssence(){
	return essence;
}
public int getlightDegree(){
	return lightDegree;
}
//Set Methods
public void setColor(String pcolor){
	this.color = color;
}
public void setSize(double psize){
	this.size = psize;
}
public void setEssence(String pessence){
	this.essence = pessence;
}
public void setLight(int plight){
	this.lightDegree = plight;
}
}