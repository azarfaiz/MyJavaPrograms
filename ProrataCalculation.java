import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ProrataCalculation {
	
	public static void main(String[] Args) throws ParseException
	{
		Calendar cal = Calendar.getInstance();
		cal.set(2017, 8, 30);
		Date policyEffectiveDate= new Date(Args[0]);
		//Date policyEffectiveDate= cal.getTime();
//		System.out.println("tz "+cal.getTimeZone());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zz");
		System.out.println("policyeff-----> "+policyEffectiveDate);
		System.out.println("formatted policy eff------>"+sdf.format(policyEffectiveDate));
		Date PolicyExpiryDate= new Date(Args[1]);
		
		cal.set(2018, 8, 30);
		//Date PolicyExpiryDate= cal.getTime();
		System.out.println("PolicyExpiryDate-----> "+PolicyExpiryDate);
		TimeZone tz = TimeZone.getDefault();
		boolean isPolicyExpirationInDT = tz.inDaylightTime(PolicyExpiryDate);
		System.out.println("PolicyExpiryDate day light----->"+isPolicyExpirationInDT);
		
		cal.set(2017, 10, 21);
		Date vehaddeddate= new Date(Args[2]);
		//Date vehaddeddate= cal.getTime();
		boolean isEndoDateInDT = tz.inDaylightTime(vehaddeddate);
		System.out.println("vehaddeddate-----> "+vehaddeddate);
		System.out.println("vehaddeddate day light----->"+isEndoDateInDT);
		//Date vehdeldate= new Date("31-Dec-2017");
		double vehicleProrataFactor = 0.0;
		System.out.println("US"+policyEffectiveDate.getTime());
		Date now = new Date();
		System.out.println("now "+now);
		
		//Added
		Long dateDifference1 = (PolicyExpiryDate.getTime()-vehaddeddate.getTime());
		//dateDifference1+=3600000;
		if(isPolicyExpirationInDT && (!isEndoDateInDT)){
			dateDifference1+=3600000;
		}
		if((!isPolicyExpirationInDT) && isEndoDateInDT){
			dateDifference1-=3600000;
		}
		Long dateDifference2 = (PolicyExpiryDate.getTime()-policyEffectiveDate.getTime());
		System.out.println("PolicyEffdate "+policyEffectiveDate.getTime());
		System.out.println("PolicyExpiryDate "+PolicyExpiryDate.getTime());
		System.out.println("vehaddeddate "+vehaddeddate.getTime());
		System.out.println("dateDifference1"+dateDifference1);
		System.out.println("dateDifference2"+dateDifference2);

		if(dateDifference2 > 0){
			vehicleProrataFactor = ( dateDifference1.doubleValue()) / ( dateDifference2.doubleValue());
			double deletedProrataFactor = 0.942 - vehicleProrataFactor; 
			deletedProrataFactor = Double.parseDouble(String.format("%.10f", deletedProrataFactor));
			//System.out.println("Deleted vehicleProrataFactor"+deletedProrataFactor);
			vehicleProrataFactor = Double.parseDouble(String.format("%.10f", vehicleProrataFactor));
		}
		System.out.println("vehicleProrataFactor"+vehicleProrataFactor);
		System.out.println("vehicleProrataFactor after rounding off "+String.format("%.3f", vehicleProrataFactor));
		
		
		/*SimpleDateFormat parser = new SimpleDateFormat("MM/dd/yyyy");
		String poleff = "09/30/2017";
		String polexp = "09/30/2018";
		String endostart = "11/21/2017";
		Date policyEffectiveDate = parser.parse(poleff);
		System.out.println(policyEffectiveDate);
		DateFormat timeFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss z");
	    timeFormat.setTimeZone(TimeZone.getTimeZone("EST"));
	    String estTime = timeFormat.format(policyEffectiveDate);
	    System.out.println(estTime);*/
		/*SimpleDateFormat isoFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss z");
		isoFormat.setTimeZone(TimeZone.getTimeZone("EST5EDT"));
		Date date = isoFormat.parse(estTime);
		System.out.println(date);*/
	}

}
