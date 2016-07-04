package tictictoe;



public class TicTacToe{
	private int rows,columns;
	private  int Counter=0; //number of turns played
	private int[][] gameboard;
	private int[][][] Indexes;

	public TicTacToe(int rows, int columns){
		this.rows=rows;
		this.columns=columns;
		gameboard=new int[rows][columns];
		Indexes=new int[2][(rows*columns)/2][2]; // Index[x/o][number of index][row/column]
	}
    
    
   
    public void incCounter(){this.Counter++;}
	

	public void setValue(int row, int column,int xOrO)
	{

         int value;
		if(gameboard[row][column] == 0)
		{if(xOrO==0) value=1;
		else value=2;
		gameboard[row][column]= value;
		Indexes[xOrO][Counter][0]=row;
		Indexes[xOrO][Counter][1]=column;
		
	}}
	
	
	
	public boolean borderChecker(int selectedrow,  int selectedcolumn)
	{
		if(selectedrow<rows&&selectedrow>0&&selectedcolumn>0&&selectedcolumn<columns) return true;
		else return false;
	}
	
public void showMatrix()
{
	for(int row =0;row<this.rows ; row++)
	{
		for(int column=0;column<this.columns;column++)
		{
			System.out.print(gameboard[row][column]+" ");
		}
		System.out.println();
	}}
	
	
	public boolean straightCheck(int xOrO){
		for(int counter =0;counter<this.Counter;counter++){
		int row=Indexes[xOrO][counter][0];
		int column=Indexes[xOrO][counter][1];
			if(column<4)
				{if((gameboard[row][column]==gameboard[row][column+1])&&(gameboard[row][column+1]==gameboard[row][column+2])&&(gameboard[row][column+2]==gameboard[row][column]))
				
			return true;} //horizontal
				if(row<4){if((gameboard[row][column]==gameboard[row+1][column])&&(gameboard[row+1][column]==gameboard[row+2][column])&&(gameboard[row][column]==gameboard[row+2][column]))
					return true;} //vertical
		}
	return false;
	}
public boolean diagonalCheck(int xOrO)
{
	for(int counter =0;counter<this.Counter;counter++){
		int row=Indexes[xOrO][counter][0];
		int column=Indexes[xOrO][counter][1];
		if(row<4&&column<5){if((gameboard[row][column]==gameboard[row+1][column+1])&&(gameboard[row+2][column+2]==gameboard[row+1][column+1])&&(gameboard[row][column]==gameboard[row+2][column+2]))
		return true;} // "\"
		if(row<4&&column>1){ if ((gameboard[row][column]==gameboard[row+1][column-1])&&(gameboard[row+1][column-1]==gameboard[row+2][column-2])&&(gameboard[row][column]==gameboard[row+2][column-2]))
	return true;} // "/"
	}
	return false;
	
}
}
