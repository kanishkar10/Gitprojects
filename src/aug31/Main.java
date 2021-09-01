package aug31;

import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;

public class Main {
	
	
	ArrayList<Basket> li=new ArrayList<Basket>();
	
	
	public static  int getHighestBasketQuantity(ArrayList<Basket> list)
	{
		int maxi;
		Stream<Basket>stream=list.stream();
		//maxi=stream.map((n)->n.qty).max(Integer::compare).get();
		maxi=stream.map((name)->name.qty).max(Integer::compare).get();
		return maxi;
		
	}
	
	public int getLowestBasketQuantity(ArrayList<Basket> list)
	{
		return 0;
		
	}
	
	public ArrayList<Basket> rangeOfBaskets(ArrayList<Basket> list,int startingRange,int endingRange)
	{
		return list;
		
	}
	
	public int totalQtyOfAllBaskets()
	{
		return 0;
		
	}

	public static void main(String args[])
	{
		
		ArrayList<Basket> array=new ArrayList<Basket>();
		Basket obj=new Basket(1234,12);
		array.add(obj);
		 obj=new Basket(1234,12);
		array.add(obj);
		 obj=new Basket(1002,30);
		array.add(obj);
		 obj=new Basket(1003,42);
		array.add(obj);
		 obj=new Basket(1004,52);
		array.add(obj);
//		ArrayList<Basket> al2=(ArrayList<Basket>) Arrays.asList(
//				new Basket(1001,1),
//				new Basket(1002,2),
//				new Basket(1003,3),
//				new Basket(1005,4),
//				new Basket(1007,5)
//				);
//		for(Basket i:al2)
//		{
//		System.out.println(i);
//		}
	//	array.stream().forEach(System.out::println);
		
		System.out.println(getHighestBasketQuantity(array));


	}

}
