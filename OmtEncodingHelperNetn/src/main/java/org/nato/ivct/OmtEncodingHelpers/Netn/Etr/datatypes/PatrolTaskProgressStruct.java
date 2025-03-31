package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.encoding.HLAfixedRecord;
import hla.rti1516e.encoding.HLAinteger64BE;
import hla.rti1516e.exceptions.RTIinternalError;

/*
<fixedRecordData>
    <name>PatrolTaskProgress</name>
    <encoding>HLAfixedRecord</encoding>
    <semantics>Task progress data for PatrolRepeating tasks.</semantics>
    <field>
        <name>PathProgress</name>
        <dataType>MoveTaskProgress</dataType>
        <semantics>Progress of the current path.</semantics>
    </field>
    <field>
        <name>ElapsedTime</name>
        <dataType>TimeMillisecondInt64</dataType>
        <semantics>Time elapsed for entire task.</semantics>
    </field>
    <field>
        <name>IntervalElapsedTime</name>
        <dataType>TimeMillisecondInt64</dataType>
        <semantics>Time elapsed in the latest interval.</semantics>
    </field>
</fixedRecordData>
 */

public class PatrolTaskProgressStruct extends HLAfixedRecordStruct {

    public enum AttributeName {
        PathProgress,
        ElapsedTime,
        IntervalElapsedTime
    }

    public PatrolTaskProgressStruct() throws RTIinternalError {
        super();
        add(AttributeName.PathProgress.name(), new MoveTaskProgressStruct());
        add(AttributeName.ElapsedTime.name(), encoderFactory.createHLAinteger64BE());
        add(AttributeName.IntervalElapsedTime.name(), encoderFactory.createHLAinteger64BE());
    }

    public PatrolTaskProgressStruct(HLAfixedRecord rec) throws RTIinternalError {
        this();
        setPathProgress((MoveTaskProgressStruct)rec.get(0));
        setElapsedTime((HLAinteger64BE)rec.get(1));
        setIntervalElapsedTime((HLAinteger64BE)rec.get(2));
    }

    public MoveTaskProgressStruct getPathProgress() {
        return (MoveTaskProgressStruct) get(AttributeName.PathProgress.name());
    }
    public void setPathProgress(MoveTaskProgressStruct pathProgress) {
        set(AttributeName.PathProgress.name(), pathProgress);
    }

    public HLAinteger64BE getElapsedTime() {
        return (HLAinteger64BE) get(AttributeName.ElapsedTime.name());
    }
    public void setElapsedTime(HLAinteger64BE elapsedTime) {
        set(AttributeName.ElapsedTime.name(), elapsedTime);
    }

    public HLAinteger64BE getIntervalElapsedTime() {
        return (HLAinteger64BE) get(AttributeName.IntervalElapsedTime.name());
    }
    public void setIntervalElapsedTime(HLAinteger64BE intervalElapsedTime) {
        set(AttributeName.IntervalElapsedTime.name(), intervalElapsedTime);
    }

}
