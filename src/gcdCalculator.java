
public class gcdCalculator {
	
	public int findGCD(int x, int y)
	{
		if(x%y == 0) 
		{ 
			return y;
		}
		else 
		{ 
			return findGCD(y,x%y);
		}
	}

}
