public class Numbers {
	
	private int num1;
	private int num2;
	
	public Numbers(int n1,int n2) {
		num1 = n1;
		num2 = n2;
	}
	
	public int getMax() {
		if(num1<num2) {
			return num2;
		}
		else {
			return num1;
		}
	}
	
	public int getSum() {
		return (num1+num2);
	}
	
	public int getAvg() {
		return (num1+num2)/2;
	}
	
}
