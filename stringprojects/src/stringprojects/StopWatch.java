package stringprojects;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
	

		
		LocalDateTime ldt =  LocalDateTime.now();
		System.out.print(ldt);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter start to start Stopwatch: ");
		sc.nextLine();
		Instant start = Instant.now();
		System.out.println(start);
		
		
		System.out.println("Enter stop to stop Stopwatch: ");
		sc.nextLine();
		Instant stop = Instant.now();
		System.out.println(stop);
		
		Duration diff = Duration.between(start, stop);
//		double a = diff.getSeconds();
		double b = diff.toMillis();
		
		System.out.print(diff.getSeconds());
		System.out.print(diff.toMillis());
		
		
		b = b % 1000;
		System.out.println(b);
		
		
		
		
		
		
		
		

	}

}
