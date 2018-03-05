/**
 * This class is generated by jOOQ
 */
package com.ivo.school.tables;


import com.ivo.school.Keys;
import com.ivo.school.Mydb;
import com.ivo.school.tables.records.SchoolDataRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class SchoolData extends TableImpl<SchoolDataRecord> {

    private static final long serialVersionUID = 1088490274;

    /**
     * The reference instance of <code>mydb.school_data</code>
     */
    public static final SchoolData SCHOOL_DATA = new SchoolData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchoolDataRecord> getRecordType() {
        return SchoolDataRecord.class;
    }

    /**
     * The column <code>mydb.school_data.id</code>.
     */
    public final TableField<SchoolDataRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mydb.school_data.name</code>.
     */
    public final TableField<SchoolDataRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>mydb.school_data.current_semester</code>.
     */
    public final TableField<SchoolDataRecord, String> CURRENT_SEMESTER = createField("current_semester", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>mydb.school_data.current_year</code>.
     */
    public final TableField<SchoolDataRecord, String> CURRENT_YEAR = createField("current_year", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>mydb.school_data.address</code>.
     */
    public final TableField<SchoolDataRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>mydb.school_data.exam_deadline</code>.
     */
    public final TableField<SchoolDataRecord, Timestamp> EXAM_DEADLINE = createField("exam_deadline", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>mydb.school_data.assignment_deadline</code>.
     */
    public final TableField<SchoolDataRecord, Timestamp> ASSIGNMENT_DEADLINE = createField("assignment_deadline", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>mydb.school_data.badge_url</code>.
     */
    public final TableField<SchoolDataRecord, String> BADGE_URL = createField("badge_url", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>mydb.school_data.createdAt</code>.
     */
    public final TableField<SchoolDataRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>mydb.school_data.updatedAt</code>.
     */
    public final TableField<SchoolDataRecord, Timestamp> UPDATEDAT = createField("updatedAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>mydb.school_data</code> table reference
     */
    public SchoolData() {
        this("school_data", null);
    }

    /**
     * Create an aliased <code>mydb.school_data</code> table reference
     */
    public SchoolData(String alias) {
        this(alias, SCHOOL_DATA);
    }

    private SchoolData(String alias, Table<SchoolDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchoolData(String alias, Table<SchoolDataRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SchoolDataRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SCHOOL_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SchoolDataRecord> getPrimaryKey() {
        return Keys.KEY_SCHOOL_DATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SchoolDataRecord>> getKeys() {
        return Arrays.<UniqueKey<SchoolDataRecord>>asList(Keys.KEY_SCHOOL_DATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchoolData as(String alias) {
        return new SchoolData(alias, this);
    }

    /**
     * Rename this table
     */
    public SchoolData rename(String name) {
        return new SchoolData(name, null);
    }
}
