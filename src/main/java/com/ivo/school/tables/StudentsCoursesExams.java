/**
 * This class is generated by jOOQ
 */
package com.ivo.school.tables;


import com.ivo.school.Keys;
import com.ivo.school.Mydb;
import com.ivo.school.tables.records.StudentsCoursesExamsRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentsCoursesExams extends TableImpl<StudentsCoursesExamsRecord> {

    private static final long serialVersionUID = 418332080;

    /**
     * The reference instance of <code>mydb.students_courses_exams</code>
     */
    public static final StudentsCoursesExams STUDENTS_COURSES_EXAMS = new StudentsCoursesExams();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentsCoursesExamsRecord> getRecordType() {
        return StudentsCoursesExamsRecord.class;
    }

    /**
     * The column <code>mydb.students_courses_exams.id</code>.
     */
    public final TableField<StudentsCoursesExamsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mydb.students_courses_exams.student_id</code>.
     */
    public final TableField<StudentsCoursesExamsRecord, Integer> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mydb.students_courses_exams.course_id</code>.
     */
    public final TableField<StudentsCoursesExamsRecord, Integer> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mydb.students_courses_exams.exam_id</code>.
     */
    public final TableField<StudentsCoursesExamsRecord, Integer> EXAM_ID = createField("exam_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mydb.students_courses_exams.score</code>.
     */
    public final TableField<StudentsCoursesExamsRecord, BigDecimal> SCORE = createField("score", org.jooq.impl.SQLDataType.DECIMAL.precision(11, 2).nullable(false), this, "");

    /**
     * The column <code>mydb.students_courses_exams.createdAt</code>.
     */
    public final TableField<StudentsCoursesExamsRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>mydb.students_courses_exams.updatedAt</code>.
     */
    public final TableField<StudentsCoursesExamsRecord, Timestamp> UPDATEDAT = createField("updatedAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>mydb.students_courses_exams</code> table reference
     */
    public StudentsCoursesExams() {
        this("students_courses_exams", null);
    }

    /**
     * Create an aliased <code>mydb.students_courses_exams</code> table reference
     */
    public StudentsCoursesExams(String alias) {
        this(alias, STUDENTS_COURSES_EXAMS);
    }

    private StudentsCoursesExams(String alias, Table<StudentsCoursesExamsRecord> aliased) {
        this(alias, aliased, null);
    }

    private StudentsCoursesExams(String alias, Table<StudentsCoursesExamsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mydb.MYDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StudentsCoursesExamsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STUDENTS_COURSES_EXAMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StudentsCoursesExamsRecord> getPrimaryKey() {
        return Keys.KEY_STUDENTS_COURSES_EXAMS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StudentsCoursesExamsRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentsCoursesExamsRecord>>asList(Keys.KEY_STUDENTS_COURSES_EXAMS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<StudentsCoursesExamsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StudentsCoursesExamsRecord, ?>>asList(Keys.FK_STUDENT, Keys.FK_COURSE, Keys.FK_EXAM);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsCoursesExams as(String alias) {
        return new StudentsCoursesExams(alias, this);
    }

    /**
     * Rename this table
     */
    public StudentsCoursesExams rename(String name) {
        return new StudentsCoursesExams(name, null);
    }
}
