/*
 * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.javafx.iio.ios;

import com.sun.javafx.iio.ImageFormatDescription;
import com.sun.javafx.iio.ImageLoader;
import com.sun.javafx.iio.ImageLoaderFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * A factory which creates a loader for images on iOS platform.
 */
public class IosImageLoaderFactory implements ImageLoaderFactory {

    private static IosImageLoaderFactory theInstance;

    private IosImageLoaderFactory() {}

    /**
     * Returns an instance of IosImageLoaderFactory
     *
     * @return an instance of IosImageLoaderFactory
     */
    public static final synchronized IosImageLoaderFactory getInstance() {
        if (theInstance == null) {
            theInstance = new IosImageLoaderFactory();
        }
        return theInstance;
    }

    /**
     * @inheritDoc
     */
    @Override
    public ImageFormatDescription getFormatDescription() {
        return IosDescriptor.getInstance();
    }

    /**
     * @inheritDoc
     */
    @Override
    public ImageLoader createImageLoader(final InputStream input) throws IOException {
        return new IosImageLoader(input, IosDescriptor.getInstance());
    }

    /**
     * Creates a loader for the specified input URL.
     *
     * @param input a URL containing an image in the supported format.
     * @return a loader capable of loading and decoding an image from the supplied URL.
     * @throws <IOException> if there is an error creating the loader.
     */
    public ImageLoader createImageLoader(final String input) throws IOException {
        return new IosImageLoader(input, IosDescriptor.getInstance());
    }
}
