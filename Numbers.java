public class numbers {
	
	private int a;
	private int b;
	
	public numbers(int n1,int n2) {
		a = n1;
		b = n2;
	}
	
	public int getMax() {
		if(a<b) {
			return b;
		}
		else {
			return a;
		}
	}
	
	public int getSum() {
		return (a-b);
	}
	
	public int getAvg() {
		return (a+b)/2;
	}
	
}
