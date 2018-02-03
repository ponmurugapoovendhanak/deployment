package ponmurugan.ponmurugan;

import org.joda.time.DateTime;

public class Joda{
	public  void getDate()
	{
	    DateTime today = new DateTime();

	    DateTime tomorrow = today.plusDays(1);

	    System.out.println(today.toString("yyyy-MMM-dd"));

	    System.out.println(tomorrow.toString("yyyy-MMM-dd"));
	}
}