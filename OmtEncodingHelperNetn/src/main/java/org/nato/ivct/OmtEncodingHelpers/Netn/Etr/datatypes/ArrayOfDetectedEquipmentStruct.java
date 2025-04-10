package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariableArrayStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.LocationStruct;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.exceptions.RTIexception;
import hla.rti1516e.exceptions.RTIinternalError;

public class ArrayOfDetectedEquipmentStruct extends HLAvariableArrayStruct<DetectedEquipmentStruct> {

    static DataElementFactory<DetectedEquipmentStruct> elementFactory = new DataElementFactory<DetectedEquipmentStruct>()
    {
        public DetectedEquipmentStruct createElement(int index) 
        {
            try {
                return new DetectedEquipmentStruct();
            } catch (RTIexception e) {
                e.printStackTrace();
                return null;
            }
        }            
    };

    public ArrayOfDetectedEquipmentStruct() throws RTIinternalError {
        super();
        value = encoderFactory.createHLAvariableArray(elementFactory);
    }

}
