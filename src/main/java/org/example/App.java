package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        String adj1;
        String noun1; //animal
        String noun2; //name animal1
        String noun3; //obj
        String noun4; //place
        String adj2;
        String noun5; //another animal
        String act1; //action?
        String act2; //an exclamation
        String noun6; //food
        String adj3;


        System.out.print("Please enter an adjective: ");
        adj1 = scanner.nextLine();
        System.out.print("Please enter an animal: ");
        noun1 = scanner.nextLine();
        System.out.print("Please enter a name for the animal: ");
        noun2 = scanner.nextLine();
        System.out.print("Please enter an object: ");
        noun3 = scanner.nextLine();
        System.out.print("Please enter a place: ");
        noun4 = scanner.nextLine();
        System.out.print("Please enter an adjective: ");
        adj2 = scanner.nextLine();
        System.out.print("Please enter an other animal: ");
        noun5 = scanner.nextLine();
        System.out.print("Please enter an action: ");
        act1 = scanner.nextLine();
        System.out.print("Please enter an exclamation: ");
        act2 = scanner.nextLine();
        System.out.print("Please enter a food: ");
        noun6 = scanner.nextLine();
        System.out.print("Please enter an adjective: ");
        adj3 = scanner.nextLine();

        System.out.print("A " + adj1 + " " + noun1 + " named " + noun2 + " found a " + noun3 +  " in " +  noun4 +".Suddenly, a " + adj2 + " " +  noun5 +  " appeared and said, “That’s my " + noun3 + "!”" +  "\n" +
                "\n" +
                "“Prove it,” said " + noun2 + "." + "\n" +
                "\n" +
                "So the creature did a " + act1 + " and shouted, “" + act2 + "!”" + "\n" +
                "\n" +
                "Laughing, " + noun2 + " gave it back. They celebrated by eating " + noun6 + " and became " + adj3 + " friends.");


    }
}
