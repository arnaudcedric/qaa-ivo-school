import acceptance.client.DatabaseClient;
import com.ivo.school.tables.Lecturers;
import com.ivo.school.tables.Students;
import com.ivo.school.tables.records.LecturersRecord;
import com.ivo.school.tables.records.StudentsRecord;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static com.ivo.school.tables.Lecturers.LECTURERS;
import static com.ivo.school.tables.Students.STUDENTS;
import static com.ivo.school.tables.Subjects.SUBJECTS;
//https://hellokoding.com/jooq-example-with-mysql/
public class DbExperiment extends DatabaseClient {

    public DbExperiment() throws SQLException {
        configureWith();
    }

    Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
    DSLContext dslContext = DSL.using(connection, SQLDialect.MYSQL);
    Result<Record> studentResult = dslContext.select().from(STUDENTS).fetch();
    Result<Record> subjectResult = dslContext.select().from(SUBJECTS).fetch();
    Result<Record> lecturerResult = dslContext.select().from(LECTURERS).fetch();

    @Test
    public void studentTestDb() throws Exception {
//        properties.loadApplicationPage(getClass().getClassLoader().getResourceAsStream("profile.properties"));
        String driver = properties.getProperty("driver");
        Class.forName(driver).newInstance();

//        try (Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"))) {

//            DSLContext dslContext = DSL.using(connection, SQLDialect.MYSQL);

//            Result<Record> studentResult = dslContext.select().from(STUDENTS).fetch();
        System.out.println("\n");
        for (Record r : studentResult) {
            Integer id = r.getValue(STUDENTS.ID);
            String firstName = r.getValue(STUDENTS.FIRST_NAME);
            String lastName = r.getValue(STUDENTS.LAST_NAME);
            String email = r.getValue(STUDENTS.EMAIL);

            System.out.println("ID: " + id + " first name: " + firstName + " last name: " + lastName + " email: " + email);
        }
        System.out.println("\n");
        for (Record r : subjectResult) {
            Integer id = r.getValue(SUBJECTS.ID);
            String name = r.getValue(SUBJECTS.NAME);
            String short_name = r.getValue(SUBJECTS.SHORT_NAME);
            String about = r.getValue(SUBJECTS.ABOUT);
            Timestamp createDat = r.getValue(SUBJECTS.CREATEDAT);

//                System.out.println("ID: " + id + " name: " + name + " short_name: " + short_name + " about: " + about /*+ " createdat :"+createDat*/);

        }

    }
    @Test
    public void lecturersTestDb() throws Exception {
//        properties.loadApplicationPage(getClass().getClassLoader().getResourceAsStream("profile.properties"));
        String driver = properties.getProperty("driver");
        Class.forName(driver).newInstance();
//        try (Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"))) {
//            DSLContext dslContext = DSL.using(connection, SQLDialect.MYSQL);
//            Result<Record> studentResult = dslContext.select().from(STUDENTS).fetch();
        System.out.println("\n");
        for (Record r : lecturerResult) {
            if (r.getValue(LECTURERS.ID).equals(7)) {
                Integer id = r.getValue(LECTURERS.ID);
                String firstName = r.getValue(LECTURERS.FIRST_NAME);
                String lastName = r.getValue(LECTURERS.LAST_NAME);
                String email = r.getValue(LECTURERS.EMAIL);
                String reg_number = r.getValue(LECTURERS.REG_NUMBER);
                String dob = r.getValue(LECTURERS.DOB);
                String qualification = r.getValue(LECTURERS.QUALIFICATION);
                String gender = r.getValue(LECTURERS.GENDER);
                String address = r.getValue(LECTURERS.ADDRESS);
                String phoneNumber = r.getValue(LECTURERS.PHONE_NUMBER);
                String nationality = r.getValue(LECTURERS.NATIONALITY);

                System.out.println("ID: " + id + "| first name: " + firstName + "| last name: " + lastName + "| email: " + email + "| reg_number: " + reg_number + "| dob: " + dob +
                        "| qualification: " + qualification + "| gender: " + gender + "| address: " + address + "| phoneNumber: " + phoneNumber + "| nationality: " + nationality);
            }
        }
    }

    @Test
    public void test03() {

        create.delete(STUDENTS).where(STUDENTS.ID.eq(49))
                .execute();
    }
    @Test
    public void deleteRecord() {
        create.delete(LECTURERS).
                where(LECTURERS.EMAIL.eq("cedric@gmail.com")).
                execute();
    }
    @Test
    public void testBooleanMethod() {
        List<Boolean> booleans = new ArrayList<>();
        booleans.add(true);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);


        for (Boolean singleBoolean : booleans) {

            if (!singleBoolean) {
                System.out.println("returns false");
            }

        }

        // System.out.println("return true");
    }

    @Test
    private void getLecturerByFirstName(){
         create.selectFrom(Lecturers.LECTURERS)
                .where(Lecturers.LECTURERS.FIRST_NAME.eq("admin"))
                .fetchOne().getValue(0);
    }


    private List<Record> getStudentRecord(){
        return create.select().from(STUDENTS).fetch();
    }

    @Test
    public void testStudentRecord(){

    }
}
