import java.time.LocalDate


abstract class DocGia(id: String, name: String, expiredDate: LocalDate, gender: String)


data class DocGiaThuong(val id: String, val name: String, val expiredDate: LocalDate, val gender: String, val number: Int) : DocGia(id, name, expiredDate, gender) {
    fun Lephi(): Int {
        return number * 50000;
    }
}



data class DocGiaVip(val id: String, val name: String, val expiredDate: LocalDate, val gender: String) : DocGia(id, name, expiredDate, gender) {
    fun LePhi() : Int {
        return 50000;
    }
}

fun main(args: Array<String>) {

    val dg1 = DocGiaThuong("1", "Tien", LocalDate.of(2018, 12, 31), "Nam", 10);
    val dg2 = DocGiaVip("2", "Trang", LocalDate.of(2018, 12, 31), "Nu");
    println(dg1)
    println(dg2)


}