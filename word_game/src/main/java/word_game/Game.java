package word_game;

public class Game {

	public int xCord;
	public int yCord;
	public int gridWidth;
	public int gridHeight;
	public int goalX;
	public int goalY;
	
	// FS
	public void setBounds() {
		System.out.println("CODE ME!");
	}	
	
	// FS
	public void checkBounds() {
		System.out.println("CODE ME!");
	}	
	
	// MM
	public void move(String user_input) {
		
		switch (user_input.toUpperCase()) {
		
		case "W":
			goalY ++;
			break;
		case "A":
			goalX --;
			break;
		case "S":
			goalY --;
			break;
		case "D":
			goalX ++;
			break;
			
		}
		
		boolean is_valid = this.checkBounds(goalX, goalY);
		
		if (is_valid == false) {
			
			this.quit();
			
		}
		
	}

	// JT
	public void checkGoal() {
		System.out.println("CODE ME!");
	}
	
	// JT
	public void setGoal() {
		System.out.println("CODE ME!");
	}

	
	// CR
	public void showResult() {
		System.out.println("CODE ME!");
	}
	
	// FR
	public void quit() {
		System.out.println("CODE ME!");
	}

	// JT
	public void start() {
		System.out.println("CODE ME!");
	}
	
}
