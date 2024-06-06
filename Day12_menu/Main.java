package Day12_menu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directory d = new Directory(10);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ch;
		
		while(true)
		{
			System.out.print("\nSelect Option From Given Menu : ");
			System.out.println("\n1..Enter New Record : ");
			System.out.println("2..Edit Existing Record : ");
			System.out.println("3..Delete Record : ");
			System.out.println("4..Search By Keyword : ");
			System.out.println("5..Show Record : ");
			System.out.println("6..Exit : ");
			
			System.out.println("\n\nEnter Choice : ");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					d.createRecord();
					break;
				case 2:
					d.editRecord();
					break;
				case 3:
					d.deleteRecord();
					break;
				case 4:
					d.searchRecord();
					break;
				case 5:
					d.showRecord();
					break;
				case 6:
					break;
			}
		}
	}

}
