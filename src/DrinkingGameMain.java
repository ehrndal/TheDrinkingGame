
public class DrinkingGameMain {
	
	public static GameModel gameModel;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		gameModel = new GameModel();
		new DrinkingGameFrame().setVisible(true);
	}

}
