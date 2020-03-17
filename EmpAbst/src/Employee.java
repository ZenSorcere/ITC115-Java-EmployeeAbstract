//**********************************************************************
//	ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
//
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//    interact with the superclass. Recreated from previous exercises to
//    have Employee class be abstract, and to include more superclass
//    interaction.
//
//	By: Mike Gilson
//	Date: 3/16/2020
//**********************************************************************

 
import java.text.*;   // for using the NumberFormat Class

public abstract class Employee {
	
//  Getters-Accessors for base employee information: Hours, Salary, Vacation Days, and Form Type
	public double getHours() {
		return 40.00;
	}  // end getHours
	
	public double getSalary() {
			return 40000.00;
	} // end getSalary

	public int getVacation() {
		return 10;
	} // end getVacation

	public String getVacationForm() {
		return "yellow";
	}  // end getVacationForm
	

//  Generic information for displaying all employee information, with new lines
//    for each category and tabs for display readability
	public String info() {
		return "\n\tSalary: " +getPriceFormatted() + "\n\tHours per week: " +  getHours() + "\n\tVacation days: " + getVacation()  
		+ "  (Use " + getVacationForm() + " form)\n";
	} // end info
	
//  Borrowing the PriceFormatted method for displaying Salary info properly
	public String getPriceFormatted() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.getSalary());
        return formattedPrice;
    }
	
} // end Employee class

