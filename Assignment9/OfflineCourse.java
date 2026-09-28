package o_exercise6;

import java.util.Date;

public class OfflineCourse extends Course {

    private String classroomNumber;
    private double materialFeePerStudent;

   public OfflineCourse(String id, double feePerStudent,
        java.util.Date startDate, boolean isAvailable,
        int enrolledStudents, String classroomNumber,
        double materialFeePerStudent) {

    super(id, feePerStudent, startDate,
            isAvailable, enrolledStudents);

    this.classroomNumber = classroomNumber;
    this.materialFeePerStudent = materialFeePerStudent;
}

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public double getMaterialFeePerStudent() {
        return materialFeePerStudent;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public void setMaterialFeePerStudent(double materialFeePerStudent) {
        this.materialFeePerStudent = materialFeePerStudent;
    }

    @Override
    public void addCourse() {
        super.addCourse();

        System.out.print("Enter classroom number: ");
        classroomNumber = sc.nextLine();

        System.out.print("Enter material fee per student: ");
        materialFeePerStudent = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void updateCourse() {
        super.updateCourse();

        System.out.print("Enter new classroom number: ");
        classroomNumber = sc.nextLine();

        System.out.print("Enter new material fee per student: ");
        materialFeePerStudent = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void displayCourse() {
        System.out.println("\n--- OFFLINE COURSE ---");

        super.displayCourse();

        System.out.println("Classroom number: " + classroomNumber);
        System.out.println("Material fee per student: "
                + materialFeePerStudent);
        System.out.println("Total fee: " + calculateTotalFee());
    }

    @Override
    public double calculateTotalFee() {
        return (getFeePerStudent() + materialFeePerStudent)
                * getEnrolledStudents();
    }
}
