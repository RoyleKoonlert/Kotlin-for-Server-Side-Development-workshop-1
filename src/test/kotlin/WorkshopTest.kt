import org.example.celsiusToFahrenheit
import org.example.kilometersToMiles
import org.example.Product
import org.example.calculateElectronicsPriceOver500
import org.example.calculateTotalElectronicsPriceOver500
import kotlin.test.Test
import kotlin.test.assertEquals

class WorkshopTest {

    // --- Tests for Workshop #1: Unit Converter ---

    // celsius input: 20.0
    // expected output: 68.0
    @Test
    fun `test celsiusToFahrenheit with positive value`() {
        // Arrange: ตั้งค่า input และผลลัพธ์ที่คาดหวัง
        val celsiusInput = 20.0
        val expectedFahrenheit = 68.0

        // Act: เรียกใช้ฟังก์ชันที่ต้องการทดสอบ
        val actualFahrenheit: Double = celsiusToFahrenheit(celsiusInput) ?: 0.0

        // Assert: ตรวจสอบว่าผลลัพธ์ที่ได้ตรงกับที่คาดหวัง
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "20°C should be 68°F")
    }

    // celsius input: 0.0
    // expected output: 32.0
    @Test
    fun `test celsiusToFahrenheit with zero`() {
        val celsiusInput = 0.0
        val expectedFahrenheit = 32.0

        val actualFahrenheit: Double = celsiusToFahrenheit(celsiusInput) ?: 0.0

        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "0°C should be 32°F")

    }

    // celsius input: -10.0
    // expected output: 14.0
    @Test
    fun `test celsiusToFahrenheit with negative value`() {
        val celsiusInput = -10.0
        val expectedFahrenheit = 14.0

        val actualFahrenheit: Double = celsiusToFahrenheit(celsiusInput) ?: 0.0

        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "-10°C should be 14°F")

    }

    // test for kilometersToMiles function
    // kilometers input: 1.0
    // expected output: 0.621371
    @Test
    fun `test kilometersToMiles with one kilometer`() {
        val kilometersinput = 1.0
        val expectedMiles = 0.621371

        val actualMiles = kilometersToMiles(kilometersinput) ?: 0.0

        assertEquals(expectedMiles, actualMiles, 0.001, "0°C should be 32°F")

    }

    // --- Tests for Workshop #1: Unit Converter End ---

    // --- Tests for Workshop #2: Data Analysis Pipeline ---
    val products = listOf(
        Product("Laptop", price = 35000.0, category = "Electronics"), Product("Smartphone", price = 25000.0, category = "Electronics"),
        Product("T-shirt", price = 450.0, category = "Apparel"), Product("Monitor", price = 7500.0, category = "Electronics"),
        Product("Keyboard", price = 499.0, category = "Electronics"), Product("Jeans", price = 1200.0, category = "Apparel"),
        Product("Headphones", price = 1800.0, category = "Electronics")
    )


    // ทำการแก้ไขไฟล์ Workshop2.kt ให้มีฟังก์ชันที่ต้องการทดสอบ
    // เช่น ฟังก์ชันที่คำนวณผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท
    // ในที่นี้จะสมมุติว่ามีฟังก์ชันชื่อ calculateTotalElectronicsPriceOver500 ที่รับ List<Product> และคืนค่า Double
    // จงเขียน test cases สำหรับฟังก์ชันนี้ โดยตรวจสอบผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท
    //
    @Test
    fun `test calculateTotalElectronicsPriceOver500`(){
        val expected = 35000.0 +25000.0 +7500.0 +1800.0

        val TotalElectronicsPriceOver500 = calculateTotalElectronicsPriceOver500(products)

        assertEquals(expected, TotalElectronicsPriceOver500)

    }
    // จงเขียน test cases เช็คจำนวนสินค้าที่อยู่ในหมวด 'Electronics' และมีราคามากกว่า 500 บาท
    // 🚨
    @Test
    fun `test calculateElectronicsPriceOver500`(){
        val expected = 4

        val ElectronicsPriceOver500 = calculateElectronicsPriceOver500(products)

        assertEquals(expected, ElectronicsPriceOver500)

    }


    // --- Tests for Workshop #2: Data Analysis Pipeline End ---
}