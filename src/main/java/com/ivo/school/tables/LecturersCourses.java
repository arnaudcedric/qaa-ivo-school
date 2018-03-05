/**
 * This class is generated by jOOQ
 */
package com.ivo.school.tables;


import com.ivo.school.Keys;
import com.ivo.school.Mydb;
import com.ivo.school.tables.records.LecturersCoursesRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class LecturersCourses extends TableImpl<LecturersCoursesRecord> {

    private static final long serialVersionUID = 1866704602;

    /**
     * The reference instance of <code>mydb.lecturers_courses</code>
     */
    public static final LecturersCourses LECTURERS_COURSES = new LecturersCourses();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LecturersCoursesRecord> getRecordType() {
        return LecturersCoursesRecord.class;
    }

    /**
     * The column <code>mydb.lecturers_courses.lecturer_id</code>.
     */
    public final TableField<LecturersCoursesRecord, Integer> LECTURER_ID = createField("lecturer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mydb.lecturers_courses.course_id</code>.
     */
    public final TableField<LecturersCoursesRecord, Integer> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mydb.lecturers_courses.aims</code>.
     */
    public final TableField<LecturersCoursesRecord, String> AIMS = createField("aims", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>mydb.lecturers_courses.createdAt</code>.
     */
    public final TableField<LecturersCoursesRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>mydb.lecturers_courses.updatedAt</code>.
     */
    public final TableField<LecturersCoursesRecord, Timestamp> UPDATEDAT = createField("updatedAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>mydb.lecturers_courses</code> table reference
     */
    public LecturersCourses() {
        this("lecturers_courses", null);
    }

    /**
     * Create an aliased <code>mydb.lecturers_courses</code> table reference
     */
    public LecturersCourses(String alias) {
        this(alias, LECTURERS_COURSES);
    }

    private LecturersCourses(String alias, Table<LecturersCoursesRecord> aliased) {
        this(alias, aliased, null);
    }

    private LecturersCourses(String alias, Table<LecturersCoursesRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<LecturersCoursesRecord> getPrimaryKey() {
        return Keys.KEY_LECTURERS_COURSES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LecturersCoursesRecord>> getKeys() {
        return Arrays.<UniqueKey<LecturersCoursesRecord>>asList(Keys.KEY_LECTURERS_COURSES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LecturersCoursesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LecturersCoursesRecord, ?>>asList(Keys.FK_LECTURER_HAS_COURSE_LECTURER1, Keys.FK_LECTURER_HAS_COURSE_COURSE1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturersCourses as(String alias) {
        return new LecturersCourses(alias, this);
    }

    /**
     * Rename this table
     */
    public LecturersCourses rename(String name) {
        return new LecturersCourses(name, null);
    }
}