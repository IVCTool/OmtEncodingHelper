package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.HLAroot;

import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.HLAinteger32BE;

/*
            <enumeratedData>
                <name>MoveTypeEnum32</name>
                <representation>HLAinteger32BE</representation>
                <semantics>CrossCountry: move directly to the destination without considering the roads. 
OnlyRoads: stay on the roads to get to the closest point to the destination that is still on the road; 
RoadsAndCrossCountry: move to the destination by considering the roads; it is allowed to go off the road.</semantics>
                <enumerator>
                    <name>CrossCountry</name>
                    <value>0</value>
                </enumerator>
                <enumerator>
                    <name>OnlyRoads</name>
                    <value>1</value>
                </enumerator>
                <enumerator>
                    <name>RoadsAndCrossCountry</name>
                    <value>2</value>
                </enumerator>
            </enumeratedData>
 */
public enum MoveTypeEnum32 {
    CrossCountry(0),
    OnlyRoads(1),
    RoadsAndCrossCountry(2);
   private final HLAinteger32BE value;

    private MoveTypeEnum32(int value) {
        this.value = HLAroot.getEncoderFactory().createHLAinteger32BE(value);
    }

    synchronized public int getValue() {
        return value.getValue();
    }

    public HLAinteger32BE getDataElement() {
        return value;
    }
    public static MoveTypeEnum32 decode(byte[] bytes) throws DecoderException {
        HLAinteger32BE de = HLAroot.getEncoderFactory().createHLAinteger32BE();   
        de.decode(bytes);
        switch (de.getValue()) {
            case 0: return CrossCountry;
            case 1: return OnlyRoads;
            case 2: return RoadsAndCrossCountry;
            default: throw new IllegalArgumentException("Unknown value: " + de.getValue());
        } 
    }
}
