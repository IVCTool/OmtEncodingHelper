package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.encoding.HLAfixedRecord;
import hla.rti1516e.encoding.HLAinteger64BE;
import hla.rti1516e.exceptions.RTIinternalError;

/*
    <fixedRecordData>
        <name>ElapsedTimeProgress</name>
        <encoding>HLAfixedRecord</encoding>
        <semantics>Progress definition for tasks only needing elapsed time.</semantics>
        <field>
            <name>ElapsedTime</name>
            <dataType>TimeMillisecondInt64</dataType>
            <semantics>Elapsed time since beginning of task</semantics>
        </field>
    </fixedRecordData>
 */
public class ElapsedTimeProgressStruct extends HLAfixedRecordStruct {

    public enum AttributeName {
        ElapsedTime
    }

    public ElapsedTimeProgressStruct() throws RTIinternalError {
        super();
        add(AttributeName.ElapsedTime.name(), encoderFactory.createHLAinteger64BE());
    }

    public ElapsedTimeProgressStruct(HLAfixedRecord rec)  throws RTIinternalError {
        this();
        setElapsedTime((HLAinteger64BE)rec.get(0));
    }

    public HLAinteger64BE getElapsedTime() {
        return (HLAinteger64BE)get(AttributeName.ElapsedTime.name());
    }
    public void setElapsedTime(HLAinteger64BE elapsedTime) {
        set(AttributeName.ElapsedTime.name(), elapsedTime);
    }

}
