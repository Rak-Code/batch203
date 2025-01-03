package stringprojects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		

		
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yy hh:mm:ss");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm:ss");
	
		
		String l = LocalDateTime.now().format(f);
		System.out.println(l);
		
		String t = LocalTime.now().format(f2);
		System.out.println(t);
		
		
		Period p = Period.between(LocalDate.now(), LocalDate.now().plusDays(355) );
		System.out.println(p);
		
		ZoneId id = ZoneId.of("Europe/Paris");
		ZonedDateTime zdt = ZonedDateTime.now(id);
		System.out.println(zdt);
	}

}
