package gmailClassifier;

import java.util.List;
import java.util.ArrayList;

import com.sun.javafx.collections.MappingChange.Map;

/*
 * This project will get a defined number of strings with the name and the gmail
 * This program will classified all the gmail ones alphabetically and is going to print them.
 * */

public class GmailClassifier {//completed

	final static String info = "riya riya@gmail.com julia julia@julia.me "
			+ "julia sjulia@gmail.com julia julia@gmail.com "
			+ "samantha samantha@gmail.com tanya tanya@gmail.com";
	String data;
	int n=0;
	
	
	public GmailClassifier(String data) {
		this.data = data;
	}

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		List<String> email = new ArrayList<String>();
		List<String> gNames = new ArrayList<String>();
		
		
		GmailClassifier user = new GmailClassifier(info);
	    String str = user.data;
	    int num=0;
	    String reg = " ";
       
	    String[] res = str.split(reg);
	    for (String out : res) {
	        if (!"".equals(out)) {
	            num++;
	        }
	    }  
	    
	    for(int i=0;i<num;i+=2){
	    	name.add(res[i]);
	    	}
	    for(int i=1;i<num;i+=2){
	    	email.add(res[i]);
	    	}	   
	    
	    for(int i=0;i<email.size();i++){
	    	if(email.get(i).contains("@gmail.com") /*!= null*/){
	    		//System.out.println(name.get(i));
	    		gNames.add(name.get(i));
	    	}
	    	
	    }
	   
	    char[] ch = new char[gNames.size()];
	    int j=0;
	    for(String s: gNames){
	    	//System.out.println(s.charAt(0));
	    	ch[j]= s.charAt(0);
	    	//System.out.println(ch[j]);
	    	j++;
	    }
	    j=0;
	    System.out.println(ch);
	}
}
