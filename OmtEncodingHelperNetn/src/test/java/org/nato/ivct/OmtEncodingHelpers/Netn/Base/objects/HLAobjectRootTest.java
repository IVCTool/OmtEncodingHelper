package org.nato.ivct.OmtEncodingHelpers.Netn.Base.objects;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.HLAobjectRootBaseTests;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.ByteWrapper;
import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.InvalidObjectClassHandle;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

public class HLAobjectRootTest extends HLAobjectRootBaseTests{

    private HLAobjectRoot hlaobjectRoot;
    public static final Logger log = LoggerFactory.getLogger(HLAobjectRootTest.class);

    @BeforeEach
    void setUp() {
        try {
            hlaobjectRoot = new HLAobjectRoot();
        } catch (NameNotFound | InvalidObjectClassHandle | FederateNotExecutionMember | NotConnected | RTIinternalError
                | EncoderException | OmtEncodingHelperException e) {
            e.printStackTrace();
            fail();
        }
    }
    

    @Test
    void testSetAndGetCreateTime() {
        try {
            hlaobjectRoot = new HLAobjectRoot();
        } catch (NameNotFound | InvalidObjectClassHandle | FederateNotExecutionMember | NotConnected | RTIinternalError
                | EncoderException | OmtEncodingHelperException e) {
            e.printStackTrace();
            fail();
        }        
        try {
            hlaobjectRoot.setCreateTime(1234);
            assertTrue(1234 == hlaobjectRoot.getCreateTime());
        } catch (NameNotFound | InvalidObjectClassHandle | FederateNotExecutionMember | NotConnected | RTIinternalError
                | EncoderException e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    @Test
    void testSetAndGetUniqueId() {
        try {
            UUIDStruct value1 = hlaobjectRoot.getUniqueId();
            value1.decode("0123456789012345".getBytes());
            ByteWrapper byteWrapper = new ByteWrapper(new byte[16]);
            UUIDStruct value2 = new UUIDStruct();
            value1.encode(byteWrapper);
            byteWrapper.reset();
            value2.decode(byteWrapper);
            hlaobjectRoot.setUniqueId(value2);
            UUIDStruct uuid = hlaobjectRoot.getUniqueId();
            log.info("UUID value = " + uuid);
            assertTrue(value1.size() == value2.size());
        } catch (NameNotFound | InvalidObjectClassHandle | FederateNotExecutionMember | NotConnected | RTIinternalError
                | EncoderException | DecoderException e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

}
