
package o_exercise9;

import java.util.ArrayList;

public class CloudServiceArrayList {
    private ArrayList<CloudService> services;

    public CloudServiceArrayList() {
        services = new ArrayList<>();
    }

    public void addServiceToArrayList(CloudService service) {
        services.add(service);
        System.out.println("Service added successfully.");
    }

    public void updateServiceById(String id) {
        for (CloudService service : services) {

            if (service.getId().equals(id)) {
                service.updateService();

                System.out.println("Service updated successfully.");
                return;
            }
        }

        System.out.println("Service not found.");
    }

    public void deleteServiceById(String id) {
        for (int i = 0; i < services.size(); i++) {

            if (services.get(i).getId().equals(id)) {
                services.remove(i);

                System.out.println("Service deleted successfully.");
                return;
            }
        }

        System.out.println("Service not found.");
    }

    public void displayAllServices() {
        if (services.isEmpty()) {
            System.out.println("No services available.");
            return;
        }

        for (CloudService service : services) {
            service.displayDetails();
        }
    }

    public void displayActiveServices() {
        boolean found = false;

        for (CloudService service : services) {

            if (service.isActive()) {
                service.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No active services found.");
        }
    }

    public double findHighestMonthlyCost() {
        if (services.isEmpty()) {
            return 0;
        }

        double highest = 0;

        for (CloudService service : services) {

            double cost = service.calculateMonthlyCost();

            if (cost > highest) {
                highest = cost;
            }
        }

        return highest;
    }
}
