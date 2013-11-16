package quizsite;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


/**
 * Application Lifecycle Listener implementation class QuizListener
 *
 */
@WebListener
public class QuizListener implements ServletContextListener, HttpSessionListener {

    /**
     * Default constructor. 
     */
    public QuizListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
//    	Quiz quiz = new Quiz();
//    	ServletContext session = arg0.getServletContext();
//        session.setAttribute("quiz", quiz);
        // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent event) {
    	HttpSession session = event.getSession();
    	session.setAttribute("connection", new DBConnection());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
