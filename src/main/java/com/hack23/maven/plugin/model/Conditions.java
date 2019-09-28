package com.hack23.maven.plugin.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Conditions
{
    private String op;

    private String period;

    private String metric;

    private String level;

    private String error;
    
    private String actual;

    public String getActual() {
		return actual;
	}

	public void setActual(final String actual) {
		this.actual = actual;
	}

	public String getOp ()
    {
        return op;
    }

    public void setOp (final String op)
    {
        this.op = op;
    }

    public String getPeriod ()
    {
        return period;
    }

    public void setPeriod (final String period)
    {
        this.period = period;
    }

    public String getMetric ()
    {
        return metric;
    }

    public void setMetric (final String metric)
    {
        this.metric = metric;
    }

    public String getLevel ()
    {
        return level;
    }

    public void setLevel (final String level)
    {
        this.level = level;
    }

    public String getError ()
    {
        return error;
    }

    public void setError (final String error)
    {
        this.error = error;
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