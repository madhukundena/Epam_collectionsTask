package com.epam.collection1;
import java.util.ArrayList;
import java.util.Scanner;

	public class List
	{
	    private static Scanner s;

		public static void main(String args[])
	    {
	    	ArrayList<Integer> ar=new ArrayList<Integer>();
	       for(int i=0;i<10;i++,ar.add(i));
	       	System.out.print("The initial list is: "+ar);
	        System.out.println();
	       
	       s = new Scanner(System.in);
	        int ch=1;
	        
	        while (ch!=0)
	        {	
	        	System.out.println("enter you choice:\n1:add to list,	2:get NO. at index	3:get index of NO.	4:enter the delete	5:find size: \n6:print NO.	7:enter 0 exit	\nenter your choice:");
	            ch=s.nextInt();
	            if(ch==1)
	            {	System.out.println("enter NO. to add:");
	            	 ar.add(s.nextInt());
	            }
	            else if(ch==2)
	            {	System.out.println("enter index of NO. between 0 and "+(ar.size()-1)+":");
	                System.out.println("Element is:"+ar.get(s.nextInt()));
	            }
	            else if(ch==3)
	            {	System.out.println("enter NO.:");
	                System.out.println("Position is:"+ar.indexOf(s.nextInt()));
	            }
	            else if(ch==4)
	            {	System.out.println("enter NO to delete.:");
	            	ar.remove(ar.get(s.nextInt()));
	            }
	            else if(ch==5)
	            {	System.out.println("size is: "+ar.size());
	            	 
	            }
	            else if(ch==6)
	            {
	            	System.out.print(ar);
	    	        System.out.println();
	            }
	            else
	            {
	              System.out.println("enter valid choice:");
	            }
	        }
	    }
	}
	
