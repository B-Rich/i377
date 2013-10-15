package listeners;

import java.io.File;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import db.SetupDao;

public class ContextListener implements ServletContextListener{

	   @Override
	   public void contextInitialized(ServletContextEvent arg0) {
	      SetupDao setupDao = new SetupDao();

	      if(!databaseExists()) {
	         setupDao.createSchema();
	         setupDao.insertTestData();
	      }
	   }

	   @Override
	   public void contextDestroyed(ServletContextEvent arg0) {
	      
	   }

	   private boolean databaseExists() {
	      return new File(System.getProperty("user.home") + "/data/KirillRyzhkov/db.script").exists();
	   }
	}
