package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.interactions;

import org.nato.ivct.OmtEncodingHelpers.Core.OmtEncodingHelperException;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.EpochTimeStruct;
import org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes.UUIDStruct;

import hla.rti1516e.exceptions.FederateNotExecutionMember;
import hla.rti1516e.exceptions.NameNotFound;
import hla.rti1516e.exceptions.NotConnected;
import hla.rti1516e.exceptions.RTIinternalError;

/*
    <interactionClass>
        <name>ObservationReport</name>
        <sharing>PublishSubscribe</sharing>
        <transportation>HLAreliable</transportation>
        <order>Receive</order>
        <semantics>Report on a unit's observation of a simulated entity. Based on SISO C2SIM standard ontology for representation of Observation Reports.</semantics>
        <parameter>
            <name>ObservedEntity</name>
            <dataType>UUID</dataType>
            <semantics>Required: The unique identifier of the observed entity</semantics>
        </parameter>
        <parameter>
            <name>ObservationTime</name>
            <dataType>EpochTime</dataType>
            <semantics>Required: The time when the observation was made.</semantics>
        </parameter>
        <parameter>
            <name>IdentificationLevel</name>
            <dataType>IdentificationLevelEnum8</dataType>
            <semantics>Optional. The identification level of spotted entities.</semantics>
        </parameter>
        <parameter>
            <name>ConfidenceLevel</name>
            <dataType>Float64</dataType>
            <semantics>Optional:</semantics>
        </parameter>
        <parameter>
            <name>SensorType</name>
            <dataType>EntityTypeStruct</dataType>
            <semantics>Optional: The type of sensor that is the primary source of the report.</semantics>
        </parameter>
        <parameter>
            <name>UncertaintyInterval</name>
            <dataType>Float64</dataType>
            <semantics>Optional</semantics>
        </parameter>
        <parameter>
            <name>Activity</name>
            <dataType>AggregateMissionEnum16</dataType>
            <semantics>Optional: The current activity of the entity. (Fromm NETN-Base) 
Default value: Moving (213)</semantics>
        </parameter>
        <parameter>
            <name>Health</name>
            <dataType>PercentFloat32</dataType>
            <semantics>Optional: Observed strength of an entity expressed as a percentage of the perceived normal strength.</semantics>
        </parameter>
        <parameter>
            <name>Location</name>
            <dataType>LocationStruct</dataType>
            <semantics>Optional: Observed location where the entity were spotted</semantics>
        </parameter>
        <parameter>
            <name>Heading</name>
            <dataType>DirectionDegreesFloat32</dataType>
            <semantics>Optional: Observed heading of spotted entity.</semantics>
        </parameter>
        <parameter>
            <name>Speed</name>
            <dataType>VelocityMeterPerSecondFloat32</dataType>
            <semantics>Optional: Observed speed of the entity (m/s).</semantics>
        </parameter>
        <parameter>
            <name>HostilityStatus</name>
            <dataType>HostilityStatusCodeEnum32</dataType>
            <semantics>Optional: Perceived hostility of the observed entity.</semantics>
        </parameter>
        <parameter>
            <name>Marking</name>
            <dataType>HLAunicodeString</dataType>
            <semantics>Optional: Observed marking on the entity.</semantics>
        </parameter>
        <parameter>
            <name>Name</name>
            <dataType>HLAunicodeString</dataType>
            <semantics>Optional: Perceived name of the observed entity.</semantics>
        </parameter>
        <parameter>
            <name>Side</name>
            <dataType>UUID</dataType>
            <semantics>Optional: Perceived force identifier of the observed entity.</semantics>
        </parameter>
        <parameter>
            <name>Equipment</name>
            <dataType>ArrayOfObservedEquipment</dataType>
            <semantics>Optional: Observed supplies and equipment.</semantics>
        </parameter>
        <parameter>
            <name>Symbol</name>
            <dataType>SymbolIdentifier</dataType>
            <semantics>Optional: Symbol identifier for the entity.</semantics>
        </parameter>
    </interactionClass>
 */
public class ObservationReport extends ETR_Report {

    public enum AttributeName {
        Activity,
        ConfidenceLevel,
        Equipment,
        Heading,
        Health,
        HostilityStats,
        IdentificationLevel,
        Location,
        Marking,
        Name,
        ObservationTime,
        ObservedEntity,
        SensorType,
        Side,
        Speed,
        Symbol,
        UncertaintyInterval
    }

    public ObservationReport() throws NameNotFound, FederateNotExecutionMember, NotConnected, RTIinternalError,
            OmtEncodingHelperException, NameNotFound, FederateNotExecutionMember {
        super();
        addParameter(AttributeName.ObservationTime.name(), new EpochTimeStruct());
        addParameter(AttributeName.ObservedEntity.name(), new UUIDStruct());
    }

    public void setObservationTime(EpochTimeStruct observationTime) {
        setParameter(AttributeName.ObservationTime.name(), observationTime.toByteArray());
    }
    public EpochTimeStruct getObservationTime() {
        return (EpochTimeStruct) getParameter(AttributeName.ObservationTime.name());
    }

    public void setObservedEntity(UUIDStruct uuid) {
        setParameter(AttributeName.ObservedEntity.name(), uuid.toByteArray());
    }
    public UUIDStruct getRObservedEntity() {
        return (UUIDStruct) getParameter(getHlaClassName(AttributeName.ObservedEntity.name()));
    }    
}
