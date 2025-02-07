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

package org.nato.ivct.OmtEncodingHelpers.Core;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import hla.rti1516e.encoding.EncoderFactory;
import hla.rti1516e.exceptions.RTIinternalError;

public class HLArootTest {


    @Test
    public void testGetRtiAmbassador() throws OmtEncodingHelperException {
        try {
            HLAroot.initialize(null);
            assertEquals(null, HLAroot.getRtiAmbassador());
        } catch (OmtEncodingHelperException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testGetRtiAmbassadorNotInitialized() {
        HLAroot.rtiAmbassador = null;
        Exception exception = assertThrows(OmtEncodingHelperException.class, () -> {
            HLAroot.getRtiAmbassador();
        });
        assertEquals("RPR Builder not initialized", exception.getMessage());
    }

    @Test
    public void testGetEncoderFactory() throws RTIinternalError {
        HLAroot.encoderFactory = null;
        EncoderFactory encoderFactory = HLAroot.getEncoderFactory();
        assertNotNull(encoderFactory);
    }

    @Test
    public void testGetHlaClassName() {
        HLAroot hlaRoot = new HLAroot();
        String className = hlaRoot.getHlaClassName("HLAroot");
        assertEquals("HLAroot", className);
    }

    @Test
    public void testGetHlaClassNameWithHierarchy() {
        class HLAchild extends HLAroot {}
        HLAchild hlaChild = new HLAchild();
        String className = hlaChild.getHlaClassName("HLAroot");
        assertEquals("HLAroot.HLAchild", className);
    }
}
