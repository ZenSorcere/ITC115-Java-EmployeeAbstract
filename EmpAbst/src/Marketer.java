//**********************************************************************
//	ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
//
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//    interact with the superclass. Recreated from previous exercises to
//    have Employee class be abstract, and to include more superclass
//    interaction.
//
//  Recreated Marketer to work with new Abstract Employee class.
//
//	By: Mike Gilson
//	Date: 3/16/2020
//**********************************************************************
public class Marketer extends Employee {
		
//  Updated getSalary from Employee class
		public double getSalary() {
			return super.getSalary() + 10000;   //  returns $50,000 salary
		}  // end getSalary
		
//  Unique behavior for the Secretary class
		public String advertise() {
			return "\"Act now, while supplies last!\"";
		} // end advertise

//  toString with unique text intro, followed by base employee information,
//		  and unique behavior, with a tab included to line up with info() display.
		public String toString() {
			return "Marketer--" + info() + "\t" + advertise();
		} // end toString
		
	} // end Marketer class