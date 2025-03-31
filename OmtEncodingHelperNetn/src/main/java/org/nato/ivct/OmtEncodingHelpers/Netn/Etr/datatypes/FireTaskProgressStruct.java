package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.encoding.HLAfixedRecord;
import hla.rti1516e.encoding.HLAinteger16BE;
import hla.rti1516e.encoding.HLAinteger64BE;
import hla.rti1516e.exceptions.RTIinternalError;

/*
    <fixedRecordData>
        <name>FireTaskProgress</name>
        <encoding>HLAfixedRecord</encoding>
        <semantics>Task progress data for Fire tasks.</semantics>
        <field>
            <name>ElapsedTime</name>
            <dataType>TimeMillisecondInt64</dataType>
            <semantics>Elapsed time since beginning of task.</semantics>
        </field>
        <field>
            <name>MunitionUsed</name>
            <dataType>Integer16</dataType>
            <semantics>Number of rounds used if specified.</semantics>
        </field>
    </fixedRecordData>
 */
public class FireTaskProgressStruct extends HLAfixedRecordStruct {

    public enum AttributeName {
        ElapsedTime,
        MunitionUsed
    }
    
    public FireTaskProgressStruct() throws RTIinternalError {
        super();
        add(AttributeName.ElapsedTime.name(), encoderFactory.createHLAinteger64BE());
        add(AttributeName.MunitionUsed.name(), encoderFactory.createHLAinteger16BE());
    }

    public FireTaskProgressStruct(HLAfixedRecord rec)  throws RTIinternalError {
        this();
        setElapsedTime((HLAinteger64BE)rec.get(0));
        setMunitionUsed((HLAinteger16BE)rec.get(0));
    }

    public HLAinteger64BE getElapsedTime() {
        return (HLAinteger64BE) get(AttributeName.ElapsedTime.name());
    }
    public void setElapsedTime(HLAinteger64BE elapsedTime) {
        set(AttributeName.ElapsedTime.name(), elapsedTime);
    }

    public HLAinteger16BE getMunitionUsed() {
        return (HLAinteger16BE) get(AttributeName.MunitionUsed.name());
    }
    public void setMunitionUsed(HLAinteger16BE munitionUsed) {
        set(AttributeName.MunitionUsed.name(), munitionUsed);
    }
}
