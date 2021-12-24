package com.neosoft.util;

import java.util.List;

import com.neosoft.dto.FromFeild;

public class Common {

	public static List<String> getService() {
		return List.of("PHP-0-2", "PHP-2-4","PHP-5+");
	}	
	
	public static List<String> skillLave() {
		return List.of("lavel1", "lavel2","lavel3","lavel4","lavel5");
	}

	public static Double calculateService(FromFeild from) {
	
	Integer a=(int)from.getCommunication().charAt(from.getCommunication().length() - 1);
	Integer b=(int)from.getBasicweb().charAt(from.getBasicweb().length() - 1);
	Integer c=(int)from.getOpp().charAt(from.getOpp().length() - 1)/5;
	Integer d=(int)from.getDatabse().charAt(from.getDatabse().length() - 1);
	Integer f=(int)from.getProgram().charAt(from.getProgram().length() - 1);
	Integer h=(int)from.getBasicconcepts().charAt(from.getBasicconcepts().length() - 1);
	Integer i=(int)from.getVersioncontroll().charAt(from.getVersioncontroll().length() - 1);
		
		
		return (double) (a+b+c+d+f+h+i)/5;
	}	
	
}
