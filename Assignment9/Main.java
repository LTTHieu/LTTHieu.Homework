package o_exercise6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CourseArrayList courseList = new CourseArrayList();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println(" COURSE ENROLLMENT MANAGEMENT");
            System.out.println("==============================");
            System.out.println("1. Add Online Course");
            System.out.println("2. Add Offline Course");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Course");
            System.out.println("5. Display All Courses");
            System.out.println("6. Display Available Courses");
            System.out.println("7. Calculate Total Fees");
            System.out.println("8. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    OnlineCourse onlineCourse
                            = new OnlineCourse(
                                    "",
                                    0,
                                    null,
                                    false,
                                    0,
                                    "",
                                    0
                            );

                    onlineCourse.addCourse();

                    courseList.addCourseToArrayList(onlineCourse);

                    break;

                case 2:

                    OfflineCourse offlineCourse
                            = new OfflineCourse(
                                    "",
                                    0,
                                    null,
                                    false,
                                    0,
                                    "",
                                    0
                            );

                    offlineCourse.addCourse();

                    courseList.addCourseToArrayList(offlineCourse);

                    break;

                case 3:

                    System.out.print("Enter course ID to update: ");
                    String updateId = sc.nextLine();

                    courseList.updateCourseById(updateId);

                    break;

                case 4:

                    System.out.print("Enter course ID to delete: ");
                    String deleteId = sc.nextLine();

                    courseList.deleteCourseById(deleteId);

                    break;

                case 5:

                    courseList.displayAllCourses();

                    break;

                case 6:

                    courseList.displayAvailableCourses();

                    break;

                case 7:

                    double totalFees
                            = courseList.calculateTotalFees();

                    System.out.println("Total fees of all courses: "
                            + totalFees);

                    break;

                case 8:

                    System.out.println("Program ended.");

                    break;

                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}
