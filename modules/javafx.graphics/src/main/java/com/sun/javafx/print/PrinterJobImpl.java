/*
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.javafx.print;

import javafx.print.PageLayout;
import javafx.scene.Node;
import javafx.stage.Window;

/**
 * Printer implementations implement these methods.
 */
public interface PrinterJobImpl {

    public PrinterImpl getPrinterImpl();
    public void setPrinterImpl(PrinterImpl printerImpl);

    public boolean showPrintDialog(Window owner);
    public boolean showPageDialog(Window owner);

    public PageLayout validatePageLayout(PageLayout pageLayout);
    public boolean print(PageLayout pageLayout, Node node);

    public boolean endJob();
    public void cancelJob();
}
