package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>IndirectFireTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for IndirectFire task.</semantics>
                <field>
                    <name>Area</name>
                    <dataType>LocationStructArray</dataType>
                    <semantics>Area of where to fire.</semantics>
                </field>
                <field>
                    <name>Duration</name>
                    <dataType>TimeMillisecondInt64</dataType>
                    <semantics>How long to fire for.</semantics>
                </field>
                <field>
                    <name>Round</name>
                    <dataType>RoundStruct</dataType>
                    <semantics>Details regarding the weapon, munition, rounds and rate of fire.</semantics>
                </field>
            </fixedRecordData>

    TODO: tbc
 */
public class IndirectFireTaskStruct extends HLAfixedRecordStruct{

    public enum Attributes {
        Area, Duration, Round
    }

    public IndirectFireTaskStruct() throws RTIinternalError {
        super();
    }

}
