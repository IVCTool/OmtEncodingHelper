/**
 * Copyright 2025, Reinhard Herzog (Fraunhofer IOSB)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http: //www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License. 
 */

 package org.nato.ivct.OmtEncodingHelpers.Netn.Smc.datatypes;

import java.util.Iterator;

import org.nato.ivct.OmtEncodingHelpers.Core.HLAroot;

import hla.rti1516e.RtiFactoryFactory;
import hla.rti1516e.encoding.ByteWrapper;
import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.HLAinteger32BE;
import hla.rti1516e.encoding.HLAvariableArray;
import hla.rti1516e.exceptions.RTIinternalError;

public class EntityControlActionsStruct implements HLAvariableArray<HLAinteger32BE> {
    private HLAvariableArray<HLAinteger32BE> value;

    public EntityControlActionsStruct() throws RTIinternalError {
        DataElementFactory<HLAinteger32BE> byteFactory = new DataElementFactory<HLAinteger32BE>()
        {
            public HLAinteger32BE createElement(int index)
            {
                return HLAroot.getEncoderFactory().createHLAinteger32BE();
            }
        };
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
    public void addElement(HLAinteger32BE dataElement) {
        value.addElement(dataElement);
    }

    @Override
    public int size() {
        return value.size();
    }

    @Override
    public HLAinteger32BE get(int index) {
        return value.get(index);
    }

    @Override
    public Iterator<HLAinteger32BE> iterator() {
        return value.iterator();
    }

    @Override
    public void resize(int newSize) {
        value.resize(newSize);
    }
    
}
