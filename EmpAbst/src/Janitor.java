//**********************************************************************
//	ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
//
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//    interact with the superclass. Recreated from previous exercises to
//    have Employee class be abstract, and to include more superclass
//    interaction.
//
//  Janitor class added, modifying salary, vacation days, hours and
//    toString. Adds unique behavior, as well.
//
//	By: Mike Gilson
//	Date: 3/16/2020
//**********************************************************************

public class Janitor extends Employee {
		
//  Updated getSalary modified from Employee superclass
		public double getSalary() {
			return super.getSalary() - 10000;
		}

//  Updated getVacation modified from Employee superclass
		public int getVacation() {
			return super.getVacation() / 2;
		}
		
//  Updated getHours modified from Employee superclass
		public double getHours() {
			return super.getHours() * 2;
		}

//  Unique behavior for the Janitor class
		public String clean() {
			return "\"Workin' for the man.\"";
		}

//  toString with unique text intro, followed by base employee information,
//	  and unique behavior, with a tab included to line up with info() display.  
		public String toString() {
			return "Janitor--" + info() + "\t" + clean();
		}
	}

