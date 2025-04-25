package org.nato.ivct.OmtEncodingHelpers.Netn.Smc.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.EpochTimeStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.interactions.HLAinteractionRoot;

import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

public class SMC_EntityControl extends HLAinteractionRoot {

    public enum AttributeName {
        Entity
    }

    public SMC_EntityControl() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException, NameNotFound, FederateNotExecutionMember {
        super();
        addParameter(AttributeName.Entity.name(), (UUIDStruct) encoderFactory.createHLAfixedArray(getByteFactory(), 16));        
    }

    public void setEntity (UUIDStruct EntityId) throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError {
        setParameter(AttributeName.Entity.name(), EntityId.toByteArray());
    }
    public UUIDStruct getEntity () throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError {
        return (UUIDStruct) getParameter(getHlaClassName(AttributeName.Entity.name()));
    }

}
