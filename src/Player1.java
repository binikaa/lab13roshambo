
public class Player1 extends Player{
	
	public Player1()
	{
		super();
	}
	public Roshambo generateRoshambo()
	{
		if (RoshmboValue.equals("R")|| RoshmboValue.equals("r"))
			return Roshambo.rock;
		if(RoshmboValue.equals("P") || RoshmboValue.equals("p"))
				return Roshambo.paper;
		return Roshambo.scissor;
	}

}
