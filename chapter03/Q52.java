package chapter03;

public class Q52 {

	public static void main(String[] args) {
		
		int[] aryPoint = new int[]{10,20,30};
		int[] ary = new int[aryPoint.length];
		
		ary = copy(aryPoint, ary);
		
		for(int x : ary) {
			System.out.println(x);
		}
	}
	public static int[] copy (int[] aryPoint, int[] ary) {
		for (int i= 0; i < aryPoint.length; i++) {
			ary[i] = aryPoint[i];
		}
		return ary;
		
	}

}
