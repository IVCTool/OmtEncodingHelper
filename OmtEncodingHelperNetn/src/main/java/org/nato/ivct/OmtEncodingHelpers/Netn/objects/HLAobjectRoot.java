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

package org.nato.ivct.OmtEncodingHelpers.Netn.objects;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Core.objects.HLAobjectRoot;

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

    public enum Attributes {
        CreateTime,
        UniqueId
    }
    
    public HLAobjectRoot() throws OmtEncodingHelperException {
        super();
        getCreateTime();
        getUniqueId();
    }

    public EpochTimeStruct getCreateTime () {
        EpochTimeStruct aEntityType = (EpochTimeStruct) getAttribute(Attributes.CreateTime.name());
        if (aEntityType == null) {
            aEntityType = new EpochTimeStruct();
            setAttribute(Attributes.CreateTime.name(), aEntityType);
        }
        return aEntityType;
    }

    public UniqueIdStruct getUniqueId () {
        UniqueIdStruct aEntityIdentifier = (UniqueIdStruct) getAttribute(Attributes.UniqueId.name());
        if (aEntityIdentifier == null) {
            aEntityIdentifier = new UUIDStruct();
            setAttribute(Attributes.UniqueId.name(), aEntityIdentifier);
        }
        return aEntityIdentifier;
    }
}
