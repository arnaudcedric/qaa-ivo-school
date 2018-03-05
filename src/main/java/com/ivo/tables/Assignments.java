/**
 * This class is generated by jOOQ
 */
package com.ivo.tables;


import com.ivo.Ivoschool;
import com.ivo.Keys;
import com.ivo.tables.records.AssignmentsRecord;

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
public class Assignments extends TableImpl<AssignmentsRecord> {

    private static final long serialVersionUID = 2117247240;

    /**
     * The reference instance of <code>ivoschool.assignments</code>
     */
    public static final Assignments ASSIGNMENTS = new Assignments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssignmentsRecord> getRecordType() {
        return AssignmentsRecord.class;
    }

    /**
     * The column <code>ivoschool.assignments.id</code>.
     */
    public final TableField<AssignmentsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ivoschool.assignments.topic</code>.
     */
    public final TableField<AssignmentsRecord, String> TOPIC = createField("topic", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>ivoschool.assignments.content</code>.
     */
    public final TableField<AssignmentsRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ivoschool.assignments.overall_mark</code>.
     */
    public final TableField<AssignmentsRecord, Integer> OVERALL_MARK = createField("overall_mark", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ivoschool.assignments.content_url</code>.
     */
    public final TableField<AssignmentsRecord, String> CONTENT_URL = createField("content_url", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

    /**
     * The column <code>ivoschool.assignments.content_url2</code>.
     */
    public final TableField<AssignmentsRecord, String> CONTENT_URL2 = createField("content_url2", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

    /**
     * The column <code>ivoschool.assignments.content_url3</code>.
     */
    public final TableField<AssignmentsRecord, String> CONTENT_URL3 = createField("content_url3", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

    /**
     * The column <code>ivoschool.assignments.lecturer_id</code>.
     */
    public final TableField<AssignmentsRecord, Integer> LECTURER_ID = createField("lecturer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ivoschool.assignments.createdAt</code>.
     */
    public final TableField<AssignmentsRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ivoschool.assignments.updatedAt</code>.
     */
    public final TableField<AssignmentsRecord, Timestamp> UPDATEDAT = createField("updatedAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ivoschool.assignments.deadline</code>.
     */
    public final TableField<AssignmentsRecord, Timestamp> DEADLINE = createField("deadline", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ivoschool.assignments.semester</code>.
     */
    public final TableField<AssignmentsRecord, String> SEMESTER = createField("semester", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>ivoschool.assignments.percentage</code>.
     */
    public final TableField<AssignmentsRecord, BigDecimal> PERCENTAGE = createField("percentage", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2), this, "");

    /**
     * Create a <code>ivoschool.assignments</code> table reference
     */
    public Assignments() {
        this("assignments", null);
    }

    /**
     * Create an aliased <code>ivoschool.assignments</code> table reference
     */
    public Assignments(String alias) {
        this(alias, ASSIGNMENTS);
    }

    private Assignments(String alias, Table<AssignmentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Assignments(String alias, Table<AssignmentsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AssignmentsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSIGNMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssignmentsRecord> getPrimaryKey() {
        return Keys.KEY_ASSIGNMENTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssignmentsRecord>> getKeys() {
        return Arrays.<UniqueKey<AssignmentsRecord>>asList(Keys.KEY_ASSIGNMENTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AssignmentsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AssignmentsRecord, ?>>asList(Keys.FK_ASSIGNMENT_LECTURER1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Assignments as(String alias) {
        return new Assignments(alias, this);
    }

    /**
     * Rename this table
     */
    public Assignments rename(String name) {
        return new Assignments(name, null);
    }
}