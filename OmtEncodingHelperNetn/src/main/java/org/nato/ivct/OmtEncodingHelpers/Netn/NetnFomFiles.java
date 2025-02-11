package org.nato.ivct.OmtEncodingHelpers.Netn;

import org.nato.ivct.OmtEncodingHelpers.RPR.RprFomFiles;

public class NetnFomFiles extends RprFomFiles {

    protected static final String FOM_PATH = "/NETN-FOM-4.0/";

    public NetnFomFiles() {
        super();
    }

    public NetnFomFiles addNetnBase() {
        fomList.add(NetnFomFiles.class.getResource(FOM_PATH + "NETN-BASE.xml"));
        return this;
    }

    public NetnFomFiles addTmpNetnBase() {
        fomList.add(createTempFile(FOM_PATH + "NETN-BASE", ".xml"));
        return this;
    }

    public NetnFomFiles addNetnSmc() {
        fomList.add(NetnFomFiles.class.getResource(FOM_PATH + "NETN-SMC.xml"));
        return this;
    }
    
    public NetnFomFiles addTmpNetnSmc() {
        fomList.add(createTempFile(FOM_PATH + "NETN-SMC", ".xml"));
        return this;
    }
    
    public NetnFomFiles addNetnEtr() {
        fomList.add(NetnFomFiles.class.getResource(FOM_PATH + "NETN-ETR.xml"));
        return this;
    }
    
    public NetnFomFiles addTmpNetnEtr() {
        fomList.add(createTempFile(FOM_PATH + "NETN-ETR", ".xml"));
        return this;
    }
    
}
