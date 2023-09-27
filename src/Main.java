import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter the maintenance costs for each season
        System.out.print("Enter maintenance cost for Spring: $");
        double springCost = in.nextDouble();

        System.out.print("Enter maintenance cost for Summer: $");
        double summerCost = in.nextDouble();

        System.out.print("Enter maintenance cost for Fall: $");
        double fallCost = in.nextDouble();

        System.out.print("Enter maintenance cost for Winter: $");
        double winterCost = in.nextDouble();

        // Calculate the total yearly maintenance cost
        double yearlyCost = springCost + summerCost + fallCost + winterCost;

        // Display the individual seasonal costs and the total yearly cost
        System.out.println("Spring cost: $" + springCost);
        System.out.println("Summer cost: $" + summerCost);
        System.out.println("Fall cost: $" + fallCost);
        System.out.println("Winter cost: $" + winterCost);
        System.out.println("Total yearly maintenance cost: $" + yearlyCost);

        // Close the in
        in.close();
    }
}