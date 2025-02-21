package org.nato.ivct.OmtEncodingHelpers.Core.datatypes;

import java.util.Iterator;

import hla.rti1516e.RtiFactoryFactory;
import hla.rti1516e.encoding.ByteWrapper;
import hla.rti1516e.encoding.DataElement;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.EncoderFactory;
import hla.rti1516e.encoding.HLAvariableArray;
import hla.rti1516e.exceptions.RTIinternalError;

public class HLAvariableArrayStruct<T extends DataElement> implements HLAvariableArray<T> {
    protected EncoderFactory encoderFactory;
    protected HLAvariableArray<T> value;

    public HLAvariableArrayStruct () throws RTIinternalError {
        encoderFactory = RtiFactoryFactory.getRtiFactory().getEncoderFactory();
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
    public void addElement(T dataElement) {
        value.addElement(dataElement);
    }

    @Override
    public int size() {
        return value.size();
    }

    @Override
    public T get(int index) {
        return value.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return value.iterator();
    }

    @Override
    public void resize(int newSize) {
        value.resize(newSize);
    }    
    

}
