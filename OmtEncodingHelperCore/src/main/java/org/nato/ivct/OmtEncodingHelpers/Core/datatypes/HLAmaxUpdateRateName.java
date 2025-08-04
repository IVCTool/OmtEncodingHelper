package org.nato.ivct.OmtEncodingHelpers.Core.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.HLAroot;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.encoding.HLAbyte;
import hla.rti1516e.exceptions.RTIinternalError;

public class HLAmaxUpdateRateName extends HLAvariableArrayStruct<HLAbyte> {

    DataElementFactory<HLAbyte> byteFactory = new DataElementFactory<HLAbyte>()
    {
        public HLAbyte createElement(int index)
        {
            return HLAroot.getEncoderFactory().createHLAbyte();
        }
    };

    public HLAmaxUpdateRateName() throws RTIinternalError {
        super();
        value = HLAroot.getEncoderFactory().createHLAvariableArray(byteFactory);
    }

}
