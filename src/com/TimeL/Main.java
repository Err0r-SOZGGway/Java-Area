package com.TimeL;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd(EEE) HH:mm:ss");
		System.out.println(formatter.format(localDateTime));

	}

}
