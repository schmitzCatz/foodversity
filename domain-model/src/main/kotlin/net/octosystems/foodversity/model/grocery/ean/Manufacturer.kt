package net.octosystems.foodversity.model.grocery.ean

import net.octosystems.foodversity.model.common.location.Address
import net.octosystems.foodversity.model.common.string.Name

data class Manufacturer(
    val name: Name,
    val address: Address,
    val manufacturer: ManufacturerCode
)