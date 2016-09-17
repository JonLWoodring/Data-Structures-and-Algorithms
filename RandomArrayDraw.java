import java.util.*;
public class RandomArrayDraw 
{
	public static void main(String[] args)
	{
		int[] rndmArray = new int[10];
		Random rndm = new Random();
	
			for(int y = 0; y < 10; y++)
			{
				rndmArray[y] = rndm.nextInt(1000) + 1; ;
			}
			for(int t = 0; t < 10; t++)
				System.out.println(rndmArray[t]);
			
			System.out.println("The three random values are:");
			
			int count = 0;
			int randomDraw;
			int randomArrayIndex;
			boolean isUnique = false;
			
			while(count < 4)
			{
				isUnique = false;
				
			while(isUnique == false)
			{
				randomArrayIndex = rndm.nextInt(10);
				randomDraw = rndmArray[randomArrayIndex];
				if(randomDraw == 0)
					isUnique = false;
				else 
					System.out.println(randomDraw);
					rndmArray[randomArrayIndex] = 0;
					count++;
					isUnique = true;
						
			}
		}
				
	}
}

