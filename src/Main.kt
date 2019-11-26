import kotlin.test.assertEquals

fun main() {
    val rectangle = Rectangle(50, 20)
    rectangle.setWidth(rectangle, 100)
    assertEquals(100, rectangle.width)

    val square = Square(20)
    square.setWidth(square, 100)
    assertEquals(100, square.width)
    assertEquals(100, square.height)
}