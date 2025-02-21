package org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes;

import hla.rti1516e.encoding.ByteWrapper;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.exceptions.RTIinternalError;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class EpochTimeStructTest {

    private EpochTimeStruct epochTimeStruct;

    @BeforeEach
    void setUp() throws RTIinternalError {
        epochTimeStruct = new EpochTimeStruct();
    }

    @Test
    void testGetOctetBoundary() {
        assertEquals(4, epochTimeStruct.getOctetBoundary());
    }

    @Test
    void testEncode() throws EncoderException {
        ByteWrapper byteWrapper = new ByteWrapper(new byte[4]);
        epochTimeStruct.setValue(12345);
        epochTimeStruct.encode(byteWrapper);
        assertEquals(4, byteWrapper.array().length);
    }

    @Test
    void testGetEncodedLength() {
        assertEquals(4, epochTimeStruct.getEncodedLength());
    }

    @Test
    void testToByteArray() throws EncoderException {
        epochTimeStruct.setValue(12345);
        byte[] byteArray = epochTimeStruct.toByteArray();
        assertEquals(4, byteArray.length);
    }

    @Test
    void testDecodeByteWrapper() throws DecoderException, EncoderException, RTIinternalError {
        ByteWrapper byteWrapper = new ByteWrapper(new byte[4]);
        epochTimeStruct.setValue(12345);
        epochTimeStruct.encode(byteWrapper);
        EpochTimeStruct decodedStruct = new EpochTimeStruct();
        byteWrapper.reset();
        decodedStruct.decode(byteWrapper);
        assertEquals(12345, decodedStruct.getValue());
    }

    @Test
    void testDecodeByteArray() throws DecoderException, EncoderException, RTIinternalError {
        epochTimeStruct.setValue(12345);
        byte[] byteArray = epochTimeStruct.toByteArray();
        EpochTimeStruct decodedStruct = new EpochTimeStruct();
        decodedStruct.decode(byteArray);
        assertEquals(12345, decodedStruct.getValue());
    }

    @Test
    void testGetValue() {
        epochTimeStruct.setValue(12345);
        assertEquals(12345, epochTimeStruct.getValue());
    }

    @Test
    void testSetValue() {
        epochTimeStruct.setValue(12345);
        assertEquals(12345, epochTimeStruct.getValue());
    }
}