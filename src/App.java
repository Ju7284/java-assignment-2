import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manifest manifest = new Manifest();
        boolean running = true; 

        System.out.println("Welcome to the SkyBox Passenger Manifest System!");

        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Insert passenger");
            System.out.println("2. Remove passenger");
            System.out.println("3. Switch seats");
            System.out.println("4. Rename passenger");
            System.out.println("5. Count passengers");
            System.out.println("6. Print passenger manifest");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            
            switch (choice) {
                
                case 1: 
                    System.out.print("What is the passenger's name? ");
                    String name = scanner.nextLine();
                    System.out.print("What is the passenger's age? ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 
                    manifest.insertPassenger(name, age);
                    break;
                
                case 2: 
                    System.out.print("Enter the passenger seat number to remove the passenger: ");
                    int seatToRemove = scanner.nextInt();
                    scanner.nextLine(); 
                    manifest.removePassenger(seatToRemove);
                    break; 
                
                case 3: 
                    System.out.print("Enter the first seat number to switch: ");
                    int seat1 = scanner.nextInt();
                    System.out.print("Enter the second seat number to switch: ");
                    int seat2 = scanner.nextInt();
                    scanner.nextLine(); 
                    manifest.switchSeats(seat1, seat2);
                    break; 

                case 4: 
                    System.out.print("Enter the seat number to rename the passenger: ");
                    int seatToRename = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter the new name of the passenger: ");
                    String newName = scanner.nextLine();
                    manifest.renamePassenger(seatToRename, newName);
                    break; 

                case 5:
                    System.out.println("Current number of passengers: " + manifest.countPassengers());
                    break; 

                case 6:
                    manifest.printManifest();
                    break; 

                case 7: 
                    System.out.println("Exiting the program. Goodbye!");
                    running = false; 
                    break;

                default: 
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
