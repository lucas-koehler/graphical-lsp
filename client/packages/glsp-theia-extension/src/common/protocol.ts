/********************************************************************************
 * Copyright (c) 2019 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/
import { ActionMessage } from "glsp-sprotty/lib";
import { NotificationType } from "vscode-jsonrpc";
import { NotificationType0 } from "vscode-jsonrpc";
import { RequestType0 } from "vscode-jsonrpc";

export namespace ActionMessageNotification {
    export const type = new NotificationType<ActionMessage, void>('process');
}

export namespace ShutdownRequest {
    export const type = new RequestType0<void, void, void>('shutdown');
}

export namespace ExitNotification {
    export const type = new NotificationType0<void>('exit');
}
