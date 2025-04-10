package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.HLAinteger32BE;
import hla.rti1516e.encoding.HLAvariantRecord;
import hla.rti1516e.exceptions.RTIinternalError;

public class TaskProgressVariantRecordStructTest {

    @Test
    public void testDecode() throws RTIinternalError, DecoderException {
        TaskProgressVariantRecord taskProgressVariantRecord = new TaskProgressVariantRecord();
        MoveTaskProgressStruct mtp = new MoveTaskProgressStruct();
        taskProgressVariantRecord.setMoveTaskProgress(EntityControlActionEnum32.MoveByRoute, mtp);
        TaskProgressVariantRecord taskProgressVariantRecord2 = new TaskProgressVariantRecord();

        taskProgressVariantRecord2.decode(taskProgressVariantRecord.toByteArray());
        int discriminant = taskProgressVariantRecord2.getDiscriminant().getValue();
        HLAvariantRecord<HLAinteger32BE> variant = taskProgressVariantRecord2.getDataElement();
        assertEquals(discriminant, EntityControlActionEnum32.MoveByRoute.getValue());
        assertInstanceOf(MoveTaskProgressStruct.class, variant.getValue());
    }    
}
