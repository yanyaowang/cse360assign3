package cse360assign3;

/**
 * 	Class to act a calculator which can do adding, subtracting, multiplying,
 * 	and dividing numbers and return the result.
 * 
 * 	@author Yanyao Wang for CSE360 Spring 2016 (PIN 901)
 */

public class Calculator {

	private int total;
	private boolean doCalculate;
	private String history;
	
	/**
	 * 	Create a calculator and set the result to be zero by default.
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		doCalculate = false;
		history = "";
	}
	
	/**
	 * 	Show the value of total variable
	 * 
	 * 	@return integer final result 
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * 	Add an inputer number into the total variable
	 * 
	 * 	@param value integer the adding number
	 */
	
	public void add (int value) {
		total += value;
		
		if(doCalculate)
			history = history + " + " + value;
		else
		{
			history = "0 + " + value;
			doCalculate = true;
		}	
	}
	
	/**
	 * 	Subtract an inputer number from the total variable
	 * 
	 * 	@param value integer the subtrahend
	 */
	
	public void subtract (int value) {
		total = total - value;
		
		if(doCalculate)
			history = history + " - " + value;
		else
		{
			history = "0 - " + value;
			doCalculate = true;
		}	
	}
	
	/**
	 * 	Multiply the total variable by the total variable by the input number
	 * 
	 * 	@param value integer the multiplier
	 */
	
	public void multiply (int value) {
		total = total * total * value;
		
		if(doCalculate)
			history = history + " * " + value;
		else
		{
			history = "0 * " + value;
			doCalculate = true;
		}	
	}
	
	/**
	 * 	divide the total variable by an inputer number
	 * 
	 * 	@param value integer the dividend
	 */
	
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
			
			if(doCalculate)
				history = history + " / " + value;
			else
			{
				history = "0 / " + value;
				doCalculate = true;
			}	
		}
		else
		{
			total = total / value;
			
			if(doCalculate)
				history = history + " / " + value;
			else
			{
				history = "0 / " + value;
				doCalculate = true;
			}	
		}
	}
	
	/**
	 * 	Show the calculating history record
	 * 
	 * 	@return String history record 
	 */
	
	public String getHistory () {
		
		return history;
	}
}
