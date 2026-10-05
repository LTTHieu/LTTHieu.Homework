package o_exercise9;

import java.util.Date;

public class StorageService extends CloudService {
    private int storageGB;
    private boolean encryptionEnabled;

    public StorageService(String id, double baseMonthlyFee, Date startDate,
                          boolean isActive, int monthsUsed,
                          int storageGB, boolean encryptionEnabled) {

        super(id, baseMonthlyFee, startDate, isActive, monthsUsed);
        this.storageGB = storageGB;
        this.encryptionEnabled = encryptionEnabled;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public boolean isEncryptionEnabled() {
        return encryptionEnabled;
    }

    public void setEncryptionEnabled(boolean encryptionEnabled) {
        this.encryptionEnabled = encryptionEnabled;
    }

    @Override
    public void addService() {
        super.addService();

        System.out.print("Enter storage (GB): ");
        storageGB = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter encryption enabled (true/false): ");
        encryptionEnabled = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void updateService() {
        super.updateService();

        System.out.print("Enter new storage (GB): ");
        storageGB = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new encryption enabled (true/false): ");
        encryptionEnabled = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Storage Service ---");

        super.displayDetails();

        System.out.println("Storage GB: " + storageGB);
        System.out.println("Encryption enabled: " + encryptionEnabled);
        System.out.println("Monthly cost: " + calculateMonthlyCost());
    }

    @Override
    public double calculateMonthlyCost() {
        double baseCost = getBaseMonthlyFee() * getMonthsUsed();

        if (storageGB >= 1000) {
            baseCost += baseCost * 0.20;
        } else if (storageGB >= 500) {
            baseCost += baseCost * 0.10;
        } else {
            baseCost += baseCost * 0.05;
        }

        if (encryptionEnabled) {
            baseCost += baseCost * 0.05;
        }

        return baseCost;
    }
}
