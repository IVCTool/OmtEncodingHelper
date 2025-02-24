package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>EmptyTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>No task parameters.</semantics>
            </fixedRecordData>

 */
public class EmptyTaskStruct extends HLAfixedRecordStruct{

    public EmptyTaskStruct() throws RTIinternalError {
        super();
    }

}
