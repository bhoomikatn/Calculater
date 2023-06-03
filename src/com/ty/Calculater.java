package com.ty;

public class Calculater 
{
    void add()
    {
    	System.out.println("add()");
    }
    void sub()
    {
    	System.out.println("sub()");
    }
    void div()
    {
    	System.out.println("div()");
    }
    void mul()
    {
    	System.out.println("mul()");
    }
	public static void main(String[] args) 
	{
		Calculater calculater=new Calculater();
		calculater.add();
		calculater.div();
		calculater.sub();
		calculater.mul();
	}

}
