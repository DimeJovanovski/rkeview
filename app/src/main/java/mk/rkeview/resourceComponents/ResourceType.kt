package mk.rkeview.resourceComponents


enum class ResourceType(
    val displayName: String,
    val shortName: String,
    val firebaseName: String,
) {
    ELECTRIC_ENERGY(
        "Електрична енергија",
        "EE",
        "electricity",
    ),
    NATURAL_GAS(
        "Природен гас",
        "NG",
        "NG",
    ),
    HEATING_ENERGY(
        "Топлинска енергија",
        "Q",
        "district_heating",
    ),
    OIL(
        "Нафта и нафтени деривати",
        "OIL",
        "oil_and_oil_derivatives",
    ),
    RENEWABLE_ENERGY(
        "Обновливи извори",
        "RE",
        "renewable_sources",
    );

    override fun toString(): String {
        return displayName
    }
}
