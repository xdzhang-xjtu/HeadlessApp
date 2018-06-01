package com.baidu.xdzhang;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class HeadlessApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Hello from Eclipse application");
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		// Get all projects in the workspace
		IProject[] projects = root.getProjects();
		// Loop over all projects
		for (IProject project : projects) {
			System.out.println(project.getName());
		}
		
		//get the args form command line
		String[] appArgs = (String[])context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		for (int i = 0; i < appArgs.length; i++) {
			System.out.println(appArgs[i]);
		}
		
		return null;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
