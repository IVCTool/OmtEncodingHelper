package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

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

    public enum Attributes {
        Location, Path, MoveType, Speed
    }

    public MoveToLocationTaskStruct() throws RTIinternalError {
        super();
    }

}
