/**
 * This class is generated by jOOQ
 */
package com.ivo.tables.records;


import com.ivo.tables.Holidays;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class HolidaysRecord extends UpdatableRecordImpl<HolidaysRecord> implements Record7<Integer, Date, Date, String, String, Date, Date> {

    private static final long serialVersionUID = -1566446124;

    /**
     * Setter for <code>ivoschool.holidays.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ivoschool.holidays.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ivoschool.holidays.start_date</code>.
     */
    public void setStartDate(Date value) {
        set(1, value);
    }

    /**
     * Getter for <code>ivoschool.holidays.start_date</code>.
     */
    public Date getStartDate() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>ivoschool.holidays.end_date</code>.
     */
    public void setEndDate(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>ivoschool.holidays.end_date</code>.
     */
    public Date getEndDate() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>ivoschool.holidays.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ivoschool.holidays.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ivoschool.holidays.acronym</code>.
     */
    public void setAcronym(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>ivoschool.holidays.acronym</code>.
     */
    public String getAcronym() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ivoschool.holidays.createdAt</code>.
     */
    public void setCreatedat(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>ivoschool.holidays.createdAt</code>.
     */
    public Date getCreatedat() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>ivoschool.holidays.updatedAt</code>.
     */
    public void setUpdatedat(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>ivoschool.holidays.updatedAt</code>.
     */
    public Date getUpdatedat() {
        return (Date) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Date, Date, String, String, Date, Date> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Date, Date, String, String, Date, Date> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Holidays.HOLIDAYS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field2() {
        return Holidays.HOLIDAYS.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return Holidays.HOLIDAYS.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Holidays.HOLIDAYS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Holidays.HOLIDAYS.ACRONYM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return Holidays.HOLIDAYS.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return Holidays.HOLIDAYS.UPDATEDAT;
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
    public Date value2() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAcronym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getUpdatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HolidaysRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HolidaysRecord value2(Date value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HolidaysRecord value3(Date value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HolidaysRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HolidaysRecord value5(String value) {
        setAcronym(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HolidaysRecord value6(Date value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HolidaysRecord value7(Date value) {
        setUpdatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HolidaysRecord values(Integer value1, Date value2, Date value3, String value4, String value5, Date value6, Date value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HolidaysRecord
     */
    public HolidaysRecord() {
        super(Holidays.HOLIDAYS);
    }

    /**
     * Create a detached, initialised HolidaysRecord
     */
    public HolidaysRecord(Integer id, Date startDate, Date endDate, String name, String acronym, Date createdat, Date updatedat) {
        super(Holidays.HOLIDAYS);

        set(0, id);
        set(1, startDate);
        set(2, endDate);
        set(3, name);
        set(4, acronym);
        set(5, createdat);
        set(6, updatedat);
    }
}
