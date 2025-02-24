package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>MoveIntoFormationTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Initial movement speed.</semantics>
                <field>
                    <name>Formation</name>
                    <dataType>AggregateStateFormationEnum32</dataType>
                    <semantics>The type of positional arrangement the entity.</semantics>
                </field>
                <field>
                    <name>Location</name>
                    <dataType>LocationStruct</dataType>
                    <semantics>The location to move to.</semantics>
                </field>
                <field>
                    <name>Distance</name>
                    <dataType>MeterFloat32</dataType>
                    <semantics>The minimum distance between entities in the formation.</semantics>
                </field>
                <field>
                    <name>Heading</name>
                    <dataType>DirectionDegreesFloat32</dataType>
                    <semantics>The heading of the formation.</semantics>
                </field>
                <field>
                    <name>Speed</name>
                    <dataType>VelocityMeterPerSecondFloat32</dataType>
                    <semantics>The initial speed of the entity.</semantics>
                </field>
            </fixedRecordData>

 */
public class MoveIntoFormationTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        Formation, Location, Distance, Heading, Speed
    }

    public MoveIntoFormationTaskStruct() throws RTIinternalError {
        super();
    }

}
