package org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes;

import java.util.Iterator;

import org.nato.ivct.OmtEncodingHelpers.Core.HLAroot;

import hla.rti1516e.RtiFactoryFactory;
import hla.rti1516e.encoding.ByteWrapper;
import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.HLAbyte;
import hla.rti1516e.encoding.HLAfixedArray;
import hla.rti1516e.exceptions.RTIinternalError;


/**
 * RFC 4122, section 4.1.2 using 16 bytes. Also referred to as 
 * Variant 1 or RFC 4122/DCE 1.1 UUIDs. 
 * For example, 00112233-4455-8877-6699-aabbccddeeff is encoded 
 * as the bytes 00 11 22 33 44 55 88 77 66 99 aa bb cc dd ee ff.
 * 
 * <name>UUID</name>
 * <dataType>HLAbyte</dataType>
 * <cardinality>16</cardinality>
 * <encoding>HLAfixedArray</encoding>
 */
public class UUIDStruct implements HLAfixedArray<HLAbyte> {

    private HLAfixedArray<HLAbyte> value;
    
    static DataElementFactory<HLAbyte> byteFactory = new DataElementFactory<HLAbyte>()
    {
        public HLAbyte createElement(int index)
        {
            return HLAroot.getEncoderFactory().createHLAbyte();
        }            
    };

    public UUIDStruct () throws RTIinternalError {
        value = RtiFactoryFactory.getRtiFactory().getEncoderFactory().createHLAfixedArray(byteFactory, 16);
    }

    /**
     * Returns the value of this UUID as a String.
     */
    public String toString () {
        byte[] bytes = value.toByteArray();
        String result = new String();
        for (int i = 0; i < bytes.length; i++) {
            result += String.format("%02X", bytes[i]);
            if (i == 3 || i == 5 || i == 7 || i == 9) {
                result += "-";
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UUIDStruct other = (UUIDStruct) obj;
        return value.toString().equals(other.value.toString());        
    }


    @Override
    public int getOctetBoundary() {
        return value.getOctetBoundary();
    }

    @Override
    public void encode(ByteWrapper byteWrapper) throws EncoderException {
        value.encode(byteWrapper);
    }

    @Override
    public int getEncodedLength() {
        return value.getEncodedLength();
    }

    @Override
    public byte[] toByteArray() throws EncoderException {
        return value.toByteArray();
    }

    @Override
    public void decode(ByteWrapper byteWrapper) throws DecoderException {
        value.decode(byteWrapper);
    }

    @Override
    public void decode(byte[] bytes) throws DecoderException {
        value.decode(bytes);
    }

    @Override
    public int size() {
        return value.size();
    }

    @Override
    public HLAbyte get(int index) {
        return value.get(index);
    }

    @Override
    public Iterator<HLAbyte> iterator() {
        return value.iterator();
    }

}
