package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.encoding.HLAinteger64BE;
import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>OtherActivityTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for this task.</semantics>
                <field>
                    <name>Duration</name>
                    <dataType>TimeMillisecondInt64</dataType>
                    <semantics>Specifies the time (milliseconds in the scenario) to perform the activity.</semantics>
                </field>
            </fixedRecordData>

 */
public class OtherActivityTaskStruct extends HLAfixedRecordStruct {
    
    enum AttributeName {
        Duration
    }

    public OtherActivityTaskStruct () throws RTIinternalError {
        super();
        add(AttributeName.Duration.name(), encoderFactory.createHLAinteger64BE());
    }    
    
    // getter and setter
    
    public long getDuration() {
        return ((HLAinteger64BE) get(AttributeName.Duration.name())).getValue();
    }
    public void setDuration(long duration) {
        ((HLAinteger64BE) get(AttributeName.Duration.name())).setValue(duration);
    }

}
