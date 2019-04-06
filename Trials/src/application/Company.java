package application;

import java.lang.*;
import java.io.*;

public class Company {
    private String companyName = null;
    private String companySlogan = null;

	public Company() {
	}

	public void setName( String name ){
         companyName = new String(name); 
	}

	public void setSlogan( String slogan ){
         companySlogan = new String(slogan); 
	}

	public void printName(){
         System.out.println( companyName );
	}

	public void printSlogan(){
         System.out.println( companySlogan );
	}

}
