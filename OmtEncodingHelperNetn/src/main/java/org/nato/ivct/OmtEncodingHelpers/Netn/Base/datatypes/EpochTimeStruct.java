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

 package org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes;

import hla.rti1516e.RtiFactoryFactory;
import hla.rti1516e.encoding.ByteWrapper;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.HLAinteger32BE;
import hla.rti1516e.exceptions.RTIinternalError;


/**
 * Helper Classes for NETN-BASE Datatypes
 * 
 * DEPRECATED: Use HLAinteger32BE instead
 */

@Deprecated
public class EpochTimeStruct implements HLAinteger32BE {

    HLAinteger32BE value;

    public EpochTimeStruct() throws RTIinternalError {
        value = RtiFactoryFactory.getRtiFactory().getEncoderFactory().createHLAinteger32BE();
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
    public int getValue() {
        return value.getValue();
    }

    @Override
    public void setValue(int i) {
        value.setValue(i);
    }

}
