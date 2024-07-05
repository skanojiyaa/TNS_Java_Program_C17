package GamePackMan_Loose_Coupling;

public class GameRunner {

	GameLauncher gl;
	public GameRunner(GameLauncher gll) {
		// TODO Auto-generated constructor stub
		this.gl=gll;
	}

	public void run(){
		gl.up();
		gl.down();
		gl.left();
		gl.right();
	}
}
