package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>ChangeSpeedTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for ChangeSpeedTask task.</semantics>
                <field>
                    <name>Speed</name>
                    <dataType>VelocityMeterPerSecondFloat32</dataType>
                    <semantics>Determines the ordered speed to set for an entity, in m/s.</semantics>
                </field>
            </fixedRecordData>

 */
public class ChangeSpeedTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        Speed
    }

    public ChangeSpeedTaskStruct() throws RTIinternalError {
        super();
    }

}
