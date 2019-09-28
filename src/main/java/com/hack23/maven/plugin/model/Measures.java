package com.hack23.maven.plugin.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Measures {
	  private String component;

	    private String metric;

	    private String value;

	    public String getComponent ()
	    {
	        return component;
	    }

	    public void setComponent (final String component)
	    {
	        this.component = component;
	    }

	    public String getMetric ()
	    {
	        return metric;
	    }

	    public void setMetric (final String metric)
	    {
	        this.metric = metric;
	    }

	    public String getValue ()
	    {
	        return value;
	    }

	    public void setValue (final String value)
	    {
	        this.value = value;
	    }

		@Override
		public final String toString() {
			return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
		}

		@Override
	    public boolean equals(final Object object) {
	    	return EqualsBuilder.reflectionEquals(this,object);
	    }

		@Override
		public final int hashCode() {
			return HashCodeBuilder.reflectionHashCode(this);
		}
}
