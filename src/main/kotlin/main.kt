fun main() {
    val amount = 16585400
    val fixedCommission = 3500
    val persentCommission = amount * 0.75 / 100
    val transferCommission = if (persentCommission < fixedCommission) fixedCommission else persentCommission
    println("Commission from $amount: $transferCommission" )
}