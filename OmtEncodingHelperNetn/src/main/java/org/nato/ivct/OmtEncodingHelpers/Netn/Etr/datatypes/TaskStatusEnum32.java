package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.HLAroot;

import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.HLAinteger32BE;

/**
 * The status of a task.
 * 
 * <representation>HLAinteger32BE</representation>
 * 
 */
public enum TaskStatusEnum32 {
    Accepted(0),
    Refused(1),
    Cancelled(2),
    Executing(3),
    Completed(4),
    Error(5);

    private  final HLAinteger32BE value;

    private TaskStatusEnum32(int value) {
        this.value = HLAroot.getEncoderFactory().createHLAinteger32BE(value);
    }

    synchronized public int getValue() {
        return value.getValue();
    }

    public HLAinteger32BE getDataElement() {
        return value;
    }

    public static TaskStatusEnum32 decode(byte[] bytes) throws DecoderException {
        HLAinteger32BE de = HLAroot.getEncoderFactory().createHLAinteger32BE();
        de.decode(bytes);
        switch (de.getValue()) {
            case 0: return Accepted;
            case 1: return Refused;
            case 2: return Cancelled;
            case 3: return Executing;
            case 4: return Completed;
            case 5: return Error;
            default: throw new IllegalArgumentException("Unknown value: " + de.getValue());
        }
    }
}
