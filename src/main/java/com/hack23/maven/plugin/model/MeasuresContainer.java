package com.hack23.maven.plugin.model;

import java.util.ArrayList;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public final class MeasuresContainer {

	private ArrayList<Measures> measures;

	public ArrayList<Measures> getMeasures() {
		return measures;
	}

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
