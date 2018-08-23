/*******************************************************************************
 * Copyright (c) 2018 Tobias Ortmayr.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 * 	Tobias Ortmayr - initial API and implementation
 ******************************************************************************/
package at.tortmayr.glsp.api.listener;

import at.tortmayr.glsp.api.action.kind.OpenAction;

public interface ModelElementOpenListener {
	
	void elementOpened(OpenAction action);
	
	public static class NullImpl implements ModelElementOpenListener{

		@Override
		public void elementOpened(OpenAction action) {
		}
		
	}
}