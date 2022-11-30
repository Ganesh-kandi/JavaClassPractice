package firstProject;

import java.time.LocalDate;
import java.time.Period;

public class DateOFBirth {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate birth = LocalDate.of(1999,8,26);
		Period p=Period.between(birth,today);
		System.out.printf("My age is %d years %d months %d days.",p.getYears(),p.getMonths(),p.getDays());

	}

}
