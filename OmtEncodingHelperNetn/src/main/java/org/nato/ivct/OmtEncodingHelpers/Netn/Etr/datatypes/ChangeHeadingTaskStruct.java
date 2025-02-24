package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>ChangeHeadingTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data to turn to the specified heading.</semantics>
                <field>
                    <name>Heading</name>
                    <dataType>DirectionDegreesFloat32</dataType>
                    <semantics>The heading an entity has to turn to.</semantics>
                </field>
            </fixedRecordData>

 */
public class ChangeHeadingTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        Heading
    }

    public ChangeHeadingTaskStruct() throws RTIinternalError {
        super();
    }

}
