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

/**
 * This class represents the native structure <code>usb_device_descriptor</code>
 * .
 * 
 * @author Mario Boikov
 * 
 */
public class usb_device_descriptor extends Structure {

    /**
     * uint8_t bLength;
     */
    public byte bLength;
    /**
     * uint8_t bDescriptorType;
     */
    public byte bDescriptorType;
    /**
     * uint16_t bcdUSB;
     */
    public short bcdUSB;
    /**
     * uint8_t bDeviceClass;
     */
    public byte bDeviceClass;
    /**
     * uint8_t bDeviceSubClass;
     */
    public byte bDeviceSubClass;
    /**
     * uint8_t bDeviceProtocol;
     */
    public byte bDeviceProtocol;
    /**
     * uint8_t bMaxPacketSize0;
     */
    public byte bMaxPacketSize0;
    /**
     * uint16_t idVendor;
     */
    public short idVendor;
    /**
     * uint16_t idProduct;
     */
    public short idProduct;
    /**
     * uint16_t bcdDevice;
     */
    public short bcdDevice;
    /**
     * uint8_t iManufacturer;
     */
    public byte iManufacturer;
    /**
     * uint8_t iProduct;
     */
    public byte iProduct;
    /**
     * uint8_t iSerialNumber;
     */
    public byte iSerialNumber;
    /**
     * uint8_t bNumConfigurations;
     */
    public byte bNumConfigurations;
}
