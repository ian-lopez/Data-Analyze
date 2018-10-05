import java.util.Scanner;

public class DataAnalyze2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the sample size: ");
		int sampleSize = input.nextInt();
		
		int[] trial0 = new int [sampleSize];
		int[] trial1 = new int [sampleSize];
		int[] trial2 = new int [sampleSize];
		int[] trial3 = new int [sampleSize];
		
		int sum0 = 0, sum1 = 0, sum2 = 0, sum3 = 0;
		int avg0 = 0, avg1 = 0, avg2 = 0, avg3 = 0;
		
		//Allows for comparrisons to find the true min and max values
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int i = 0;
		
		//Gather information for the trials
		System.out.println("Please enter the number for Trial 0");
		
		for(i = 0; i < trial0.length; i++)
		{
			System.out.print("Enter sample #" + i + ": ");
			trial0[i] = input.nextInt();
			
			//Calculating the sum for the entries in each individual trial along with the averages
			sum0 += trial0[i];
			avg0 = (int) (sum0 / sampleSize);
		}
		
		System.out.println();
		
		System.out.println("Please enter the number for Trial 1");
		
		for(i = 0; i < trial1.length; i++)
		{
			System.out.print("Enter sample #" + i + ": ");
			trial1[i] = input.nextInt();
			
			sum1 += trial1[i];
			avg1 = (int) (sum1 / sampleSize);
		}
		
		System.out.println();
		
		System.out.println("Please enter the number for Trial 2");
		
		for(i = 0; i < trial2.length; i++)
		{	
			System.out.print("Enter sample #" + i + ": ");
			trial2[i] = input.nextInt();
			
			sum2 += trial2[i];
			avg2 = (int) (sum2 / sampleSize);
		}
		
		System.out.println();
		
		System.out.println("Please enter the number for Trial 3");
		
		for(i = 0; i < trial3.length; i++)
		{
			System.out.print("Enter sample #" + i + ": ");
			trial3[i] = input.nextInt();
			
			sum3 += trial3[i];
			avg3 = (int) (sum3 / sampleSize);
		}
		
		System.out.println();
		
		System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");
		for(i = 0; i < sampleSize; i++)
		{
			System.out.println("\t" + i + "\t\t" + trial0[i] + "\t" + trial1[i] + "\t" + trial2[i] + "\t" + trial3[i]);
		}
		System.out.println("\t------------------------------------------------");
		
		System.out.println("Average:\t\t" + avg0 + "\t" + avg1 + "\t" + avg2 + "\t" + avg3);
		
		System.out.println();
		
		int[] averages = {avg0, avg1, avg2, avg3};
		
		for(i = 0; i < averages.length; i++)
		{
			if(averages[i] > max)
			{
				max = averages[i];
			}
			else if(averages[i] < min)
			{
				min = averages[i];
			}	
		}
		System.out.println("Min Average: " + min);
		System.out.println("Max Average: " + max);
		
		System.out.println();
		
		if(min == max)
		{
			System.out.println("The trials match EXACTLY!");
		}
		else if(max < (2 * min))
		{
			System.out.println("The trials concur with each other!");
		}
		else
		{
			System.out.println("The trials do NOT concur!");
		}
		input.close();
	}
}