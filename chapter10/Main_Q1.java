package chapter10;

import java.util.ArrayList;

public class Main_Q1 {

	public static void main(String[] args) {
		
		System.out.println("***キャット　コレクション***");
		
		int a = 0;
		

		ArrayList<Cat> array = new ArrayList<Cat>();	
		
		while(a != 3){
			
			System.out.println("---------------------------");	
			System.out.println("1.コレクト  2.遊ぶ   3.終了");
			
			a = new java.util.Scanner(System.in).nextInt();
			
			switch(a){
			
			case 1:
				int catType = new java.util.Random().nextInt(3);
				char type = 0;
				
				switch(catType){
				
				case 0:
					type ='A';
					break;
				case 1:
					type ='B';
					break;
				case 2:
					type ='C';
					break;
				}
				System.out.println(type + "タイプのキャットが登場しました");
				System.out.println("名前は何にしますか？");
				String name = new java.util.Scanner(System.in).nextLine();
				
				
				array.add(new Cat(type,name));
				System.out.println(name + "が仲間になった");
				
				
				break;
			case 2:
				if(array.isEmpty()){
					System.out.println("キャットがいません");
				} else{
					int count = 0;
					for(Cat c : array){
						System.out.println(count + "..." + c.getName() + "[" + c.getType() + "]" + c.getIntimacy());
						count++;
					}
					System.out.println("どの子と遊びますか？");
					int play = new java.util.Scanner(System.in).nextInt();
					System.out.println(array.get(play).getName() + "と遊んだ");
					array.get(play).setIntimacy(array.get(play).getIntimacy() + 1);
					System.out.println("親密度が上がった");
					
					
					
				}
				break;
			case 3:
				System.out.println("終了します...");
				break;			
			}
			
		}

	}
	
	public static void add(){
		
	}

}
