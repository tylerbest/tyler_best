public class getodds
{
	static int[]numbers = new int[10];
	public static void main(String[]args)
	{
		fillArray();
		printArray();
		System.out.println("\n\nThese numbers... " + getOdds() + " are odd numbers");
	}
	public static void fillArray()
	{
		for(int i =0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	public static void printArray()
	{
		System.out.println("For the following numbers...");
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
	}

public static String getOdds()

	{
		String odds = "";
		for(int num : numbers)
		{
			if(num%2 == 1)
			{
				odds += num + " ";
			}
		}
		return odds;
	}
}



