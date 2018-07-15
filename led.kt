import pigpio.*

fun main(args: Array<String>) {

	val port = 0
	
	gpioInitialise()

	gpioSetMode(port, PI_OUTPUT)
   
	gpioWrite(port, 1)
           
}
