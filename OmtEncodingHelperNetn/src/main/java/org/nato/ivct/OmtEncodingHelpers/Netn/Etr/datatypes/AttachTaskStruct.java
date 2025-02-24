package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>AttachTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for tasks related to attach or associate one entity with another, e.g. mount a platform, embark on a ship, or to enter a facility.</semantics>
                <field>
                    <name>EntityId</name>
                    <dataType>UUID</dataType>
                    <semantics>Reference to the entity to mount.</semantics>
                </field>
            </fixedRecordData>

 */
public class AttachTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        EntityId
    }

    public AttachTaskStruct() throws RTIinternalError {
        super();
    }

}
