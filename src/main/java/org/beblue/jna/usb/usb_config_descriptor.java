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
import com.sun.jna.ptr.ByteByReference;

/**
 * This class represents the native structure
 * <code>struct usb_config_descriptor</code>.
 * 
 * @author Mario Boikov
 * 
 */
public class usb_config_descriptor extends Structure {

    public static class ByReference extends usb_config_descriptor implements
            Structure.ByReference {
    }
    /**
     * uint8_t bLength;
     */
    public byte bLength;
    /**
     * uint8_t bDescriptorType;
     */
    public byte bDescriptorType;
    /**
     * uint16_t wTotalLength;
     */
    public short wTotalLength;
    /**
     * uint8_t bNumInterfaces;
     */
    public byte bNumInterfaces;
    /**
     * uint8_t bConfigurationValue;
     */
    public byte bConfigurationValue;
    /**
     * uint8_t iConfiguration;
     */
    public byte iConfiguration;
    /**
     * uint8_t bmAttributes;
     */
    public byte bmAttributes;
    /**
     * uint8_t MaxPower;
     */
    public byte MaxPower;
    /**
     * struct usb_interface *interface;
     */
    public usb_interface.ByReference interf;
    /**
     * unsigned char *extra;
     */
    public ByteByReference extra;
    /**
     * int extralen;
     */
    public int extralen;
}
