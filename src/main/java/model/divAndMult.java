/**
 * @author ${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Fall 2021
 * ${1/10/2022}
 */
package model;


public class divAndMult {

	private double outDiv;
	private double outMult;
	
	public divAndMult(){
		super();
	}
	
	public divAndMult(double inputDiv, double inputDiv2, double inputMult, double inputMult2){
		
		this.outDiv = inputDiv / inputDiv2;
		this.outMult = inputMult * inputMult2;
	}
	
	
	public double getOutDiv() {
		return outDiv;
	}
	
	
	public double getOutMult() {
		return outMult;
	}
	
	public double divide(double input1, double input2) {
		this.outDiv = input1 / input2;
		return this.outDiv;
		
	}
	public double multiply(double input1, double input2) {
		this.outMult = input1 * input2;
		return this.outMult;
	}
	
	public String divideString(String input1, String input2) {
		String output = "";
		double in1 = Double.parseDouble(input1);
		double in2 = Double.parseDouble(input2);
		double out = in1 / in2;
		this.outDiv = out;
		
		output = Double.toString(this.getOutDiv());
		return output;
	}
	
    public String multiplyString(String input1, String input2) {
    	String output = "";
		double in1 = Double.parseDouble(input1);
		double in2 = Double.parseDouble(input2);
		double out = in1 * in2;
		this.outMult = out;
		
		output = Double.toString(this.getOutMult());
		return output;
	}
	
	
	
}
