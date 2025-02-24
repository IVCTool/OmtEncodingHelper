package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>OperateCheckpointTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for OperateCheckpoint task.</semantics>
                <field>
                    <name>CheckpointId</name>
                    <dataType>UUID</dataType>
                    <semantics>UniqueId of the checkpoint to operate.</semantics>
                </field>
                <field>
                    <name>Duration</name>
                    <dataType>TimeMillisecondInt64</dataType>
                    <semantics>How long to operate the checkpoint for (Milliseconds).</semantics>
                </field>
                <field>
                    <name>DelayTime</name>
                    <dataType>TimeMillisecondInt64</dataType>
                    <semantics>Updates the DelayTime for the checkpoint. If left blank the DelayTime will remain the same.</semantics>
                </field>
            </fixedRecordData>

 */
public class OperateCheckpointTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        CheckpointId, Duration, DelayTime
    }

    public OperateCheckpointTaskStruct() throws RTIinternalError {
        super();
    }

}
