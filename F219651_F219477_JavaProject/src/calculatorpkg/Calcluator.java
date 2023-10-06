package calculatorpkg;

public class Calcluator {
	public int add(int x ,int y) {
		return x+y;
	}
	public int sub(int x,int y) {
		if(x>y) return x-y; else return  y-x;
	}
	

	public int divide(int x,int y) {
		 return x/y;
	}
}
