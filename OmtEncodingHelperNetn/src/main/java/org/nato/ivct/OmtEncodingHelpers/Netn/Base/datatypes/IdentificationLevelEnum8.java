package org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.HLAroot;

import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.HLAoctet;

/**
 * The identification level of an object.
 * 
 * <representation>HLAoctet</representation>
 * 
 */
public enum IdentificationLevelEnum8 {
    Lost((byte) 0),
    Detected((byte) 1),
    Classified((byte) 2),
    Identified((byte) 3),
    FullKnowledge((byte) 4);

    private HLAoctet value;

    private IdentificationLevelEnum8(byte value) {
        this.value = HLAroot.getEncoderFactory().createHLAoctet(value);
    }

    public static IdentificationLevelEnum8 decode(byte[] bytes) throws DecoderException {
        HLAoctet de = HLAroot.getEncoderFactory().createHLAoctet();
        de.decode(bytes);
        switch (de.getValue()) {
            case 0:
                return Lost;
            case 1:
                return Detected;
            case 2:
                return Classified;
            case 3:
                return Identified;
            case 4:
                return FullKnowledge;
            default:
                throw new IllegalArgumentException("Unknown value: " + de.getValue());
        }
    }

    public byte getValue() {
        return value.getValue();
    }
}
