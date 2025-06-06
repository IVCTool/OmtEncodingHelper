package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.ArrayOfUuidStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Smc.interactions.SMC_EntityControl;

import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

public class CancelTasks extends SMC_EntityControl {

    public enum AttributeName {
        Tasks
    }

    public CancelTasks() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException, NameNotFound, FederateNotExecutionMember {
        super();
        addParameter(AttributeName.Tasks.name(), new ArrayOfUuidStruct());
    }

    public ArrayOfUuidStruct getTasks() {
        return (ArrayOfUuidStruct)getParameter(AttributeName.Tasks.name());
    }
    public void setTasks(ArrayOfUuidStruct arrayofuuids) {
        setParameter(AttributeName.Tasks.name(), arrayofuuids.toByteArray());
    }    
}
