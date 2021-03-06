/**
 * This class is generated by jOOQ
 */
package com.ivo.school.tables.records;


import com.ivo.school.tables.AssignmentsCourses;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class AssignmentsCoursesRecord extends UpdatableRecordImpl<AssignmentsCoursesRecord> implements Record5<Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1905144338;

    /**
     * Setter for <code>mydb.assignments_courses.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mydb.assignments_courses.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mydb.assignments_courses.assignment_id</code>.
     */
    public void setAssignmentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mydb.assignments_courses.assignment_id</code>.
     */
    public Integer getAssignmentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mydb.assignments_courses.course_id</code>.
     */
    public void setCourseId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mydb.assignments_courses.course_id</code>.
     */
    public Integer getCourseId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mydb.assignments_courses.createdAt</code>.
     */
    public void setCreatedat(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>mydb.assignments_courses.createdAt</code>.
     */
    public Timestamp getCreatedat() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>mydb.assignments_courses.updatedAt</code>.
     */
    public void setUpdatedat(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mydb.assignments_courses.updatedAt</code>.
     */
    public Timestamp getUpdatedat() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AssignmentsCourses.ASSIGNMENTS_COURSES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return AssignmentsCourses.ASSIGNMENTS_COURSES.ASSIGNMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return AssignmentsCourses.ASSIGNMENTS_COURSES.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return AssignmentsCourses.ASSIGNMENTS_COURSES.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return AssignmentsCourses.ASSIGNMENTS_COURSES.UPDATEDAT;
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
        return getAssignmentId();
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
    public Timestamp value4() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentsCoursesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentsCoursesRecord value2(Integer value) {
        setAssignmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentsCoursesRecord value3(Integer value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentsCoursesRecord value4(Timestamp value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentsCoursesRecord value5(Timestamp value) {
        setUpdatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssignmentsCoursesRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AssignmentsCoursesRecord
     */
    public AssignmentsCoursesRecord() {
        super(AssignmentsCourses.ASSIGNMENTS_COURSES);
    }

    /**
     * Create a detached, initialised AssignmentsCoursesRecord
     */
    public AssignmentsCoursesRecord(Integer id, Integer assignmentId, Integer courseId, Timestamp createdat, Timestamp updatedat) {
        super(AssignmentsCourses.ASSIGNMENTS_COURSES);

        set(0, id);
        set(1, assignmentId);
        set(2, courseId);
        set(3, createdat);
        set(4, updatedat);
    }
}
