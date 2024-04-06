package com.openl.testddd.logfilter;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class appletfilter extends Filter<ILoggingEvent> {
    @Override
    public FilterReply decide(ILoggingEvent iLoggingEvent) {
        if(iLoggingEvent.getMessage().contains("applet:"))
        {
            return  FilterReply.ACCEPT;
        }
        else
        {
            return FilterReply.DENY;
        }
    }
}
