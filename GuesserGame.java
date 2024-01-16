//NUMBER GUESSING GAME

import java.util.Scanner;

class Yogesh
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan= new Scanner(System.in);
		int num;
		do 
		{
		System.out.println("Yogesh please guess the number");
		num=scan.nextInt();
		}while(num<0 || num>10);  
		return num;
	}
}

class Players
{
	int playerNum;
	
	int playerNum()
	{
		Scanner scan=new Scanner(System.in);
		int num;
		
		do
		{
			System.out.println("Player please guess the number");
			num=scan.nextInt();
		}while(num<0 || num>10);
		return num;
		
	}
	

}

class Mahi
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectnumFromGuesser()
	{
		Yogesh g=new Yogesh();
		numFromGuesser=g.guessNum();
	}
	
	void collectnumFromPlayers()
	{
		Players p1=new Players();
		numFromPlayer1=p1.playerNum();
		
		Players p2=new Players();
		numFromPlayer2=p2.playerNum();
		
		Players p3=new Players();
		numFromPlayer3=p3.playerNum();
	}
	
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 and 2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and 3 won");
			}
			else
			{
				System.out.println("Player 1 won");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 and 3 won");
			}
			else
			{
				System.out.println("Player 2 won");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won");
		}
		else
		{
			System.out.println("Game lost play again");
		}
	}
	
	
	
}



public class GuesserGame 
{

	public static void main(String[] args) 
	{
		Mahi u=new Mahi();
		u.collectnumFromGuesser();
		u.collectnumFromPlayers();
		u.compare();

	}

}
