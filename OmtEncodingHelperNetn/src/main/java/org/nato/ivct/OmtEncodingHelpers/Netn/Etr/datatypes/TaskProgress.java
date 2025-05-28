package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.EpochTimeStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;

import hla.rti1516e.encoding.HLAfixedRecord;
import hla.rti1516e.exceptions.RTIinternalError;

/*
    <fixedRecordData>
        <name>TaskProgress</name>
        <encoding>HLAfixedRecord</encoding>
        <semantics>Fixed record to describe the progress of an executing task.</semantics>
        <field>
            <name>TaskId</name>
            <dataType>UUID</dataType>
            <semantics>Reference to the task this progress belongs to.</semantics>
        </field>
        <field>
            <name>LastUpdated</name>
            <dataType>EpochTime</dataType>
            <semantics>When was this task last updated.</semantics>
        </field>
        <field>
            <name>ExecutingFederateId</name>
            <dataType>UUID</dataType>
            <semantics>Reference to the federate that is executing this task.</semantics>
        </field>
        <field>
            <name>ETC</name>
            <dataType>EpochTime</dataType>
            <semantics>Estimated time to completion.</semantics>
        </field>
        <field>
            <name>ProgressData</name>
            <dataType>TaskProgressVariantRecord</dataType>
            <semantics>Variant record with task specific progress data.</semantics>
        </field>
    </fixedRecordData>
 */

public class TaskProgress extends HLAfixedRecordStruct {

    public enum AttributeName {
        TaskId,
        LastUpdated,
        ExecutingFederateId,
        ETC,
        ProgressData
    }

    public TaskProgress() throws RTIinternalError {
        super();
        add(AttributeName.TaskId.name(), new UUIDStruct());
        add(AttributeName.LastUpdated.name(), new EpochTimeStruct());
        add(AttributeName.ExecutingFederateId.name(), new UUIDStruct());
        add(AttributeName.ETC.name(), new EpochTimeStruct());
        add(AttributeName.ProgressData.name(), new TaskProgressVariantRecord());
    }

    public TaskProgress(HLAfixedRecord rec) throws RTIinternalError {
        this();
        setTaskId((UUIDStruct)rec.get(0));
        setLastUpdated((EpochTimeStruct)rec.get(1));
        setExecutingFederateIdId((UUIDStruct)rec.get(2));
        setETC((EpochTimeStruct)rec.get(3));
        setPrgressData((TaskProgressVariantRecord)rec.get(4));
    }

    public UUIDStruct getXTaskId() {
        return (UUIDStruct) get(AttributeName.TaskId.name());
    }
    public void setTaskId(UUIDStruct taskId) {
        set(AttributeName.TaskId.name(), taskId);
    }

    public EpochTimeStruct getLastUpdated() {
        return (EpochTimeStruct) get(AttributeName.LastUpdated.name());
    }
    public void setLastUpdated(EpochTimeStruct lastUpdated) {
        set(AttributeName.LastUpdated.name(), lastUpdated);
    }

    public UUIDStruct getXExecutingFederateId() {
        return (UUIDStruct) get(AttributeName.ExecutingFederateId.name());
    }
    public void setExecutingFederateIdId(UUIDStruct taskId) {
        set(AttributeName.ExecutingFederateId.name(), taskId);
    }

    public EpochTimeStruct getETC() {
        return (EpochTimeStruct) get(AttributeName.ETC.name());
    }
    public void setETC(EpochTimeStruct etc) {
        set(AttributeName.ETC.name(), etc);
    }    

    public TaskProgressVariantRecord getProgressData() {
        return (TaskProgressVariantRecord) get(AttributeName.ProgressData.name());
    }
    public void setPrgressData(TaskProgressVariantRecord progressData) {
        set(AttributeName.ProgressData.name(), progressData);
    }
}
