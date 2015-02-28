import java.util.Scanner;
public class BoardGame2048
{
public static void main(String[] args)
{
	
	// Start the game
	
	{
		int[][] board = new int[4][4];
		int score, gameOver = 0;
		board[0][0] = (int) Math.random(); board[0][1] = 2;
	/*
 	
	// Print the array "board"
	 	
	for(int row = 0; row < board.length; row++)
	{for (int column = 0; column < board[row].length; column++)
	{System.out.print(board[row][column] + " ");}
	System.out.println();}
	
	*/
	
	// Display the board 1st row
	
	System.out.println("\u2554\u2550\u2550\u2564\u2550\u2550\u2557"
			+ "\u2554\u2550\u2550\u2564\u2550\u2550\u2557");
	
	System.out.print("\u2551" + board[0][0] + " \u2551" + board[0][1] +" \u2551\u2551" + board[0][2]);
	System.out.println(" \u2551" + board[0][3] +" \u2551");
	
	System.out.println("\u255A\u2550\u2550\u2567\u2550\u2550\u255D"
			+ "\u255A\u2550\u2550\u2567\u2550\u2550\u255D");
	
	// Display the board 2nd row

	System.out.println("\u2554\u2550\u2550\u2564\u2550\u2550\u2557"
			+ "\u2554\u2550\u2550\u2564\u2550\u2550\u2557");
	
	System.out.print("\u2551" + board[1][0] + " \u2551" + board[1][1] +" \u2551\u2551" + board[1][2]);
	System.out.println(" \u2551" + board[1][3] +" \u2551");
	
	System.out.println("\u255A\u2550\u2550\u2567\u2550\u2550\u255D"
			+ "\u255A\u2550\u2550\u2567\u2550\u2550\u255D");
	
	// Display the board 3rd row
	
	System.out.println("\u2554\u2550\u2550\u2564\u2550\u2550\u2557"
			+ "\u2554\u2550\u2550\u2564\u2550\u2550\u2557");
	
	System.out.print("\u2551" + board[2][0] + " \u2551" + board[2][1] +" \u2551\u2551" + board[2][2]);
	System.out.println(" \u2551" + board[2][3] +" \u2551");
	
	System.out.println("\u255A\u2550\u2550\u2567\u2550\u2550\u255D"
			+ "\u255A\u2550\u2550\u2567\u2550\u2550\u255D");
	
	// Display the board 4th row
	
	System.out.println("\u2554\u2550\u2550\u2564\u2550\u2550\u2557"
			+ "\u2554\u2550\u2550\u2564\u2550\u2550\u2557");
	
	System.out.print("\u2551" + board[3][0] + " \u2551" + board[3][1] +" \u2551\u2551" + board[3][2]);
	System.out.println(" \u2551" + board[3][3] +" \u2551");
	
	System.out.println("\u255A\u2550\u2550\u2567\u2550\u2550\u255D"
			+ "\u255A\u2550\u2550\u2567\u2550\u2550\u255D");
	
	
}
{	
}
}
}
