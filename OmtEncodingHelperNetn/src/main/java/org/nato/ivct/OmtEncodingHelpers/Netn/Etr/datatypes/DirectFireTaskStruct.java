package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>DirectFireTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for direct fire.</semantics>
                <field>
                    <name>Target</name>
                    <dataType>UUID</dataType>
                    <semantics>Target to fire at.</semantics>
                </field>
                <field>
                    <name>Duration</name>
                    <dataType>TimeMillisecondInt64</dataType>
                    <semantics>Duration of the fire (milliseconds). Can be 0</semantics>
                </field>
                <field>
                    <name>Round</name>
                    <dataType>RoundStruct</dataType>
                    <semantics>Details regarding the weapon, munition, rounds and rate of fire.</semantics>
                </field>
            </fixedRecordData>

 */
public class DirectFireTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        Target, Duration, Round
    }

    public DirectFireTaskStruct() throws RTIinternalError {
        super();
    }

}
