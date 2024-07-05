package GamePackMan_Loose_Coupling;

public class PackMan implements GameLauncher{

	public void up(){
		System.out.println("Packman Up");
	}
	
	public void down(){
		System.out.println("Packman Down");
	}
	
	public void left(){
		System.out.println("Packman Go Back");
	}
	
	public void right(){
		System.out.println("Packman Go ahead");
	}

}
