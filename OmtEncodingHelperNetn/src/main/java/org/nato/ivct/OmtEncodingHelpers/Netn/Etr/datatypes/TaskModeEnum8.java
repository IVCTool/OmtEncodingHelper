package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.HLAroot;

import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.HLAoctet;

/**
 * Specifies if task execution is in non-concurrent or concurrent mode.
 * 
 * <representation>HLAoctet</representation>
 * 
 */
public enum TaskModeEnum8 {
    NonConcurrentMode((byte) 0),
    ConcurrentMode((byte) 1);

    private final HLAoctet value;

    private TaskModeEnum8(byte value) {
        this.value = HLAroot.getEncoderFactory().createHLAoctet(value);
    }

    public static TaskModeEnum8 decode (byte[] bytes) throws DecoderException {
        HLAoctet de = HLAroot.getEncoderFactory().createHLAoctet();
        de.decode(bytes);
        switch (de.getValue()) {
            case 0:
                return NonConcurrentMode;
            case 1:
                return ConcurrentMode;
            default:
                throw new IllegalArgumentException("Unknown value: " + de.getValue());
        }
    }

    public byte getValue() {
        return value.getValue();
    }

}
