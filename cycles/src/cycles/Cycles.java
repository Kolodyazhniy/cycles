package cycles;

public class Cycles {
		
	public static void main(String args[]) {
		
		
		
		
		int n;
		for(n=10; n>0; n--)
		System.out.println("такт " + n);
		
	
	
	int a, b;
	
	for(a=1, b=4; a<b; a++, b--) {
	System.out.println("a = " + a) ;
	System.out.println("b = " + b);
	
	}

	
	int nums[] = { 1, 2, 7, 4, 5, 6, 4, 9, 8, 10 };
	int sum = 0;
	for(int x: nums) {
	
	System.out.println(+x);
	sum += x;
	}
	
	System.out.println("Сумма равна: " + sum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}