package com.hack23.maven.plugin.model;

import java.util.ArrayList;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public final class QualityGateValue {
	private String ignoredConditions;

	private String level;

	private ArrayList<Conditions> conditions;

	public String getIgnoredConditions() {
		return ignoredConditions;
	}

	public void setIgnoredConditions(final String ignoredConditions) {
		this.ignoredConditions = ignoredConditions;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(final String level) {
		this.level = level;
	}

	public ArrayList<Conditions> getConditions() {
		return conditions;
	}

	public void setConditions(final ArrayList<Conditions> conditions) {
		this.conditions = conditions;
	}

	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	@Override
	public boolean equals(final Object object) {
		return EqualsBuilder.reflectionEquals(this, object);
	}

	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}