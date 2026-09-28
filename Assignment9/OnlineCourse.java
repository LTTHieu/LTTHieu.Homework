package o_exercise6;

import java.util.Date;
import java.util.Scanner;

public class OnlineCourse extends Course {

    private String platformName;
    private double discountPercent;

    public OnlineCourse(String id, double feePerStudent,
            java.util.Date startDate, boolean isAvailable,
            int enrolledStudents, String platformName,
            double discountPercent) {

        super(id, feePerStudent, startDate,
                isAvailable, enrolledStudents);

        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void addCourse() {

        // Nhập thông tin chung của Course
        super.addCourse();

        // Nhập thông tin riêng của OnlineCourse
        System.out.print("Enter platform name: ");
        platformName = sc.nextLine();

        System.out.print("Enter discount percent: ");
        discountPercent = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void updateCourse() {

        super.updateCourse();

        System.out.print("Enter new platform name: ");
        platformName = sc.nextLine();

        System.out.print("Enter new discount percent: ");
        discountPercent = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void displayCourse() {

        System.out.println("\n--- ONLINE COURSE ---");

        super.displayCourse();

        System.out.println("Platform name: " + platformName);
        System.out.println("Discount percent: " + discountPercent + "%");
        System.out.println("Total fee: " + calculateTotalFee());
    }

    @Override
    public double calculateTotalFee() {

        return getFeePerStudent()
                * getEnrolledStudents()
                * (1 - discountPercent / 100);
    }
}

