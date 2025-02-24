package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>FollowEntityTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for FollowEntity</semantics>
                <field>
                    <name>FollowedEntity</name>
                    <dataType>UUID</dataType>
                    <semantics>Reference to the entity to follow.</semantics>
                </field>
                <field>
                    <name>Behind</name>
                    <dataType>MeterFloat32</dataType>
                    <semantics>The distance in meters behind the entity to follow.</semantics>
                </field>
                <field>
                    <name>Right</name>
                    <dataType>MeterFloat32</dataType>
                    <semantics>The distance in meters to the right of the entity to follow.</semantics>
                </field>
                <field>
                    <name>Above</name>
                    <dataType>MeterFloat32</dataType>
                    <semantics>The distance in meters above the entity to follow.</semantics>
                </field>
                <field>
                    <name>Duration</name>
                    <dataType>TimeMillisecondInt64</dataType>
                    <semantics>The duration of the follow action (Milliseconds).</semantics>
                </field>
            </fixedRecordData>

 */
public class FollowEntityTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        FollowedEntity, Behind, Right, Above, Duration
    }

    public FollowEntityTaskStruct() throws RTIinternalError {
        super();
    }

}
