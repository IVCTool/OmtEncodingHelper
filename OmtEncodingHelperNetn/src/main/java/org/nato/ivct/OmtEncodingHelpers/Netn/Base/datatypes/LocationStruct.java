package org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.encoding.HLAfloat64BE;
import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
    <fixedRecordData>
        <name>LocationStruct</name>
        <encoding>HLAfixedRecord</encoding>
        <semantics>The location of a point in space. Unless specified otherwise for the attribute, parameter, or datatype field using this datatype, the location is in the world coordinate system, as specified in IEEE Std 1278.1-2012 section 1.6.3.</semantics>
        <field>
            <name>X</name>
            <dataType>MeterFloat64</dataType>
            <semantics>Distance from the origin along the X axis.</semantics>
        </field>
        <field>
            <name>Y</name>
            <dataType>MeterFloat64</dataType>
            <semantics>Distance from the origin along the Y axis.</semantics>
        </field>
        <field>
            <name>Z</name>
            <dataType>MeterFloat64</dataType>
            <semantics>Distance from the origin along the Z axis.</semantics>
        </field>
    </fixedRecordData>
 */
public class LocationStruct extends HLAfixedRecordStruct {
    
    enum AttributeName {
        X,
        Y,
        Z
    }

    public LocationStruct () throws RTIinternalError {
        super();
        add(AttributeName.X.name(), encoderFactory.createHLAfloat64BE());
        add(AttributeName.Y.name(), encoderFactory.createHLAfloat64BE());
        add(AttributeName.Z.name(), encoderFactory.createHLAfloat64BE());
    }    
    
    // getter and setter
    
    public double getX() {
        return ((HLAfloat64BE) get(AttributeName.X.name())).getValue();
    }
    public void setX(double x) {
        ((HLAfloat64BE) get(AttributeName.X.name())).setValue(x);
    }
    
    public double getY() {
        return ((HLAfloat64BE) get(AttributeName.Y.name())).getValue();
    }
    public void setY(double y) {
        ((HLAfloat64BE) get(AttributeName.Y.name())).setValue(y);
    }
    
    public double getZ() {
        return ((HLAfloat64BE) get(AttributeName.Z.name())).getValue();
    }
    public void setZ(double z) {
        ((HLAfloat64BE) get(AttributeName.Z.name())).setValue(z);
    }

}
