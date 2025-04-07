package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariableArrayStruct;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.exceptions.RTIexception;
import hla.rti1516e.exceptions.RTIinternalError;

public class ArrayOfTrack extends HLAvariableArrayStruct<TrackStruct> {

    static DataElementFactory<TrackStruct> elementFactory = new DataElementFactory<TrackStruct>()
    {
        public TrackStruct createElement(int index) 
        {
            try {
                return new TrackStruct();
            } catch (RTIexception e) {
                e.printStackTrace();
                return null;
            }
        }            
    };    

    public ArrayOfTrack() throws RTIinternalError {
        super();
        value = encoderFactory.createHLAvariableArray(elementFactory);        
    }

}
