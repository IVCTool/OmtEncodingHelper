package org.nato.ivct.OmtEncodingHelpers.Netn.Smc.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Core.interactions.HLAinteractionRoot;

import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

/*
    <interactionClass>
        <name>SMC_FederationControl</name>
        <sharing>Neither</sharing>
        <transportation>HLAreliable</transportation>
        <order>Receive</order>
        <semantics>Base class for all control actions applicable to all federates in the federation. The inherited NETN-BASE `UniqueId` parameter is used to match this interaction with a corresponding `SMC_Response`.</semantics>
    </interactionClass>
 */
public class SMC_FederationControl extends HLAinteractionRoot{

    // no attributes
    public SMC_FederationControl() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException {
        super();
    }

}
