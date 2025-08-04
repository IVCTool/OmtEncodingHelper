package org.nato.ivct.OmtEncodingHelpers.Core.datatypes;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.exceptions.RTIinternalError;

public class HLAinteractionSubList extends HLAvariableArrayStruct<HLAinteractionSubscription> {
    
    DataElementFactory<HLAinteractionSubscription> elementFactory = new DataElementFactory<HLAinteractionSubscription>()
    {
        public HLAinteractionSubscription createElement(int index) 
        {
            try {
                return new HLAinteractionSubscription();
            } catch (RTIinternalError e) {
                e.printStackTrace();
                return null;
            }
        }            
    };

    public HLAinteractionSubList() throws RTIinternalError {
        super();
        value = encoderFactory.createHLAvariableArray(elementFactory);
    }

}
