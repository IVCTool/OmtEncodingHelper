package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariantRecordStruct;

import hla.rti1516e.encoding.DataElement;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.HLAfixedRecord;
import hla.rti1516e.encoding.HLAinteger32BE;
import hla.rti1516e.encoding.HLAvariantRecord;
import hla.rti1516e.exceptions.RTIinternalError;

import static org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes.EntityControlActionEnum32.*;

/**
 * 
        <variantRecordDataTypes>
            <variantRecordData>
                <name>TaskDefinitionVariantRecord</name>
                <discriminant>TaskType</discriminant>
                <dataType>EntityControlActionEnum</dataType>
                <alternative>
                    <enumerator>Detach, StopAtSideOfRoad</enumerator>
                    <name>NoTaskParameters</name>
                    <dataType>EmptyTaskStruct</dataType>
                    <semantics>No additional parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>DirectFire</enumerator>
                    <name>DirectFire</name>
                    <dataType>DirectFireTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>IndirectFire</enumerator>
                    <name>IndirectFire</name>
                    <dataType>IndirectFireTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>FollowEntity</enumerator>
                    <name>FollowEntity</name>
                    <dataType>FollowEntityTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>MoveInDirection</enumerator>
                    <name>MoveInDirection</name>
                    <dataType>MoveInDirectionTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>MoveIntoFormation</enumerator>
                    <name>MoveIntoFormation</name>
                    <dataType>MoveIntoFormationTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>MoveToLocation</enumerator>
                    <name>MoveToLocation</name>
                    <dataType>MoveToLocationTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>Attach, EnterFacility</enumerator>
                    <name>Attach</name>
                    <dataType>AttachTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>Observe</enumerator>
                    <name>Observe</name>
                    <dataType>ObserveTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>OperateCheckpoint</enumerator>
                    <name>OperateCheckpoint</name>
                    <dataType>OperateCheckpointTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>Patrol</enumerator>
                    <name>Patrol</name>
                    <dataType>PatrolTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>ChangeAltitude</enumerator>
                    <name>ChangeAltitude</name>
                    <dataType>ChangeAltitudeTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>ChangeSpeed</enumerator>
                    <name>ChangeSpeed</name>
                    <dataType>ChangeSpeedTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>ChangeHeading</enumerator>
                    <name>ChangeHeading</name>
                    <dataType>ChangeHeadingTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>OtherActivity</enumerator>
                    <name>OtherActivity</name>
                    <dataType>OtherActivityTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>OperateObservationPost</enumerator>
                    <name>OperateObservationPost</name>
                    <dataType>OperateObservationPostTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>SetRulesOfEngagement</enumerator>
                    <name>ChangeRulesOfEngagement</name>
                    <dataType>ChangeRulesOfEngagementTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>MagicMove</enumerator>
                    <name>MagicMove</name>
                    <dataType>MagicMoveTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>MoveByRoute</enumerator>
                    <name>MoveByRoute</name>
                    <dataType>MoveByRouteTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <encoding>HLAextendableVariantRecord</encoding>
                <semantics>Variant record for task definition data.</semantics>
            </variantRecordData>

 */
public class TaskDefinitionVariantRecordStruct extends HLAvariantRecordStruct<HLAinteger32BE> {

    public TaskDefinitionVariantRecordStruct () throws RTIinternalError {
        super();
    }

    public void decode (byte[] bytes) throws DecoderException {
        HLAvariantRecord<DataElement> decoder = encoderFactory.createHLAvariantRecord(encoderFactory.createHLAinteger32BE());
        try {
            decoder.setVariant(encoderFactory.createHLAinteger32BE(MoveToLocation.getValue()), new MoveToLocationTaskStruct().getDataElement());
            decoder.setVariant(encoderFactory.createHLAinteger32BE(MoveByRoute.getValue()), new MoveByRouteTaskStruct().getDataElement());
            
            decoder.decode(bytes);
            int dv = ((HLAinteger32BE) decoder.getDiscriminant()).getValue();
            HLAfixedRecord rec = (HLAfixedRecord) decoder.getValue();
            EntityControlActionEnum32 ev = EntityControlActionEnum32.get(dv);
            switch (ev) {
                case MoveToLocation: setVariant(encoderFactory.createHLAinteger32BE(dv), new MoveToLocationTaskStruct(rec));
                case MoveByRoute: setVariant(encoderFactory.createHLAinteger32BE(dv), new MoveByRouteTaskStruct(rec));
                default: break;
            }
        } catch (RTIinternalError e) {
            throw new DecoderException(e.getMessage());
        }
    }
}
