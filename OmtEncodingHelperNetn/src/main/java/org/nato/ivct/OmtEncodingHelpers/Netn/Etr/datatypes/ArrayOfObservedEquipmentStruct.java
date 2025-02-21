package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariableArrayStruct;
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
    
    public ArrayOfObservedEquipmentStruct () throws RTIinternalError {
        super();
    }    
    

}
