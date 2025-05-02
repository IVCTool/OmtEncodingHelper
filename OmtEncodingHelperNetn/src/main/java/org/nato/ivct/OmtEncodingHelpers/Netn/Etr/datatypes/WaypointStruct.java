package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.LocationStruct;

import hla.rti1516e.encoding.HLAfloat32BE;
import hla.rti1516e.exceptions.RTIinternalError;

/*
        <fixedRecordData>
            <name>Waypoint</name>
            <encoding>HLAfixedRecord</encoding>
            <semantics>A location and the speed to reach that location.</semantics>
            <field>
                <name>Location</name>
                <dataType>LocationStruct</dataType>
                <semantics>Coordinate to move towards.</semantics>
            </field>
            <field>
                <name>Speed</name>
                <dataType>VelocityMeterPerSecondFloat32</dataType>
                <semantics>Speed over ground for an entity, in m/s.</semantics>
            </field>
            <field>
                <name>SegmentMaxWidth</name>
                <dataType>MeterFloat32</dataType>
                <semantics>Maximum allowed width on road or terrain. Use zero (0) for no max width.</semantics>
            </field>
        </fixedRecordData>
 */
public class WaypointStruct extends HLAfixedRecordStruct {

    public enum AttributeName {
        Location, Speed, SegmentMaxWidth
    }

    public WaypointStruct() throws RTIinternalError {
        super();
        add(AttributeName.Location.name(), new LocationStruct());
        add(AttributeName.Speed.name(), encoderFactory.createHLAfloat32BE());
        add(AttributeName.SegmentMaxWidth.name(), encoderFactory.createHLAfloat32BE());
    }

    public LocationStruct getLocation() {
        return (LocationStruct)get(AttributeName.Location.name());
    }
    public void setLocation(LocationStruct loaction) {
        set(AttributeName.Location.name(), loaction);
    }

    public float getSpeed() {
        return ((HLAfloat32BE)get(AttributeName.Speed.name())).getValue();
    }
    public void setSpeed(float speed) {
        ((HLAfloat32BE)get(AttributeName.Speed.name())).setValue(speed);;
    }

    public float getSegmentMaxWidth() {
        return ((HLAfloat32BE)get(AttributeName.SegmentMaxWidth.name())).getValue();
    }
    public void setSegmentMaxWidth(float segmentMaxWidth) {
        ((HLAfloat32BE)get(AttributeName.SegmentMaxWidth.name())).setValue(segmentMaxWidth);;
    }
}
