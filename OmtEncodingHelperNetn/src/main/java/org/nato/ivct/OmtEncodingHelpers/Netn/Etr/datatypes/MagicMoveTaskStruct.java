package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>MagicMoveTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for MagicMove.</semantics>
                <field>
                    <name>Location</name>
                    <dataType>LocationStruct</dataType>
                    <semantics>Location of the entity.</semantics>
                </field>
                <field>
                    <name>Heading</name>
                    <dataType>DirectionDegreesFloat32</dataType>
                    <semantics>Heading of the entity. [0,360). Default = 0. True North.</semantics>
                </field>
            </fixedRecordData>

 */
public class MagicMoveTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        Location, Heading
    }

    public MagicMoveTaskStruct() throws RTIinternalError {
        super();
    }

}
