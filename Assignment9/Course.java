package o_exercise6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Course implements ICourse {

    private String id;
    private double feePerStudent;
    private Date startDate;
    private boolean isAvailable;
    private int enrolledStudents;

    protected Scanner sc = new Scanner(System.in);

    public Course() {

    }

    public Course(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        this.id = id;
        this.feePerStudent = feePerStudent;
        this.startDate = startDate;
        this.isAvailable = isAvailable;
        this.enrolledStudents = enrolledStudents;
    }

    public String getId() {
        return id;
    }

    public double getFeePerStudent() {
        return feePerStudent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFeePerStudent(double feePerStudent) {
        this.feePerStudent = feePerStudent;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void addCourse() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter course ID: ");
        id = sc.nextLine();

        System.out.print("Enter fee per student: ");
        feePerStudent = Double.parseDouble(sc.nextLine());

        System.out.print("Enter start date (dd/MM/yyyy): ");
        String date = sc.nextLine();
        try {
            startDate = sdf.parse(date);
        } catch (ParseException e) {
            System.out.println("Invalid date!");
        }

        System.out.print("Is available? (true/false): ");
        isAvailable = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Enter enrolled students: ");
        enrolledStudents = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void updateCourse() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter new fee per student: ");
        feePerStudent = Double.parseDouble(sc.nextLine());

        System.out.print("Enter new start date (dd/MM/yyyy): ");
        String date = sc.nextLine();

        try {
            startDate = sdf.parse(date);
        } catch (ParseException e) {
            System.out.println("Invalid date!");
        }

        System.out.print("Is available? (true/false): ");
        isAvailable = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Enter new enrolled students: ");
        enrolledStudents = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayCourse() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Course ID: " + id);
        System.out.println("Fee per student: " + feePerStudent);
        System.out.println("Start date: " + sdf.format(startDate));
        System.out.println("Available: " + isAvailable);
        System.out.println("Enrolled students: " + enrolledStudents);
    }

    
}
