
import java.util.Scanner;
import java.util.*;

public class TwoTypePairDemo
{
   public static void main(String[] args)
   {
   		ArrayList<String> s = new ArrayList<String>();
   		s.add(new String());

        TwoTypePair<String, Integer> rating =
             new TwoTypePair<String, Integer>("The Car Guys", 8);

        Scanner keyboard = new Scanner(System.in);
        System.out.println(
                    "Our current rating for " + rating.getFirst());
        System.out.println(" is " + rating.getSecond());

        System.out.println("How would you rate them?");
        int score = keyboard.nextInt();
        rating.setSecond(score);

        System.out.println(
                    "Our new rating for " + rating.getFirst());
        System.out.println(" is " + rating.getSecond());
   }
}
