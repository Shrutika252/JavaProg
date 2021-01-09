import java.util.Scanner;
public class NumberOfDaysAndYears {
	public static void main(String args[])
	{
		System.out.println("Enter Mins :");
    
		Scanner s=new Scanner(System.in);
    
		double min=s.nextDouble();
    
    long years = (long) (min /(60*24*365));
    
    int days = (int) (min / 60 / 24) % 365;
    
  System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
  
	}

}
