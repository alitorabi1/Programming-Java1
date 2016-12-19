//Using the order of precedence rules,
public class Lab_2_2
{
public static void main(String[] args)
{
//Using the order of precedence rules,
//3 * 7 - 6 + 2 * 5 / 4 + 6
//means the following:
	System.out.println(((3 * 7) - 6) + ((2 * 5) / 4 )) + 6 = ((21 - 6) + (10 / 4)) + 6) ;//(Evaluate *)
	System.out.println((21 - 6) + 2) + 6; //(Evaluate /. Note that this is an integer division.)
	System.out.println(15 + 2) + 6; //(Evaluate -)
	System.out.println(17 + 6) = 23; //(Evaluate +)
}
}