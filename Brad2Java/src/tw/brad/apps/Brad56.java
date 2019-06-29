package tw.brad.apps;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Brad56 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate birthday = LocalDate.of(1966, 3, 31);
		System.out.println(birthday.isLeapYear());
		System.out.println(birthday.isBefore(now));
		System.out.println(now.getDayOfMonth());
		LocalDate m3plus = birthday.plusMonths(1);
		System.out.println(m3plus);
		
		LocalDate n5 = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println(n5);
		
		long days = ChronoUnit.DAYS.between(birthday, now);
		System.out.println(days);
		
		LocalDate deadline = LocalDate.of(2019, 12, 25);
		Period period = Period.between(now, deadline);
		System.out.println(period.getMonths() + "月"+ period.getDays() + "天");
		
		
	}

}
