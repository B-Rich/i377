package listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessioCountListener
 *
 */
public class SessioCountListener implements HttpSessionListener {

	private static int activeSessions = 0;
	
	public void sessionCreated(HttpSessionEvent se) {
		activeSessions++;
	}
	
	public void sessionDestroyed(HttpSessionEvent se) {
		activeSessions--;
		
		if(activeSessions < 0)
			activeSessions = 0;
	}
	
	public static int getActiveSessions() {
		return activeSessions;
	}
	
}
