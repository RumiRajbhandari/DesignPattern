package builderpattern

data class Sku private constructor(
        val id: Int?,
        val name: String?,
        val quantity: Int?
) {
    data class SkuBuilder(
            var id: Int? = null,
            var name: String? = null,
            var quantity: Int? = null
    ) {
        fun id(id: Int) = apply { this.id = id }
        fun name(name: String) = apply { this.name = name }
        fun quantity(quantity: Int) = apply { this.quantity = quantity }
        fun build() = Sku(id, name, quantity)
    }
}