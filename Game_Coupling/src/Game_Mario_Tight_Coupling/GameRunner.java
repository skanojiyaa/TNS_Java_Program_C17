package Game_Mario_Tight_Coupling;

public class GameRunner {

	Mario m;
	public GameRunner(Mario mario) {
		// TODO Auto-generated constructor stub
		this.m=mario;
	}
	
	public void run(){
		m.up();
		m.down();
		m.left();
		m.right();
	}

}
