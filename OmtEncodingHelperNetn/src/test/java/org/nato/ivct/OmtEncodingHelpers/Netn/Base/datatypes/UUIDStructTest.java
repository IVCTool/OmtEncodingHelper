package org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes;

import java.nio.charset.Charset;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.HLAobjectRootBaseTests;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.objects.HLAobjectRoot;

import hla.rti1516e.AttributeHandleValueMap;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.InvalidObjectClassHandle;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

public class UUIDStructTest extends HLAobjectRootBaseTests {
    private HLAobjectRoot hlaobjectRoot;

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
    void testDecode() {
        try {
            hlaobjectRoot.publishCreateTime();
            hlaobjectRoot.publishUniqueId();
            hlaobjectRoot.publish();

            hlaobjectRoot.setCreateTime(42);
            UUIDStruct id = hlaobjectRoot.getUniqueId();
            // sammple UUID 10 39 00 74 76 F2 45 33 80 B3 C5 AE 2F C1 13 73  
            id.decode("1039007476F2453380B3C5AE2FC11373".getBytes(Charset.forName("UTF-16BE")));
            hlaobjectRoot.setUniqueId(id);

            hlaobjectRoot.register();
            hlaobjectRoot.update();

        } catch (Exception e) {
            fail(e.getMessage());

        }
    }


    @Test
    void testUUIDEncode() {
        try {
            UUIDStruct id1 = hlaobjectRoot.getUniqueId();
            id1.decode("0123456789012345".getBytes());
            UUIDStruct id2 = new UUIDStruct();
            id2.decode(id1.toByteArray());
            assertEquals(id1.toString(), id2.toString());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }


    @Test
    void testEncodeUuidAttributeEncode() {
        try {
            hlaobjectRoot.setCreateTime(42);
            UUIDStruct id = hlaobjectRoot.getUniqueId();
            id.decode("0123456789012345".getBytes());
            hlaobjectRoot.setUniqueId(id);
            AttributeHandleValueMap attributes = hlaobjectRoot.getAttributeValues();
            HLAobjectRoot receivingObject = new HLAobjectRoot();
            receivingObject.decode(attributes);
            assertEquals(hlaobjectRoot.getCreateTime(), receivingObject.getCreateTime());
            assertEquals(hlaobjectRoot.getUniqueId().toString(), receivingObject.getUniqueId().toString());
        } catch (Exception e) {
            fail(e.getMessage());

        }
}

}
