
package o_exercise9;

import java.util.Date;

public class ComputeService extends CloudService {
    private int cpuCores;
    private double runtimeHours;

    public ComputeService(String id, double baseMonthlyFee, Date startDate,
                          boolean isActive, int monthsUsed,
                          int cpuCores, double runtimeHours) {

        super(id, baseMonthlyFee, startDate, isActive, monthsUsed);
        this.cpuCores = cpuCores;
        this.runtimeHours = runtimeHours;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public double getRuntimeHours() {
        return runtimeHours;
    }

    public void setRuntimeHours(double runtimeHours) {
        this.runtimeHours = runtimeHours;
    }

    @Override
    public void addService() {
        super.addService();

        System.out.print("Enter CPU cores: ");
        cpuCores = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter runtime hours: ");
        runtimeHours = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void updateService() {
        super.updateService();

        System.out.print("Enter new CPU cores: ");
        cpuCores = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new runtime hours: ");
        runtimeHours = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Compute Service ---");

        super.displayDetails();

        System.out.println("CPU cores: " + cpuCores);
        System.out.println("Runtime hours: " + runtimeHours);
        System.out.println("Monthly cost: " + calculateMonthlyCost());
    }

    @Override
    public double calculateMonthlyCost() {
        double baseCost = getBaseMonthlyFee() * getMonthsUsed();

        if (cpuCores >= 16) {
            baseCost += baseCost * 0.25;
        } else if (cpuCores >= 8) {
            baseCost += baseCost * 0.15;
        } else {
            baseCost += baseCost * 0.05;
        }

        if (runtimeHours > 200) {
            baseCost += (runtimeHours - 200) * 0.50;
        }

        return baseCost;
    }
}
