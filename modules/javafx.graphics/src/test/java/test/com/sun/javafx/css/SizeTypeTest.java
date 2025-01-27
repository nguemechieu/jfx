/*
 * Copyright (c) 2010, 2015, Oracle and/or its affiliates. All rights reserved.
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

package test.com.sun.javafx.css;

import com.sun.javafx.css.ParsedValueImpl;
import static org.junit.Assert.assertEquals;

import javafx.css.ParsedValue;
import javafx.css.Size;
import javafx.css.SizeUnits;
import javafx.css.StyleConverter;
import javafx.scene.text.Font;

import org.junit.Test;



public class SizeTypeTest {

    public SizeTypeTest() {
    }

    /**
     * Test of convert method, of class SizeType.
     */
    @Test
    public void testConvert() {
        //System.out.println("convert");
        Size size = new Size(2.0f, SizeUnits.EM);
        ParsedValue<Size, Size> value = new ParsedValueImpl<>(size,null);
        Font font = null;
        Size result = value.convert(font);
        assertEquals(size, result);

        ParsedValue<ParsedValue<?,Size>,Double> pxSize = new ParsedValueImpl(value,StyleConverter.getSizeConverter());
        Float expResult = (float) size.pixels(font);
        Float pixels = (float) ((double) pxSize.convert(font));
        assertEquals(expResult, pixels);

//        ParsedValue<Value<?,Size>,Double> ptSize = new ParsedValue(value,SizeConverter.POINTS);
//        expResult = (float) size.points(font);
//        Float points = (float) ((double) ptSize.convert(font));
//        assertEquals(expResult, points);

    }

}
