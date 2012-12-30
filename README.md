libusb4j
========

Enables libusb from within Java using the JNA (Java Native Access) library.

Call for Help
--------
If you know [JNA][1], [libusb][2], or maybe just C or Java, please consider spending some time on this project, as it is in need of some professional help.
[I][3] don't know much about C, libusb, or JNA myself. The primary reason I forked the project is that before I didn't find the way to get the source code convenient.
As it turned out, this project is too immature for me to use, which is why I'd like people to chip in.


Origin
--------

A Maven-compatible fork of Mario Boikov's libusb4j

Mario is the original author. See his project [here][4]  
Marco (a.k.a. hybris0) forked the project and published it [here][5]

I then took the newest fork (the one by Marco) and forked it again, which is what you see here.  
I converted it to Maven and published it on [github][6].

Usage
--------

Run `mvn install` to be able to use libusb4j as a dependency in other projects.

If you'd like to modify the source code, here are some pointers
*  Clone the repo and import it as an "Existing Maven Project" into Eclipse (requires m2e).
*  Don't forget about the [LGPL license][7]
*  Feel free to contact me if you found/fixed bugs or made any other changes worth sharing here.

License
--------

The project is licensed under the [LGPL license][4] v2.1 or later.  
This means you can modify the code, but you also have to publish the modifications under the LGPL.  
You can use the library in closed-source projects.

  [1]: https://github.com/twall/jna
  [2]: http://www.libusb.org/
  [3]: https://github.com/derabbink
  [4]: https://launchpad.net/libusb4j "libusb4j on launchpad.net"
  [5]: http://kenai.com/projects/libusb4j "libusb4j on kenai.com"
  [6]: https://github.com/derabbink/libusb4j "project website on github"
  [7]: http://www.gnu.org/copyleft/lesser.html "LGPL license"

