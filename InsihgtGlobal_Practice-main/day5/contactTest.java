package com.inisght.day5;

import java.time.LocalDate;
import java.time.Month;

public class contactTest {

	public static void main(String[] args) throws stackUnderflowException,stackOverflowException,InvalidContactException {
		stackdatastructure st=new stackdatastructure(3);
		st.push(new contact("Sriram", "Poojitha", "Sriram", LocalDate.of(2003, Month.AUGUST, 02), "f",
					"9652618886"));
		st.push(new contact("abc", "user1", "ig", LocalDate.of(2005, Month.OCTOBER, 06), "f", "9652618986"));
		st.push(new contact("def", "Chaithu", "Poojitha", LocalDate.of(2003, Month.OCTOBER, 11), "f", "9652618986"));
		st.push(new contact("hihi", "user2", "ig", LocalDate.of(2007, Month.SEPTEMBER, 12), "f",
					"9876543218"));

		//System.out.println(st);
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println("handled stackunderflow exception");
	}
}
