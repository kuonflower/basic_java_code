package tes1;

public class Q11 {

	public static void main(String[] args) {
		int selectNum = 0;                 // 選択した番号を保持する変数。
		boolean createAccountFlag = false; // 新しくアカウントを作成したかどうかのフラグ
		boolean loginFlag = false;         // ログインしたかどうかのフラグ
		String[] account = new String[2];  // アカウントを保持する配列 [0]にID [1]にPASS
		System.out.println("ログインアプリケーションを開始します");
		while (selectNum != 6) {
			selectNum = repeatStatement();
			switch (selectNum) {
			case 1:
				createAccountFlag = createAccount(account);
				break;
			case 2:
				displayAccount(account, createAccountFlag);
				break;
			case 3:
				loginFlag = loginChecker(account, createAccountFlag);
				break;
			case 4:
				execution(account , loginFlag);
				break;
			case 5:
				loginFlag = logout(loginFlag);
				break;
			}// switch
		} // while
		System.out.println("アプリケーションを終了します");
	}// main


	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	//繰り返しの最初の文
	public static int repeatStatement(){
		System.out.println("----------------------------------------------");
		System.out.println("どの処理をしますか？");
		System.out.println("1:新規作成  2:ID・PASS確認   3:ログイン  4:実行  5:ログアウト  6:終了");
		int selectNum = new java.util.Scanner(System.in).nextInt();
		return selectNum;
	}

	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	// １、アカウント作成
	public static boolean createAccount(String[] account) {
		boolean judge = false;
		System.out.println("IDを入力して下さい");
		String inputId = new java.util.Scanner(System.in).nextLine();
		System.out.println("PASSを入力して下さい");
		String inputPass = new java.util.Scanner(System.in).nextLine();
		if (inputId.length() > 0 && inputPass.length() > 0) {
			account[0] = inputId;
			account[1] = inputPass;
			System.out.println("登録が完了しました");
			judge = true;
		} else {
			System.out.println("ID・PASSは１文字以上入力してください");
		}
		return judge;
	}// createAccount

	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	// ２、アカウント確認
	public static void displayAccount(String[] account, boolean flag) {
		if (flag) {
			System.out.println("あなたのIDは" + account[0] + " , PASSは" + account[1]);
		} else {
			System.out.println("アカウントを作成してください");
		}
	}// displayAccount

	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	// ３、ログイン処理
	public static boolean loginChecker(String[] account, boolean createAccountFlag) {
		boolean judge = false;
		if (createAccountFlag) {
			System.out.println("ログインの処理をします");
			System.out.println("IDを入力して下さい");
			String inputId = new java.util.Scanner(System.in).nextLine();
			System.out.println("PASSを入力して下さい");
			String inputPass = new java.util.Scanner(System.in).nextLine();

			if (inputId.equals(account[0]) && inputPass.equals(account[1])) {
				judge = true;
				System.out.println("ログイン完了");
			} else {
				System.out.println("入力が間違っています");
			}
		} else {
			System.out.println("アカウントを作成してください");
		}

		return judge;
	}// loginChecker

	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	//４、実行
	public static void execution(String[] account , boolean loginFlag){
		if (loginFlag) {
			System.out.println(account[0] + "さんこんにちは");
		} else {
			System.out.println("ログインしてください");
		}
	}//execution

	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	//ログアウト
	public static boolean logout(boolean loginFlag){
		if (loginFlag) {
			loginFlag = false;
			System.out.println("ログアウトしました");
		} else {
			System.out.println("ログインしてください");
		}
		return loginFlag;
	}//logout

	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■


}// class
