package org.example;
import uk.pigpioj.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        System.out.println( "Hello World!" );
        int red = 17;
        try(PigpioInterface pigpioInterface = PigpioJ.autoDetectedImplementation()) {
            pigpioInterface.setMode(red, PigpioConstants.MODE_PI_OUTPUT);
            for (int i = 0; i <= 4; i++) {
                pigpioInterface.write(red, true);
                Thread.sleep(1000);
                pigpioInterface.write(red, false);
                Thread.sleep(1000);
            }

        }

    }
}
