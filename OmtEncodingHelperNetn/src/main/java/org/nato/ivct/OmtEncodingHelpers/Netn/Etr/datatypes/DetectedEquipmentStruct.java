package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;
import org.nato.ivct.OmtEncodingHelpers.RPR.Base.datatypes.EntityTypeStruct;

import hla.rti1516e.encoding.HLAinteger32BE;
import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>DetectedEquipment</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Equipment at the spotted entity.</semantics>
                <field>
                    <name>Type</name>
                    <dataType>EntityTypeStruct</dataType>
                    <semantics>Use entity types from Supply Types, Expendibles or Sensors/Emitters tables  (SISO-REF-010-2010, 4.3), 
for aggregate entities, also use entity types from platform tables to describe the equipment type.</semantics>
                </field>
                <field>
                    <name>NumberOfEquipment</name>
                    <dataType>QuantityInt32</dataType>
                    <semantics>The number of the equipment.</semantics>
                </field>
            </fixedRecordData>

 */
public class DetectedEquipmentStruct extends HLAfixedRecordStruct {
    
    enum AttributeName {
        Type,
        NumberOfEquipment
    }

    public DetectedEquipmentStruct () throws RTIinternalError {
        super();
        add(AttributeName.Type.name(), new EntityTypeStruct());
        add(AttributeName.NumberOfEquipment.name(), encoderFactory.createHLAinteger32BE());
    }    
    
    // getter and setter
    
    public EntityTypeStruct getType() {
        return (EntityTypeStruct) get(AttributeName.Type.name());
    }
    public void setType(EntityTypeStruct type) {
        set(AttributeName.Type.name(), type);
    }
    
    public int getNumberOfEquipment() {
        return ((HLAinteger32BE) get(AttributeName.NumberOfEquipment.name())).getValue();
    }
    public void setNumberOfEquipment(int numberOfEquipment) {
        ((HLAinteger32BE) get(AttributeName.NumberOfEquipment.name())).setValue(numberOfEquipment);
    }

}
