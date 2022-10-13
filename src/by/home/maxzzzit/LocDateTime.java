package by.home.maxzzzit;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocDateTime {
	public static void main(String[]args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(System.currentTimeMillis());
	}
}
