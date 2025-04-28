package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Smc.interactions.SMC_EntityControl;

import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

public class Task extends SMC_EntityControl {

    enum AttributeName {
        Activity,
        Annotation,
        MainTask,
        NextTask,
        PreviousTask,
        StartTime,
        TaskId, //required
        TaskMode,
        Tasker
    }

    public Task() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException, NameNotFound, FederateNotExecutionMember {
        super();
        addParameter(AttributeName.TaskId.name(), new UUIDStruct());
    }

    public void setTaskId(UUIDStruct uuid) {
        setParameter(AttributeName.TaskId.name(), uuid.toByteArray());
    }
    public UUIDStruct getTaskId() {
        return (UUIDStruct) getParameter(getHlaClassName(AttributeName.TaskId.name()));
    }    
}
