package com.cisc181.core;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.cisc181.eNums.eTitle;

import org.junit.After;
import org.junit.Before;



public class Staff_Test {


	@Test(expected = PersonException.class)
	public void employeeExceptionPhoneTest() throws Exception 
	{
		Date DOB = new SimpleDateFormat("1996-04-09").parse("1996-04-09");
		Date DOH = new SimpleDateFormat("2010-08-09").parse("2010-08-09");
		Staff s = new Staff("Francis", "Laurence", "Field", DOB, "123 East Drive", "3027773355",
				"ffield@udel.edu", "MWF 9-12",5,60000,DOH,eTitle.PROFESSOR);
	}
	
	@Test(expected = PersonException.class)
	public void employeeExceptionDOBTest() throws Exception 
	{
		Date DOB = new SimpleDateFormat("1900-04-09").parse("1996-04-09");
		Date DOH = new SimpleDateFormat("2010-08-09").parse("2010-08-09");
		Staff s = new Staff("Francis", "Laurence", "Field", DOB, "123 East Drive", "3027773355",
				"ffield@udel.edu", "MWF 9-12",5,60000,DOH,eTitle.PROFESSOR);
	}

}
