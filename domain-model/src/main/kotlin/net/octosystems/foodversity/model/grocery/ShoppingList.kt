package net.octosystems.foodversity.model.grocery

@JvmInline
value class ShoppingList(val value: MutableMap<Shop, List<Product>>) : MutableMap<Shop, List<Product>> by value
