package org.nato.ivct.OmtEncodingHelpers.Netn.Base.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.EpochTimeStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;

import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;


public class HLAinteractionRoot extends org.nato.ivct.OmtEncodingHelpers.Core.interactions.HLAinteractionRoot {

    public enum AttributeName {
        SendTime,
        UniqueId
    }

    public HLAinteractionRoot() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError, OmtEncodingHelperException, hla.rti1516e.exceptions.NameNotFound, hla.rti1516e.exceptions.FederateNotExecutionMember {
        super();
        addParameter(AttributeName.SendTime.name(), encoderFactory.createHLAinteger32BE());
        addParameter(AttributeName.UniqueId.name(), new UUIDStruct());
    }

    public void setSendTime (int SendTime) throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError {
        EpochTimeStruct value = (EpochTimeStruct) getParameter(AttributeName.SendTime.name());
        value.setValue(SendTime);
        setParameter(AttributeName.SendTime.name(), value.toByteArray());
    }
    public int getSendTime () throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError {
        EpochTimeStruct value = (EpochTimeStruct) getParameter(AttributeName.SendTime.name());
        return value.getValue();
    }

    public void setUniqueId(UUIDStruct uuid) {
        setParameter(AttributeName.UniqueId.name(), uuid.toByteArray());
    }
    public UUIDStruct getUniqueId() {
        return (UUIDStruct) getParameter(AttributeName.UniqueId.name());
    }
}
