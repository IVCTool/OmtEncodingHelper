package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.encoding.HLAfixedRecord;
import hla.rti1516e.encoding.HLAinteger32BE;
import hla.rti1516e.exceptions.RTIinternalError;

/*
    <fixedRecordData>
        <name>MoveTaskProgress</name>
        <encoding>HLAfixedRecord</encoding>
        <semantics>Task progress data for all move tasks with a path. If the next waypoint index &lt; the last waypoint index, it indicates the reverse movement along a route.</semantics>
        <field>
            <name>LastPassedWaypointIndex</name>
            <dataType>Integer32</dataType>
            <semantics>Index of last passed waypoint.</semantics>
        </field>
        <field>
            <name>NextWaypointIndex</name>
            <dataType>Integer32</dataType>
            <semantics>Index of next waypoint.</semantics>
        </field>
    </fixedRecordData>
 */
public class MoveTaskProgressStruct extends HLAfixedRecordStruct {

    public enum AttributeName {
        LastPassedWaypointIndex,
        NextWaypointIndex
    }

    public MoveTaskProgressStruct() throws RTIinternalError {
        super();
        add(AttributeName.LastPassedWaypointIndex.name(), encoderFactory.createHLAinteger32BE());
        add(AttributeName.NextWaypointIndex.name(), encoderFactory.createHLAinteger32BE());
    }

    public MoveTaskProgressStruct(HLAfixedRecord rec ) throws RTIinternalError {
        this();
        setLastPassedWaypointIndex((HLAinteger32BE)rec.get(0));
        setNextWaypointIndex((HLAinteger32BE)rec.get(1));
    }
    
    public HLAinteger32BE getLastPassedWaypointIndex() {
        return (HLAinteger32BE) get(AttributeName.LastPassedWaypointIndex.name());
    }
    public void setLastPassedWaypointIndex(HLAinteger32BE lastPassedWaypointIndex) {
        set(AttributeName.LastPassedWaypointIndex.name(), lastPassedWaypointIndex);
    }

    public HLAinteger32BE geNextWaypointIndex() {
        return (HLAinteger32BE) get(AttributeName.NextWaypointIndex.name());
    }
    public void setNextWaypointIndex(HLAinteger32BE lastPassedWaypointIndex) {
        set(AttributeName.NextWaypointIndex.name(), lastPassedWaypointIndex);
    }    
}
