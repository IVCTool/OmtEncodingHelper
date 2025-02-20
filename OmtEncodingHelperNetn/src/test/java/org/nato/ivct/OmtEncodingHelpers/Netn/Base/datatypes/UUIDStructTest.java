package org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes;

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
            id.decode("0123456789012345".getBytes());
            hlaobjectRoot.setUniqueId(id);

            hlaobjectRoot.register();
            hlaobjectRoot.update();

        } catch (Exception e) {
            fail(e.getMessage());

        }
    }

    @Test
    void testEncode() {
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
