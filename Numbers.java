//Number Class
public class Numbers {
	
	private int number1;
	private int number2;
	
	public Numbers(int n1,int n2) {
		number1 = n1;
		number2 = n2;
	}
	
	public int getMax() {
		if(number1<number2) {
			return number2;
		}
		else {
			return number1;
		}
	}
	
	public int getSum() {
		return (number1+number2);
	}
	
	public int getAvg() {
		return (number1+number2)*2;
	}
	
}
