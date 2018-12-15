package battleships.model;

import java.util.ArrayList;

import javafx.scene.layout.GridPane;

public class PlayerBoard extends Board{
	
    public PlayerBoard(GridPane gridPane) {
        super(gridPane);
        this.isPlayerBoard = true;
    }
    
    @Override
    public void createBoard() {
        for (int x = 0; x < 10; x++) {
            ArrayList<Field> row = new ArrayList(10);
            for (int y = 0; y < 10; y++) {
                row.add(new Field());
            }
            gameBoard.add(row);
        }
        ships.clear();
        this.clearDisplayBoard();
    }
}
