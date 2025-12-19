import java.util.Scanner;

public class Loop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter string: ");
	int con=0, vol=0;
	String str = sc.nextLine().toLowerCase();
	for(char c:str.toCharArray())
	{
		if(Character.isLetter(c))
		{
		if("aeiou".indexOf(c)>=0)
		{
		vol++;
		}
		else
		{
		con++;
		}
		}
	}
	System.out.println("Constant: " + con  + "     Vowels: " + vol);
    }
}
