package net.octosystems.foodversity.model.grocery.ean

import net.octosystems.foodversity.model.common.numeric.PositiveNumber
import net.octosystems.foodversity.model.common.string.NotEmptyString

data class CheckSum(val barcode: NotEmptyString) {

    val value: PositiveNumber
        get() {
            val code = barcode.reversed()
            var sum = 0
            var weight = 3
            for (i in code.indices) {
                val digit = code[i].digitToInt()
                sum += (digit * weight)
                weight = if (weight == 3) 1 else 3
            }

            if (sum % 10 != 0) {
                val closes = sum + (10 - sum % 10)
                return PositiveNumber.of(closes - sum)
            }

            return PositiveNumber.of(0)
        }

    companion object {
        fun of(value: String) = CheckSum(NotEmptyString(value))
    }
}
