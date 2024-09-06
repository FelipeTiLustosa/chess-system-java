package chess;

import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' ||row <1 || row>8) {
            throw new IllegalArgumentException("Error instantianting chessPosition. Valid values are from a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
/*
matrix_row =8 - chess_row
matrix_column = chess_column - 'a'

'a' - 'a' = 0
'b' - 'a' = 1
'c' - 'a' = 2

a = 0
b = 1
c = 2
d = 3

OBS: Diagrama de classe # representa q o metado e protected e o Sublinhado embaixo do metado representa q ele e estatico
 */
    protected Position toPosition(){
        return new Position(8- row, column - 'a');
    }
protected  static ChessPosition fromPosition(Position position){
        return  new ChessPosition((char) ('a' - position.getColumn()),8 - position.getRow());
}
@Override
    public String toString() {
       return "" + column + row;
}
}
