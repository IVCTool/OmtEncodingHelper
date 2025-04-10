package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes.MoveByRouteTaskStruct;

import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

public class MoveByRoute extends Task {

    public enum AttributeName {
        TaskParameters
    }

    public MoveByRoute() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException, NameNotFound, FederateNotExecutionMember {
        super();
        addParameter(AttributeName.TaskParameters.name(), new MoveByRouteTaskStruct());
    }

    public MoveByRouteTaskStruct getTaskParameters() {
        return (MoveByRouteTaskStruct)getParameter(AttributeName.TaskParameters.name());
    }
    public void setTaskParameters(MoveByRouteTaskStruct movebyroutetask) {
        setParameter(AttributeName.TaskParameters.name(), movebyroutetask.toByteArray());
    }
}
