package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAvariableArrayStruct;

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
    
    public ArrayOfTaskDefinitionsStruct () throws RTIinternalError {
        super();
    }

}
