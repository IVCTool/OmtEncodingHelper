package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.LocationStruct;

import hla.rti1516e.encoding.HLAfloat32BE;
import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

public class PositionStatusReport extends ETR_Report {

    public enum AttributeName {
        Heading,
        Position,
        Speed
    }

    public PositionStatusReport() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException, NameNotFound, FederateNotExecutionMember {
        super();
        addParameter(AttributeName.Heading.name(), encoderFactory.createHLAfloat32BE());
        addParameter(AttributeName.Position.name(), new LocationStruct());
        addParameter(AttributeName.Speed.name(), encoderFactory.createHLAfloat32BE());
    }

    public float getHeading() {
        return ((HLAfloat32BE) getParameter(AttributeName.Heading.name())).getValue();
    }
    public void setHeading(float heading) {
        setParameter(AttributeName.Heading.name(), encoderFactory.createHLAfloat32BE(heading).toByteArray());
    }

    public LocationStruct getPosition() {
        return (LocationStruct) getParameter(AttributeName.Position.name());
    }
    public void setPosition(LocationStruct location) {
        setParameter(AttributeName.Position.name(), location.toByteArray());
    }
    public float getSpeed() {
        return ((HLAfloat32BE) getParameter(AttributeName.Speed.name())).getValue();
    }

    public void setSpeed(float speed) {
        setParameter(AttributeName.Speed.name(), encoderFactory.createHLAfloat32BE(speed).toByteArray());
    }    
}
