/**
 * This class is generated by jOOQ
 */
package com.ivo.tables.records;


import com.ivo.tables.StudentsCourses;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class StudentsCoursesRecord extends UpdatableRecordImpl<StudentsCoursesRecord> implements Record6<Integer, Integer, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 2141837348;

    /**
     * Setter for <code>ivoschool.students_courses.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ivoschool.students_courses.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ivoschool.students_courses.student_id</code>.
     */
    public void setStudentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ivoschool.students_courses.student_id</code>.
     */
    public Integer getStudentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ivoschool.students_courses.course_id</code>.
     */
    public void setCourseId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>ivoschool.students_courses.course_id</code>.
     */
    public Integer getCourseId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ivoschool.students_courses.remarks</code>.
     */
    public void setRemarks(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ivoschool.students_courses.remarks</code>.
     */
    public String getRemarks() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ivoschool.students_courses.createdAt</code>.
     */
    public void setCreatedat(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>ivoschool.students_courses.createdAt</code>.
     */
    public Timestamp getCreatedat() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>ivoschool.students_courses.updatedAt</code>.
     */
    public void setUpdatedat(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>ivoschool.students_courses.updatedAt</code>.
     */
    public Timestamp getUpdatedat() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StudentsCourses.STUDENTS_COURSES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return StudentsCourses.STUDENTS_COURSES.STUDENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return StudentsCourses.STUDENTS_COURSES.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return StudentsCourses.STUDENTS_COURSES.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return StudentsCourses.STUDENTS_COURSES.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return StudentsCourses.STUDENTS_COURSES.UPDATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsCoursesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsCoursesRecord value2(Integer value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsCoursesRecord value3(Integer value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsCoursesRecord value4(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsCoursesRecord value5(Timestamp value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsCoursesRecord value6(Timestamp value) {
        setUpdatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsCoursesRecord values(Integer value1, Integer value2, Integer value3, String value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentsCoursesRecord
     */
    public StudentsCoursesRecord() {
        super(StudentsCourses.STUDENTS_COURSES);
    }

    /**
     * Create a detached, initialised StudentsCoursesRecord
     */
    public StudentsCoursesRecord(Integer id, Integer studentId, Integer courseId, String remarks, Timestamp createdat, Timestamp updatedat) {
        super(StudentsCourses.STUDENTS_COURSES);

        set(0, id);
        set(1, studentId);
        set(2, courseId);
        set(3, remarks);
        set(4, createdat);
        set(5, updatedat);
    }
}
