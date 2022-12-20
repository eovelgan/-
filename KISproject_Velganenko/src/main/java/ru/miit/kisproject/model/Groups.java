package ru.miit.kisproject.model;

/**
 * Table: sys_options
 */
public class Groups {
    /**
     * Column: option_name
     * Type: varchar(50)
     */
    private String groupName;

    /**
     * Column: option_value
     * Type: varchar(50)
     */
    private String groupID;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID == null ? null : groupID.trim();
    }
}