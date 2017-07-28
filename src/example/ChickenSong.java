package example;

import java.util.ArrayList;
import java.util.List;

class Chicken {}
 interface HenHouse { public java.util.List<Chicken> getChickens(); }
 public class ChickenSong {

 public static void main(String[] args) {
	 //List list=new ArrayList();
	 //Chicken chicken1=new Chicken();
	 //list.add(chicken1);
	 //list.add(chicken1);
 //HenHouse house=()->list;
	
	 List list =new ArrayList();
	 HenHouse house=()->list;
	 Chicken chicken1=new Chicken();
	 list.add(chicken1);
	 
 Chicken chicken = house.getChickens().get(0);
 for(int i=0; i<house.getChickens().size();
 chicken = house.getChickens().get(i++)) {
 System.out.println("Cluck");
 } } }

