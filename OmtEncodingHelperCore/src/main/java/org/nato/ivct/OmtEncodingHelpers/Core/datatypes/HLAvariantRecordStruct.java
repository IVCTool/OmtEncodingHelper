/**    Copyright 2022, Reinhard Herzog (Fraunhofer IOSB)

Licensed under the Apache License, Version 2.0 (the "License")
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http: //www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. */

package org.nato.ivct.OmtEncodingHelpers.Core.datatypes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hla.rti1516e.RtiFactoryFactory;
import hla.rti1516e.encoding.ByteWrapper;
import hla.rti1516e.encoding.DataElement;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.EncoderFactory;
import hla.rti1516e.encoding.HLAvariantRecord;
import hla.rti1516e.exceptions.RTIinternalError;

public class HLAvariantRecordStruct<T extends DataElement> implements DataElement {
    public static final Logger log = LoggerFactory.getLogger(HLAvariantRecordStruct.class);

    protected T discriminant = null;
    protected DataElement dataElement = null;
    protected EncoderFactory encoderFactory;
    private HLAvariantRecord<T> decoder;

    public HLAvariantRecordStruct() throws RTIinternalError {
        encoderFactory = RtiFactoryFactory.getRtiFactory().getEncoderFactory();
    }
    
    public void setDecoder(HLAvariantRecord<T> d) {
        decoder = d;
    }

    public void setDecoder(T t, DataElement de) {
        decoder.setVariant(t, de);
        decoder.setDiscriminant(t);
    }

    public void setVariant(T aDiscriminant, DataElement aDataElement) {
        if (this.discriminant == null) {
            log.trace("setVariant(" + aDiscriminant + ", " + aDataElement.getClass() + ")"); 
        } else if (this.discriminant.equals(aDiscriminant)) {
            log.warn("setVariant(" + aDiscriminant + ", " + aDataElement.getClass() +") reset with (" + this.discriminant + ", " + aDataElement.getClass()); 
        } else {
            log.warn("setVariant(" + aDiscriminant + ", " + aDataElement.getClass() +") overwriting with (" + this.discriminant + ", " + aDataElement.getClass()); 
        }
        this.discriminant = aDiscriminant;
        this.dataElement = aDataElement;
        decoder.setDiscriminant(aDiscriminant);
    }

    public T getDiscriminant() {
        return decoder.getDiscriminant();
    }

    public DataElement getDecoderValue() {
        return decoder.getValue();
    }

    public DataElement getValue() {
        return this.dataElement;
    }

    public HLAvariantRecord<T> getDataElement() {
        if (discriminant != null) {
            decoder.setVariant(discriminant, dataElement);
            decoder.setDiscriminant(discriminant);
        }
        return decoder;
    }

    /**
     * Inherited methods from DataElement
     */

    @Override
    public int getOctetBoundary() {
        int ret = getDataElement().getOctetBoundary();
        log.trace("Octet Boundary: " + ret);
        return ret;
    }

    @Override
    public void encode(ByteWrapper byteWrapper) throws EncoderException {
        log.trace("encode(byte[] bytes)");        
        getDataElement().encode(byteWrapper);        
    }

    @Override
    public int getEncodedLength() {
        int ret = getDataElement().getEncodedLength();
        log.trace("getEncodedLength() " + ret);        
        return ret;
    }

    @Override
    public byte[] toByteArray() throws EncoderException {
        return getDataElement().toByteArray();
    }

    @Override
    public void decode(ByteWrapper byteWrapper) throws DecoderException {
        log.trace("decode(ByteWrapper byteWrapper)");      
        decoder.decode(byteWrapper);
    }

    @Override
    public void decode(byte[] bytes) throws DecoderException {
        log.trace("decode(byte[] bytes)");
        this.decode(new ByteWrapper(bytes));
    }

    public String toString() {
        return decoder.toString();
    }
}
