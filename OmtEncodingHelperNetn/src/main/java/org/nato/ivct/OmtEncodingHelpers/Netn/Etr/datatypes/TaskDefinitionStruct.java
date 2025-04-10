package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.AggregateMissionEnum16;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.CallSignStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.EpochTimeStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;

import hla.rti1516e.encoding.DataElement;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.HLAunicodeString;
import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>TaskDefinition</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Fixed record to describe the definition of a task.</semantics>
                <field>
                    <name>TaskId</name>
                    <dataType>UUID</dataType>
                    <semantics>Unique identifier for the task.</semantics>
                </field>
                <field>
                    <name>TaskedEntity</name>
                    <dataType>UUID</dataType>
                    <semantics>Reference to who is executing the task.</semantics>
                </field>
                <field>
                    <name>Tasker</name>
                    <dataType>Callsign</dataType>
                    <semantics>Callsign of the commander of the task.</semantics>
                </field>
                <field>
                    <name>StartTime</name>
                    <dataType>EpochTime</dataType>
                    <semantics>Timestamp of when the task should start.</semantics>
                </field>
                <field>
                    <name>Annotation</name>
                    <dataType>HLAunicodeString</dataType>
                    <semantics>A general text describing information about this task. The annotation may e.g. include the reason for the task and text describing names of referenced entities.</semantics>
                </field>
                <field>
                    <name>TaskMode</name>
                    <dataType>TaskModeEnum8</dataType>
                    <semantics>Determines the task mode.</semantics>
                </field>
                <field>
                    <name>Activity</name>
                    <dataType>AggregateMissionEnum16</dataType>
                    <semantics>Suggested activity for unit executing this task.</semantics>
                </field>
                <field>
                    <name>Status</name>
                    <dataType>TaskStatusEnum32</dataType>
                    <semantics>Current status of this task.</semantics>
                </field>
                <field>
                    <name>TaskParameters</name>
                    <dataType>TaskDefinitionVariantRecord</dataType>
                    <semantics>Task specific definition details.</semantics>
                </field>
                <field>
                    <name>MainTask</name>
                    <dataType>UUID</dataType>
                    <semantics>Unique identifier of the main task if this task is part of a complex task sequence. Equals TaskId if this task is the main task.</semantics>
                </field>
                <field>
                    <name>PreviousTask</name>
                    <dataType>UUID</dataType>
                    <semantics>Unique identifier of the previous task if this task is part of a complex task sequence. Null if this task is the first in the sequence.</semantics>
                </field>
                <field>
                    <name>NextTask</name>
                    <dataType>UUID</dataType>
                    <semantics>Unique identifier of the next task if this task is part of a complex task sequence. Null if this task is the last in the sequence.</semantics>
                </field>
            </fixedRecordData>

 */
public class TaskDefinitionStruct extends HLAfixedRecordStruct {
    
    enum AttributeName {
        TaskId,
        TaskedEntity,
        Tasker,
        StartTime,
        Annotation,
        TaskMode,
        Activity,
        Status,
        TaskParameters,
        MainTask,
        PreviousTask,
        NextTask
    }

    public TaskDefinitionStruct () throws RTIinternalError {
        super();
        add(AttributeName.TaskId.name(), new UUIDStruct());
        add(AttributeName.TaskedEntity.name(), new UUIDStruct());
        add(AttributeName.Tasker.name(), new CallSignStruct());
        add(AttributeName.StartTime.name(), new EpochTimeStruct());
        add(AttributeName.Annotation.name(), encoderFactory.createHLAunicodeString());
        add(AttributeName.TaskMode.name(), encoderFactory.createHLAoctet());
        add(AttributeName.Activity.name(), AggregateMissionEnum16.Other.getDataElement());
        add(AttributeName.Status.name(), TaskStatusEnum32.Accepted.getDataElement());
        add(AttributeName.TaskParameters.name(), new TaskDefinitionVariantRecordStruct());
        add(AttributeName.MainTask.name(), new UUIDStruct());
        add(AttributeName.PreviousTask.name(), new UUIDStruct());
        add(AttributeName.NextTask.name(), new UUIDStruct());
    }    
    
    // getter and setter
    
    public UUIDStruct getTaskId() {
        return (UUIDStruct) get(AttributeName.TaskId.name());
    }
    public void setTaskId(UUIDStruct taskId) {
        set(AttributeName.TaskId.name(), taskId);
    }
    
    public UUIDStruct getTaskedEntity() {
        return (UUIDStruct) get(AttributeName.TaskedEntity.name());
    }
    public void setTaskedEntity(UUIDStruct taskedEntity) {
        set(AttributeName.TaskedEntity.name(), taskedEntity);
    }
    
    public CallSignStruct getTasker() {
        return (CallSignStruct) get(AttributeName.Tasker.name());
    }
    public void setTasker(CallSignStruct tasker) {
        set(AttributeName.Tasker.name(), tasker);
    }
    
    public EpochTimeStruct getStartTime() {
        return (EpochTimeStruct) get(AttributeName.StartTime.name());
    }
    public void setStartTime(EpochTimeStruct startTime) {
        set(AttributeName.StartTime.name(), startTime);
    }
    
    public String getAnnotation() {
        return ((HLAunicodeString) get(AttributeName.Annotation.name())).getValue();
    }
    public void setAnnotation(String annotation) {
        HLAunicodeString hlaAnnotation = encoderFactory.createHLAunicodeString();
        hlaAnnotation.setValue(annotation);
        set(AttributeName.Annotation.name(), hlaAnnotation);
    }
    
    public TaskModeEnum8 getTaskMode() throws EncoderException, DecoderException {
        DataElement de = get(AttributeName.TaskMode.name());
        return TaskModeEnum8.decode(de.toByteArray());
    }
    public void setTaskMode(TaskModeEnum8 taskMode) {
        set(AttributeName.TaskMode.name(), taskMode.getDataElement());
    }
    
    public AggregateMissionEnum16 getActivity() throws EncoderException, DecoderException {
        DataElement de = get(AttributeName.Activity.name());
        return AggregateMissionEnum16.decode(de.toByteArray());
    }
    public void setActivity(AggregateMissionEnum16 activity) {
        set(AttributeName.Activity.name(), activity.getDataElement());
    }
    
    public TaskStatusEnum32 getStatus() throws EncoderException, DecoderException {
        DataElement de = get(AttributeName.Status.name());
        return TaskStatusEnum32.decode(de.toByteArray());
    }
    public void setStatus(TaskStatusEnum32 status) {
        set(AttributeName.Status.name(), status.getDataElement());
    }
    
    public TaskDefinitionVariantRecordStruct getTaskParameters() {
        return (TaskDefinitionVariantRecordStruct)get(AttributeName.TaskParameters.name());
    }
    public void setTaskParameters(TaskDefinitionVariantRecordStruct taskParameters) {
        set(AttributeName.TaskParameters.name(), taskParameters);
    }
    
    /*
     * Unique identifier of the main task if this task is part of a complex task sequence. 
     * Equals TaskId if this task is the main task.
     */
    public UUIDStruct getMainTask() {
        return (UUIDStruct) get(AttributeName.MainTask.name());
    }

    public void setMainTask(UUIDStruct taskId) {
        set(AttributeName.MainTask.name(), taskId);
    }

    /* Unique identifier of the previous task if this task is part of a complex task sequence. 
    Null if this task is the first in the sequence. */
    public UUIDStruct getPreviousTask() {
        return (UUIDStruct) get(AttributeName.PreviousTask.name());
    }

    public void setPreviousTask(UUIDStruct taskId) {
        set(AttributeName.PreviousTask.name(), taskId);
    }

    /**Unique identifier of the next task if this task is part of a complex task sequence. 
     * Null if this task is the last in the sequence. */
    public UUIDStruct getNextTask() {
        return (UUIDStruct) get(AttributeName.NextTask.name());
    }

    public void setNextTaskk(UUIDStruct taskId) {
        set(AttributeName.NextTask.name(), taskId);
    }

}
