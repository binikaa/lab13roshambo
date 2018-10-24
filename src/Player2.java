import java.util.Scanner;

public class Player2 extends Player {
	
	Scanner scr;
	public Player2()
	{
		super();
	}
	public Roshambo generateRoshambo(Scanner scanner)
	{
		this.scr= scanner;
		
		System.out.println("Enter your choice:");
		String choice = scr.next();
		
		if (choice.equals("R")|| choice.equals("r"))
			return Roshambo.rock;
		if(choice.equals("P") || choice.equals("p"))
				return Roshambo.paper;
		return Roshambo.scissor;
	
	}
	

	
}
