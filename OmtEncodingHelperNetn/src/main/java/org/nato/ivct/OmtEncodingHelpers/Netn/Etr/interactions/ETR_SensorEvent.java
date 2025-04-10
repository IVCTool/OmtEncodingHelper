package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Core.interactions.HLAinteractionRoot;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;

import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

public class ETR_SensorEvent extends HLAinteractionRoot {

    public enum AttributeName {
        ProducingEntity //optional
    }

    public ETR_SensorEvent() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException {
        super();
        addParameter(AttributeName.ProducingEntity.name(), new UUIDStruct());
    }

    public UUIDStruct getProducingEntity() {
        return (UUIDStruct) getParameter(AttributeName.ProducingEntity.name());
    }
    public void setProducingEntity(UUIDStruct uuid){
        setParameter(AttributeName.ProducingEntity.name(), uuid.toByteArray());
    }
}
