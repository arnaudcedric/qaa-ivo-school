package acceptance.client;

import acceptance.type.LecturerType;
import com.ivo.school.tables.Lecturers;
import com.ivo.school.tables.Parents;
import com.ivo.school.tables.Students;
import com.ivo.school.tables.records.LecturersRecord;
import com.ivo.school.tables.records.ParentsRecord;
import com.ivo.school.tables.records.StudentsRecord;
import com.ivo.tables.Assignments;
import com.ivo.tables.records.AssignmentsRecord;

import java.util.logging.Logger;

import static com.ivo.school.tables.Lecturers.LECTURERS;
import static com.ivo.school.tables.Students.STUDENTS;


//There shouldn't be any test in this class

public class IvoSchoolDbClient extends DatabaseClient {
    public Students getStudents() {
        return students;
    }

    private Students students;
    private Logger log = Logger.getLogger(getClass().getName());
    private static IvoSchoolDbClient instance;

    public static IvoSchoolDbClient getInstance() {
        if (instance == null) {
            instance = new IvoSchoolDbClient();
        }
        return instance;
    }

    private IvoSchoolDbClient() {
        configureWith();
    }


    private AssignmentsRecord getAssignmentById(int id) {
        return create.selectFrom(Assignments.ASSIGNMENTS)
                .where(Assignments.ASSIGNMENTS.ID.eq(id))
                .fetchOne();
    }

    public boolean hasAssignment(int id) {
        return getAssignmentById(id) != null;
    }

    private StudentsRecord getStudentByEmail(String email) {
        return create.selectFrom(Students.STUDENTS)
                .where(Students.STUDENTS.EMAIL.eq(email))
                .fetchOne();
    }


    public boolean hasStudent(String email) {
        return getStudentByEmail(email) != null;
    }

    private LecturersRecord getLecturerByEmail(String email) {
        return create.selectFrom(LECTURERS)
                .where(LECTURERS.EMAIL.eq(email))
                .fetchOne();
    }

    public boolean hasLecturer(String email) {
        return getLecturerByEmail(email) != null;
    }

    private ParentsRecord getParentByEmail(String email) {
        return create.selectFrom(Parents.PARENTS)
                .where(Parents.PARENTS.EMAIL.eq(email))
                .fetchOne();
    }

    public boolean hasParent(String email) {
        return getParentByEmail(email) != null;
    }

    public void deleteStudentRecord(String email) {

        create.delete(STUDENTS).where(STUDENTS.EMAIL.eq(email))
                .execute();
    }

    public void deleteLecturerRecord(String email) {

        create.delete(LECTURERS).where(LECTURERS.EMAIL.eq(email))
                .execute();
    }

    public void createOrUpdateLecturer(LecturerType lecturers) {
        log.info("creating lecturer with id : " + lecturers.getId());

        LecturersRecord record = (LecturersRecord) create.select()
                .from(LECTURERS)
                .where(LECTURERS.ID.eq(lecturers.getId()))
                .fetchOne();
        if (record == null) {
            log.info("Creating new Lecturer......");
            create.insertInto(LECTURERS)
                    .columns(
                            LECTURERS.ID,
                            LECTURERS.FIRST_NAME,
                            LECTURERS.LAST_NAME,
                            LECTURERS.QUALIFICATION,
                            LECTURERS.EMAIL,
                            LECTURERS.PHONE_NUMBER,
                            LECTURERS.DOB,
                            LECTURERS.STATE_OF_ORIGIN,
                            LECTURERS.ADDRESS,
                            LECTURERS.GENDER,
                            LECTURERS.PREVIOUS_WORK_PLACE,
                            LECTURERS.REG_NUMBER,
                            LECTURERS.NATIONALITY,
                            LECTURERS.LANGUAGE,
                            LECTURERS.ROLE
                    )
                    .values(lecturers.getId(),
                            lecturers.getFirst_name(),
                            lecturers.getLast_name(),
                            lecturers.getQualification(),
                            lecturers.getEmail(),
                            lecturers.getPhone_Number(),
                            lecturers.getDob(),
                            lecturers.getState_of_origin(),
                            lecturers.getAddress(),
                            lecturers.getGender(),
                            lecturers.getPrevious_work_place(),
                            lecturers.getReg_number(),
                            lecturers.getNationality(),
                            lecturers.getNationality(),
                            lecturers.getRole())
                            .execute();
        }else {
            log.info("record already exists update record");
            create.update(LECTURERS)
                    .set(LECTURERS.ID, lecturers.getId())
                    .set(LECTURERS.FIRST_NAME,lecturers.getFirst_name())
                    .set(LECTURERS.LAST_NAME,lecturers.getLast_name())
                    .set(LECTURERS.QUALIFICATION,lecturers.getQualification())
                    .set(LECTURERS.EMAIL,lecturers.getEmail())
                    .set(LECTURERS.PHONE_NUMBER,lecturers.getPhone_Number())
                    .set(LECTURERS.DOB,lecturers.getDob())
                    .set(LECTURERS.STATE_OF_ORIGIN,lecturers.getState_of_origin())
                    .set(LECTURERS.ADDRESS,lecturers.getAddress())
                    .set(LECTURERS.GENDER,lecturers.getGender())
                    .set(LECTURERS.PREVIOUS_WORK_PLACE,lecturers.getPrevious_work_place())
                    .set(LECTURERS.REG_NUMBER,lecturers.getReg_number())
                    .set(LECTURERS.NATIONALITY,lecturers.getNationality())
                    .set(LECTURERS.LANGUAGE,lecturers.getNationality())
                    .set(LECTURERS.ROLE,lecturers.getRole())
                    .executeAsync();
        }


    }

}