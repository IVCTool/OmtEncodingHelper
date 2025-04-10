package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.interactions.HLAinteractionRoot;
import org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes.TaskStatusEnum32;

import hla.rti1516e.encoding.DataElement;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

/*
    <interactionClass>
        <name>ETR_TaskStatus</name>
        <sharing>PublishSubscribe</sharing>
        <transportation>HLAreliable</transportation>
        <order>Receive</order>
        <semantics>A management task report regarding the status of a specific task assigned to an entity. The inherited parameter `Time is required.`</semantics>
        <parameter>
            <name>Task</name>
            <dataType>UUID</dataType>
            <semantics>Required. Reference to the task associated with the report.</semantics>
        </parameter>
        <parameter>
            <name>TaskStatus</name>
            <dataType>TaskStatusEnum32</dataType>
            <semantics>Required. The status of the task.</semantics>
        </parameter>
    </interactionClass>
 */
public class ETR_TaskStatus  extends HLAinteractionRoot {

    public enum AttributeName {
        Task,
        TaskStatus
    }

    public ETR_TaskStatus() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException, NameNotFound, FederateNotExecutionMember {
        super();
        addParameter(AttributeName.Task.name(), (UUIDStruct) encoderFactory.createHLAfixedArray(getByteFactory(), 16));
        addParameter(AttributeName.TaskStatus.name(), encoderFactory.createHLAinteger32BE());
    }

    public void setUniqueId(UUIDStruct uuid) {
        setParameter(AttributeName.Task.name(), uuid.toByteArray());
    }
    public UUIDStruct getUniqueId() {
        return (UUIDStruct) getParameter(AttributeName.Task.name());
    }

    public TaskStatusEnum32 getStatus() throws EncoderException, DecoderException {
        DataElement de = getParameter(AttributeName.TaskStatus.name());
        return TaskStatusEnum32.decode(de.toByteArray());
    }
    public void setStatus(TaskStatusEnum32 status) {
        setParameter(AttributeName.TaskStatus.name(), status.getDataElement().toByteArray());
    }    
}
