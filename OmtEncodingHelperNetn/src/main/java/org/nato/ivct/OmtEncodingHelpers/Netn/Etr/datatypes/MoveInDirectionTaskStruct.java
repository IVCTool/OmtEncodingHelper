package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>MoveInDirectionTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Tasking of an entity to move in a specified direction for a given duration.</semantics>
                <field>
                    <name>Direction</name>
                    <dataType>DirectionDegreesFloat32</dataType>
                    <semantics>Direction of movement</semantics>
                </field>
                <field>
                    <name>Speed</name>
                    <dataType>VelocityMeterPerSecondFloat32</dataType>
                    <semantics>Initial speed of the entity.</semantics>
                </field>
                <field>
                    <name>Duration</name>
                    <dataType>TimeMillisecondInt64</dataType>
                    <semantics>The duration of the move.</semantics>
                </field>
            </fixedRecordData>

 */
public class MoveInDirectionTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        Direction, Speed, Duration
    }

    public MoveInDirectionTaskStruct() throws RTIinternalError {
        super();
    }

}
