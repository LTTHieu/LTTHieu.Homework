package o_exercise6;

import java.util.ArrayList;

public class CourseArrayList {

    private ArrayList<Course> courses;

    public CourseArrayList() {
        courses = new ArrayList<>();
    }

    public void addCourseToArrayList(Course course) {
        courses.add(course);
        System.out.println("Course added successfully!");
    }

    public void updateCourseById(String id) {

        for (Course course : courses) {

            if (course.getId().equalsIgnoreCase(id)) {

                course.updateCourse();

                System.out.println("Course updated successfully!");
                return;
            }
        }

        System.out.println("Course not found!");
    }

    public void deleteCourseById(String id) {

        for (Course course : courses) {

            if (course.getId().equalsIgnoreCase(id)) {

                courses.remove(course);

                System.out.println("Course deleted successfully!");
                return;
            }
        }

        System.out.println("Course not found!");
    }

    // Display all courses
    public void displayAllCourses() {

        if (courses.isEmpty()) {
            System.out.println("No courses available!");
            return;
        }

        System.out.println("\n===== ALL COURSES =====");

        for (Course course : courses) {
            course.displayCourse();
            System.out.println("-------------------------");
        }
    }

    public void displayAvailableCourses() {

        boolean found = false;

        System.out.println("\n===== AVAILABLE COURSES =====");

        for (Course course : courses) {

            if (course.isIsAvailable()) {

                course.displayCourse();

                System.out.println("-------------------------");

                found = true;
            }
        }

        if (!found) {
            System.out.println("No courses are open for enrollment!");
        }
    }

    public double calculateTotalFees() {

        double total = 0;

        for (Course course : courses) {
            total += course.calculateTotalFee();
        }

        return total;
    }
}
