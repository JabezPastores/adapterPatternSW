public class SchoolApp {
    public static void main(String[]args){
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        SchoolManagementApp attendance = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp grading = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp library = new LibrarySystemAdapter(librarySystem);

        System.out.println("Attendance System: " + attendance.integrateSystem());
        System.out.println("Grading System: " + grading.integrateSystem());
        System.out.println("Library System: "+ library.integrateSystem());



    }


}
