package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariableArrayStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.LocationStruct;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.exceptions.RTIexception;
import hla.rti1516e.exceptions.RTIinternalError;

public class ArrayOfLocationStruct extends HLAvariableArrayStruct<LocationStruct> {

    static DataElementFactory<LocationStruct> elementFactory = new DataElementFactory<LocationStruct>()
    {
        public LocationStruct createElement(int index) 
        {
            try {
                return new LocationStruct();
            } catch (RTIexception e) {
                e.printStackTrace();
                return null;
            }
        }            
    };

    public ArrayOfLocationStruct() throws RTIinternalError {
        super();
        value = encoderFactory.createHLAvariableArray(elementFactory);        
    }

}
