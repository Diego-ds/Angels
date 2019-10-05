

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
/*public String addCandle(String pcolor,double psize,String pessence,int plight){
	String msg = "";
	Candle can1 = new Candle(pcolor,psize,pessence,plight);
	boolean val = true;
	for(int i = 0;i<cand.length()&&val;i++){
		if(cand[i]==null){
			cand[i]=can1;
			msg = "\nThe candle has been added sucesfully\n";
			val =false;
		}
	}
return msg;
	
}
public String addDate(int pday,String pmonth){
	String msg = "";
		Date fecha = new Date(pday,pmonth);
	    boolean val = true;
	    for(int i =0;i<date.length()&&val;i++){
	    	if(date[i]==null){
	    		date[i]=fecha;
	    		val = false;
	    		msg="The date has been added sucessfully";
	    	}
	    }
	    return msg;
}
*/

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