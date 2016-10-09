package com.dylan.java.spring.bean;

public class MsgDefinition {
	
	private String name;
	
	private String groupName;
	
	private ReplierSource replierSource;

	public ReplierSource getReplierSource() {
		return replierSource;
	}

	public void setReplierSource(ReplierSource replierSource) {
		this.replierSource = replierSource;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	

}
