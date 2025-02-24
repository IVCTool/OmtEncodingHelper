package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import hla.rti1516e.encoding.DataElement;
import hla.rti1516e.exceptions.RTIinternalError;




public class TaskDefinitionVariantRecordStructTest {

    private TaskDefinitionVariantRecordStruct taskDefinitionVariantRecordStruct;

    @BeforeEach
    public void setUp() throws RTIinternalError {
        taskDefinitionVariantRecordStruct = new TaskDefinitionVariantRecordStruct();
    }

    @Test
    public void testConstructor() throws RTIinternalError {
        assertNotNull(taskDefinitionVariantRecordStruct);
    }

    @Test
    public void testAddDetachTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.Detach.name());
        assertNotNull(task);
    }

    @Test
    public void testAddDirectFireTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.DirectFire.name());
        assertNotNull(task);
    }

    @Test
    public void testAddIndirectFireTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.IndirectFire.name());
        assertNotNull(task);
    }

    @Test
    public void testAddFollowEntityTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.FollowEntity.name());
        assertNotNull(task);
    }

    @Test
    public void testAddMoveInDirectionTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.MoveInDirection.name());
        assertNotNull(task);
    }

    @Test
    public void testAddMoveIntoFormationTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.MoveIntoFormation.name());
        assertNotNull(task);
    }

    @Test
    public void testAddMoveToLocationTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.MoveToLocation.name());
        assertNotNull(task);
    }

    @Test
    public void testAddAttachTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.Attach.name());
        assertNotNull(task);
    }

    @Test
    public void testAddObserveTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.Observe.name());
        assertNotNull(task);
    }

    @Test
    public void testAddOperateCheckpointTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.OperateCheckpoint.name());
        assertNotNull(task);
    }

    @Test
    public void testAddPatrolTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.Patrol.name());
        assertNotNull(task);
    }

    @Test
    public void testAddChangeAltitudeTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.ChangeAltitude.name());
        assertNotNull(task);
    }

    @Test
    public void testAddChangeSpeedTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.ChangeSpeed.name());
        assertNotNull(task);
    }

    @Test
    public void testAddChangeHeadingTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.ChangeHeading.name());
        assertNotNull(task);
    }

    @Test
    public void testAddOtherActivityTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.OtherActivity.name());
        assertNotNull(task);
    }

    @Test
    public void testAddOperateObservationPostTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.OperateObservationPost.name());
        assertNotNull(task);
    }

    @Test
    public void testAddChangeRulesOfEngagementTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.SetRulesOfEngagement.name());
        assertNotNull(task);
    }

    @Test
    public void testAddMagicMoveTask() {
        DataElement task = taskDefinitionVariantRecordStruct.get(TaskDefinitionVariantRecordStruct.TaskType.MagicMove.name());
        assertNotNull(task);
    }

    @Test
    public void testInvalidTaskType() {
        assertThrows(IllegalArgumentException.class, () -> {
            taskDefinitionVariantRecordStruct.get("InvalidTaskType");
        });
    }
}