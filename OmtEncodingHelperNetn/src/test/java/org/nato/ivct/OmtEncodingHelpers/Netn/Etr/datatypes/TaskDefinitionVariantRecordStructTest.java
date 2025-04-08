package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import hla.rti1516e.RtiFactoryFactory;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderFactory;
import hla.rti1516e.encoding.HLAinteger32BE;
import hla.rti1516e.encoding.HLAvariantRecord;
import hla.rti1516e.exceptions.RTIinternalError;

public class TaskDefinitionVariantRecordStructTest {
    private EncoderFactory encoderFactory;

    @BeforeEach
    public void setup() throws RTIinternalError {
            encoderFactory = RtiFactoryFactory.getRtiFactory().getEncoderFactory();
    }

    @Test
    public void testDecode() throws RTIinternalError, DecoderException {
        TaskDefinitionVariantRecordStruct taskDefinitionVariantRecordStruct = new TaskDefinitionVariantRecordStruct();
        MoveByRouteTaskStruct mbr = new MoveByRouteTaskStruct();
        taskDefinitionVariantRecordStruct.setVariant(encoderFactory.createHLAinteger32BE(29), mbr);
        TaskDefinitionVariantRecordStruct taskDefinitionVariantRecordStruct2 = new TaskDefinitionVariantRecordStruct();
        taskDefinitionVariantRecordStruct2.decode(taskDefinitionVariantRecordStruct.toByteArray());
        int discriminant = taskDefinitionVariantRecordStruct2.getDiscriminant().getValue();
        HLAvariantRecord<HLAinteger32BE> variant = taskDefinitionVariantRecordStruct2.getDataElement();
        assertEquals(discriminant, 29);
        assertInstanceOf(MoveByRouteTaskStruct.class, variant.getValue());
    }
}