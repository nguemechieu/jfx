/*
 * Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.
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
package javafx.scene.control;

public class TreeViewShim {


    public static <T> MultipleSelectionModel<TreeItem<T>>
            get_TreeViewBitSetSelectionModel(TreeView treeView) {
        return new TreeView.TreeViewBitSetSelectionModel<>(treeView);
    }

    public static Class get_TreeViewBitSetSelectionModel_class() {
        return TreeView.TreeViewBitSetSelectionModel.class;
    }

    public static boolean is_TreeViewBitSetSelectionModel(Object o) {
        return o instanceof TreeView.TreeViewBitSetSelectionModel;
    }

    public static <T> FocusModel<TreeItem<T>> get_TreeViewFocusModel(TreeView treeView) {
        return new TreeView.TreeViewFocusModel(treeView);
    }

    public static TableView.TableViewSelectionModel<String>
        newInstance_from_class(Class<? extends TableView.TableViewSelectionModel >modelClass,
                TableView tableView) throws Exception {
            return modelClass.getConstructor(TableView.class).newInstance(tableView);
    }

}
