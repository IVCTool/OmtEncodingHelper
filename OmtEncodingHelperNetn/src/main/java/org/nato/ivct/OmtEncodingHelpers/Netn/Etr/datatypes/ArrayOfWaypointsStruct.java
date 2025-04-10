package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariableArrayStruct;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.exceptions.RTIexception;
import hla.rti1516e.exceptions.RTIinternalError;

public class ArrayOfWaypointsStruct extends HLAvariableArrayStruct<WaypointStruct> {

    static DataElementFactory<WaypointStruct> waypointFactory = new DataElementFactory<WaypointStruct>()
    {
        public WaypointStruct createElement(int index) 
        {
            try {
                return new WaypointStruct();
            } catch (RTIexception e) {
                e.printStackTrace();
                return null;
            }
        }            
    };

    public ArrayOfWaypointsStruct() throws RTIinternalError {
        super();
        value = encoderFactory.createHLAvariableArray(waypointFactory);
    }

}
