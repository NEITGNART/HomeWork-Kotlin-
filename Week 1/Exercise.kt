import java.util.*







// EXERCISE STRING

//1. Cho trước chuỗi s. Viết hàm trả về độ dài chuỗi; Gọi sử dụng hàm để in ra độ dài

fun getLength(s: String): Int {
    return s.length
}
//2. Cho trước chuỗi s1, s2. Viết hàm trả nối chuỗi s2 vào chuỗi s1 để tạo thành chuỗi
//mới và trả về kết quả. Gọi sử dụng hàm

fun concat(s1: String, s2: String): String {
    return "$s1$s2";
}

//3. Cho trước chuỗi s. Viết hàm chuyển chuỗi s thành chuỗi IN HOA và trả về kết quả;
//Gọi sử dụng hàm để in ra chuỗi mới.

fun upperCase(s: String): String {
    return s.uppercase(Locale.getDefault());
}

//4. Cho trước chuỗi s1, s2. Viết hàm Tìm và thay thế các chuỗi s2 trong s1 thành chuỗi
//“nlhdung” và trả về chuỗi kết quả. Gọi sử dụng hàm để in ra chuỗi mới.

fun replace(s1: String, s2: String): String {
    return s1.replace(s2, "nlhdung");
}

//5. Cho trước chuỗi s1, s2. Viết hàm Tìm và xóa các chuỗi s2 trong s1 và trả về chuỗi kết
//quả. Gọi sử dụng hàm để in ra chuỗi mới.

fun remove(s1: String, s2: String): String {
    return s1.replace(s2, "");
}

//6. Cho trước chuỗi s. Viết hàm chèn chuỗi “nlhdung” và đầu chuỗi và trả về chuỗi kết
//quả. Gọi sử dụng hàm để in ra chuỗi mới.

fun insertStart(s: String): String {
    return "nlhdung$s"
}

//7. Cho trước chuỗi s. Viết hàm chèn chuỗi “nlhdung” và cuối chuỗi và trả về chuỗi kết
//quả. Gọi sử dụng hàm để in ra chuỗi mới.

fun insertEnd(s: String): String {
    return "{$s}nlhdung"
}
//8. Cho trước chuỗi s. Viết hàm chèn chuỗi “nlhdung” và vị trí x cho trước và trả về
//chuỗi kết quả. Gọi sử dụng hàm để in ra chuỗi mới.

fun replaceX(s: String, x: Int): String {
    return if (x < s.length) return s.replaceRange(x, x, "nlhdung") else s;

}

//9. Cho trước chuỗi s. Viết hàm đếm số lần xuất hiện chuỗi “nlhdung” trong chuỗi s và
//trả về kết quả. Gọi sử dụng hàm để in ra kết quả

fun count(s: String): Int {
    return s.split("nlhdung").size - 1
}

//10. Cho trước chuỗi s. Viết hàm tạo chuỗi con bất kỳ từ chuỗi s và có độ dài bằng 1⁄2 độ
//dài chuỗi s.

fun subString(s: String): String {
    return s.substring(s.length / 2)
}

// For and Array


//1. Cho trước mảng số nguyên 5 phần tử. Viết hàm đảo ngược mảng và tao ra mảng
//mới, sau đó trả về kết quả. Gọi hàm để in ra mảng mới

fun reveseArray(arr: Array<Int>?): Array<Int> {
    return (arr?.reversedArray() ?: arr) as Array<Int>
}

//2. Cho trước số nguyên dương n, viết hàm tính và trả về số lượng ước số của n và tính
//tổng các ước số đó (trả về dạng tuple). Gọi hàm để in ra kết quả

fun countDivisors(n: Int): Pair<Int, Int> {
    var count = 0
    var sum = 0
    for (i in 1..n) {
        if (n % i == 0) {
            count++
            sum += i
        }
    }
    return Pair(count, sum)
}


//3. Cho trước số nguyên dương n, viết hàm đếm số lượng chữ số và tính tổng các chữ số
//của n, sau đó trả về kết quả dạng tuple. Gọi hàm để in ra kết quả

fun countDigitAndSum(n: Int): Pair<Int, Int> {
    var sum = 0
    var count = 0
    var temp = n
    while (temp > 0) {
        sum += temp % 10
        count++
        temp /= 10
    }
    return Pair(count, sum)
}


//4. Cho trước số nguyên dương n, viết hàm đếm số lượng chữ số chẳn và số lượng chữ
//số lẻ của n, sau đó trả về kết quả dạng tuple. Gọi hàm để in ra kết quả

fun countDigit(n: Int): Pair<Int, Int> {
    var countEven = 0
    var countOdd = 0
    var temp = n
    while (temp > 0) {
        if (temp % 2 == 0) {
            countEven++
        } else {
            countOdd++
        }
        temp /= 10
    }
    return Pair(countEven, countOdd)
}


//5. Cho trước số nguyên dương n, viết hàm tính giá trị biểu thức S = 1^2 + 2^2 +...+n^2,
//trả về kết quả đã tính đc. Gọi hàm để in ra kết quả

fun sum(n: Long): Long {
    var sum: Long = 0
    for (i in 1..n) {
        sum += i * i
    }
    return sum
}


//6. Cho trước chuỗi “nlhdung”. Viết hàm để tạo và trả về mảng gồm 100 phần tử chuỗi
//với định dạng “nlhdung-x”, trong đó x là số nguyên từ 1 đến 100. Ví dụ mảng kết quả
//sẽ chứa các phần tử như:
//[“nlhdung-1”, “nlhdung-2”,...,”nlhdung-100”]
//

fun repeatString(str: String = "nlhdung", n: Int): Array<String> {
    var result = arrayOf<String>()
    for (i in 1..n) {
        result += "$str-$i"
    }
    return result
}

//============================================================

//=================================================================

//7. Cho trước mảng số nguyên 5 phần tử. Viết hàm sắp xếp các phần tử trong mảng
//theo thứ tự tăng dần rồi trả về mảng kết quả

fun sortIncreasingOrder(array: Array<Int>): Array<Int> {
    return sortArray(array, true)
}


//8. Cho trước mảng số nguyên 5 phần tử. Viết hàm sắp xếp các phần tử trong mảng
//theo thứ tự giảm dần rồi trả về mảng kết quả

fun sortDecreasingOrder(array: Array<Int>): Array<Int> {
    return sortArray(array, false)
}


//9. Cho trước mảng số nguyên 5 phần tử. Viết hàm sắp xếp các phần tử trong mảng
//theo thứ tự tăng dần hoặc giảm dần, thứ tự này dự vào biến k cho trước (1: tăng
//dần; 0: giảm dần) rồi trả về mảng kết quả

fun sortArray(array: Array<Int>, comparator: Boolean): Array<Int> {
    array.sortWith(Comparator<Int> { a, b ->
        if (comparator) {
            b - a
        } else {
            a - b
        }
    })
    return array
}

//10. Cho trước số nguyên dương n. Viết hàm kiểm tra n có phải là số đối xứng không (Ví
//dụ về số đối xứng: 121,53435, 33, ...)

fun isPalindrome(n: Int): Boolean {
    var temp = n
    var reverse = 0
    while (temp > 0) {
        reverse = reverse * 10 + temp % 10
        temp /= 10
    }
    return n == reverse
}


//11. Cho trước số nguyên dương n. Viết hàm kiểm tra n có phải là số nguyên tố không

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false
    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
    }
    return true
}


//12. Cho trước mảng số nguyên 10 phần tử. Viết hàm để:
//- Tìm giá trị lớn nhất trong mảng
//- Tìm giá trị số chẵn lớn nhất trong mảng
//- Tìm giá trị số lẽ lớn nhất trong mảng
//- Tìm giá trị số nguyên tố lớn nhất trong mảng
//Trả kết quả về dạng tuple có 4 phần tử tương ứng với 4 kết quả tìm được

fun gogo(array: Array<Int>): Array<Int> {
    var max1 = -1
    var max2 = -1
    var max3 = -1
    var max4 = -1
    for (i in array) {
        if (i > max1) {
            max1 = i
        }
        if (i % 2 == 0 && i > max2) {
            max2 = i
        }
        if (i % 2 != 0 && i > max3) {
            max3 = i
        }
        if (isPrime(i) && i > max4) {
            max4 = i
        }
    }
    return arrayOf(max1, max2, max3, max4)
}



//1. Cho trước số km đã đi. Viết chương trình tính tiền đi taxi theo công thức:
//1 km đầu giá 15000đ

//Từ km thứ 2 đến km thứ 5 giá 13500đ
//Từ km thứ 6 trở đi giá 11000đ
//Nếu đi hơn 120km sẽ được giảm 10% trên tổng số tiền

fun calculateMoney(km: Int): Double {
    var money = 0.0
    if (km <= 0) {
        return money
    }

    if (km <= 1) {
        money = 15000.0
    } else if (km <= 5) {
        money = 15000.0 + (km - 1) * 13500.0
    } else if (km <= 6) {
        money = 15000.0 + 4 * 13500.0 + (km - 5) * 11000.0
    };

    if (km > 120) {
        money *= 0.9
    }

    return money
}

//2. Cho trước đơn giá một cuốn sách, số lượng muốn mua, và ý định của người mua là
//có giao hàng hoặc không. Viết hàm tính phí: nếu giao hàng thì tính thêm 20.000 tiền
//shipping, nhưng nếu đơn hàng trên 100.000 thì giảm 10% số tiền.

fun calculateMoney(price: Int, quantity: Int, isShipping: Boolean): Double {
    var money = 0.0
    if (price <= 0 || quantity <= 0) {
        return money
    }

    money = (price * quantity).toDouble()
    if (isShipping) {
        money += 20000.0
    }

    if (money > 100000) {
        money *= 0.9
    }

    return money
}

//3. Cho trước tỷ giá 1usd = 22700vnd. Viết chương trình chuyển đổi từ ngoại tệ sang
//tiền Việt và ngược lại

fun VNDtoUSD(vnd: Int): Double = (vnd / 22700).toDouble()

fun USDtoVND(usd: Int): Double = (usd * 22700).toDouble()


//4. Cho trước số nguyên dương N. Tìm số nguyên dương k nhỏ nhất sao cho:
//
//1+2+....+k >N

fun findMin(n: Int): Int {

    // (k * (k + 1)) / 2 > n
    // (k^2+k) / 2 > n
    // k^2 + k > n * 2

    var k = 1
    while (k * (k + 1) <= n * 2) {
        k++
    }
    return k
}


fun main(args: Array<String>) {

    val s1 = "Hello"
    val s2 = "World"
    val s3 = "radar"


    //  OUTPUT STRING
//    println("1. ${getLength(s1)}") // 1. 5
//    println("2. ${concat(s1, s2)}") // 2. HelloWorld
//    println("3. ${upperCase(s3)}") // 3. RADAR
//    println("4. ${remove(s3, "a")}") // 4. rdr
//    println("5. ${remove(s3, "a")}") // 5. rdr
//    println("6. ${insertStart("!!!")}") //  6. nlhdung!!!
//    println("7. ${insertEnd("!!!")}") // 7. {!!!}nlhdung
//    println("8. ${replaceX(s3, 3)}") // 8. radnlhdungar
//    println("9. ${count("nlhdung nlhdung nlhdungnlhdung nlhdungnlhdungnlhdung")}") // 9. 7
//    println("10. ${subString(s3)}") // 10. dar


}