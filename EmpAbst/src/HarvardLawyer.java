//**********************************************************************
//	ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
//
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//    interact with the superclass. Recreated from previous exercises to
//    have Employee class be abstract, and to include more superclass
//    interaction.
//
//  HarvardLawyer extends Lawyer, modifying salary, vacation days, and
//  updated toString.
//
//	By: Mike Gilson
//	Date: 3/16/2020
//**********************************************************************

//  HarvardLawyer using Lawyer as superclass instead of Employee
public class HarvardLawyer extends Lawyer {
	
//  Overwritten getVacationForm, run through a for loop to repeat the 
//    superclass version 4 times.
		public String getVacationForm() {
			String s = "";
			for (int i = 0; i < 4; i++) {
				s += super.getVacationForm();
			}
			return s;
		} // end getVacationForm
		
//  Updated getSalary, modified from Lawyer superclass.
		public double getSalary() {
			return super.getSalary() * 1.2;  // returns $120,000 salary
		} // end getSalary
		
		
//  Updated getVacation, modified from Lawyer superclass.
		public int getVacation() {
			return super.getVacation() + 3;  // returns 20 vacation days
		} // end getVacation
		
//  toString with unique text intro, followed by Lawyer's full toString 
		public String toString() {
			return "Harvard " + super.toString();
		}
	}


