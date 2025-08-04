package org.nato.ivct.OmtEncodingHelpers.Core.datatypes;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.exceptions.RTIinternalError;

public class HLAhandleList extends HLAvariableArrayStruct<HLAhandle> {

    DataElementFactory<HLAhandle> elementFactory = new DataElementFactory<HLAhandle>()
    {
        public HLAhandle createElement(int index) 
        {
            try {
                return new HLAhandle();
            } catch (RTIinternalError e) {
                e.printStackTrace();
                return null;
            }
        }            
    };

    public HLAhandleList() throws RTIinternalError {
        super();
        value = encoderFactory.createHLAvariableArray(elementFactory);
    }

}
