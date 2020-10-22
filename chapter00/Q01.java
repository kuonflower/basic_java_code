package chapter00;

public class Q01 {

	public static void main(String[] args) {
		
		System.out.println("年を入力してください");
		int year = new java.util.Scanner(System.in).nextInt();
		
		int x = 10;
		
		int one = year % 10;
		int ten = (year % 100 - one) / 10;
		
		
		System.out.println("一桁目" + one);
		System.out.println("二桁目" +ten);
		
		int ans = one + ten;
		System.out.println("1の位と10の位の和は" + ans);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		int count =0 ;
		
		
		while (year != year % (x / 10)){
	
			a = year % x;
			b = a - b;
			c = b / (x / 10);
			
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			
			
			x *= 10;
			
			count++;
		}
		
		int d = 0;
		int e = 0;
		int f = 0;
		
		int y = 10;
		
		int[] digits = new int[count];
		
		for(int i = 0; i < count; i++){
			d = year % y;
			e = d - e;
			f = e  / (y / 10);
			
			digits[i] = f;
			y *= 10;
			
		}
		
		System.out.println("列の中身↓");
		for(int i : digits){
			System.out.println(i);
		}
	}

}
