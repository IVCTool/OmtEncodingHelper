package org.nato.ivct.OmtEncodingHelpers.RPR.interactions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.nato.ivct.OmtEncodingHelpers.Core.HLAroot;
import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Core.interactions.HLAmanager;
import org.nato.ivct.OmtEncodingHelpers.Core.interactions.HLAreportObjectClassSubscription;
import org.nato.ivct.OmtEncodingHelpers.RPR.RprFomFiles;

import hla.rti1516e.CallbackModel;
import hla.rti1516e.FederateAmbassador;
import hla.rti1516e.NullFederateAmbassador;
import hla.rti1516e.ParameterHandleValueMap;
import hla.rti1516e.RTIambassador;
import hla.rti1516e.ResignAction;
import hla.rti1516e.RtiFactory;
import hla.rti1516e.RtiFactoryFactory;
import hla.rti1516e.exceptions.*;

public class HLAmanagerTest {
    static RTIambassador rtiAmbassador = null;

    @BeforeAll
    static void createRtiAmbassador() throws ConnectionFailed, InvalidLocalSettingsDesignator, UnsupportedCallbackModel, AlreadyConnected, CallNotAllowedFromWithinCallback, RTIinternalError, InconsistentFDD, ErrorReadingFDD, CouldNotOpenFDD, NotConnected, CouldNotCreateLogicalTimeFactory, FederationExecutionDoesNotExist, SaveInProgress, RestoreInProgress, FederateAlreadyExecutionMember, FederateNameAlreadyInUse {
        RtiFactory rtiFactory = RtiFactoryFactory.getRtiFactory();
        rtiAmbassador = rtiFactory.getRtiAmbassador();
        FederateAmbassador nullAmbassador = new NullFederateAmbassador();
        URL[] fomList = new RprFomFiles()
            .addRPR_BASE()
            .addRPR_Enumerations()
            .addRPR_Foundation()
            .addRPR_Physical()
            .addRPR_Switches()
            .get();

        rtiAmbassador.connect(nullAmbassador, CallbackModel.HLA_IMMEDIATE);
        try {
            rtiAmbassador.createFederationExecution("TestFederation", fomList);
        } catch (FederationExecutionAlreadyExists ignored) { }
        rtiAmbassador.joinFederationExecution("HLAmanagerTest", "UnitTest", "TestFederation");
        HLAroot.initialize(rtiAmbassador);
    }

    @AfterAll
    static void leaveFederation() throws InvalidResignAction, OwnershipAcquisitionPending, FederateOwnsAttributes, FederateNotExecutionMember, NotConnected, CallNotAllowedFromWithinCallback, RTIinternalError, FederationExecutionDoesNotExist, FederateIsExecutionMember {
        rtiAmbassador.resignFederationExecution(ResignAction.DELETE_OBJECTS);
        try {
            rtiAmbassador.destroyFederationExecution("TestFederation");
        } catch (FederatesCurrentlyJoined ignored) { }
        rtiAmbassador.disconnect();
    }


    @Test
    void testGetHlaClassName() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError, OmtEncodingHelperException {
        HLAmanager manager = new HLAmanager();
        String name = manager.getHlaClassName();
        assertEquals(name, "HLAinteractionRoot.HLAmanager");
    }

    @Test
    void testHLAreportObjectClassSubscription() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError, OmtEncodingHelperException {
        HLAreportObjectClassSubscription report = new HLAreportObjectClassSubscription();
        ParameterHandleValueMap phvm = report.getParameterHandleValueMap();
        
    }
}
