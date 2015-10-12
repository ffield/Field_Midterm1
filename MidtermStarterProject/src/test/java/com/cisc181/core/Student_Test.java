package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@Test
	public void testMajorChange() throws PersonException, ParseException {
		Date DOB = new SimpleDateFormat("1996-04-09").parse("1996-04-09");
		Student s = new  Student( "Francis", "Laurence", "Field", DOB, eMajor.NURSING,
				"234 North Way", "302-555-6667", "ffield@udel.edu");
		s.setMajor(eMajor.CHEM);
		assertTrue(s.getMajor() == eMajor.CHEM);
	}

}
