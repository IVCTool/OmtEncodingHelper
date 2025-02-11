package org.nato.ivct.OmtEncodingHelpers.RPR.datatypes;

import org.junit.jupiter.api.Test;
import org.nato.ivct.OmtEncodingHelpers.RPR.Base.datatypes.WorldLocationStruct;

import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.exceptions.RTIinternalError;

public class WorldLocationStructTest {

    @Test
    void testEncodeDecode() throws RTIinternalError, DecoderException {
        WorldLocationStruct wl = new WorldLocationStruct();
        wl.setX(1.1);
        wl.setY(2.2);
        wl.setZ(3.3);

        byte[] bytes = wl.getDataElement().toByteArray();
        assert(bytes.length > 0);

        WorldLocationStruct wl2 = new WorldLocationStruct();
        wl2.decode(bytes);
        assert(wl2.getX() == 1.1);
        assert(wl2.getY() == 2.2);
        assert(wl2.getZ() == 3.3);
    }
}
