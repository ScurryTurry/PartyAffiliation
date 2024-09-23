import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String party = "";
        String partyMenu = "D - Democratic\tR - Republican\tI - Independent\nEnter your party choice: ";

        System.out.print(partyMenu);
        party = in.nextLine();

        if (party.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (party.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (party.equalsIgnoreCase("I"))
            System.out.println("You get an Independent Man!");
        else
            System.out.println("You must be an other!");
    }
}