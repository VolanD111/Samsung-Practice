class Circle(val r:Double): Shape() {
    override fun area(): Double {
        return (3.14*r*r)
    }
}