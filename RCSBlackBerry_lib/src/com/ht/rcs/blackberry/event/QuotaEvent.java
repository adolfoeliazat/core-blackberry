/* *************************************************
 * Copyright (c) 2010 - 2010
 * HT srl,   All rights reserved.
 * Project      : RCS, RCSBlackBerry_lib 
 * File         : QuotaEvent.java 
 * Created      : 26-mar-2010
 * *************************************************/
package com.ht.rcs.blackberry.event;

public class QuotaEvent extends Event {

    public QuotaEvent(int actionId, byte[] confParams) {
        super(Event.EVENT_QUOTA, actionId, confParams);
    }

    protected void EventRun() {
        // TODO Auto-generated method stub

    }

    protected boolean Parse(byte[] confParams) {
        // TODO Auto-generated method stub
        return false;
    }

}
