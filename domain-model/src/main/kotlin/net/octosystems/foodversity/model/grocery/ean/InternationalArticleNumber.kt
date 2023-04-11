package net.octosystems.foodversity.model.grocery.ean

data class InternationalArticleNumber(
    val prefix: GS1Prefix,
    val manufacturer: ManufacturerCode,
    val product: ProductCode,
    val checkSum: CheckSum
)