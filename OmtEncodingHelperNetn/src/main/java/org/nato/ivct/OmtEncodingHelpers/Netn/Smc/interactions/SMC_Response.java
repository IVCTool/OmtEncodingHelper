package org.nato.ivct.OmtEncodingHelpers.Netn.Smc.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Core.interactions.HLAinteractionRoot;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;

import hla.rti1516e.encoding.HLAboolean;
import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

/*
    <interactionClass>
        <name>SMC_Response</name>
        <sharing>PublishSubscribe</sharing>
        <transportation>HLAreliable</transportation>
        <order>Receive</order>
        <semantics>The response indicates whether the related action was accepted or rejected/failed by a federate. A single response per sent action is expected.</semantics>
        <parameter>
            <name>Action</name>
            <dataType>UUID</dataType>
            <semantics>Required: Reference to the control action this is a response to. The reference corresponds to the NETN-BASE `UniqueId` parameter of the control action interaction.</semantics>
        </parameter>
        <parameter>
            <name>Status</name>
            <dataType>HLAboolean</dataType>
            <semantics>Required: Indicates success or failure of a corresponding control action.</semantics>
        </parameter>
    </interactionClass>
 */
public class SMC_Response extends HLAinteractionRoot {
    public enum AttributeName {
        Action,
        Status
    }

    public SMC_Response() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException {
        super();
        addParameter(AttributeName.Action.name(), new UUIDStruct());
        addParameter(AttributeName.Status.name(), encoderFactory.createHLAboolean());
    }

    public UUIDStruct getAction() {
        return (UUIDStruct) getParameter(AttributeName.Action.name());
    }
    public void setAction(UUIDStruct action) {
        setParameter(AttributeName.Action.name(), action.toByteArray());
    }

    public boolean getStatus() {
        HLAboolean value = (HLAboolean) getParameter(AttributeName.Status.name());
        return value.getValue();
    }
    public void setStatus(boolean status) {
        setParameter(AttributeName.Status.name(), encoderFactory.createHLAboolean(status).toByteArray());
    }
}
