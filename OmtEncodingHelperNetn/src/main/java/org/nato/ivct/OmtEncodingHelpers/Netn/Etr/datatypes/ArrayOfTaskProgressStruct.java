package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariableArrayStruct;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.exceptions.RTIexception;
import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
 * 
 */
public class ArrayOfTaskProgressStruct extends HLAvariableArrayStruct<TaskProgress> {
  
    static DataElementFactory<TaskProgress> elementFactory = new DataElementFactory<TaskProgress>()
    {
        public TaskProgress createElement(int index) 
        {
            try {
                return new TaskProgress();
            } catch (RTIexception e) {
                e.printStackTrace();
                return null;
            }
        }            
    };    

    public ArrayOfTaskProgressStruct () throws RTIinternalError {
        super();
        value = encoderFactory.createHLAvariableArray(elementFactory); 
    }

}
