import pigpio.*

fun main(args: Array<String>) {
	
	gpioInitialise()

	gpioSetMode(0, PI_OUTPUT)
   
	gpioWrite(0, 1)
           
}
