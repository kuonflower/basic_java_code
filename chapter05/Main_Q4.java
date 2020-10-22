package chapter05;

public class Main_Q4 {

	public static void main(String[] args) {
		Student02[] s = new Student02[3];
		
		s[0] = new Student02("のびた", 100); 
		s[1] = new Student02("しずか", 90); 
		s[2] = new Student02("じゃいあん", 55); 
		
		for(Student02 array : s){
			System.out.println(array.name + ":" + array.score);
		}

	}

}
