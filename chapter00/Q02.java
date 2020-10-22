package chapter00;

public class Q02 {

	public static void main(String[] args) {
		System.out.println("整数入力してください");
		int num = new java.util.Scanner(System.in).nextInt();
		
		
		
		int count1 = 0;
		
		for(int i = 10; i / 10 <= num; i *= 10) {
			count1++;
		}
		
		System.out.println("桁数は" + count1); //count1が桁数
		System.out.println("一桁目から順番に");
		
		int digit = 0;
		
		/*if(count1 <= 1) {
			System.out.println("一桁の数字は四捨五入できません");
		} else {*/
				
		
		do{
			System.out.println("何桁目を四捨五入しますか？" + "1～" + (count1 - 1) + "で入力してください");
			digit = new java.util.Scanner(System.in).nextInt() - 1;// 配列の要素数で使うためマイナス１してます
		}while (!(digit >= 0 && digit + 1 < count1));
			
			
		/*}*/

		
		int[] digits = new int[count1];
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		int count2 = 0;
		
		for(int i = 10; i / 10 <= num; i *= 10) {
			
			a = num % i;
			b = a - b;
			c = b / (i / 10);
			
			/*System.out.println(i);
			System.out.println(a);
			System.out.println(b);*/
			System.out.println(c);
			
			digits[count2] = c;
			count2++;
		}
		
		System.out.println("-----------------------------1");
		
		int count3 = 0;
		for(int i : digits) {
			System.out.println("配列["  + count3 + "]の要素は" + i);
			count3++;
			System.out.println(count3 + "桁目の数字は" + i + "\n");
		}
		
		
		System.out.println("------------------------------\n確認用2");
		
		
		if(digits[digit] >= 5) {
			digits[digit + 1]++;   /*= digits[digit + 1] + 1;*/
			for(int i = 0; i <= digit;i++) {
				digits[i] = 0;
				
			}
			
		} else {
			digits[digit] = 0;
			for(int i = 0; i < digit;i++) {
				digits[i] = 0;
			}
		}
		
		System.out.println("------------------------------\n確認用3");
		
		int count4 = 0;
		for(int i : digits) {
			System.out.println("配列["  + count4 + "]の要素は" + i);
			count4++;
			System.out.println(count4 + "桁目の数字は" + i + "\n");
		}
		
		System.out.println("------------------------------\n確認用4");
		
		int ans = 0 ;
		int zzz = 1;
		
		for(int i = 0; i < count1; i++) {
			
			ans += digits[i] * zzz;
			System.out.println(ans);
			zzz *= 10;
		}
		
		System.out.println("四捨五入した数値は" + ans);

	}

}
