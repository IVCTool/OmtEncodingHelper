package org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariableArrayStruct;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.encoding.HLAunicodeChar;
import hla.rti1516e.exceptions.RTIinternalError;

public class CallSignStruct extends HLAvariableArrayStruct<HLAunicodeChar> {

    DataElementFactory<HLAunicodeChar> elementFactory = new DataElementFactory<HLAunicodeChar>()
    {
        public HLAunicodeChar createElement(int index) 
        {
            return encoderFactory.createHLAunicodeChar();
        }            
    };

    public CallSignStruct() throws RTIinternalError {
        super();
        value = encoderFactory.createHLAvariableArray(elementFactory);
    }


}
