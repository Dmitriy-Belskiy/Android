abstract class Figure {
    abstract fun perimeter(): Float
    abstract fun area(): Float
}
class Rectangle(val width: Float, val height: Float) : Figure(perimeter, area)
{
    override fun perimeter(): Float{
        return width * 2 + height * 2;
        println("Perimeter of this rectangle is $perimeter")
    }
    override fun area(): Float{
        return width * height;
        println("Area of this rectangle is $area")
    }
}