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
package com.eclipsesource.glsp.api.model;

import org.eclipse.sprotty.SNode;

import com.eclipsesource.glsp.api.types.NodeTypeHint;

public class NodeTypeConfiguration extends ModelTypeConfiguration {

	public NodeTypeConfiguration() {
		super();
	}

	public NodeTypeConfiguration(String elementTypeId, Class<? extends SNode> javaClassRepresentation,
			NodeTypeHint nodeTypeHint) {
		super(elementTypeId, javaClassRepresentation, nodeTypeHint);
	}

}