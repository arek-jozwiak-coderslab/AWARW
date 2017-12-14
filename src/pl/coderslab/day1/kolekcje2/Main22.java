package pl.coderslab.day1.kolekcje2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main22 
{	
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			int counter = 0;
			
			Map<String, String> questions = getMap();
			
			for(String key : questions.keySet())
			{
				System.out.printf("Przeciwieństwo do [%s]: ", key);
				if(sc.nextLine().equals(questions.get(key)))
				{
					counter++;
				}
			}
			
			System.out.println("Poprwnych odpowiedzi: " + counter);
		}
	}
	
	public static Map<String, String> getMap()
	{
		Map<String, String> result = new HashMap<>();
		
		result.put("zimno", "ciepło");
		result.put("białe", "czarne");
		result.put("zima", "lato");
		result.put("ogień", "woda");
		result.put("mały", "duży");
		
		return result;
	}
}
