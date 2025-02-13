package org.nato.ivct.OmtEncodingHelpers.Netn;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.net.URL;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class NetnFomFilesTest {

    private NetnFomFiles netnFomFiles;

    @Test
    public void testAddNetnBase() {
        netnFomFiles = new NetnFomFiles();
        netnFomFiles.addNetnBase();
        URL[] fomList = netnFomFiles.get();
        assertTrue(fomList[0].toString().endsWith("NETN-BASE.xml"));
        assertTrue(fomList.length > 0);
    }

    @Test
    public void testAddNetnSmc() {
        netnFomFiles = new NetnFomFiles();
        netnFomFiles.addNetnSmc();
        URL[] fomList = netnFomFiles.get();
        assertTrue(fomList[0].toString().endsWith("NETN-SMC.xml"));
        assertTrue(fomList.length > 0);
    }

    @Test
    public void testAddNetnEtr() {
        netnFomFiles = new NetnFomFiles();
        netnFomFiles.addNetnEtr();
        URL[] fomList = netnFomFiles.get();
        assertTrue(fomList[0].toString().endsWith("NETN-ETR.xml"));
        assertTrue(fomList.length > 0);
    }

    @Test
    public void testAddNetnAll() {
        netnFomFiles = new NetnFomFiles();
        netnFomFiles.addNetnBase().addNetnSmc().addNetnEtr();
        URL[] fomList = netnFomFiles.get();
        assertTrue(fomList[0].toString().endsWith("NETN-BASE.xml"));
        assertTrue(fomList[1].toString().endsWith("NETN-SMC.xml"));
        assertTrue(fomList[2].toString().endsWith("NETN-ETR.xml"));
        netnFomFiles.addRPR_BASE().addRPR_Enumerations().get();
        URL[] fomList2 = netnFomFiles.get();
        assertTrue(fomList2[3].toString().endsWith("RPR-Base_v2.0.xml"));
        assertTrue(fomList2[4].toString().endsWith("RPR-Enumerations_v2.0.xml"));
    }

    
}