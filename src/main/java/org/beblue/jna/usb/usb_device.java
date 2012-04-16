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

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;

/**
 * This class represents the native structure <code>struct usb_device</code>.
 * 
 * @author Mario Boikov
 * 
 */
public class usb_device extends Structure {

    public static class ByReference extends usb_device implements
            Structure.ByReference {
    }
    /**
     * struct usb_device *next;
     */
    public usb_device.ByReference next;
    /**
     * struct usb_device *prev;
     */
    public usb_device.ByReference prev;
    /**
     * char filename[PATH_MAX + 1];
     */
    public byte[] filename = new byte[LibUSBConstants.PATH_MAX + 1];
    /**
     * struct usb_bus *bus;
     */
    // usb_bus.ByReference did not work, I'm not sure why.
    //public Pointer /* usb_bus.ByReference */bus;
    public usb_bus.ByReference bus;
    /**
     * struct usb_device_descriptor descriptor;
     */
    public usb_device_descriptor descriptor;
    /**
     * struct usb_config_descriptor *config;
     */
    public usb_config_descriptor.ByReference config;
    /**
     * void *dev; Darwin support
     */
    public Pointer dev;
    /**
     * uint8_t devnum;
     */
    public byte devnum;
    /**
     * unsigned char num_children;
     */
    public byte num_children;
    /**
     * struct usb_device **children;
     */
    public PointerByReference children;
}
