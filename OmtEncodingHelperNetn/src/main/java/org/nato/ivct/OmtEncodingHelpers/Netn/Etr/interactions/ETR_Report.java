package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.EpochTimeStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.interactions.HLAinteractionRoot;

import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

/*
    <interactionClass>
        <name>ETR_Report</name>
        <sharing>Neither</sharing>
        <transportation>HLAreliable</transportation>
        <order>Receive</order>
        <semantics>A base interaction class for more specialized report interaction classes. The inherited parameter `Time is required.`</semantics>
        <parameter>
            <name>ReportId</name>
            <dataType>UUID</dataType>
            <semantics>Required: Unique identifier for the report itself.</semantics>
        </parameter>
        <parameter>
            <name>ReportingEntity</name>
            <dataType>UUID</dataType>
            <semantics>Required: The entity sending the report.</semantics>
        </parameter>
        <parameter>
            <name>Receiver</name>
            <dataType>UUID</dataType>
            <semantics>Optional: The indended receiver of the message if directed to a specific unit or simulated entity. If not provided, the report is modeled as broadcasted on the entity's default C2 or Battle Management System network.</semantics>
        </parameter>
        <parameter>
            <name>TimeStamp</name>
            <dataType>EpochTime</dataType>
            <semantics>Required: The time when the report was created.</semantics>
        </parameter>
        <parameter>
            <name>Comments</name>
            <dataType>HLAunicodeString</dataType>
            <semantics>Optional. Any additional comments associated with the report.</semantics>
        </parameter>
    </interactionClass>
 */
public class ETR_Report extends HLAinteractionRoot {

    public enum AttributeName {
        Comments,
        Receiver,
        ReportId,
        ReportingEntity,
        Timestamp
    }

    public ETR_Report() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException, NameNotFound, FederateNotExecutionMember {
        super();
        addParameter(AttributeName.ReportId.name(), new UUIDStruct());
        addParameter(AttributeName.ReportingEntity.name(), new UUIDStruct());
        addParameter(AttributeName.Timestamp.name(), new EpochTimeStruct());
    }

    public void setReportId(UUIDStruct uuid) {
        setParameter(AttributeName.ReportId.name(), uuid.toByteArray());
    }
    public UUIDStruct getReportId() {
        return (UUIDStruct) getParameter(getHlaClassName(AttributeName.ReportId.name()));
    }        

    public void setReportingEntity(UUIDStruct uuid) {
        setParameter(AttributeName.ReportingEntity.name(), uuid.toByteArray());
    }
    public UUIDStruct getReportingEntity() {
        return (UUIDStruct) getParameter(getHlaClassName(AttributeName.ReportingEntity.name()));
    }

    public void setTimestamp(EpochTimeStruct epochTime) {
        setParameter(AttributeName.Timestamp.name(), epochTime.toByteArray());
    }
    public EpochTimeStruct getTimestamp() {
        return (EpochTimeStruct) getParameter(AttributeName.Timestamp.name());
    }
}
