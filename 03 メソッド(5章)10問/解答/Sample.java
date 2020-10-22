package ensyu;

public class Sample {

	public static void main(String[] args) {
		int ans = sample();
		//int ans = 0;
		System.out.println(ans);
		sample2(10,5);
	}

	public static int sample(){
		return 0;
	}

	public static int sample2(int x,int y){
		int sum = x + y;
		return sum;
	}
}
