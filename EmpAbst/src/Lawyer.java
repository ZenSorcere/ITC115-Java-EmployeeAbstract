//**********************************************************************
//	ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
//
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//    interact with the superclass. Recreated from previous exercises to
//    have Employee class be abstract, and to include more superclass
//    interaction.
//
//  Recreated Lawyer to work with new Abstract Employee class.
//
//	By: Mike Gilson
//	Date: 3/16/2020
//**********************************************************************

public class Lawyer extends Employee {
	
//  Overridden methods to account for object variations from generic Employee info
	public String getVacationForm() {
		return "pink";
	}
	
	public double getSalary() {
		return super.getSalary() + 60000;   //  outputs $100,000 salary
	}
	
	public int getVacation() {
		return super.getVacation() + 7;    //   outputs 17 vacation days
	}

//  Unique behavior of Lawyer object
	public String sue() {
		return "\"I'll see you in court!\"";
	}


//  toString with unique text intro, followed by base employee information,
//    and unique behavior, with a tab included to line up with info() display.
	public String toString() {
		return "Lawyer--" + info() + "\t" + sue();
	}
}
