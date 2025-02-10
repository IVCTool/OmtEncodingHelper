package org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes;

import hla.rti1516e.encoding.HLAbyte;
import hla.rti1516e.encoding.HLAfixedArray;


/**
 *             <arrayData>
                <name>UUID</name>
                <dataType>HLAbyte</dataType>
                <cardinality>16</cardinality>
                <encoding>HLAfixedArray</encoding>
                <semantics>RFC 4122, section 4.1.2 using 16 bytes. Also referred to as Variant 1 or RFC 4122/DCE 1.1 UUIDs. 
 
For example, 00112233-4455-8877-6699-aabbccddeeff is encoded as the bytes 00 11 22 33 44 55 88 77 66 99 aa bb cc dd ee ff.</semantics>
            </arrayData>
            
 */
public interface UUIDStruct extends HLAfixedArray<HLAbyte> {

}
