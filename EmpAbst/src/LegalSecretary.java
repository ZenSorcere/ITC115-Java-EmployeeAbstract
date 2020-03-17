//**********************************************************************
//	ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
//
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//    interact with the superclass. Recreated from previous exercises to
//    have Employee class be abstract, and to include more superclass
//    interaction.
//
//  Recreated LegalSecretary to work with new Abstract Employee class.
//
//	By: Mike Gilson
//	Date: 3/16/2020
//**********************************************************************
public class LegalSecretary extends Secretary{
	
//  Updated getSalary from Security class
	public double getSalary() {
		return super.getSalary() + 5000;
	} // end getSalary
	
//  Unique behavior for LegalSecretary
	public String fileLegalBriefs() {
		return "\"I can file all day!\"";
	}  // fileLegalBriefs
	
//  toString with unique text intro to tag onto Superclass toString. 
//    Also, keeps Secretary unique behavior while adding new LegalSecretary unique behavior.
	public String toString() {
		return "Legal " + super.toString() + "\t" + " - " + fileLegalBriefs();	
	}  //  end toString
	
	
}  // end LegalSecretary class