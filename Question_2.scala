object Question_2 {
    def main(args : Array[String]) {
        println("Value of fahrenheit : " + Temperature(35))
    }

    def Temperature(Cel : Double) : Double = {
        var F : Double = 0
        F = Cel*1.8000 + 32.00
        return F
    }
}