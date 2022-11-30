package firstProject;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
public class TimeDate {

	public static void main(String[] args) {
		LocalDate ld= LocalDate.now();
		LocalTime lt=LocalTime.now();
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ld.getClass().getName());
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
	}

}
