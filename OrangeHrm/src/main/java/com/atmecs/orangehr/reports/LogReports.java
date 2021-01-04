package com.atmecs.orangehr.reports;


import java.util.logging.Logger;

import com.atmecs.orangehr.constants.FilePaths;

public class LogReports {

	Logger logger = null;

	public void Logreports() {
		getLogger();
		logger = Logger.getLogger(LogReports.class.getName());

	}

	public void getLogger() {

		PropertyConfigurator.configure(FilePaths.LOG4J_FILE);
	}

	public void info(String message) {
		logger.info(message);
	}
}


