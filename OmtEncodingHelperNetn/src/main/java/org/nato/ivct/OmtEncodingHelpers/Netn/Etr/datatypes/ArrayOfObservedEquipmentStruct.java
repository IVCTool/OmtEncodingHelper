package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariableArrayStruct;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.exceptions.RTIexception;
import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <arrayData>
                <name>ArrayOfObservedEquipment</name>
                <dataType>ObservedEquipment</dataType>
                <cardinality>Dynamic</cardinality>
                <encoding>HLAvariableArray</encoding>
                <semantics>An array with spotted equipment at the spotted entity.</semantics>
            </arrayData>

 */
public class ArrayOfObservedEquipmentStruct extends HLAvariableArrayStruct<ObservedEquipmentStruct> {

    static DataElementFactory<ObservedEquipmentStruct> elementFactory = new DataElementFactory<ObservedEquipmentStruct>()
    {
        public ObservedEquipmentStruct createElement(int index) 
        {
            try {
                return new ObservedEquipmentStruct();
            } catch (RTIexception e) {
                e.printStackTrace();
                return null;
            }
        }            
    };    

    public ArrayOfObservedEquipmentStruct () throws RTIinternalError {
        super();
        value = encoderFactory.createHLAvariableArray(elementFactory); 
    }    
    

}
