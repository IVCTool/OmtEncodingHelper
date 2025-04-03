package org.nato.ivct.OmtEncodingHelpers.Netn.Base.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.EpochTimeStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;

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

    public void setSendTime (int Entity) throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError {
        EpochTimeStruct value = (EpochTimeStruct) getParameter(AttributeName.Entity.name());
        value.setValue(Entity);
        setParameter(AttributeName.Entity.name(), value.toByteArray());
    }
    public int getSendTime () throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError {
        EpochTimeStruct value = (EpochTimeStruct) getParameter(AttributeName.Entity.name());
        return value.getValue();
    }

}
