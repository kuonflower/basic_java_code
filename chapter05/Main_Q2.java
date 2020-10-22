package chapter05;

public class Main_Q2 {

	public static void main(String[] args) {
		Student nobita = new Student("のび太",0,0,0);
		Student suneo = new Student("スネ夫",54,31,32);
		Student dekisugi = new Student("出木杉",100,100,100);
		
		System.out.println(nobita.makePrintData());
		System.out.println(suneo.makePrintData());
		System.out.println(dekisugi.makePrintData());
	}

}
