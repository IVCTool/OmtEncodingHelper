package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.encoding.DataElement;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.HLAfixedRecord;
import hla.rti1516e.exceptions.RTIinternalError;

/*
    <fixedRecordData>
        <name>MoveByRouteTaskStruct</name>
        <encoding>HLAfixedRecord</encoding>
        <semantics>Task-specific data for MoveByRoute.</semantics>
        <field>
            <name>Route</name>
            <dataType>ArrayOfWaypoints</dataType>
            <semantics>Each waypoint includes the speed of movement to the waypoint.</semantics>
        </field>
        <field>
            <name>MoveType</name>
            <dataType>MoveTypeEnum32</dataType>
            <semantics>Indicates if roads have to be followed or not.</semantics>
        </field>
    </fixedRecordData>
 */
public class MoveByRouteTaskStruct extends HLAfixedRecordStruct {

    public enum AttributeName {
        Route,
        MoveType
    }

    public MoveByRouteTaskStruct() throws RTIinternalError {
        super();
        add(AttributeName.Route.name(), new ArrayOfWaypointsStruct());
        add(AttributeName.MoveType.name(), MoveTypeEnum32.CrossCountry.getDataElement());
    }

    public MoveByRouteTaskStruct(HLAfixedRecord rec) throws RTIinternalError {
        this();
        setArrayOfWaypointsStruct((ArrayOfWaypointsStruct)(rec.get(0)));
        set(AttributeName.MoveType.name(), rec.get(1));
    }

    public ArrayOfWaypointsStruct getArrayOfWaypointsStruct() {
        return (ArrayOfWaypointsStruct) get(AttributeName.Route.name());
    }
    public void setArrayOfWaypointsStruct(ArrayOfWaypointsStruct arrayOfWaypoints) {
        set(AttributeName.Route.name(), arrayOfWaypoints);
    }

    public MoveTypeEnum32 getMoveType() throws EncoderException, DecoderException {
        DataElement de = get(AttributeName.MoveType.name());
        return MoveTypeEnum32.decode(de.toByteArray());
    }
    public void setMoveType(MoveTypeEnum32 moveType) {
        set(AttributeName.MoveType.name(), moveType.getDataElement());
    }
}
