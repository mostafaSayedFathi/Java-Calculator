/**
 * This class is a simple calculator and its' functionalities
 * like addition , subtraction , multiplication and devision
 * @author MOSTAFA Sayed Fathi
 * @version 1.00 16/10/2014
 */

public class Calculator {
	
	private double total , secondNumber;
	private boolean plus , minus , divide , multiply , point;
	private String decimalPoint;
	
	public Calculator(){
		total = 0;
		secondNumber = 0;
		
		plus = false;
		minus = false;
		divide = false;
		multiply = false;
		point = false;
		
		decimalPoint = "";
	}
	
	/**
	 * the setTotal method assign a given value to the total
	 * @param tot is the value to set the total value to
	 */
	public void setTotal(double tot){
		total = tot;
	}
	
	/**
	 * the setSecondNum method assign a given value to the secondNumber
	 * @param secNum is the value to set the secondNumber value to
	 */
	public void setSecondNum(double secNum){
		secondNumber = secNum;
	}
	
	/**
	 * the setDecimalPoint method assign a given value to decimalPoint
	 * @param p is the value to set the decimalPoint value to
	 */
	public void setDecimalPoint(String p){
		decimalPoint = p;
	}
	
	/**
	 * the getTtoal method returns the total value
	 * @return returns the total value
	 */
	public String getTotal(){
		return ""+total;
	}
	
	/**
	 * the getSecondNum method returns the secondNumber value
	 * @return returns the secondNumber value
	 */
	public String getSecondNum(){
		return ""+secondNumber;
	}
	
	/**
	 * the getDecimalPoint returns the decimalPoint value
	 * @return returns the decimalPoint value
	 */
	public String getDecimalPoint(){
		return decimalPoint;
	}
	
	/**
	 * the add method set add value to true
	 */
	public void add(){
		plus = true;
		multiply = false;
		divide = false;
		minus = false;
	}
	
	/**
	 * the multiply method set multiply value to true
	 */
	public void multiply(){
		plus = false;
		multiply = true;
		divide = false;
		minus = false;
	}
	
	/**
	 * the subtract method set subtract value to true
	 */
	public void subtract(){
		plus = false;
		multiply = false;
		divide = false;
		minus = true;
	}
	
	/**
	 * the divide method set divide value to true
	 */
	public void divide(){
		plus = false;
		multiply = false;
		divide = true;
		minus = false;
	}
		
	/**
	 * the startFirst method checks the true boolean and do its operation
	 * @param num is the value to multiply or subtract or divide or add to the total value
	 */
	public void startFirst(String num){
		if(plus==false && minus==false && divide==false && multiply==false){
			total= Double.parseDouble(num);
		}else if(plus==true && minus==false && divide==false && multiply==false){
			total += Double.parseDouble(num);
		}else if(plus==false && minus==true && divide==false && multiply==false){
			total -= Double.parseDouble(num);
		}else if(plus==false && minus==false && divide==true && multiply==false){
			total /= Double.parseDouble(num);
		}else if(plus==false && minus==false && divide==false && multiply==true){
			total *= Double.parseDouble(num);
		}
	}
	
	/**
	 * the checkEqual method check the true boolean and do its operation
	 * this operations is applied to last number
	 * @param num is the value to multiply or subtract or divide or add to the total value
	 */
	public void checkEqual(String num){
		secondNumber = Double.parseDouble(num);
		if(plus == true){
			total += Double.parseDouble(num);
		}else if(minus == true){
			total -= Double.parseDouble(num);
		}else if(multiply == true){
			total *= Double.parseDouble(num);
		}else if(divide == true){
			total /= Double.parseDouble(num);
		}else{
			total = Double.parseDouble(num);
		}
	}
	
	/**
	 * the reset method reset all attributes to default values
	 */
	public void reset(){
		total = 0;
		secondNumber = 0;
		plus = false;
		minus = false;
		multiply = false;
		divide = false;
		point  = false;
	}
	
	/**
	 * the decimalPoint method check if point is true or false and assign given value to decimalPoint
	 * @param p is the value to set the decimalPoint value to
	 */
	public void decimalPoint(String p){
		if(point == true){
			decimalPoint = "";
			return;
		}else if(point == false){
			point = true;
			decimalPoint = p;
		}
	}
	
	/**
	 * the reset method reset the point to its default value
	 */
	public void resetDecimalPoint(){
		point = false;
	}
	
	/**
	 * the plusMinus method assign the negative of given value to total
	 * @param num is the value to set to the total value
	 */
	public void plusMinus(String num){
		total = -Double.parseDouble(num);
	}
		
}
