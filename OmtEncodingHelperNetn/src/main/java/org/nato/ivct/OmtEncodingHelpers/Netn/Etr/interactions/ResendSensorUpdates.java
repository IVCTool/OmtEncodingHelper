package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Smc.interactions.SMC_FederationControl;

import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

/*
    <interactionClass>
        <name>ResendSensorUpdates</name>
        <sharing>PublishSubscribe</sharing>
        <transportation>HLAreliable</transportation>
        <order>Receive</order>
        <semantics>Request all sensor services to resend their latest sensor updates.</semantics>
    </interactionClass>
 */
public class ResendSensorUpdates extends SMC_FederationControl {

    // no attributes
    public ResendSensorUpdates() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException {
        super();
    }

}
