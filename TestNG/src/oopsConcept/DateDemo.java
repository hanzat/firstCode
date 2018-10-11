package oopsConcept;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		
		
		
		Date d = new 	Date();
		
	//print the current day and time.
		System.out.println(d.toString());
		
		
		//print with the stander format===>    mm/dd/yyyy      hh:mm:ss
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyy");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyy  hh:mm:ss");
		sdf.format(d);
		
		System.out.println(sdf.format(d));
		
		System.out.println(sd.format(d));
		
		
		
	}

}
