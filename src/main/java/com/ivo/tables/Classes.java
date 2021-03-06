/**
 * This class is generated by jOOQ
 */
package com.ivo.tables;


import com.ivo.Ivoschool;
import com.ivo.Keys;
import com.ivo.tables.records.ClassesRecord;

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
public class Classes extends TableImpl<ClassesRecord> {

    private static final long serialVersionUID = 1549535035;

    /**
     * The reference instance of <code>ivoschool.classes</code>
     */
    public static final Classes CLASSES = new Classes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClassesRecord> getRecordType() {
        return ClassesRecord.class;
    }

    /**
     * The column <code>ivoschool.classes.id</code>.
     */
    public final TableField<ClassesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ivoschool.classes.name</code>.
     */
    public final TableField<ClassesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>ivoschool.classes.about</code>.
     */
    public final TableField<ClassesRecord, String> ABOUT = createField("about", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

    /**
     * The column <code>ivoschool.classes.location</code>.
     */
    public final TableField<ClassesRecord, String> LOCATION = createField("location", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>ivoschool.classes.colour</code>.
     */
    public final TableField<ClassesRecord, String> COLOUR = createField("colour", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>ivoschool.classes.short_name</code>.
     */
    public final TableField<ClassesRecord, String> SHORT_NAME = createField("short_name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>ivoschool.classes.photo_url</code>.
     */
    public final TableField<ClassesRecord, String> PHOTO_URL = createField("photo_url", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

    /**
     * The column <code>ivoschool.classes.photo_url2</code>.
     */
    public final TableField<ClassesRecord, String> PHOTO_URL2 = createField("photo_url2", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

    /**
     * The column <code>ivoschool.classes.photo_url3</code>.
     */
    public final TableField<ClassesRecord, String> PHOTO_URL3 = createField("photo_url3", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

    /**
     * The column <code>ivoschool.classes.lecturer_id</code>.
     */
    public final TableField<ClassesRecord, Integer> LECTURER_ID = createField("lecturer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ivoschool.classes.createdAt</code>.
     */
    public final TableField<ClassesRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ivoschool.classes.updatedAt</code>.
     */
    public final TableField<ClassesRecord, Timestamp> UPDATEDAT = createField("updatedAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ivoschool.classes.level</code>.
     */
    public final TableField<ClassesRecord, Integer> LEVEL = createField("level", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>ivoschool.classes</code> table reference
     */
    public Classes() {
        this("classes", null);
    }

    /**
     * Create an aliased <code>ivoschool.classes</code> table reference
     */
    public Classes(String alias) {
        this(alias, CLASSES);
    }

    private Classes(String alias, Table<ClassesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Classes(String alias, Table<ClassesRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ClassesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLASSES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClassesRecord> getPrimaryKey() {
        return Keys.KEY_CLASSES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClassesRecord>> getKeys() {
        return Arrays.<UniqueKey<ClassesRecord>>asList(Keys.KEY_CLASSES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ClassesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ClassesRecord, ?>>asList(Keys.FK_CLASS_LECTURER1, Keys.LECTURER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Classes as(String alias) {
        return new Classes(alias, this);
    }

    /**
     * Rename this table
     */
    public Classes rename(String name) {
        return new Classes(name, null);
    }
}
