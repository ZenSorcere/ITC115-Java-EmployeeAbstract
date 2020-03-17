//**********************************************************************
//	ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
//
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//    interact with the superclass. Recreated from previous exercises to
//    have Employee class be abstract, and to include more superclass
//    interaction.
//
//  Recreated Secretary to work with new Abstract Employee class.
//
//	By: Mike Gilson
//	Date: 3/16/2020
//**********************************************************************
public class Secretary extends Employee {
	
//  Unique behavior for the Secretary class
	public String takeDictation() {
		return "\"I know how to take dictation.\"";
	}
	

//  toString with unique text intro, followed by base employee information,
//	  and unique behavior, with a tab included to line up with info() display.
	public String toString() {
		return "Secretary--" + info() + "\t" + takeDictation();
	}
}