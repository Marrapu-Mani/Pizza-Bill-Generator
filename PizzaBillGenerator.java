import java.util.Scanner;

public class PizzaBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Pizzamania!");

        System.out.println("Select the type of pizza:");
        System.out.println("1. Veg Pizza - 300");
        System.out.println("2. Non-Veg Pizza - 400");
        System.out.println("3. Delux Veg Pizza - 550");
        System.out.println("4. Delux Non-Veg Pizza - 650");

        int choice = scanner.nextInt();
        Pizza pizza = null;

        switch (choice) {
            case 1:
                pizza = new Pizza("Veg Pizza", 300);
                break;
            case 2:
                pizza = new Pizza("Non-Veg Pizza", 400);
                break;
            case 3:
                pizza = new Pizza("Delux Veg Pizza", 550);
                pizza.setExtraCheese(true);
                pizza.setExtraToppings(true);
                break;
            case 4:
                pizza = new Pizza("Delux Non-Veg Pizza", 650);
                pizza.setExtraCheese(true);
                pizza.setExtraToppings(true);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        if (choice == 1 || choice == 2) {
            System.out.println("Do you want extra cheese? (yes/no)");
            String extraCheese = scanner.next();
            pizza.setExtraCheese(extraCheese.equalsIgnoreCase("yes"));

            System.out.println("Do you want extra toppings? (yes/no)");
            String extraToppings = scanner.next();
            pizza.setExtraToppings(extraToppings.equalsIgnoreCase("yes"));
        }

        System.out.println("Do you want to take away? (yes/no)");
        String takeAway = scanner.next();
        pizza.setTakeAway(takeAway.equalsIgnoreCase("yes"));

        System.out.println("\nGenerating Bill...\n");
        System.out.println(pizza);
    }
}
