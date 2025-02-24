package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>PatrolTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for a Patrol task.</semantics>
                <field>
                    <name>Path</name>
                    <dataType>ArrayOfWaypoints</dataType>
                    <semantics>Specifies the route to patrol.</semantics>
                </field>
                <field>
                    <name>PatrolType</name>
                    <dataType>PatrolTypeEnum32</dataType>
                    <semantics>Defined how the patrol should be executed. The full movement from start point, through the patrol route and back to the start point is called one cycle.</semantics>
                </field>
                <field>
                    <name>MoveType</name>
                    <dataType>PatrolMoveTypeEnum32</dataType>
                    <semantics>Defines how the entity shall move during the patrol route.</semantics>
                </field>
                <field>
                    <name>Duration</name>
                    <dataType>TimeMillisecondInt64</dataType>
                    <semantics>The duration of the patrol task. The path will be patrolled minimum 1 time. When time has expired no patrol along the path will start.</semantics>
                </field>
                <field>
                    <name>IntervalTime</name>
                    <dataType>TimeMillisecondInt64</dataType>
                    <semantics>The time between the start of two patrol cycles, i.e. the time to complete a cycle and any waiting time before starting the next cycle.</semantics>
                </field>
            </fixedRecordData>

 */
public class PatrolTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        Path, PatrolType, MoveType, Duration, IntervalTime
    }

    public PatrolTaskStruct() throws RTIinternalError {
        super();
    }

}
