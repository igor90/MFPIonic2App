/*
 *    Licensed Materials - Property of IBM
 *    5725-I43 (C) Copyright IBM Corp. 2015, 2016. All Rights Reserved.
 *    US Government Users Restricted Rights - Use, duplication or
 *    disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
*/

package com.ibm.mfp.sample;

import java.util.logging.Logger;

import com.ibm.mfp.adapter.api.MFPJAXRSApplication;

public class JavaShmadapterApplication extends MFPJAXRSApplication{

	static Logger logger = Logger.getLogger(JavaShmadapterApplication.class.getName());
	

	protected void init() throws Exception {
		logger.info("Hello from java adapter!");
	}
	

	protected void destroy() throws Exception {
		logger.info("Bye-bye from java adapter!");
	}
	

	protected String getPackageToScan() {
		//The package of this class will be scanned (recursively) to find JAX-RS resources. 
		//It is also possible to override "getPackagesToScan" method in order to return more than one package for scanning
		return getClass().getPackage().getName();
	}
}
