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

import java.nio.Buffer;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface LibUSB extends Library {

    
    LibUSB libUSB = (LibUSB) Native.loadLibrary("usb", LibUSB.class);

    /* Core Operations. */
    void usb_init();

    int usb_find_busses();

    int usb_find_devices();

    usb_bus usb_get_busses();

    /* Device operations. */
    usb_dev_handle usb_open(usb_device dev);

    int usb_close(usb_dev_handle dev);

    int usb_set_configuration(usb_dev_handle dev, int configuration);

    int usb_set_altinterface(usb_dev_handle dev, int alternate);

    int usb_resetep(usb_dev_handle dev, int ep);

    int usb_clear_halt(usb_dev_handle dev, int ep);

    int usb_reset(usb_dev_handle dev);

    /**
     * int usb_claim_interface(usb_dev_handle *dev, int interface);
     * 
     * @param usb_dev_handle
     * @param interf
     * @return
     */
    int usb_claim_interface(usb_dev_handle dev, int interf);

    int usb_release_interface(usb_dev_handle dev, int interf);

    /* Control operations. */
    int usb_control_msg(usb_dev_handle dev, int requesttype, int request,
            int value, int index, byte[] bytes, int size, int timeout);

    int usb_control_msg(usb_dev_handle dev, int requesttype, int request,
            int value, int index, Buffer bytes, int size, int timeout);

    int usb_get_string(usb_dev_handle dev, int index, int langid, byte[] buf,
            int buflen);

    int usb_get_string(usb_dev_handle dev, int index, int langid, Buffer buf,
            int buflen);

    int usb_get_string_simple(usb_dev_handle dev, int index, byte[] buf,
            int buflen);

    int usb_get_string_simple(usb_dev_handle dev, int index, Buffer buf,
            int buflen);

    int usb_get_descriptor(usb_dev_handle udev, byte type, byte index,
            byte[] buf, int size);

    int usb_get_descriptor(usb_dev_handle udev, byte type, byte index,
            Buffer buf, int size);

    int usb_get_descriptor_by_endpoint(usb_dev_handle udev, int ep, byte type,
            byte index, byte[] buf, int size);

    int usb_get_descriptor_by_endpoint(usb_dev_handle udev, int ep, byte type,
            byte index, Buffer buf, int size);

    /* Bulk operations. */
    int usb_bulk_write(usb_dev_handle dev, int ep, byte[] bytes, int size,
            int timeout);

    int usb_bulk_write(usb_dev_handle dev, int ep, Buffer bytes, int size,
            int timeout);

    int usb_bulk_read(usb_dev_handle dev, int ep, byte[] bytes, int size,
            int timeout);

    int usb_bulk_read(usb_dev_handle dev, int ep, Buffer bytes, int size,
            int timeout);

    /* Interrupt operations. */
    /**
     * int usb_interrupt_write(usb_dev_handle *dev, int ep, char *bytes, int
     * size, int timeout);
     */
    int usb_interrupt_write(usb_dev_handle dev, int ep, Buffer bytes, int size,
            int timeout);

    int usb_interrupt_write(usb_dev_handle dev, int ep, byte[] bytes, int size,
            int timeout);

    int usb_interrupt_read(usb_dev_handle dev, int ep, Buffer bytes, int size,
            int timeout);

    int usb_interrupt_read(usb_dev_handle dev, int ep, byte[] bytes, int size,
            int timeout);

    /* Non portable */
    /**
     * @throws UnsatisfiedLinkError
     *             if this function does not exist on the running platform.
     */
    int usb_get_driver_np(usb_dev_handle dev, int interf, Buffer name,
            int namelen);

    int usb_get_driver_np(usb_dev_handle dev, int interf, byte[] name,
            int namelen);

    /**
     * @throws UnsatisfiedLinkError
     *             if this function does not exist on the running platform.
     */
    int usb_detach_kernel_driver_np(usb_dev_handle dev, int interf);

    /* Uncategorised operations. */
    void usb_set_debug(int level);

    /*
     * Check if the returned string need to be freed. If so, then use Pointer
     * instead.
     */
    String usb_strerror();

    usb_device usb_device(usb_dev_handle dev);
}
