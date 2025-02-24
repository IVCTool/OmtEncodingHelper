package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>OperateObservationPostTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for OperateObservationPost task.</semantics>
                <field>
                    <name>ObserveTask</name>
                    <dataType>ObserveTaskStruct</dataType>
                    <semantics>Common observe task parameters.</semantics>
                </field>
                <field>
                    <name>Duration</name>
                    <dataType>TimeMicrosecondFloat32</dataType>
                    <semantics>Duration of the observe task (milliseconds). Can be 0</semantics>
                </field>
                <field>
                    <name>ObservationPostId</name>
                    <dataType>UUID</dataType>
                    <semantics>UniqueId of the observatin post to operate.</semantics>
                </field>
            </fixedRecordData>

 */
public class OperateObservationPostTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        ObserveTask, Duration, ObservationPostId
    }

    public OperateObservationPostTaskStruct() throws RTIinternalError {
        super();
    }

}
