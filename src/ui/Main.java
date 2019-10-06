package ui;
import model.*;
import java.util.Scanner;

public class Main{
//Atributos
private Legion objLeg;
//Constructor method
public Main(){
	Scanner teclado = new Scanner(System.in);
	System.out.println("How many archangels do you want to enter\n");
	int cant=teclado.nextInt();
 objLeg = new Legion("Maximum Supirium",cant);
}

public static void main(String args[]){
Main obj = new Main();
Scanner teclado = new Scanner(System.in);
Scanner teclado1 = new Scanner(System.in);
int option = 0;
int helper = obj.getCant();
boolean val = true;


while(val==true){
obj.showMenu();
option = teclado.nextInt();
switch(option){
	case 1:
	obj.createArchangel();
	break;
	case 2:
	System.out.println("Enter the power of the archangel\n");
	String pow = teclado1.nextLine();
	obj.toStringPower(pow);
	break;
	case 3:
	System.out.println("Enter the name of the archangel\n");
	String nam = teclado1.nextLine();
	obj.toStringName(nam);
	break;
	case 4:
	System.out.println("Enter the month that you want to search\n");
	String mon = teclado1.nextLine();
	obj.showMonth(mon);
	break;
	case 5:
    System.out.println(obj.showAll());
    break;
    case 6:
    System.out.println("You have registered "+ obj.count() +" angels.\n");
    break;
    case 7:
    val=false;
    break;
    default:
    System.out.print("Error: invalid option");
}
}



}

/**
* This method recollect the information to create an archangel <br>
* <b>post: </b> The information has been recollected.<br>
*/
public void createArchangel(){
	Scanner teclado = new Scanner(System.in);
	Scanner teclado1 = new Scanner(System.in);
	Scanner teclado2 = new Scanner(System.in);
	System.out.print("\nEnter the name of the archangel\n");
	String name =teclado.nextLine();
	String photo = name+".jpg";
    System.out.print("Enter the power of the archangel\n");
	String power  =teclado.nextLine();
	System.out.print("Enter the pray of the archangel\n");
	String pray =teclado.nextLine();
	System.out.print("Enter the day of the celebration\n");
	int day =teclado1.nextInt();
	System.out.print("Enter the name of the month of the celebration\n");
	String month =teclado.nextLine();
	System.out.print("Enter the color of the candle\n");
	String color =teclado.nextLine();
    System.out.print("Enter the size of the candle\n");
	double size =teclado2.nextDouble();
	System.out.print("Enter the essence of the candle\n");
	String essence =teclado.nextLine();
	System.out.print("Enter the light Degree of the candle\n");
	int light =teclado1.nextInt();
	Candle can1 = new Candle(color,size,essence,light);
	Date dat1 = new Date(day,month);
    System.out.print(objLeg.addArchangel(name,photo,power,pray,color,size,essence,light,day,month,can1,dat1));
	
}
/**
* This method show the menu of options <br>
* <b>post: </b> The menu has been showed.<br>
*/
public void showMenu(){
System.out.print("------------------------------------------------\n");
System.out.print(""+""+""+"Please select one option to continue"+""+""+"\n");
System.out.print("-----------------------------------------------\n");
System.out.print("<1> to Enter an angel \n<2> to search an archangel by power\n<3> to Search an archangel by  name\n<4> to Show celebrations by month\n<5> to show all the celebrations\n<6> to Count the registered angels\n<7> to Close the program\n");
}
public void toStringName(String nam){
	objLeg.toStringName(nam); 
}
public void toStringPower(String pow){
	objLeg.toStringPower(pow); 
}

public int getCant(){
	int num =objLeg.getCant();
	return num;
}
public void showMonth(String month){
	objLeg.showMonth(month);
}
public String showAll(){
	String msg =objLeg.showAll();
	return msg;
}
public int count(){
	int cont = objLeg.count();
	return cont;
}
}