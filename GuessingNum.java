import java.util.Scanner;
import java.util.Random;
class GuessingNum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
         String play="yes";

		 //to ask if we are playing game again or not
		 while(play.equals("yes"))
		{
			 Random rand=new Random();
			 int randnum=rand.nextInt(50);
			 int guess = -1;
			 int tries = 0;

			 //to cheak if game is over
			 while (guess!=randnum)

			 {
				 System.out.println("Guess a number between 1 and 50:");
				 guess = s.nextInt();
				 tries++;
				 

				 if (guess==randnum)
				 {
					 System.out.println("congratulations! you guessed a correct Number ");
					 System.out.println("It only took you" +tries +"guesses");
					 System.out.println("Would you like to play again? yes or no:");
					 play=s.next().toLowerCase();

				 }
				 else if(guess>randnum)
				 {
					System.out.println("your guess is to high, try again");

				 }
				 else
				 {
					System.out.println("your guess is too low,try again.");
				 }
			 }
	}
	s.close();
}
}