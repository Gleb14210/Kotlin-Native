import pigpio.*

fun main(args: Array<String>) {
	
	

	gpioInitialise()

	gpioSetMode(17, PI_OUTPUT)
   
	gpioWrite(17, 0)
           
}
