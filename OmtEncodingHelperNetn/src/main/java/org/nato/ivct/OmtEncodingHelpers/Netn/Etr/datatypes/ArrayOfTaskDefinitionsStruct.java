package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariableArrayStruct;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.exceptions.RTIexception;
import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <arrayData>
                <name>ArrayOfTaskDefinitions</name>
                <dataType>TaskDefinition</dataType>
                <cardinality>Dynamic</cardinality>
                <encoding>HLAvariableArray</encoding>
                <semantics>Array containing task definitions.</semantics>
            </arrayData>

 */
public class ArrayOfTaskDefinitionsStruct extends HLAvariableArrayStruct<TaskDefinitionStruct> {

    static DataElementFactory<TaskDefinitionStruct> elementFactory = new DataElementFactory<TaskDefinitionStruct>()
    {
        public TaskDefinitionStruct createElement(int index) 
        {
            try {
                return new TaskDefinitionStruct();
            } catch (RTIexception e) {
                e.printStackTrace();
                return null;
            }
        }            
    };    

    public ArrayOfTaskDefinitionsStruct () throws RTIinternalError {
        super();
        value = encoderFactory.createHLAvariableArray(elementFactory); 
    }

}
