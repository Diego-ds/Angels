public class Legion{

private String name;
private Archangel arch[];
private int cant;

public Legion(String name, int c){
	this.name=name;
	arch = new Archangel[c];
	this.cant =c;
}

public String addArchangel(String pname,String pphoto,String ppower,String ppray,String pcolor,double psize,String pessence,int plight,int pday,String pmonth,Candle cand,Date date){
	Candle can1 = new Candle(pcolor,psize,pessence,plight);
	Date dat1 = new Date(pday,pmonth);
    Archangel ang1 = new Archangel(pname,pphoto,ppower,ppray,can1,dat1);
	String msg = "";
	boolean val = false;
	//valida que termine en "el",que no exista otro con el mismo nombre o poder
	if(pname.substring(pname.length()-2).equalsIgnoreCase("el")){
		for(int i = 0;i<arch.length && !val;i++){
    	if(arch[i] != null ){
    		if(arch[i].getName().equalsIgnoreCase(pname)){
            msg = "\nError: There is another archangel with the same name.\n";
    	    val=true;
        	} 
    	}
	}
    for(int j = 0;j<arch.length && !val;j++){
    	if(arch[j] != null){
    		if(arch[j].getPower().equalsIgnoreCase(ppower)){
    	    val=true;
            msg = "\nError: There is another archangel with the same power.\n";
        	}
    	}
    }
    if(arch[arch.length-1]!=null){
    	val=true;
    	msg="You cant register more angels because you have registered all the angels.\n";
    }    
    }
    else{
    	msg = "\nError: The name doesn't end in <el> \n";
    	val=true;
    }

    if(val==false){
    	for(int t =0;t<arch.length && !val;t++){
    		if(arch[t]==null){
    			arch[t]=ang1;
    			msg = "\nYou have registered the archangel sucessfully\n";
    			val = true;
    		}

    	}
    }
    return msg;
}

public Archangel buscarName(String name){
	boolean val = false;
    Archangel angel = null;
	for(int i =0;i<arch.length && !val;i++){
		if(arch[i]!=null){
		if(arch[i].getName().equalsIgnoreCase(name)){
			angel = arch[i];
			val = true;
		}
	}
		else{
			val=true;
		}
		}
	
return angel;

}
public Archangel buscarPower(String pow){
	boolean val = false;
    Archangel angel = null;
	for(int i =0;i<arch.length && !val;i++){
		if(arch[i]!=null){
		if(arch[i].getPower().equalsIgnoreCase(pow)){
			angel = arch[i];
			val = true;
		}
	}
			else{
			val=true;
		}
	}

return angel;

}
public int getCant(){
	return cant;
}
public void toStringName(String nam){
     	
        boolean val = false;

     for(int i =0;i<arch.length && !val;i++){
      	if(arch[i]!=null){
      		if(arch[i].getName().equalsIgnoreCase(nam)){
      			    System.out.println("---------------------------");
      		 		System.out.println(arch[i].getName());
                    System.out.println(arch[i].getPhoto());
                    System.out.println(arch[i].getDate().getDay());
                    System.out.println(arch[i].getDate().getMonth());
                    val=true;
            }
      	}
      	else{
 	   		System.out.print("Error: the angel doesn't exist");
 	   		val =true;
    	}
     }
	
}
public void toStringPower(String pow){
     	
        boolean val = false;

     for(int i =0;i<arch.length && !val;i++){
      	if(arch[i]!=null){
      		if(arch[i].getPower().equalsIgnoreCase(pow)){
      			    System.out.println("---------------------------");
      		 		System.out.println(arch[i].getName());
                    System.out.println(arch[i].getPhoto());
                    System.out.println(arch[i].getDate().getDay());
                    System.out.println(arch[i].getDate().getMonth());
            }
      	}
      	else{
 	   		System.out.print("Error: the angel doesn't exist");
 	   		val =true;
    	}
     }
	
}
public void showMonth(String mon){
	boolean val = false;
	for(int i =0;i<arch.length && !val;i++){
		if(arch[i]!=null){
			if(arch[i].getDate().getMonth().equalsIgnoreCase(mon)){
				System.out.println("Name: "+arch[i].getName());
				System.out.println("Day: "+arch[i].getDate().getDay());
				System.out.println("Candle color: "+arch[i].getCandle().getColor());
				System.out.println("Candle essence: "+arch[i].getCandle().getEssence());
				System.out.println("-----------------------------------");

			}
		}
		else{
			val=true;
		}
	}
}

public String showAll(){
	String msg = "";
	boolean val = false;
	for(int i =0;i<arch.length && !val;i++){
		if(arch[i]!=null){
			msg+=arch[i].getName()+": "+arch[i].getDate().getDay()+" of "+ arch[i].getDate().getMonth()+", ";

		}
		else{
			val=true;
		}
	}
	return msg;
}

public int count(){
	boolean val = false;
	int cont = 0;
	for(int i =0;i<arch.length && !val;i++){
		if(arch[i]!=null){
			cont++;
		}
		else{
			val=true;
		}
	}
	return cont;
}

}



