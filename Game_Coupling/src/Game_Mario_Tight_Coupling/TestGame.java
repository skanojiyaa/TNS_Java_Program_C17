package Game_Mario_Tight_Coupling;
public class TestGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mario mario = new Mario();
		GameRunner gamerunner = new GameRunner(mario);
		
		gamerunner.run();
	}

}
