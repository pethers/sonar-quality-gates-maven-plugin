package com.hack23.maven.plugin.model;

import java.util.ArrayList;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class QualityGateValue.
 */
public final class QualityGateValue {
	
	/** The ignored conditions. */
	private String ignoredConditions;

	/** The level. */
	private String level;

	/** The conditions. */
	private ArrayList<Conditions> conditions;

	/**
	 * Gets the ignored conditions.
	 *
	 * @return the ignored conditions
	 */
	public String getIgnoredConditions() {
		return ignoredConditions;
	}

	/**
	 * Sets the ignored conditions.
	 *
	 * @param ignoredConditions the new ignored conditions
	 */
	public void setIgnoredConditions(final String ignoredConditions) {
		this.ignoredConditions = ignoredConditions;
	}

	/**
	 * Gets the level.
	 *
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * Sets the level.
	 *
	 * @param level the new level
	 */
	public void setLevel(final String level) {
		this.level = level;
	}

	/**
	 * Gets the conditions.
	 *
	 * @return the conditions
	 */
	public ArrayList<Conditions> getConditions() {
		return conditions;
	}

	/**
	 * Sets the conditions.
	 *
	 * @param conditions the new conditions
	 */
	public void setConditions(final ArrayList<Conditions> conditions) {
		this.conditions = conditions;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	@Override
	public boolean equals(final Object object) {
		return EqualsBuilder.reflectionEquals(this, object);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}