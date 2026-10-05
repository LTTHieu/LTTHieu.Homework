
package o_exercise9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CloudServiceArrayList manager = new CloudServiceArrayList();

        int choice;

        do {
            System.out.println("\n===== CLOUD SERVICE MANAGEMENT =====");
            System.out.println("1. Add Storage Service");
            System.out.println("2. Add Compute Service");
            System.out.println("3. Update Service");
            System.out.println("4. Delete Service");
            System.out.println("5. Display All Services");
            System.out.println("6. Display Active Services");
            System.out.println("7. Find Highest Monthly Cost");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    StorageService storage = new StorageService(
                            "", 0, null, false, 0, 0, false
                    );

                    storage.addService();
                    manager.addServiceToArrayList(storage);
                    break;

                case 2:
                    ComputeService compute = new ComputeService(
                            "", 0, null, false, 0, 0, 0
                    );

                    compute.addService();
                    manager.addServiceToArrayList(compute);
                    break;

                case 3:
                    System.out.print("Enter service ID to update: ");
                    String updateId = scanner.nextLine();

                    manager.updateServiceById(updateId);
                    break;

                case 4:
                    System.out.print("Enter service ID to delete: ");
                    String deleteId = scanner.nextLine();

                    manager.deleteServiceById(deleteId);
                    break;

                case 5:
                    manager.displayAllServices();
                    break;

                case 6:
                    manager.displayActiveServices();
                    break;

                case 7:
                    double highest = manager.findHighestMonthlyCost();

                    System.out.println(
                            "Highest monthly cost: " + highest
                    );
                    break;

                case 8:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        scanner.close();
    }
}