package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>ChangeAltitudeTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for ChangeAltitude</semantics>
                <field>
                    <name>Altitude</name>
                    <dataType>AltitudeMeterFloat64</dataType>
                    <semantics>Defines the altitude as relative to mean sea level (MSL). Positive if above MSL and negative if below.</semantics>
                </field>
            </fixedRecordData>

 */
public class ChangeAltitudeTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        Altitude
    }

    public ChangeAltitudeTaskStruct() throws RTIinternalError {
        super();
    }

}
