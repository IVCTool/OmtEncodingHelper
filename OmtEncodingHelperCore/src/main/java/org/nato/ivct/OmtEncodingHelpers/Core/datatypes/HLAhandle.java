package org.nato.ivct.OmtEncodingHelpers.Core.datatypes;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.encoding.HLAbyte;
import hla.rti1516e.exceptions.RTIinternalError;

public class HLAhandle extends HLAvariableArrayStruct<HLAbyte> {

    DataElementFactory<HLAbyte> elementFactory = new DataElementFactory<HLAbyte>()
    {
        public HLAbyte createElement(int index) 
        {
            return encoderFactory.createHLAbyte();
        }            
    };

    public HLAhandle() throws RTIinternalError {
        super();
        value = encoderFactory.createHLAvariableArray(elementFactory);
    }

}
