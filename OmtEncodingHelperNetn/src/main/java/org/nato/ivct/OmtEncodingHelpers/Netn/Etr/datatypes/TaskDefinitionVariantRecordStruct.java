package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
        <variantRecordDataTypes>
            <variantRecordData>
                <name>TaskDefinitionVariantRecord</name>
                <discriminant>TaskType</discriminant>
                <dataType>EntityControlActionEnum</dataType>
                <alternative>
                    <enumerator>Detach, StopAtSideOfRoad</enumerator>
                    <name>NoTaskParameters</name>
                    <dataType>EmptyTaskStruct</dataType>
                    <semantics>No additional parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>DirectFire</enumerator>
                    <name>DirectFire</name>
                    <dataType>DirectFireTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>IndirectFire</enumerator>
                    <name>IndirectFire</name>
                    <dataType>IndirectFireTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>FollowEntity</enumerator>
                    <name>FollowEntity</name>
                    <dataType>FollowEntityTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>MoveInDirection</enumerator>
                    <name>MoveInDirection</name>
                    <dataType>MoveInDirectionTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>MoveIntoFormation</enumerator>
                    <name>MoveIntoFormation</name>
                    <dataType>MoveIntoFormationTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>MoveToLocation</enumerator>
                    <name>MoveToLocation</name>
                    <dataType>MoveToLocationTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>Attach, EnterFacility</enumerator>
                    <name>Attach</name>
                    <dataType>AttachTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>Observe</enumerator>
                    <name>Observe</name>
                    <dataType>ObserveTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>OperateCheckpoint</enumerator>
                    <name>OperateCheckpoint</name>
                    <dataType>OperateCheckpointTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>Patrol</enumerator>
                    <name>Patrol</name>
                    <dataType>PatrolTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>ChangeAltitude</enumerator>
                    <name>ChangeAltitude</name>
                    <dataType>ChangeAltitudeTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>ChangeSpeed</enumerator>
                    <name>ChangeSpeed</name>
                    <dataType>ChangeSpeedTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>ChangeHeading</enumerator>
                    <name>ChangeHeading</name>
                    <dataType>ChangeHeadingTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>OtherActivity</enumerator>
                    <name>OtherActivity</name>
                    <dataType>OtherActivityTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>OperateObservationPost</enumerator>
                    <name>OperateObservationPost</name>
                    <dataType>OperateObservationPostTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>SetRulesOfEngagement</enumerator>
                    <name>ChangeRulesOfEngagement</name>
                    <dataType>ChangeRulesOfEngagementTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>MagicMove</enumerator>
                    <name>MagicMove</name>
                    <dataType>MagicMoveTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <alternative>
                    <enumerator>MoveByRoute</enumerator>
                    <name>MoveByRoute</name>
                    <dataType>MoveByRouteTaskStruct</dataType>
                    <semantics>Task parameters.</semantics>
                </alternative>
                <encoding>HLAextendableVariantRecord</encoding>
                <semantics>Variant record for task definition data.</semantics>
            </variantRecordData>

 */
public class TaskDefinitionVariantRecordStruct extends HLAfixedRecordStruct {
    
    public enum TaskType {
        Detach, StopAtSideOfRoad, DirectFire, IndirectFire, FollowEntity, MoveInDirection, MoveIntoFormation, MoveToLocation, Attach, EnterFacility, Observe, OperateCheckpoint, Patrol, ChangeAltitude, ChangeSpeed, ChangeHeading, OtherActivity, OperateObservationPost, SetRulesOfEngagement, MagicMove, MoveByRoute
    }

    public TaskDefinitionVariantRecordStruct () throws RTIinternalError {
        super();
        
        // TODO  create EmptyTaskStruct
        add(TaskType.Detach.name(), new EmptyTaskStruct() );
        
        // ToDo create DirectFireTaskStruct
        add(TaskType.DirectFire.name(), new DirectFireTaskStruct() );
        
        // ToDo create IndirectFireTaskStruct
        add(TaskType.IndirectFire.name(), new IndirectFireTaskStruct() );
        
        // ToDo create FollowEntityTaskStruct
        add(TaskType.FollowEntity.name(), new FollowEntityTaskStruct() );
        
        // ToDo create MoveInDirectionTaskStruct
        add(TaskType.MoveInDirection.name(), new MoveInDirectionTaskStruct() );
        
        // ToDo create MoveIntoFormationTaskStruct
        add(TaskType.MoveIntoFormation.name(), new MoveIntoFormationTaskStruct() );
        
        // ToDo create MoveToLocationTaskStruct
        add(TaskType.MoveToLocation.name(), new MoveToLocationTaskStruct() );
        
        // ToDo create AttachTaskStruct
        add(TaskType.Attach.name(), new AttachTaskStruct() );
        
        // ToDo create ObserveTaskStruct
        add(TaskType.Observe.name(), new ObserveTaskStruct() );
        
        // ToDo create OperateCheckpointTaskStruct
        add(TaskType.OperateCheckpoint.name(), new OperateCheckpointTaskStruct() );
        
        // ToDo create PatrolTaskStruct
        add(TaskType.Patrol.name(), new PatrolTaskStruct() );
        
        // ToDo create ChangeAltitudeTaskStruct
        add(TaskType.ChangeAltitude.name(), new ChangeAltitudeTaskStruct() );
        
        // ToDo create ChangeSpeedTaskStruct
        add(TaskType.ChangeSpeed.name(), new ChangeSpeedTaskStruct() );
        
        // ToDo create ChangeHeadingTaskStruct
        add(TaskType.ChangeHeading.name(), new ChangeHeadingTaskStruct() );
        
        // ToDo create OtherActivityTaskStruct
        add(TaskType.OtherActivity.name(), new OtherActivityTaskStruct() );
        add(TaskType.OperateObservationPost.name(), new OperateObservationPostTaskStruct() );
        add(TaskType.SetRulesOfEngagement.name(), new ChangeRulesOfEngagementTaskStruct() );
        add(TaskType.MagicMove.name(), new MagicMoveTaskStruct() );
    }
}
