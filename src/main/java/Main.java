import java.math.BigDecimal;
import java.util.Scanner;

import big.decimal.operations.UtilsBigDecimal;
import car.inventory.system.factory.Sedan;
import car.inventory.system.factory.Truck;
import car.inventory.system.factory.UtilityVehicle;
import interfaces.AbstractIntList;
import video.streaming.service.content.Movie;
import video.streaming.service.content.TvSeries;
import interfaces.IntArrayList;
import interfaces.IntVector;

public class Main {
    public static void main(String[] args) {
        boolean continueProgram = true;
        Scanner scanner = new Scanner(System.in);
        do{
        printWelcomeMessage();
        int option = getUserInput(scanner, "Please select an option (1-4):", 1,4);
        switch (option){
            case 1 -> handleBigDecimalOperations(scanner);
            case 2 -> handleVideoStreaming(scanner);
            case 3 -> handleCarInventory(scanner);
            case 4 -> handleIntList(scanner);
            default -> System.out.println("Invalid option.");
        }
            System.out.println("\n---------------------------------------------------------");
            char response;
            do{
                System.out.print("Do you want to continue? (y/n): ");
                response = scanner.next().toLowerCase().charAt(0);
                if (response != 'y' && response != 'n') {
                    System.out.print("Invalid input. Please enter 'y' or 'n': ");
                }
            } while (response != 'y' && response != 'n');
            switch (response) {
                case 'y' -> System.out.println("Continuing program...");
                case 'n' -> {
                    System.out.println("Exiting program.");
                    continueProgram = false;
                }
            }


        } while(continueProgram);

        scanner.close();
    }

    private static void printWelcomeMessage() {
        // This method prints a welcome message and the options menu.
        System.out.println("    ╔═══════════════════════════════════╗");
        System.out.println("    ║           OPTIONS MENU            ║");
        System.out.println("    ╠═══════════════════════════════════╣");
        System.out.println("    ║    1. BigDecimal Operations       ║");
        System.out.println("    ║    2. Video Streaming Service     ║");
        System.out.println("    ║    3. Car Inventory System        ║");
        System.out.println("    ║    4. Int List Operations         ║");
        System.out.println("    ╚═══════════════════════════════════╝\n");
    }

    private static void handleBigDecimalOperations( Scanner scanner) {
        // Clear the scanner buffer
        scanner.nextLine();
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║         *** BigDecimal Operations Selected ***         ║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        System.out.println("║  Convert a BigDecimal value to double in this section. ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        // Prompt the user for a BigDecimal input
        System.out.println("Please enter a BigDecimal value: ");
        // Read BigDecimal input from the user
        BigDecimal input = null;
        while( input == null) {
            try {
                String userInput = scanner.nextLine().trim();
                input = new BigDecimal(userInput);
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Invalid BigDecimal format. Please try again: ");
            }
        }
        double result = UtilsBigDecimal.bigDecimalToDouble(input);

        System.out.println("╔═══════════════════════════╦════════════════════════════╗");
        System.out.println("║   BigDecimal entered      ║      Converted to double   ║");
        System.out.println("╠═══════════════════════════╬════════════════════════════╣");
        System.out.printf("║ %-25s ║ %25.2f  ║\n", input, result);
        System.out.println("╚═══════════════════════════╩════════════════════════════╝");
    }

    private static void handleVideoStreaming(Scanner scanner) {
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║         *** Video Streaming Service Selected ***     ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  Create a Movie or TV Series in this section.        ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  1. Create Movie                                     ║");
        System.out.println("║  2. Create TV Series                                 ║");
        System.out.println("╚══════════════════════════════════════════════════════╝\n");
        int choice = getUserInput(scanner, "Choose content type (1 or 2):", 1, 2);

        scanner.nextLine(); // limpiar buffer
        try {
            if (choice < 1 || choice > 2) {
                throw new IllegalArgumentException("Invalid choice. Please select 1 or 2.");
            }
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            if (choice == 1) {
                System.out.print("Enter duration (minutes): ");
                int duration = Integer.parseInt(scanner.nextLine().trim());
                System.out.print("Enter rating: ");
                String ratingInput = scanner.nextLine().trim().replace(",", ".");
                double rating = Double.parseDouble(ratingInput);
                Movie movie = new Movie(title, duration, rating);
                System.out.println("Created: " + movie.getInfo());
            } else {
                System.out.print("Enter episode duration (minutes): ");
                int episodeDuration = Integer.parseInt(scanner.nextLine().trim());
                System.out.print("Enter number of episodes: ");
                int episodes = Integer.parseInt(scanner.nextLine().trim());
                TvSeries series = new TvSeries(title, episodeDuration, episodes);
                System.out.println("Created: " + series.getInfo());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void handleCarInventory(Scanner scanner) {
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║         *** Car Inventory System Selected ***        ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  Create a car in the inventory system.               ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  Select car type:                                    ║");
        System.out.println("║  1. Sedan                                            ║");
        System.out.println("║  2. Utility Vehicle                                  ║");
        System.out.println("║  3. Truck                                            ║");
        System.out.println("╚══════════════════════════════════════════════════════╝\n");

        int type = getUserInput(scanner, "Select car type (1-3):", 1, 3);
        scanner.nextLine(); // limpiar buffer
        try{
            if (type < 1 || type > 3) {
                throw new IllegalArgumentException("Invalid car type. Please select 1, 2, or 3.");
            }
            System.out.println("Creating a car of type: " + (type == 1 ? "Sedan" : type == 2 ? "Utility Vehicle" : "Truck"));
            System.out.print("Enter VIN: ");
            String vin = scanner.nextLine();
            System.out.print("Enter make: ");
            String make = scanner.nextLine();
            System.out.print("Enter model: ");
            String model = scanner.nextLine();
            System.out.print("Enter mileage: ");
            int mileage = Integer.parseInt(scanner.nextLine().trim());
        switch (type) {
            case 1 -> {
                Sedan sedan = new Sedan(vin, make, model, mileage);
                System.out.println("Created: " + sedan.getInfo());
            }
            case 2 -> {
                System.out.print("Is it 4x4 (true/false)? ");
                boolean is4x4 = Boolean.parseBoolean(scanner.nextLine().trim());
                UtilityVehicle utility = new UtilityVehicle(vin, make, model, mileage, is4x4);
                System.out.println("Created: " + utility.getInfo());
            }
            case 3 -> {
                System.out.print("Enter towing capacity: ");
                double towing = Double.parseDouble(scanner.nextLine().trim().replace(",", "."));
                Truck truck = new Truck(vin, make, model, mileage, towing);
                System.out.println("Created: " + truck.getInfo());
            }
        }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

    }

    private static void handleIntList(Scanner scanner) {
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║         *** Int List Operations Selected ***         ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  Create an IntArrayList or IntVector in this section.║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  Select list type:                                   ║");
        System.out.println("║  1. IntArrayList                                     ║");
        System.out.println("║  2. IntVector                                        ║");
        System.out.println("╚══════════════════════════════════════════════════════╝\n");

        int choice = getUserInput(scanner, "Choose list type (1 or 2):", 1, 2);
        // Clear the scanner buffer
        scanner.nextLine(); // limpiar buffer
        if (choice == 1) {
            IntArrayList intArrayList = new IntArrayList();
            createIntList(intArrayList, 20);  // Fixed size for automatic filling

        } else {
            IntVector intVector = new IntVector();
            createIntList(intVector, 30);
        }

    }
    private static void createIntList(AbstractIntList instance, int size) {
        System.out.println("Creating an instance of " + instance.getClass().getSimpleName() + " with initial size " + size + ".");
        String className = instance.getClass().getSimpleName();
        if (className.equals("IntArrayList")) {
            // This is an IntArrayList
            System.out.println("╔══════════════════════════════════════════════════════╗");
            System.out.println("║             *** IntArrayList Created ***             ║");
            System.out.println("╠══════════════════════════════════════════════════════╣");
            System.out.println("║   This is an IntArrayList with a fixed size to 20.   ║");
            System.out.println("╚══════════════════════════════════════════════════════╝");
        } else{
            // This is an IntVector
            System.out.println("╔══════════════════════════════════════════════════════╗");
            System.out.println("║               *** IntVector Created ***              ║");
            System.out.println("╠══════════════════════════════════════════════════════╣");
            System.out.println("║    This is an IntVector with a fixed size to 30.     ║");
            System.out.println("╚══════════════════════════════════════════════════════╝");
            System.out.println("This is an IntVector. Setting size to " + size + ".");
        }

        System.out.println("Filling the list with " + size + " elements automatically.");
        for (int i = 0; i < size; i++) {
            instance.add(i);
        }
        // Print the elements in the list
        System.out.print("Elementos en la lista: [");
        for (int i = 0; i < instance.size(); i++) {
            System.out.print(instance.get(i));
            if (i < instance.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Total de elementos en la lista: " + instance.size());
        System.out.println("Capacidad interna de la lista: " + instance.getData().length);

    }

    private static int getUserInput(Scanner scanner, String message, int min, int max) {
    // This method prompts the user for input and validates it within a specified range.

        int input;
        do {
            System.out.print(message + " ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Try again: ");
                scanner.next();
            }
            input = scanner.nextInt();
            if (input < min || input > max){
                System.out.print("Invalid input. Try again: ");
            }
        } while (input < min || input > max);
        return input;
    }

}
