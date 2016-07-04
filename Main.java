package tictictoe;

import java.util.Scanner;
import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		TicTacToe TicTac =new TicTacToe(6,7);
		
	
        
		
		Scanner input=new Scanner(System.in);
        int xrow,xcolumn,orow,ocolumn;
      boolean flag=false;
        while(true){
            xrow=input.nextInt();
        	xcolumn=input.nextInt();
        	TicTac.setValue(xrow, xcolumn,0);
        	TicTac.incCounter(); //increment Counter
        	TicTac.showMatrix();
        	if(TicTac.straightCheck(0)||TicTac.diagonalCheck(0))
        		{System.out.println("X wins!");
        		flag=true;
        		break;}
        			     			
           	
        	orow=input.nextInt();
        	ocolumn=input.nextInt();
        	TicTac.setValue(orow,ocolumn,1);
        	TicTac.showMatrix();
        	if(TicTac.straightCheck(1)||TicTac.diagonalCheck(1))
        		{System.out.println("O wins!");
        		flag=true;
        		break;}
       
        	}
       if(!flag) System.out.println("Tie");

        
	}
	

}

