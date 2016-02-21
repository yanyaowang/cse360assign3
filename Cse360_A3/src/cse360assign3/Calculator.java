package cse360assign3;

/**
 * 	Class to act a calculator which can do adding, subtracting, multiplying,
 * 	and dividing numbers and return the result.
 * 
 * 	@author Yanyao Wang for CSE360 Spring 2016 (PIN 901)
 */

public class Calculator {

	private int total;
	
	/**
	 * 	Create a calculator and set the result to be zero by default.
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * 	Show the result after calculation
	 * 
	 * 	@return integer final result 
	 */
	
	public int getTotal () {
		return 0;
	}
	
	/**
	 * 	Add an inputer number into the total variable
	 * 
	 * 	@param value integer the adding number
	 */
	
	public void add (int value) {
		total += value;
	}
	
	/**
	 * 	Subtract an inputer number from the total variable
	 * 
	 * 	@param value integer the subtrahend
	 */
	
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * 	Multiply the result by an inputer number
	 * 
	 * 	@param value integer the multiplier
	 */
	
	public void multiply (int value) {
		
	}
	
	/**
	 * 	divide the result by an inputer number
	 * 
	 * 	@param value integer the dividend
	 */
	
	public void divide (int value) {
		
	}
	
	/**
	 * 	Show the calculating history record
	 * 
	 * 	@return String history record 
	 */
	
	public String getHistory () {
		return "";
	}
}
