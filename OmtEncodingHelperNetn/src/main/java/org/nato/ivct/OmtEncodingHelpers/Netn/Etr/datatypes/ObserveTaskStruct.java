package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>ObserveTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for Observe task.</semantics>
                <field>
                    <name>ObservationArea</name>
                    <dataType>LocationStructArray</dataType>
                    <semantics>Area to observe.</semantics>
                </field>
            </fixedRecordData>

 */
public class ObserveTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        ObservationArea
    }

    public ObserveTaskStruct() throws RTIinternalError {
        super();
    }

}
