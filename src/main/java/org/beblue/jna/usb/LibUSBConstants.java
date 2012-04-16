/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beblue.jna.usb;

/**
 *
 * @author marcopar
 */
public class LibUSBConstants {

    public static int PATH_MAX = 4096;

    static {
        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            PATH_MAX = 4096;
        } else if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            PATH_MAX = 256;
        } else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            PATH_MAX = 1024;
        } else {
            PATH_MAX = 4096;
        }
    }
    /*
     * Device and/or Interface Class codes
     */
    byte USB_CLASS_PER_INTERFACE = 0;
    /* for DeviceClass */
    byte USB_CLASS_AUDIO = 1;
    byte USB_CLASS_COMM = 2;
    byte USB_CLASS_HID = 3;
    byte USB_CLASS_PRINTER = 7;
    byte USB_CLASS_PTP = 6;
    byte USB_CLASS_MASS_STORAGE = 8;
    byte USB_CLASS_HUB = 9;
    byte USB_CLASS_DATA = 10;
    byte USB_CLASS_VENDOR_SPEC = (byte)0xff;
    /*
     * Descriptor types
     */
    byte USB_DT_DEVICE = 0x01;
    byte USB_DT_CONFIG = 0x02;
    byte USB_DT_STRING = 0x03;
    byte USB_DT_INTERFACE = 0x04;
    byte USB_DT_ENDPOINT = 0x05;
    byte USB_DT_HID = 0x21;
    byte USB_DT_REPORT = 0x22;
    byte USB_DT_PHYSICAL = 0x23;
    byte USB_DT_HUB = 0x29;
    /*
     * Descriptor sizes per descriptor type
     */
    byte USB_DT_DEVICE_SIZE = 18;
    byte USB_DT_CONFIG_SIZE = 9;
    byte USB_DT_INTERFACE_SIZE = 9;
    byte USB_DT_ENDPOINT_SIZE = 7;
    byte USB_DT_ENDPOINT_AUDIO_SIZE = 9;
    /* Audio extension */
    byte USB_DT_HUB_NONVAR_SIZE = 7;
    byte USB_MAXENDPOINTS = 32;
    byte USB_ENDPOINT_ADDRESS_MASK = 0x0f;
    /* in bEndpointAddress */
    byte USB_ENDPOINT_DIR_MASK = (byte)0x80;
    byte USB_ENDPOINT_TYPE_MASK = 0x03;
    /* in bmAttributes */
    byte USB_ENDPOINT_TYPE_CONTROL = 0;
    byte USB_ENDPOINT_TYPE_ISOCHRONOUS = 1;
    byte USB_ENDPOINT_TYPE_BULK = 2;
    byte USB_ENDPOINT_TYPE_INTERRUPT = 3;
    /* Interface descriptor */
    byte USB_MAXINTERFACES = 32;
    byte USB_MAXALTSETTING = (byte)128; /* Hard limit */

    byte USB_MAXCONFIG = 8;
    /*
     * Standard requests
     */
    byte USB_REQ_GET_STATUS = 0x00;
    byte USB_REQ_CLEAR_FEATURE = 0x01;
    /* 0x02 is reserved */
    byte USB_REQ_SET_FEATURE = 0x03;
    /* 0x04 is reserved */
    byte USB_REQ_SET_ADDRESS = 0x05;
    byte USB_REQ_GET_DESCRIPTOR = 0x06;
    byte USB_REQ_SET_DESCRIPTOR = 0x07;
    byte USB_REQ_GET_CONFIGURATION = 0x08;
    byte USB_REQ_SET_CONFIGURATION = 0x09;
    byte USB_REQ_GET_INTERFACE = 0x0A;
    byte USB_REQ_SET_INTERFACE = 0x0B;
    byte USB_REQ_SYNCH_FRAME = 0x0C;
    byte USB_TYPE_STANDARD = (0x00 << 5);
    byte USB_TYPE_CLASS = (0x01 << 5);
    byte USB_TYPE_VENDOR = (0x02 << 5);
    byte USB_TYPE_RESERVED = (0x03 << 5);
    byte USB_RECIP_DEVICE = 0x00;
    byte USB_RECIP_INTERFACE = 0x01;
    byte USB_RECIP_ENDPOINT = 0x02;
    byte USB_RECIP_OTHER = 0x03;
    /*
     * Various libusb API related stuff
     */
    byte USB_ENDPOINT_IN = (byte)0x80;
    byte USB_ENDPOINT_OUT = 0x00;
    /* Error codes */
    int USB_ERROR_BEGIN = 500000;
}
