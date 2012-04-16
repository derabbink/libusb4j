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
import com.sun.jna.ptr.ByteByReference;

/**
 * This class represents the native structure
 * <code>struct usb_endpoint_descriptor</code>.
 * 
 * @author Mario Boikov
 * 
 */
public class usb_endpoint_descriptor extends Structure {

    public static class ByReference extends usb_endpoint_descriptor implements
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
     * uint8_t bEndpointAddress;
     */
    public byte bEndpointAddress;
    /**
     * uint8_t bmAttributes;
     */
    public byte bmAttributes;
    /**
     * uint16_t wMaxPacketSize;
     */
    public short wMaxPacketSize;
    /**
     * uint8_t bInterval;
     */
    public byte bInterval;
    /**
     * uint8_t bRefresh;
     */
    public byte bRefresh;
    /**
     * uint8_t bSynchAddress;
     */
    public byte bSynchAddress;
    /**
     * unsigned char *extra;
     */
    public ByteByReference extra;
    /**
     * int extralen;
     */
    public int extralen;
}
