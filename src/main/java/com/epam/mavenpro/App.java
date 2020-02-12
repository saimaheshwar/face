package com.epam.mavenpro;

public class App 
	{
    public static void main( String[] args )
    {
    	Interest i= new Interest();
    	System.out.println("enter principle amount,time,rate of interest"); 
        System.out.println(i.SimpleInterest());
        System.out.println("enter principle amount,time,rate of interest");
        System.out.println(i.CompoundInterest());
        HouseConstruction h=new HouseConstruction();
	    System.out.println("enter 1 for standard material"); 
	    System.out.println("enter 2 for above standard material");
	    System.out.println("enter 3 for high standard material"); 
	    System.out.println("enter 4 for high standard material and automated home");                          
        System.out.println("enter area");
		System.out.println(h.constructionCost());
       
    }
}
