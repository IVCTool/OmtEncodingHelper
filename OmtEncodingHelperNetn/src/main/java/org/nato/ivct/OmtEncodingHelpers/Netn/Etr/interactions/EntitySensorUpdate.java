package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes.ArrayOfTrack;
import org.nato.ivct.OmtEncodingHelpers.RPR.Base.datatypes.EntityTypeStruct;

import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

public class EntitySensorUpdate extends ETR_SensorEvent {

    public enum AttributeName {
        SensorType,
        Tracks
    }

    public EntitySensorUpdate() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException {
        super();
        addParameter(AttributeName.SensorType.name(), new EntityTypeStruct());
        addParameter(AttributeName.Tracks.name(), new ArrayOfTrack());
    }

}
