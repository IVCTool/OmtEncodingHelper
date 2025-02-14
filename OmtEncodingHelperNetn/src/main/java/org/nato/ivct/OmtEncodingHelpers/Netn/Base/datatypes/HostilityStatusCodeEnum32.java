package org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.HLAroot;

import hla.rti1516e.encoding.DataElement;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.HLAinteger32BE;

/**
 * The value represents the perceived hostility status.
 */
public enum HostilityStatusCodeEnum32 {
    AFR(0),
    AHO(1),
    AIV(2),
    ANT(3),
    FAKER(4),
    FR(5),
    HO(6),
    IV(7),
    JOKER(8),
    NEUTRL(9),
    PENDNG(10),
    SUSPCT(11),
    UNK(12);


    private final HLAinteger32BE value;

    private HostilityStatusCodeEnum32 (int value) {
        this.value = HLAroot.getEncoderFactory().createHLAinteger32BE(value);
    }

    public static HostilityStatusCodeEnum32 decode(byte[] bytes) throws DecoderException  {
        HLAinteger32BE de = HLAroot.getEncoderFactory().createHLAinteger32BE();
        de.decode(bytes);
        switch (de.getValue()) {
            case 0: return AFR;
            case 1: return AHO;
            case 2: return AIV;
            case 3: return ANT;
            case 4: return FAKER;
            case 5: return FR;
            case 6: return HO;
            case 7: return IV;
            case 8: return JOKER;
            case 9: return NEUTRL;
            case 10: return PENDNG;
            case 11: return SUSPCT;
            case 12: return UNK;
            default: throw new IllegalArgumentException("Unknown value: " + de.getValue());
        }
    }

    public int getValue() {
        return value.getValue();
    }

    public DataElement getDataElement() {
        return value;
    }
}

