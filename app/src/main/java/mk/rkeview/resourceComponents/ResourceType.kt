package mk.rkeview.resourceComponents

import java.util.Date

private val measureUnitEE: String = "ден/kWh"
private val measureUnitNG: String = "X"
private val measureUnitQ: String = "ден/kW/година"
private val measureUnitOIL: String = "ден/л"
private val measureUnitRE: String = "€центи/kWh"


/**
 * RKE's (https://www.erc.org.mk/) resource types with test data.
 * TODO: connect to Firebase and fetch data from there.
 */
enum class ResourceType(
  val displayName: String,
  val shortName: String,
  val firebaseName: String,
  val subTypes: List<SubType>
) {
  ELECTRIC_ENERGY(
    "Електрична енергија",
    "EE",
    "electricity",
    listOf(SubType.H_HT_VT1, SubType.H_HT_VT2, SubType.H_HT_VT3, SubType.H_HT_VT4, SubType.H_LT_NT, SubType.S_HT_VT, SubType.S_LT_NT, SubType.P_D)
  ),
  NATURAL_GAS(
    "Природен гас",
    "NG",
    "NG",
    listOf()
  ),
  HEATING_ENERGY(
    "Топлинска енергија",
    "Q",
    "district_heating",
    listOf(SubType.HS_ESM_LLC_H_CHP, SubType.HS_ESM_DOOEL_H_TE, SubType.HS_ESM_LLC_O_ETP, SubType.HS_ESM_LLC_O_TE, SubType.S_SN_H_ETP, SubType.S_SN_H_TE, SubType.S_SN_O_CTP, SubType.SN_O_TE)
  ),
  OIL(
    "Нафта и нафтени деривати",
    "OIL",
    "oil_and_oil_derivatives",
    listOf(SubType.ES_95, SubType.ES_98, SubType.ED_BS, SubType.ELFO_1, SubType.M_1HC)
  ),
  RENEWABLE_ENERGY(
    "Обновливи извори",
    "RE",
    "renewable_sources",
    listOf(SubType.WPP_50MW, SubType.HPP_85kWh, SubType.HEP_85_170kWh, SubType.HEP_170_350kWh, SubType.HPP_350_700kWh, SubType.HPP_700kWh, SubType.BTPP, SubType.BGTPP)
  );

  enum class SubType(
    val displayName: String,
    val measureUnit: String,
    val price: Double,
    val validFrom: Date
  ) {
    /** ELECTRIC ENERGY RESOURCE SUB-TYPES */
    H_HT_VT1("Домаќинства ДВОТАРИФНО мерење (висока тарифа) ВТ1", measureUnitEE, 1.0, Date(2022-1900, 0, 1)),
    H_HT_VT2("Домаќинства ДВОТАРИФНО мерење (висока тарифа) ВТ2", measureUnitEE, 1.0, Date(2022-1900, 0, 1)),
    H_HT_VT3("Домаќинства ДВОТАРИФНО мерење (висока тарифа) ВТ3", measureUnitEE, 1.0, Date(2022-1900, 0, 1)),
    H_HT_VT4("Домаќинства ДВОТАРИФНО мерење (висока тарифа) ВТ4", measureUnitEE, 1.0, Date(2022-1900, 0, 1)),
    H_LT_NT("Домаќинства ДВОТАРИФНО мерење (ниска тарифа) НТ", measureUnitEE, 1.0, Date(2022-1900, 0, 1)),
    S_HT_VT("мали потрошувачи (висока тарифа) ВТ", measureUnitEE, 1.0, Date(2022-1900, 0, 1)),
    S_LT_NT("мали потрошувачи (ниска тарифа) НТ", measureUnitEE, 1.0, Date(2022-1900, 0, 1)),
    P_D("Надоместок за пренос и дистрибуција", measureUnitEE, 1.0, Date(2022-1900, 0, 1)),

    /** NATURAL GAS RESOURCE SUB-TYPES */

    /** HEATING ENERGY RESOURCE SUB-TYPES */
    HS_ESM_LLC_H_CHP("СНАБДУВАЊЕ СО ТОПЛИНА ЕСМ СНАБДУВАЊЕ СО ТОПЛИНА ДООЕЛ-ДОМАЌИНСТВА Ангажирана топлинска моќност на ниво на мерно место", measureUnitQ, 1.0, Date(2022-1900, 0, 1)),
    HS_ESM_DOOEL_H_TE("СНАБДУВАЊЕ СО ТОПЛИНА ЕСМ СНАБДУВАЊЕ СО ТОПЛИНА ДООЕЛ ДОМАЌИНСТВА Топлинска енергија на ниво на мерно место", measureUnitQ, 1.0, Date(2022-1900, 0, 1)),
    HS_ESM_LLC_O_ETP("СНАБДУВАЊЕ СО ТОПЛИНА ЕСМ СНАБДУВАЊЕ СО ТОПЛИНА ДООЕЛ ОСТАНАТИ Ангажирана топлинска моќност на ниво на мерно место", measureUnitQ, 1.0, Date(2022-1900, 0, 1)),
    HS_ESM_LLC_O_TE("СНАБДУВАЊЕ СО ТОПЛИНА ЕСМ СНАБДУВАЊЕ СО ТОПЛИНА ДООЕЛ ОСТАНАТИ Топлинска енергија на ниво на мерно место", measureUnitQ, 1.0, Date(2022-1900, 0, 1)),
    S_SN_H_ETP("СНАБДУВАЊЕ – СКОПЈЕ СЕВЕР ДОМАЌИНСТВА Ангажирана топлинска моќност на ниво на мерно место", measureUnitQ, 1.0, Date(2022-1900, 0, 1)),
    S_SN_H_TE("СНАБДУВАЊЕ – СКОПЈЕ СЕВЕР ДОМАЌИНСТВА Топлинска енергија на ниво на мерно место", measureUnitQ, 1.0, Date(2022-1900, 0, 1)),
    S_SN_O_CTP("СНАБДУВАЊЕ – СКОПЈЕ СЕВЕР ОСТАНАТИ Ангажирана топлинска моќност на ниво на мерно место", measureUnitQ, 1.0, Date(2022-1900, 0, 1)),
    SN_O_TE("СНАБДУВАЊЕ – СКОПЈЕ СЕВЕР ОСТАНАТИ Топлинска енергија на ниво на мерно место", measureUnitQ, 1.0, Date(2022-1900, 0, 1)),

    /** OIL AND OIL DERIVATIVES RESOURCE SUB-TYPES */
    ES_95("ЕУРОСУПЕР БС - 95", measureUnitOIL, 1.0, Date(2022-1900, 0, 1)),
    ES_98("ЕУРОСУПЕР БС - 98", measureUnitOIL, 1.0, Date(2022-1900, 0, 1)),
    ED_BS("ЕУРОДИЗЕЛ БС (Д-Е V)", measureUnitOIL, 1.0, Date(2022-1900, 0, 1)),
    ELFO_1("МАСЛО ЗА ГОРЕЊЕ ЕКСТРА ЛЕСНО 1(ЕЛ-1)", measureUnitOIL, 1.0, Date(2022-1900, 0, 1)),
    M_1HC("МАЗУТ М-1 HC", measureUnitOIL, 1.0, Date(2022-1900, 0, 1)),

    /** RENEWABLE ENERGY RESOURCE SUB-TYPES */
    WPP_50MW("ВЕТЕРНИ ЕЛЕКТРОЦЕНТРАЛИ ≤ 50 MW", measureUnitRE, 1.0, Date(2022-1900, 0, 1)),
    HPP_85kWh("ХИДРОЕЛЕКТРОЦЕНТРАЛИ ≤ 85.000 kWh", measureUnitRE, 1.0, Date(2022-1900, 0, 1)),
    HEP_85_170kWh("ХИДРОЕЛЕКТРОЦЕНТРАЛИ > 85.000 и ≤ 170.000 kWh", measureUnitRE, 1.0, Date(2022-1900, 0, 1)),
    HEP_170_350kWh("ХИДРОЕЛЕКТРОЦЕНТРАЛИ > 170.000 и ≤ 350.000 kWh", measureUnitRE, 1.0, Date(2022-1900, 0, 1)),
    HPP_350_700kWh("ХИДРОЕЛЕКТРОЦЕНТРАЛИ > 350.000 и ≤ 700.000 kWh", measureUnitRE, 1.0, Date(2022-1900, 0, 1)),
    HPP_700kWh("ХИДРОЕЛЕКТРОЦЕНТРАЛИ > 700.000 kWh", measureUnitRE, 1.0, Date(2022-1900, 0, 1)),
    BTPP("ТЕРМОЕЛЕКТРОЦЕНТРАЛИ НА БИОМАСА", measureUnitRE, 1.0, Date(2022-1900, 0, 1)),
    BGTPP("ТЕРМОЕЛЕКТРОЦЕНТРАЛИ НА БИОГАС", measureUnitRE, 1.0, Date(2022-1900, 0, 1)),
  }

  override fun toString(): String {
    return displayName
  }
}
