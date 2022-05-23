import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateDemo {
	
	/*
	  Class	  Description
LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects*/

	public static void main(String[] args) {
	LocalDate date=	  LocalDate.now();
	LocalTime time =LocalTime.now();
	LocalDateTime dt =	LocalDateTime.now();
	System.out.println(date);
	System.out.println(time );
	System.out.println(dt);
	DateTimeFormatter format=  DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	String f=dt.format(format);
	System.out.println(f);
	}
}
