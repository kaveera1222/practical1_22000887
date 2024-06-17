object Question_3
{
    def main(args : Array[String]) {
        println("The volume of the sphere : " +  sphereVolume(5))
    }
import scala.math.Pi 
    def sphereVolume(radius: Double): Double = {
        var volume : Double = 0
        volume = 4/3 * Pi * radius * radius *radius
        return volume
    }

}