package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import java.util.UUID;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.AggregateMissionEnum16;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.SymbolIdentifierStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;
import org.nato.ivct.OmtEncodingHelpers.RPR.Base.datatypes.OrientationStruct;
import org.nato.ivct.OmtEncodingHelpers.RPR.Base.datatypes.WorldLocationStruct;

import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.HLAfloat32BE;
import hla.rti1516e.encoding.HLAinteger16BE;
import hla.rti1516e.encoding.HLAoctet;
import hla.rti1516e.exceptions.RTIinternalError;

/*
            <fixedRecordData>
                <name>TrackStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Descripton of the observed entity. 
The symbol contains information about the spotted entity's relation to the spotter and details about the type and echelon at the spotted entity.</semantics>
                <field>
                    <name>Track</name>
                    <dataType>UUID</dataType>
                    <semantics>Unique identifier for a track. A new unique track id is generated if the sensor lose track of the entity.</semantics>
                </field>
                <field>
                    <name>Entity</name>
                    <dataType>UUID</dataType>
                    <semantics>The unique identifier for the detected entity (ground truth)</semantics>
                </field>
                <field>
                    <name>IdentificationLevel</name>
                    <dataType>IdentificationLevelEnum8</dataType>
                    <semantics>Required. The identification level of the tracked entity.</semantics>
                </field>
                <field>
                    <name>Equipment</name>
                    <dataType>ArrayOfDetectedEquipment</dataType>
                    <semantics>Spotted equipment list, type and number. 
 
Default value: Empty array.</semantics>
                </field>
                <field>
                    <name>Location</name>
                    <dataType>WorldLocationStruct</dataType>
                    <semantics>The location where the entity were spotted</semantics>
                </field>
                <field>
                    <name>Orientation</name>
                    <dataType>OrientationStruct</dataType>
                    <semantics>The orientation in Psi, Theta, Phi [radians]</semantics>
                </field>
                <field>
                    <name>Speed</name>
                    <dataType>VelocityMeterPerSecondFloat32</dataType>
                    <semantics>The speed of the entity (m/s). 
 
Default value: 0 m/s</semantics>
                </field>
                <field>
                    <name>Activity</name>
                    <dataType>AggregateMissionEnum16</dataType>
                    <semantics>The current activity of the entity. (Fromm NETN-Base) 
Default value: Moving (213)</semantics>
                </field>
                <field>
                    <name>Symbol</name>
                    <dataType>SymbolIdentifier</dataType>
                    <semantics>Symbol identifier for the entity. The detailed level may vary and the publishing federate decides the level of details in the symbol description. E.g. 
Default Ground value: app6b:SUGP------***** 
Default Air value: app6b:SUAP------***** 
Default Sea Surface value: app6b:SUSP------***** 
Default Subsurface value: app6b:SUUP------*****</semantics>
                </field>
            </fixedRecordData>
 */
public class TrackStruct extends HLAfixedRecordStruct {

    public enum AttributeName {
        Track,
        Entity,
        IdentificationLevel,
        Equipment,
        Location,
        Orientation,
        Speed,
        Activity,
        Symbol
    }

    public TrackStruct() throws RTIinternalError {
        super();
        add(AttributeName.Track.name(), new UUIDStruct());
        add(AttributeName.Entity.name(), new UUIDStruct());
        add(AttributeName.IdentificationLevel.name(), encoderFactory.createHLAoctet());
        add(AttributeName.Equipment.name(), new ArrayOfDetectedEquipmentStruct());
        add(AttributeName.Location.name(), new WorldLocationStruct());
        add(AttributeName.Orientation.name(), new OrientationStruct());
        add(AttributeName.Speed.name(), encoderFactory.createHLAfloat32BE());
        add(AttributeName.Activity.name(), encoderFactory.createHLAinteger16BE());
        add(AttributeName.Symbol.name(), new SymbolIdentifierStruct());
    }

    public UUIDStruct getTrack() {
        return (UUIDStruct) get(AttributeName.Track.name());
    }
    public void setTrack(UUIDStruct track) {
        set(AttributeName.Track.name(), track);
    }

    public UUIDStruct getEntity() {
        return (UUIDStruct) get(AttributeName.Entity.name());
    }
    public void setEntity(UUIDStruct entity) {
        set(AttributeName.Entity.name(), entity);
    }

    public IdentificationLevelEnum8 getIdentificationLevel() throws EncoderException, DecoderException {
        HLAoctet value = (HLAoctet) get(AttributeName.IdentificationLevel.name());
        return IdentificationLevelEnum8.decode(value.toByteArray());
    }
    public void setIdentificationLevel(IdentificationLevelEnum8 identificationLevel) {
        set(AttributeName.IdentificationLevel.name(), identificationLevel.getDataElement());
    }

    public ArrayOfDetectedEquipmentStruct getEquipment() {
        return (ArrayOfDetectedEquipmentStruct) get(AttributeName.Equipment.name());
    }
    public void setEquipment(ArrayOfDetectedEquipmentStruct equipment) {
        set(AttributeName.Equipment.name(), equipment);
    }

    public WorldLocationStruct getLocation() {
        return (WorldLocationStruct) get(AttributeName.Location.name());
    }
    public void setLocation(WorldLocationStruct location) {
        set(AttributeName.Location.name(), location);
    }

    public OrientationStruct getOrientation() {
        return (OrientationStruct) get(AttributeName.Orientation.name());
    }
    public void setOrientation(OrientationStruct orientation) {
        set(AttributeName.Orientation.name(), orientation);
    }

    public float getSpeed() {
        return ((HLAfloat32BE)get(AttributeName.Speed.name())).getValue();
    }
    public void setSpeed(float speed) {
        set(AttributeName.Speed.name(), encoderFactory.createHLAfloat32BE(speed));
    }

    public AggregateMissionEnum16 getActivity() throws EncoderException, DecoderException {
        HLAinteger16BE value = (HLAinteger16BE)get(AttributeName.Activity.name());
        return AggregateMissionEnum16.decode(value.toByteArray());
    }
    public void setActivity(AggregateMissionEnum16 activity) {
        set(AttributeName.Activity.name(), activity.getDataElement());
    }

    public SymbolIdentifierStruct getSymbol() {
        return (SymbolIdentifierStruct) get(AttributeName.Symbol.name());
    }
    public void setSymbol(SymbolIdentifierStruct symbol) {
        set(AttributeName.Symbol.name(), symbol);
    }
}
