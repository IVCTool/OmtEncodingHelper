package org.nato.ivct.OmtEncodingHelpers.Netn.Etr.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.datatypes.HLAfixedRecordStruct;

import hla.rti1516e.exceptions.RTIinternalError;

/**
 * 
            <fixedRecordData>
                <name>ChangeRulesOfEngagementTaskStruct</name>
                <encoding>HLAfixedRecord</encoding>
                <semantics>Task-specific data for ChangeRulesOfEngagement.</semantics>
                <field>
                    <name>RulesOfEngagement</name>
                    <dataType>RulesOfEngagementEnum8</dataType>
                    <semantics>The rules of engagement for an entity.</semantics>
                </field>
            </fixedRecordData>

 */
public class ChangeRulesOfEngagementTaskStruct extends HLAfixedRecordStruct {

    public enum Attributes {
        RulesOfEngagement
    }

    public ChangeRulesOfEngagementTaskStruct() throws RTIinternalError {
        super();
    }

}
