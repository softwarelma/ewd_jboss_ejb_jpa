package com.softwarelma.ewd.main;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.softwarelma.ewd.ejb.EwdEjb;

public class EwdServletContextListener implements HttpSessionListener {

    private Logger logger = Logger.getLogger(EwdEjb.class.getName());

    public EwdServletContextListener() {
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        if (logger.isLoggable(Level.FINEST))
            logger.log(Level.FINEST, "EwdServletContextListener.sessionCreated");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        if (logger.isLoggable(Level.FINEST))
            logger.log(Level.FINEST, "EwdServletContextListener.sessionDestroyed");
    }

}
