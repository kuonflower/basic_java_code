package chapter03;

public class Q11 {

	public static void main(String[] args) {
		int selectNum = 0; // 選択した番号を保持する変数。
		boolean createAcountFlag = false;// 新しくアカウントを作成したかどうかのフラグ
		boolean loginFlag = false;// ログインしたかどうかのフラグ
		String[] account = new String[2]; //アカウント保持する配列「０」にID　「１」にpass
		System.out.println("ログインアプリケーションを開始します");
		while (selectNum != 6) {
			System.out.println("どの処理をしますか？\n1:新規作成  2:ID・PASS確認   3:ログイン  4:実行  5:ログアウト  6:終了");
			switch (selectNum = new java.util.Scanner(System.in).nextInt()) {
			case 1://新規作成createAccount();
				createAcountFlag = createAccount(account);
				break;
			case 2://ID　PASS確認displayAccount()
				displayAccount(createAcountFlag, account);
				break;
			case 3://ログインloginChecker()
				loginFlag = loginChecker(createAcountFlag, account);
				break;
			case 4://実行execution()
				execution(createAcountFlag, loginFlag, account);
				break;
			case 5://ログアウトlogout()
				loginFlag = logout();
				break;
			case 6://終了
				System.out.println("アプリケーションを終了します");
				break;
			default:
				System.out.println("1～6の数字を入力してください");
			}
		}
	}

	public static boolean createAccount(String[] account) {
		String id = "未登録";
		String pass = "未登録";
		if (account[0] == null || account[1] == null) {
			System.out.println("ID・PASSは１文字以上入力してください");
			System.out.println("IDを入力してください");
			account[0] = new java.util.Scanner(System.in).nextLine();
			System.out.println("PASSを入力してください");
			account[1] = new java.util.Scanner(System.in).nextLine();
		} else {
			System.out.println("IDを入力してください");
			id = new java.util.Scanner(System.in).nextLine();
			System.out.println("PASSを入力してください");
			pass = new java.util.Scanner(System.in).nextLine();
			if (id.equals(account[0]) && pass.equals(account[1])) {
				System.out.println("登録が完了しました");

			}
		}
		return id.equals(account[0]) && pass.equals(account[1]);
	}

	public static void displayAccount(boolean createAcountFlag, String[] account) {
		if (createAcountFlag) {
			System.out.println("あなたのIDは" + account[0] + ", PASSは" + account[1]);
		} else {
			System.out.println("アカウントを作成してください");
		}
	}

	public static boolean loginChecker(boolean createAcountFlag, String[] account) {
		String id = "未入力";
		String pass = "未入力";
		if (createAcountFlag) {
			System.out.println("ログインの処理をします");
			System.out.println("IDを入力してください");
			id = new java.util.Scanner(System.in).nextLine();
			System.out.println("PASSを入力してください");
			pass = new java.util.Scanner(System.in).nextLine();
			if (id.equals(account[0]) && pass.equals(account[1])) {
				System.out.println("ログイン完了");
			} else {
				System.out.println("ログイン失敗");
			}
		} else {
			System.out.println("アカウントを作成してください");

		}
		return id.equals(account[0]) && pass.equals(account[1]);
	}

	public static void execution(boolean createAcountFlag, boolean loginFlag, String[] account) {
		if (createAcountFlag == true && loginFlag == true) {
			System.out.println(account[0] + "さんこんにちは");
		} else {
			System.out.println("ログインしてください");
		}
	}

	public static boolean logout() {
		System.out.println("ログアウトしました");
		return false;
	}
}