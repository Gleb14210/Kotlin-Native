import pigpio.*

fun main(args: Array<String>) {

	val port = 0

	gpioSetMode(port, PI_OUTPUT)
   
	gpioWrite(port, 0)
           
}
