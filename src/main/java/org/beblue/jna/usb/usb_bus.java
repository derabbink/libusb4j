/*
 * libusb4j - libusb for java using JNA.
 * Copyright (C) 2008  Mario Boikov <mario@beblue.org>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.beblue.jna.usb;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;

/**
 * This class represents the native structure <code>struct usb_bus</code>.
 * 
 * @author Mario Boikov
 * 
 */
public class usb_bus extends Structure {

    public static class ByReference extends usb_bus implements
            Structure.ByReference {
//        public ByReference() {
//            super();
//        }
    }
//    public usb_bus() {
//        super();
//    }
//
//    public usb_bus(Pointer p) {
//        super();
//        useMemory(p);
//        read();
//    }
    /**
     * struct usb_bus *next;
     */
    public usb_bus.ByReference next;
    /**
     * struct usb_bus *prev;
     */
    public usb_bus.ByReference prev;
    /**
     * char dirname[PATH_MAX + 1];
     */
    public byte[] dirname = new byte[LibUSBConstants.PATH_MAX + 1];
    /**
     * struct usb_device *devices;
     */
    public usb_device.ByReference devices;
    /**
     * uint32_t location;
     */
    public int location;
    /**
     * struct usb_device *root_dev;
     */
    public usb_device.ByReference root_dev;
}
