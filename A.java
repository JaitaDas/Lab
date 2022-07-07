package com;
public class A {  //superclass 
	    public void show()
	    {
	        System.out.println("Jaita");
	    }
	}
	  
	class B extends A {   //subclass of A
	    public void show() { System.out.println("Stuti"); }
	}
	class C extends B {  //subclass of B
	    public void show()
	    {
	        System.out.println("Arpan"); 
	    }
	public static void main(String[] args)
	    {
		  A g = new A();
	    	B g1 = new B();
	        C g2 = new C();
	        g.show();
	        g1.show();
	        g2.show();
	   }
	}