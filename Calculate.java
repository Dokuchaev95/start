public class Calculate
{
	public static double sum(double first, double second)
	{
		return first+second;
	}
	public static double sub(double first,double second)
	{
		return first-second;
	}
	public static double multy(double first, double second)
	{
		return first*second;
	}
	public static double dif(double first, double second)
	{
		return first/second;
	}
	public static void main(String[] argv)
	{
		System.out.println("Calculate...");
		if(argv.length==2)
		{
			System.out.println("SUM: "+sum(Double.valueOf(argv[0]),Double.valueOf(argv[1])));
			System.out.println("SUBTRACT: "+sub(Double.valueOf(argv[0]),Double.valueOf(argv[1])));
			System.out.println("MULTY: "+multy(Double.valueOf(argv[0]),Double.valueOf(argv[1])));
			System.out.println("DIF: "+dif(Double.valueOf(argv[0]),Double.valueOf(argv[1])));
		}
		else System.out.println("ERROR IN ARGV");
	}
}