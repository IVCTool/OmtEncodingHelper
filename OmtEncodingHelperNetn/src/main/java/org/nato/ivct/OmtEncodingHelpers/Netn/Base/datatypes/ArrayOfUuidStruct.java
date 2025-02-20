package org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes;

import java.util.Iterator;

import hla.rti1516e.exceptions.RTIexception;
import hla.rti1516e.exceptions.RTIinternalError;
import hla.rti1516e.RtiFactoryFactory;
import hla.rti1516e.encoding.ByteWrapper;
import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.HLAvariableArray;

/**
 * An array of Unique Identifiers expressed as UUIDs.
 * 
 * <dataType>UUID</dataType>
 * <cardinality>Dynamic</cardinality>
 * <encoding>HLAvariableArray</encoding>
 * <semantics></semantics>
 */
public class ArrayOfUuidStruct implements HLAvariableArray<UUIDStruct> {

    private HLAvariableArray<UUIDStruct> value;

    static DataElementFactory<UUIDStruct> byteFactory = new DataElementFactory<UUIDStruct>()
    {
        public UUIDStruct createElement(int index) 
        {
            try {
                return new UUIDStruct();
            } catch (RTIexception e) {
                e.printStackTrace();
                return null;
            }
        }            
    };

    public ArrayOfUuidStruct() throws RTIinternalError {
        value = RtiFactoryFactory.getRtiFactory().getEncoderFactory().createHLAvariableArray(byteFactory);
    }
    
    @Override
    public int getOctetBoundary() {
        return value.getOctetBoundary();
    }

    @Override
    public int getEncodedLength() {
        return value.getEncodedLength();
    }

    @Override
    public byte[] toByteArray() {
        return value.toByteArray();
    }

    @Override
    public void encode(ByteWrapper byteWrapper) throws EncoderException {
        value.encode(byteWrapper);
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
    public void addElement(UUIDStruct dataElement) {
        value.addElement(dataElement);
    }

    @Override
    public int size() {
        return value.size();
    }

    @Override
    public UUIDStruct get(int index) {
        return value.get(index);
    }

    @Override
    public Iterator<UUIDStruct> iterator() {
        return value.iterator();
    }

    @Override
    public void resize(int newSize) {
        value.resize(newSize);
    }
    
}
