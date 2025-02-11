package org.nato.ivct.OmtEncodingHelpers.Netn.Base.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.EpochTimeStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;

import hla.rti1516e.encoding.DataElement;
import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.encoding.HLAbyte;
import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;


public class HLAinteractionRoot extends org.nato.ivct.OmtEncodingHelpers.Core.interactions.HLAinteractionRoot {

    public enum AttributeName {
        CreateTime,
        UniqueId
    }

    public HLAinteractionRoot() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError, OmtEncodingHelperException, hla.rti1516e.exceptions.NameNotFound, hla.rti1516e.exceptions.FederateNotExecutionMember {
        super();
        addParameter(AttributeName.CreateTime.name(), encoderFactory.createHLAinteger32BE());
        addParameter(AttributeName.UniqueId.name(), (UUIDStruct) encoderFactory.createHLAfixedArray((DataElementFactory<HLAbyte>) encoderFactory, 16));
    }

    public void setCreateTime (int createTime) throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError {
        EpochTimeStruct value = (EpochTimeStruct) getParameter(AttributeName.CreateTime.name());
        value.setValue(createTime);
        setParameter(AttributeName.CreateTime.name(), value.toByteArray());
    }
    public int getCreateTime () throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError {
        EpochTimeStruct value = (EpochTimeStruct) getParameter(AttributeName.CreateTime.name());
        return value.getValue();
    }
}
