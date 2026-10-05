package o_exercise9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class CloudService implements ICloudService {

    private String id;
    private double baseMonthlyFee;
    private Date startDate;
    private boolean isActive;
    private int monthsUsed;

    protected Scanner scanner = new Scanner(System.in);

    public CloudService(String id, double baseMonthlyFee, Date startDate,
            boolean isActive, int monthsUsed) {
        this.id = id;
        this.baseMonthlyFee = baseMonthlyFee;
        this.startDate = startDate;
        this.isActive = isActive;
        this.monthsUsed = monthsUsed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBaseMonthlyFee() {
        return baseMonthlyFee;
    }

    public void setBaseMonthlyFee(double baseMonthlyFee) {
        this.baseMonthlyFee = baseMonthlyFee;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getMonthsUsed() {
        return monthsUsed;
    }

    public void setMonthsUsed(int monthsUsed) {
        this.monthsUsed = monthsUsed;
    }

    @Override
    public void addService() {
        try {
            System.out.print("Enter ID: ");
            id = scanner.nextLine();

            System.out.print("Enter base monthly fee: ");
            baseMonthlyFee = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter start date (dd/MM/yyyy): ");
            String date = scanner.nextLine();
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);

            System.out.print("Enter active status (true/false): ");
            isActive = Boolean.parseBoolean(scanner.nextLine());

            System.out.print("Enter months used: ");
            monthsUsed = Integer.parseInt(scanner.nextLine());

        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }

    @Override
    public void updateService() {
        try {
            System.out.print("Enter new base monthly fee: ");
            baseMonthlyFee = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter new start date (dd/MM/yyyy): ");
            String date = scanner.nextLine();
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);

            System.out.print("Enter new active status (true/false): ");
            isActive = Boolean.parseBoolean(scanner.nextLine());

            System.out.print("Enter new months used: ");
            monthsUsed = Integer.parseInt(scanner.nextLine());

        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("ID: " + id);
        System.out.println("Base monthly fee: " + baseMonthlyFee);
        System.out.println("Start date: " + sdf.format(startDate));
        System.out.println("Active: " + isActive);
        System.out.println("Months used: " + monthsUsed);
    }
}
