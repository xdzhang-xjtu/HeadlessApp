package com.baidu.xdzhang;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class HeadlessApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Hello from Eclipse application");
		return null;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
