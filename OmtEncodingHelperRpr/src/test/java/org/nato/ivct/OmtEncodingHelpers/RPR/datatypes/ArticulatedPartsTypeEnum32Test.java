package org.nato.ivct.OmtEncodingHelpers.RPR.datatypes;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ArticulatedPartsTypeEnum32Test {
    @Test
    void testGetValue() {

        assertEquals(0, ArticulatedPartsTypeEnum32.Other.getValue());
        assertEquals(1024, ArticulatedPartsTypeEnum32.Rudder.getValue());
        assertEquals(1056, ArticulatedPartsTypeEnum32.LeftFlap.getValue());
        assertEquals(1088, ArticulatedPartsTypeEnum32.RightFlap.getValue());
        assertEquals(1120, ArticulatedPartsTypeEnum32.LeftAileron.getValue());

        // RightAileron(1152),
        // HelicopterMainRotor(1184),
        // HelicopterTailRotor(1216),
        // OtherAircraftControlSurfaces(1248),
        // PropellerNumber1(1280),    
        // PropellerNumber2(1312),
        // PropellerNumber3(1344),
        // PropellerNumber4(1376),
        // LeftStabilator_StabilatorNumber1_(1408),
        // RightStabilator_StabilatorNumber2_(1440);


    }
}
