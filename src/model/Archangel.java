

public class Archangel{
   private String name;
   private String photo;
   private String power;
   private String pray;
   private Candle cand;
   private Date date;
   
public Archangel(String name,String photo,String power,String pray,Candle cand,Date date){//Constructor method

	this.name =name;
	this.photo=photo;
	this.power=power;
	this.pray=pray;
	this.date=date;
	this.cand=cand;

}

//Get mehods
public String getName(){
	return name;


}
public String getPhoto(){
	return photo;
}
public String getPower(){
	return power;
}

//Set methods
public void setName(String pname){
     this.name = pname;
}
public void setPhoto(String pphoto){
	this.photo=pphoto;
}
public void setPower(String ppower){
	this.power=ppower;
}

public void addCandle(String pname,double psize,String pessence,int plight){
      
}
public Candle getCandle(){
	return cand;
}
public Date getDate(){
    return date;
}
}