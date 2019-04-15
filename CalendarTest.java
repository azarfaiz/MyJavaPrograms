import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	
	enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.set(2018,0,4);
		//System.out.println(calendar);
		//System.out.println(cal.get(7));
		int value = cal.get(7) - 1;
		System.out.println(value);
		int days = 8;
		while(days > 0){
			if(value>=5){
				value = 0;
			}
			value++;
			days--;
		}
		String s = String.valueOf(value);
		System.out.println(s);
		//System.out.println("Value is "+value);
		System.out.println(Day.values()[value]);
		
		String d1 = "2017-10-31";
		String d2 = "2017-11-30";
		String d3 = "2018-10-17";
		Double vehicleProrataFactor = 0.0;
		SimpleDateFormat parser = null;
		parser = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Before difference");
		java.util.Date start = parser.parse(d1);
		java.util.Date end = parser.parse(d2);
		java.util.Date polexp = parser.parse(d3);
		Long dateDifference1 = (end.getTime()-start.getTime());
		Long dateDifference2 = (polexp.getTime()-start.getTime());
		vehicleProrataFactor = ( dateDifference1.doubleValue()) / ( dateDifference2.doubleValue());
		System.out.println("vehicleProrataFactor before--->"+vehicleProrataFactor);
		vehicleProrataFactor = Double.parseDouble(String.format("%.3f", vehicleProrataFactor));
		System.out.println("vehicleProrataFactor after--->"+vehicleProrataFactor);

	}

}
