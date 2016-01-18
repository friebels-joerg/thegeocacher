package thegeocacher.jsf;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DebugPhaseListener implements PhaseListener
{
	private static final long serialVersionUID = 28697126271609506L;
	private static Log log = LogFactory.getLog(DebugPhaseListener.class);

	@Override
	public void afterPhase(PhaseEvent event)
	{
		log.debug("After phase: " + event.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent event)
	{
		log.debug("Before phase: " + event.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId()
	{
		return PhaseId.ANY_PHASE;
	}

}
