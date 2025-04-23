package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.objects;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.objects.HLAobjectRoot;
import org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes.ArrayOfTaskDefinitionsStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes.ArrayOfTaskProgressStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Smc.datatypes.EntityControlActionsStruct;

import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.InvalidObjectClassHandle;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

public class BaseEntity extends HLAobjectRoot {

    public enum AttributeName {
        SupportedActions,
        CurrentTasks,
        TaskProgress
    }

    public BaseEntity() throws OmtEncodingHelperException, NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        super();
        getSupportedActions();
        getCurrentTasks();
        getTaskProgress();
    }

    public void publishSupportedActions() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError {
        addPubAttribute(AttributeName.SupportedActions.name());
    }
    public void subscribeSupportedActions() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError {
        addSubAttribute(AttributeName.SupportedActions.name());
    }

    public void publishCurrentTasks() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError {
        addPubAttribute(AttributeName.CurrentTasks.name());
    }
    public void subscribeCurrentTasks() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError {
        addSubAttribute(AttributeName.CurrentTasks.name());
    }
    
    public void publishTaskProgress() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError {
        addPubAttribute(AttributeName.TaskProgress.name());
    }
    public void subscribeTaskProgress() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError {
        addSubAttribute(AttributeName.TaskProgress.name());
    }

    public ArrayOfTaskDefinitionsStruct getCurrentTasks() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        ArrayOfTaskDefinitionsStruct holder = (ArrayOfTaskDefinitionsStruct)getAttribute(AttributeName.CurrentTasks.name());
        if (holder == null) {
            holder = new ArrayOfTaskDefinitionsStruct();
            setAttributeValue(AttributeName.CurrentTasks.name(), holder);
        }
        return holder;
    }
    public void setCurrentTasks(ArrayOfTaskDefinitionsStruct arrayOfTaskDefinitions) throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        setAttributeValue(AttributeName.CurrentTasks.name(), arrayOfTaskDefinitions);
    }

    public EntityControlActionsStruct getSupportedActions() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        EntityControlActionsStruct holder = (EntityControlActionsStruct)getAttribute(AttributeName.SupportedActions.name());
        if (holder == null) {
            holder = new EntityControlActionsStruct();
            setAttributeValue(AttributeName.SupportedActions.name(), holder);
        }
        return holder;
    }
    public void setSupportedActions(EntityControlActionsStruct suppActions) throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        setAttributeValue(AttributeName.SupportedActions.name(), suppActions);
    }

    public ArrayOfTaskProgressStruct getTaskProgress() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        ArrayOfTaskProgressStruct holder = (ArrayOfTaskProgressStruct)getAttribute(AttributeName.TaskProgress.name());
        if (holder == null) {
            holder = new ArrayOfTaskProgressStruct();
            setAttributeValue(AttributeName.TaskProgress.name(), holder);
        }
        return holder;
    }
    public void setTaskProgress(ArrayOfTaskProgressStruct taskProgress) throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        setAttributeValue(AttributeName.TaskProgress.name(), taskProgress);
    }
}
