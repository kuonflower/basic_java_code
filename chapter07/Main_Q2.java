package chapter07;

public class Main_Q2 {

	public static void main(String[] args) {
		
		PC p = new PC();
		UsbConnectable[] array = new UsbConnectable[3];
		array[0] = new Mouse();
		array[1] = new Memory();
		array[2] = new CardReader();
		
		int x = 0;
		
		while(x != 3) {
			System.out.println("-------------------------------");
			System.out.println("0:アプリ実行      1:USBデバイス接続     2:USBデバイス取り外し     3:終わり");
			x = new java.util.Scanner(System.in).nextInt();
			
			switch(x) {
			case 0:
				p.execApp();
				break;
			case 1:
				System.out.println("どのデバイスを接続しますか   0:マウス       1:メモリー      2:カードリーダー");
				int y = new java.util.Scanner(System.in).nextInt();
				p.setDevice(array[y]);
				System.out.println("接続しました");
				break;
			case 2:
				if(p.getDevice() == null) {
					System.out.println("接続をして下さい");
				} else {
					System.out.println("デバイスを取り外しました");
					p.setDevice(null);
				}
				break;
			case 3:
				System.out.println("アプリケーションを終了します。");
				break;
			}
			
		}

	}

}
