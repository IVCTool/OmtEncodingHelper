package org.nato.ivct.OmtEncodingHelpers.Core.datatypes;

import hla.rti1516e.encoding.HLAboolean;
import hla.rti1516e.encoding.HLAfixedRecord;
import hla.rti1516e.exceptions.RTIinternalError;

public class HLAinteractionSubscription extends HLAfixedRecordStruct {

    public enum AttributeName {
        HLAinteractionClass,
        HLAactive
    }

    public HLAinteractionSubscription() throws RTIinternalError {
        super();
        add(AttributeName.HLAinteractionClass.name(), new HLAhandle());
        add(AttributeName.HLAactive.name(), encoderFactory.createHLAboolean());
    }

    public HLAinteractionSubscription(HLAfixedRecord rec)  throws RTIinternalError {
        this();
        setHLAinteractionClass((HLAhandle)rec.get(0));
        setHLAactive((HLAboolean)rec.get(1));
    }

    public HLAhandle getHLAinteractionClass() {
        return (HLAhandle) get(AttributeName.HLAinteractionClass.name());
    }

    public void setHLAinteractionClass(HLAhandle handle) {
        set(AttributeName.HLAinteractionClass.name(), handle);
    }

    public HLAboolean getHLAactive() {
        return (HLAboolean)get(AttributeName.HLAactive.name());
    }

    public void setHLAactive(HLAboolean active) {
        set(AttributeName.HLAactive.name(), active);
    }
}
