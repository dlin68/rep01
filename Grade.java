public class Grade{
	public static void main (String args[]){
		int grade = 70;
		if (grade > 60 && grade <70)
		{
			System.out.println("Your grade is F");
		}

		if (grade >= 70 && grade <80)
		{
			System.out.println("Your grade is S");
		}

		if (grade >= 80 && grade <90)
		{
			System.out.println("Your grade is G");
		}
		if (grade >= 90)
		System.out.println("Your grade is E");
	}
}


