package org.nato.ivct.OmtEncodingHelpers.Netn;

import java.io.IOException;

import org.nato.ivct.OmtEncodingHelpers.RPR.RprFomFiles;

public class NetnFomFiles extends RprFomFiles {

    protected static final String FOM_PATH = "NETN-FOM-4.0/";

    public NetnFomFiles() {
        super();
    }

    public NetnFomFiles addNetnBase() {
        fomList.add(NetnFomFiles.class.getResource("/" + FOM_PATH + "NETN-BASE.xml"));
        return this;
    }

    public NetnFomFiles addTmpNetnBase() throws IOException {
        fomList.add(createTempFile(FOM_PATH + "NETN-BASE", ".xml"));
        return this;
    }

    public NetnFomFiles addNetnSmc() {
        fomList.add(NetnFomFiles.class.getResource("/" + FOM_PATH + "NETN-SMC.xml"));
        return this;
    }
    
    public NetnFomFiles addTmpNetnSmc() throws IOException {
        fomList.add(createTempFile(FOM_PATH + "NETN-SMC", ".xml"));
        return this;
    }
    
    public NetnFomFiles addNetnEtr() {
        fomList.add(NetnFomFiles.class.getResource("/" + FOM_PATH + "NETN-ETR.xml"));
        return this;
    }
    
    public NetnFomFiles addTmpNetnEtr() throws IOException {
        fomList.add(createTempFile(FOM_PATH + "NETN-ETR", ".xml"));
        return this;
    }
    
}
