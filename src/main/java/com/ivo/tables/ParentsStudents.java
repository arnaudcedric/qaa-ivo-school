/**
 * This class is generated by jOOQ
 */
package com.ivo.tables;


import com.ivo.Ivoschool;
import com.ivo.Keys;
import com.ivo.tables.records.ParentsStudentsRecord;

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
public class ParentsStudents extends TableImpl<ParentsStudentsRecord> {

    private static final long serialVersionUID = -279417327;

    /**
     * The reference instance of <code>ivoschool.parents_students</code>
     */
    public static final ParentsStudents PARENTS_STUDENTS = new ParentsStudents();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParentsStudentsRecord> getRecordType() {
        return ParentsStudentsRecord.class;
    }

    /**
     * The column <code>ivoschool.parents_students.id</code>.
     */
    public final TableField<ParentsStudentsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ivoschool.parents_students.parent_id</code>.
     */
    public final TableField<ParentsStudentsRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ivoschool.parents_students.student_id</code>.
     */
    public final TableField<ParentsStudentsRecord, Integer> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ivoschool.parents_students.createdAt</code>.
     */
    public final TableField<ParentsStudentsRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ivoschool.parents_students.updatedAt</code>.
     */
    public final TableField<ParentsStudentsRecord, Timestamp> UPDATEDAT = createField("updatedAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ivoschool.parents_students</code> table reference
     */
    public ParentsStudents() {
        this("parents_students", null);
    }

    /**
     * Create an aliased <code>ivoschool.parents_students</code> table reference
     */
    public ParentsStudents(String alias) {
        this(alias, PARENTS_STUDENTS);
    }

    private ParentsStudents(String alias, Table<ParentsStudentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ParentsStudents(String alias, Table<ParentsStudentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Ivoschool.IVOSCHOOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ParentsStudentsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PARENTS_STUDENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ParentsStudentsRecord> getPrimaryKey() {
        return Keys.KEY_PARENTS_STUDENTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ParentsStudentsRecord>> getKeys() {
        return Arrays.<UniqueKey<ParentsStudentsRecord>>asList(Keys.KEY_PARENTS_STUDENTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ParentsStudentsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ParentsStudentsRecord, ?>>asList(Keys.FK_PARENT_HAS_STUDENT_PARENT, Keys.FK_PARENT_HAS_STUDENT_STUDENT1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentsStudents as(String alias) {
        return new ParentsStudents(alias, this);
    }

    /**
     * Rename this table
     */
    public ParentsStudents rename(String name) {
        return new ParentsStudents(name, null);
    }
}
