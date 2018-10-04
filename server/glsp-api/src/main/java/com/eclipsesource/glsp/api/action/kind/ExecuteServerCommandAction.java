/*******************************************************************************
 * Copyright (c) 2018 EclipseSource Services GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *   
 * Contributors:
 * 	Tobias Ortmayr - initial API and implementation
 ******************************************************************************/
package com.eclipsesource.glsp.api.action.kind;

import com.eclipsesource.glsp.api.action.Action;

public class ExecuteServerCommandAction extends Action {

	private String commandID;

	public ExecuteServerCommandAction() {
		super(ActionKind.EXECUTE_SERVER_COMMAND);

	}

	public ExecuteServerCommandAction(String commandID) {
		this();
		this.commandID = commandID;
	}

	public String getCommandID() {
		return commandID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((commandID == null) ? 0 : commandID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExecuteServerCommandAction other = (ExecuteServerCommandAction) obj;
		if (commandID == null) {
			if (other.commandID != null)
				return false;
		} else if (!commandID.equals(other.commandID))
			return false;
		return true;
	}

}