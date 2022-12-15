import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Classroom_Schema", "root", "Tingbjerg1!");

  /*      TeacherSchema teacherSchema = new TeacherSchema("time", "subject", "class", "subjectRoom", "teacherName");
        System.out.println("\nMonday: \n________________ ");
        teacherSchema.getSchemaForMondayDB();

        System.out.println("\nTuesday: \n________________ ");
        teacherSchema.getSchemaForTuesdayDB();

        System.out.println("\nWednesday: \n________________ ");
        teacherSchema.getSchemaForWednesdayDB();

        System.out.println("\nThursday: \n________________ ");
        teacherSchema.getSchemaForThursdayDB();

        System.out.println("\nFriday: \n________________ ");
        teacherSchema.getSchemaForFridayDB();

        System.out.println(teacherSchema.schema.toString().split("TeacherSchema"));*/

        //LoginGUI loginGUI = new LoginGUI(null);
        //loginGUI.getTeacher();

       /* LoginGUI loginGUI = new LoginGUI(null);
        Login login = loginGUI.user;
        if(login != null) {
            System.out.println("Successfull login" + " " + login.username);
        }*/

       // Teacher teacher = new Teacher();
       // teacher.getAccessToStudent();

       //DBStudents dbStudents = new DBStudents();
       // dbStudents.getStudentFromDatabase(1);
        //dbStudents.getStudentFromDatabase();

       // DBClassRooms dbClassRooms = new DBClassRooms();
        //dbClassRooms.getClassRoomsFromDatabase();

     //  Booking booking = new Booking();


       // Bookingtest bookingtest = new Bookingtest();
       // bookingtest.unbookRoom(connection);


  // Teacher teacher = new Teacher();
    // teacher.getAccessToStudent();

      //SuperUser superUser = new SuperUser();
       //superUser.deleteTeacherDB(5);

        //ChangeStudentInfo changeStudentInfo = new ChangeStudentInfo();
        //changeStudentInfo.infoChangeGUI();

       // DBEmployees dbEmployees = new DBEmployees();
        //dbEmployees.getSpecificEmployeeFromDB();

        //DBClassRooms dbClassRooms = new DBClassRooms();
        //dbClassRooms.getClassRoomsFromDatabase();

      //RunTeacher runTeacher = new RunTeacher();
       //runTeacher.run();



        //SuperUser superUser = new SuperUser();
         //superUser.displaySpecificTeacher();

       // DBEmployees dbEmployees = new DBEmployees();
        // dbEmployees.getSpecificEmployeeFromDB();

        //RunStudent runstudent = new RunStudent();
        //runstudent.run();

        //Login login = new Login();
        //login.studentLogin();

       // RunSuperUser runSuperUser = new RunSuperUser();
        //runSuperUser.runSuperUser();
Run run = new Run();
run.runProgram();












    }
}

