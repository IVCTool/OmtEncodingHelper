package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariantRecordStruct;
import static org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes.EntityControlActionEnum32.*;

import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.HLAfixedRecord;
import hla.rti1516e.encoding.HLAinteger32BE;
import hla.rti1516e.exceptions.RTIinternalError;

/*
    <variantRecordData>
        <name>TaskProgressVariantRecord</name>
        <discriminant>TaskType</discriminant>
        <dataType>EntityControlActionEnum</dataType>
        <alternative>
            <enumerator>OperateCheckpoint, OtherActivity, FollowEntity, MoveInDirection, OperateObservationPost</enumerator>
            <name>ElapsedTime</name>
            <dataType>ElapsedTimeProgress</dataType>
            <semantics>Keeps track of elapesed time.</semantics>
        </alternative>
        <alternative>
            <enumerator>DirectFire, IndirectFire</enumerator>
            <name>FireTask</name>
            <dataType>FireTaskProgress</dataType>
            <semantics>Keeps track of elapesed time and spent munition.</semantics>
        </alternative>
        <alternative>
            <enumerator>MoveToLocation, MoveByRoute</enumerator>
            <name>MoveOnPath</name>
            <dataType>MoveTaskProgress</dataType>
            <semantics>Keeps track of achieved waypoints.</semantics>
        </alternative>
        <alternative>
            <enumerator>Patrol</enumerator>
            <name>Patrol</name>
            <dataType>PatrolTaskProgress</dataType>
            <semantics>Keeps track of achieved waypoints and elapsed time.</semantics>
        </alternative>
        <encoding>HLAextendableVariantRecord</encoding>
        <semantics>Variant record for task progress data.</semantics>
    </variantRecordData>
 */
public class TaskProgressVariantRecord extends HLAvariantRecordStruct<HLAinteger32BE> {

    private Set<EntityControlActionEnum32> elapsedTime = new HashSet<>(Arrays.asList(
        OperateCheckpoint, OtherActivity, FollowEntity, OperateObservationPost));

    public TaskProgressVariantRecord() throws RTIinternalError {
        super();
        decoder = encoderFactory.createHLAvariantRecord(encoderFactory.createHLAinteger32BE());
        
        HLAfixedRecord ftp = new FireTaskProgressStruct().getDataElement();
        decoder.setVariant(encoderFactory.createHLAinteger32BE(DirectFire.getValue()), ftp);
        decoder.setVariant(encoderFactory.createHLAinteger32BE(IndirectFire.getValue()), ftp);

        HLAfixedRecord mtp = new MoveTaskProgressStruct().getDataElement();
        decoder.setVariant(encoderFactory.createHLAinteger32BE(MoveToLocation.getValue()), mtp);
        decoder.setVariant(encoderFactory.createHLAinteger32BE(MoveByRoute.getValue()), mtp);

        HLAfixedRecord etp = new ElapsedTimeProgressStruct().getDataElement();
        elapsedTime.stream().forEach(i -> decoder.setVariant(encoderFactory.createHLAinteger32BE(i.getValue()), etp));
        
        HLAfixedRecord ptp = new PatrolTaskProgressStruct().getDataElement();
        decoder.setVariant(encoderFactory.createHLAinteger32BE(Patrol.getValue()), ptp);        
    }

    public void decode (byte[] bytes) throws DecoderException {
        try {
            decoder.decode(bytes);
 
            HLAinteger32BE hv = (HLAinteger32BE) decoder.getDiscriminant();
            HLAfixedRecord rec = (HLAfixedRecord) decoder.getValue();
            
            EntityControlActionEnum32 ev = EntityControlActionEnum32.get(hv.getValue());
            
            switch (ev) {
                case OperateCheckpoint: 
                case OtherActivity: 
                case FollowEntity: 
                case MoveInDirection: 
                case OperateObservationPost: 
                    setVariant(hv, new ElapsedTimeProgressStruct(rec)); 
                    break;
                case DirectFire: case IndirectFire: 
                    setVariant(hv, new FireTaskProgressStruct(rec)); 
                    break;
                case MoveToLocation: case MoveByRoute: 
                    setVariant(hv, new MoveTaskProgressStruct(rec));
                    break;
                case Patrol:
                    setVariant(hv, new PatrolTaskProgressStruct(rec));
                break;
                default: break;
            }
        } catch (RTIinternalError e) {
            throw new DecoderException(e.getMessage());
        }
    }
    
    public void setPatrolTaskProgress(EntityControlActionEnum32 ev, PatrolTaskProgressStruct patrolTaskProgress) {
        setVariant(encoderFactory.createHLAinteger32BE(Patrol.getValue()), patrolTaskProgress);
    }

    public void setMoveTaskProgress(EntityControlActionEnum32 ev, MoveTaskProgressStruct moveTaskProgress) throws RTIinternalError {
        if (ev == MoveToLocation || ev == MoveByRoute) {
            setVariant(encoderFactory.createHLAinteger32BE(ev.getValue()), moveTaskProgress);
        } else throw new RTIinternalError("Wrong match between discriminant and data element.");
    }

    public void setFireTaskProgress(EntityControlActionEnum32 ev, FireTaskProgressStruct fireTaskProgress) throws RTIinternalError {
        if (ev == DirectFire || ev == IndirectFire) {
            setVariant(encoderFactory.createHLAinteger32BE(ev.getValue()), fireTaskProgress);
        } else throw new RTIinternalError("Wrong match between discriminant and data element.");
    }

    public void setElapsedTimeProgress(EntityControlActionEnum32 ev, ElapsedTimeProgressStruct elapsedTimeProgress) throws RTIinternalError {
        if (elapsedTime.contains(ev)) {
            setVariant(encoderFactory.createHLAinteger32BE(ev.getValue()), elapsedTimeProgress);
        } else throw new RTIinternalError("Wrong match between discriminant and data element.");
    }    
}
