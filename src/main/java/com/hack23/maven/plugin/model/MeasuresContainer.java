package com.hack23.maven.plugin.model;

import java.util.ArrayList;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class MeasuresContainer.
 */
public final class MeasuresContainer {

	/** The measures. */
	private ArrayList<Measures> measures;

	/**
	 * Gets the measures.
	 *
	 * @return the measures
	 */
	public ArrayList<Measures> getMeasures() {
		return measures;
	}

	/**
	 * Sets the measures.
	 *
	 * @param measures the new measures
	 */
	public void setMeasures(final ArrayList<Measures> measures) {
		this.measures = measures;
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
