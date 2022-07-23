# led-control
This is a basic led control project that uses the Java pigpioj dependency. Link can be found [here](https://github.com/mattjlewis/pigpioj). To run this application, make sure to have IntelliJ downloaded which can be found [here](https://www.jetbrains.com/idea/download/#section=linux). Download the one for your OS. In my case I used the Linux version. Also make sure to have Maven installted. Download Maven [here](https://maven.apache.org/download.cgi). After that open up IntelliJ and then open this repository. Next, make sure that you have remote GPIO access. You can do this with `sudo pigpiod` or enable remote GPIO using the Raspberry Pi Configuration menu (desktop) or `sudo raspi-config`. Next, run `mvn package` to build the application. Then change to the target directory as that will have the new Jar file. Next, run this command: `java -jar -DPIGPIOD_HOST=<ip-address-of-pi> led-control-1.0-SNAPSHOT-jar-with-dependencies.jar`. And then the LED should blink.
