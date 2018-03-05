/**
 * This class is generated by jOOQ
 */
package com.ivo.tables;


import com.ivo.Ivoschool;
import com.ivo.Keys;
import com.ivo.tables.records.SubjectsRecord;

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
public class Subjects extends TableImpl<SubjectsRecord> {

    private static final long serialVersionUID = -1243129885;

    /**
     * The reference instance of <code>ivoschool.subjects</code>
     */
    public static final Subjects SUBJECTS = new Subjects();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SubjectsRecord> getRecordType() {
        return SubjectsRecord.class;
    }

    /**
     * The column <code>ivoschool.subjects.id</code>.
     */
    public final TableField<SubjectsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ivoschool.subjects.name</code>.
     */
    public final TableField<SubjectsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>ivoschool.subjects.about</code>.
     */
    public final TableField<SubjectsRecord, String> ABOUT = createField("about", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

    /**
     * The column <code>ivoschool.subjects.short_name</code>.
     */
    public final TableField<SubjectsRecord, String> SHORT_NAME = createField("short_name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>ivoschool.subjects.createdAt</code>.
     */
    public final TableField<SubjectsRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ivoschool.subjects.updatedAt</code>.
     */
    public final TableField<SubjectsRecord, Timestamp> UPDATEDAT = createField("updatedAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ivoschool.subjects</code> table reference
     */
    public Subjects() {
        this("subjects", null);
    }

    /**
     * Create an aliased <code>ivoschool.subjects</code> table reference
     */
    public Subjects(String alias) {
        this(alias, SUBJECTS);
    }

    private Subjects(String alias, Table<SubjectsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Subjects(String alias, Table<SubjectsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SubjectsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SUBJECTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SubjectsRecord> getPrimaryKey() {
        return Keys.KEY_SUBJECTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SubjectsRecord>> getKeys() {
        return Arrays.<UniqueKey<SubjectsRecord>>asList(Keys.KEY_SUBJECTS_PRIMARY, Keys.KEY_SUBJECTS_NAME, Keys.KEY_SUBJECTS_SHORT_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Subjects as(String alias) {
        return new Subjects(alias, this);
    }

    /**
     * Rename this table
     */
    public Subjects rename(String name) {
        return new Subjects(name, null);
    }
}
