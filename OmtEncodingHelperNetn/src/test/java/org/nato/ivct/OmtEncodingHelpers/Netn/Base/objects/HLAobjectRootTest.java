package org.nato.ivct.OmtEncodingHelpers.Netn.Base.objects;

import static org.junit.Assert.fail;

import java.net.URL;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.NetnFomFiles;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.EpochTimeStruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hla.rti1516e.CallbackModel;
import hla.rti1516e.FederateAmbassador;
import hla.rti1516e.NullFederateAmbassador;
import hla.rti1516e.RTIambassador;
import hla.rti1516e.ResignAction;
import hla.rti1516e.RtiFactory;
import hla.rti1516e.RtiFactoryFactory;
import hla.rti1516e.encoding.EncoderException;
import hla.rti1516e.exceptions.AlreadyConnected;
import hla.rti1516e.exceptions.CallNotAllowedFromWithinCallback;
import hla.rti1516e.exceptions.ConnectionFailed;
import hla.rti1516e.exceptions.CouldNotCreateLogicalTimeFactory;
import hla.rti1516e.exceptions.CouldNotOpenFDD;
import hla.rti1516e.exceptions.ErrorReadingFDD;
import hla.rti1516e.exceptions.FederateAlreadyExecutionMember;
import hla.rti1516e.exceptions.FederateIsExecutionMember;
import hla.rti1516e.exceptions.FederateNameAlreadyInUse;
import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.FederateOwnsAttributes;
import hla.rti1516e.exceptions.FederatesCurrentlyJoined;
import hla.rti1516e.exceptions.FederationExecutionAlreadyExists;
import hla.rti1516e.exceptions.FederationExecutionDoesNotExist;
import hla.rti1516e.exceptions.InconsistentFDD;
import hla.rti1516e.exceptions.InvalidLocalSettingsDesignator;
import hla.rti1516e.exceptions.InvalidObjectClassHandle;
import hla.rti1516e.exceptions.InvalidResignAction;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.OwnershipAcquisitionPending;
import hla.rti1516e.exceptions.RTIinternalError;
import hla.rti1516e.exceptions.RestoreInProgress;
import hla.rti1516e.exceptions.SaveInProgress;
import hla.rti1516e.exceptions.UnsupportedCallbackModel;

public class HLAobjectRootTest {

    private static HLAobjectRoot hlaobjectRoot;
    public static final Logger log = LoggerFactory.getLogger(HLAobjectRootTest.class);
    static RTIambassador rtiAmbassador = null;

    @BeforeAll
    static void createRtiAmbassador() throws ConnectionFailed, InvalidLocalSettingsDesignator, UnsupportedCallbackModel, AlreadyConnected, CallNotAllowedFromWithinCallback, RTIinternalError, InconsistentFDD, ErrorReadingFDD, CouldNotOpenFDD, NotConnected, CouldNotCreateLogicalTimeFactory, FederationExecutionDoesNotExist, SaveInProgress, RestoreInProgress, FederateAlreadyExecutionMember, FederateNameAlreadyInUse {
        RtiFactory rtiFactory = RtiFactoryFactory.getRtiFactory();
        rtiAmbassador = rtiFactory.getRtiAmbassador();
        FederateAmbassador nullAmbassador = new NullFederateAmbassador();
        URL[] fomList = new NetnFomFiles()
            .addNetnBase()
            .addRPR_BASE()
            .get();

        rtiAmbassador.connect(nullAmbassador, CallbackModel.HLA_IMMEDIATE);
        try {
            rtiAmbassador.createFederationExecution("TestFederation", fomList);
        } catch (FederationExecutionAlreadyExists ignored) { }
        rtiAmbassador.joinFederationExecution("NetnBaseEntityTest", "UnitTest", "TestFederation");
        HLAobjectRoot.initialize(rtiAmbassador);

        try {
            hlaobjectRoot = new HLAobjectRoot();
        } catch (NameNotFound | InvalidObjectClassHandle | FederateNotExecutionMember | NotConnected | RTIinternalError
                | EncoderException | OmtEncodingHelperException e) {
            e.printStackTrace();
            fail();
        }
    }

    @AfterAll
    static void leaveFederation() throws InvalidResignAction, OwnershipAcquisitionPending, FederateOwnsAttributes, FederateNotExecutionMember, NotConnected, CallNotAllowedFromWithinCallback, RTIinternalError, FederationExecutionDoesNotExist, FederateIsExecutionMember {
        rtiAmbassador.resignFederationExecution(ResignAction.DELETE_OBJECTS);
        try {
            rtiAmbassador.destroyFederationExecution("TestFederation");
        } catch (FederatesCurrentlyJoined ignored) {
            log.trace("leave federation open for remaining federates");
        }
        rtiAmbassador.disconnect();
    }

    

    @Test
    void testGetCreateTime() {
        EpochTimeStruct value;
        try {
            value = hlaobjectRoot.getCreateTime();
            value.setValue(1234);
            hlaobjectRoot.setCreateTime(value);
        } catch (NameNotFound | InvalidObjectClassHandle | FederateNotExecutionMember | NotConnected | RTIinternalError
                | EncoderException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    void testGetUniqueId() {

    }

    @Test
    void testSetCreateTime() {

    }

    @Test
    void testSetUniqueId() {

    }
}
