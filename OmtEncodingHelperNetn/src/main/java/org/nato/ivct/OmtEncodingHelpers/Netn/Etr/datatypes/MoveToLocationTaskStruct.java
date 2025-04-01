package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.LocationStruct;

import hla.rti1516e.encoding.DataElement;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.HLAfixedRecord;
import hla.rti1516e.encoding.HLAfloat32BE;
import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>MoveToLocationTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for MoveToLocation task.</semantics>
                <field>
                    <name>Location</name>
                    <dataType>LocationStruct</dataType>
                    <semantics>Location to move to.</semantics>
                </field>
                <field>
                    <name>Path</name>
                    <dataType>LocationStructArray</dataType>
                    <semantics>Path to use in order to move to Location.</semantics>
                </field>
                <field>
                    <name>MoveType</name>
                    <dataType>MoveTypeEnum32</dataType>
                    <semantics>Indicates if roads have to be followed.</semantics>
                </field>
                <field>
                    <name>Speed</name>
                    <dataType>VelocityMeterPerSecondFloat32</dataType>
                    <semantics>Initial speed of the entity.</semantics>
                </field>
            </fixedRecordData>

 */
public class MoveToLocationTaskStruct extends HLAfixedRecordStruct {

    public enum AttributeName {
        Location, Path, MoveType, Speed
    }

    public MoveToLocationTaskStruct() throws RTIinternalError {
        super();
        add(AttributeName.Location.name(), new LocationStruct());
        add(AttributeName.Path.name(), new ArrayOfLocationStruct());
        add(AttributeName.MoveType.name(), MoveTypeEnum32.CrossCountry.getDataElement());
        add(AttributeName.Speed.name(), encoderFactory.createHLAfloat32BE());
    }

    public MoveToLocationTaskStruct(HLAfixedRecord rec) throws RTIinternalError {
        setLocation((LocationStruct)rec.get(0));
        setPath((ArrayOfLocationStruct)rec.get(1));
        set(AttributeName.MoveType.name(), rec.get(2));
        setSpeed((HLAfloat32BE)rec.get(3));
    }

    public LocationStruct getLocation() {
        return (LocationStruct)get(AttributeName.Location.name());
    }
    public void setLocation(LocationStruct loaction) {
        set(AttributeName.Location.name(), loaction);
    }    

    public ArrayOfLocationStruct getPath() {
        return (ArrayOfLocationStruct)get(AttributeName.Path.name());
    }
    public void setPath(ArrayOfLocationStruct arrayOfLocation) {
        set(AttributeName.Path.name(), arrayOfLocation);
    }

    public MoveTypeEnum32 getMoveType() throws EncoderException, DecoderException {
        DataElement de = get(AttributeName.MoveType.name());
        return MoveTypeEnum32.decode(de.toByteArray());
    }
    public void setMoveType(MoveTypeEnum32 moveType) {
        set(AttributeName.MoveType.name(), moveType.getDataElement());
    }    

    public HLAfloat32BE getSpeed() {
        return (HLAfloat32BE)get(AttributeName.Speed.name());
    }
    public void setSpeed(HLAfloat32BE speed) {
        set(AttributeName.Speed.name(), speed);
    }    
}
