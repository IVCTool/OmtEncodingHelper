package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariantRecordStruct;

import hla.rti1516e.encoding.DataElement;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.HLAfixedRecord;
import hla.rti1516e.encoding.HLAinteger32BE;
import hla.rti1516e.encoding.HLAvariantRecord;
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

    public TaskProgressVariantRecord() throws RTIinternalError {
        super();
    }

    public void decode (byte[] bytes) throws DecoderException {
        HLAvariantRecord<DataElement> decoder = encoderFactory.createHLAvariantRecord(encoderFactory.createHLAinteger32BE());
        try {
            decoder.setVariant(encoderFactory.createHLAinteger32BE(EntityControlActionEnum32.DirectFire.getValue()), (new FireTaskProgressStruct()).getDataElement());
            decoder.setVariant(encoderFactory.createHLAinteger32BE(EntityControlActionEnum32.IndirectFire.getValue()), (new FireTaskProgressStruct()).getDataElement());

            decoder.decode(bytes);
 
            int dv = ((HLAinteger32BE) decoder.getDiscriminant()).getValue();
            HLAfixedRecord rec = (HLAfixedRecord) decoder.getValue();
            setVariant(encoderFactory.createHLAinteger32BE(dv), rec);            
            switch (dv) {
                case 32: case 42: case 24: case 25: case 34: 
                    setElapsedTimeProgress(dv, new ElapsedTimeProgressStruct(rec)); 
                    break;
                case 20: case 22: 
                    setFireTaskProgress(dv, new FireTaskProgressStruct(rec)); 
                    break;
                case 28: case 29: 
                    setMoveTaskProgress(dv, new MoveTaskProgressStruct(rec));
                    break;
                case 33:
                    setPatrolTaskProgress(dv, new PatrolTaskProgressStruct(rec))
                break;
                default: break;
            }
        } catch (RTIinternalError e) {
            throw new DecoderException(e.getMessage());
        }
    }
    
    private void setPatrolTaskProgress(int dv, PatrolTaskProgressStruct patrolTaskProgress) {
        setVariant(encoderFactory.createHLAinteger32BE(dv), patrolTaskProgress);
    }

    private void setMoveTaskProgress(int dv, MoveTaskProgressStruct moveTaskProgress) {
        setVariant(encoderFactory.createHLAinteger32BE(dv), moveTaskProgress);
    }

    private void setFireTaskProgress(int dv, FireTaskProgressStruct fireTaskProgress) {
        setVariant(encoderFactory.createHLAinteger32BE(dv), fireTaskProgress);
    }

    private void setElapsedTimeProgress(int dv, ElapsedTimeProgressStruct elapsedTimeProgress) {
        setVariant(encoderFactory.createHLAinteger32BE(dv), elapsedTimeProgress);
    }    
}
