package net.therap.lifecycle.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 9/9/13
 * Time: 12:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class LifeCycleListener implements PhaseListener {

    Logger logger = LoggerFactory.getLogger(LifeCycleListener.class);
    @Override
    public void afterPhase(PhaseEvent phaseEvent) {
        logger.info("END PHASE " + phaseEvent.getPhaseId());
    }

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {
        logger.info("START PHASE " + phaseEvent.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
