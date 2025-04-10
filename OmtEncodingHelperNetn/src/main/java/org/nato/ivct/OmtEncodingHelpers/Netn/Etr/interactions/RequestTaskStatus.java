package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.ArrayOfUuidStruct;

import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

public class RequestTaskStatus extends Task {

    public enum AttributeName {
        Tasks
    }

    public RequestTaskStatus() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
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
