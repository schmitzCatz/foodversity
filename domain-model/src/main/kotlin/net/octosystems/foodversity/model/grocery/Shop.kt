package net.octosystems.foodversity.model.grocery

import net.octosystems.foodversity.model.common.location.Address
import net.octosystems.foodversity.model.common.string.Name

data class Shop(val name: Name, val address: Address? = null, val assortment: List<Buyable> = emptyList())
