package GamePackMan_Loose_Coupling;

public class TestGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameLauncher ob = new PackMan();
		
		GameRunner ob1 = new GameRunner(ob);// dependency injection(depend on GameLauncher)
		// 1 class bija unknown class ne run kare 
		ob1.run();
		
	}

}
