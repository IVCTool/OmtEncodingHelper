/**    Copyright 2025, Reinhard Herzog (Fraunhofer IOSB)

Licensed under the Apache License, Version 2.0 (the "License")
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http: //www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. */

package org.nato.ivct.OmtEncodingHelpers.Netn.Base.objects;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;

import hla.rti1516e.encoding.DataElementFactory;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.encoding.HLAbyte;
import hla.rti1516e.encoding.HLAinteger32BE;
import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.InvalidObjectClassHandle;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

/**
 * NETN-BASE Extension to HLAobjectRoot
 * 
 * Attributes
 * - CreateTime (Datatype EpochTime) [Optional]: 
 *   The time in the scenario when the object is created.
 * - UniqueId	(Datatype UUID)[Required]: 
 *   A unique identifier for the object. The Universally Unique Identifier (UUID)
 *   is generated or pre-defined.
 * 
 */
public class HLAobjectRoot extends org.nato.ivct.OmtEncodingHelpers.Core.objects.HLAobjectRoot {

    public enum AttributeName {
        CreateTime,
        UniqueId
    }
    DataElementFactory<HLAbyte> byteFactory;

    /**
     * HLAobjectRoot constructor extension for NETN-BASE
     * 
     * @throws OmtEncodingHelperException
     * @throws NameNotFound
     * @throws InvalidObjectClassHandle
     * @throws FederateNotExecutionMember
     * @throws NotConnected
     * @throws RTIinternalError
     * @throws EncoderException
     */
    public HLAobjectRoot() throws OmtEncodingHelperException, NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        super();
        // initialize the attributes and ignore the return values
        getCreateTime();
        getUniqueId();
    }

    /* publish and subscribe helper methods */

    public void publishCreateTime() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError {
        addPubAttribute(HLAobjectRoot.AttributeName.CreateTime.name());
    }

    public void subscribeCreateTime() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError {
        addSubAttribute(HLAobjectRoot.AttributeName.CreateTime.name());
    }

    public void publishUniqueId() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError {
        addPubAttribute(HLAobjectRoot.AttributeName.UniqueId.name());
    }

    public void subscribeUniqueId() throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError {
        addSubAttribute(HLAobjectRoot.AttributeName.UniqueId.name());
    }
    

    /* Getter and Setter methods */

    private HLAinteger32BE getDataElementCreateTime () throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        HLAinteger32BE holder = (HLAinteger32BE) getAttribute(AttributeName.CreateTime.name());
        if (holder == null) {
            holder = encoderFactory.createHLAinteger32BE();
            setAttributeValue(AttributeName.CreateTime.name(), holder);            
        }
        return holder;
    }
    public void setCreateTime (int createTime) throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        HLAinteger32BE holder = getDataElementCreateTime();
        holder.setValue(createTime);
        setAttributeValue(AttributeName.CreateTime.name(), holder);
    }
    public int getCreateTime () throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        HLAinteger32BE holder = getDataElementCreateTime();
        return holder.getValue();
    }

    public UUIDStruct getUniqueId () throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        UUIDStruct holder = (UUIDStruct) getAttribute(AttributeName.UniqueId.name());
        if (holder == null) {
            holder = new UUIDStruct();
            setAttributeValue(AttributeName.UniqueId.name(), holder);
        }
        return holder;
    }
    public void setUniqueId (UUIDStruct uniqueId) throws NameNotFound, InvalidObjectClassHandle, FederateNotExecutionMember, NotConnected, RTIinternalError, EncoderException {
        setAttributeValue(AttributeName.UniqueId.name(), uniqueId);
    }

}
