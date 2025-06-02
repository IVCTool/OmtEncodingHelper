package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

import hla.rti1516e.RtiFactoryFactory;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderFactory;
import hla.rti1516e.encoding.HLAinteger32BE;
import hla.rti1516e.encoding.HLAvariantRecord;
import hla.rti1516e.exceptions.RTIinternalError;

public class TaskProgressVariantRecordStructTest {

    @Test
    public void testDecode() throws RTIinternalError, DecoderException {
        EncoderFactory encoderFactory = RtiFactoryFactory.getRtiFactory().getEncoderFactory();
        TaskProgressVariantRecord taskProgressVariantRecord = new TaskProgressVariantRecord();
        MoveTaskProgressStruct mtp = new MoveTaskProgressStruct();
        HLAinteger32BE wp1 = encoderFactory.createHLAinteger32BE(1);
        mtp.setLastPassedWaypointIndex(wp1);
        HLAinteger32BE wp2 = encoderFactory.createHLAinteger32BE(2);
        mtp.setNextWaypointIndex(wp2);
        taskProgressVariantRecord.setMoveTaskProgress(EntityControlActionEnum32.MoveByRoute, mtp);
        TaskProgressVariantRecord taskProgressVariantRecord2 = new TaskProgressVariantRecord();
        byte [] ba1 = taskProgressVariantRecord.toByteArray();
        taskProgressVariantRecord2.decode(ba1);
        int discriminant = taskProgressVariantRecord2.getDiscriminant().getValue();
        assertEquals(discriminant, EntityControlActionEnum32.MoveByRoute.getValue());
        assertInstanceOf(MoveTaskProgressStruct.class, taskProgressVariantRecord2.getValue());

        TaskProgress tp = new TaskProgress();
        tp.setPrgressData(taskProgressVariantRecord);
        TaskProgress tp2 = new TaskProgress();
        byte [] ba = tp.toByteArray();
        tp2.decode(ba);
        TaskProgressVariantRecord tpvr = tp2.getProgressData();
        discriminant = tpvr.getDiscriminant().getValue();
        assertEquals(discriminant, EntityControlActionEnum32.MoveByRoute.getValue());
        assertInstanceOf(MoveTaskProgressStruct.class, tpvr.getValue());
    }    
}
