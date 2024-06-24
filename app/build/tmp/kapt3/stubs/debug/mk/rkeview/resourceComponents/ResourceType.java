package mk.rkeview.resourceComponents;

/**
 * RKE's (https://www.erc.org.mk/) resource types with test data.
 * TODO: connect to Firebase and fetch data from there.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013\u00a8\u0006\u0015"}, d2 = {"Lmk/rkeview/resourceComponents/ResourceType;", "", "displayName", "", "shortName", "subTypes", "", "Lmk/rkeview/resourceComponents/ResourceType$SubType;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDisplayName", "()Ljava/lang/String;", "getShortName", "getSubTypes", "()Ljava/util/List;", "toString", "ELECTRIC_ENERGY", "NATURAL_GAS", "HEATING_ENERGY", "OIL", "RENEWABLE_ENERGY", "SubType", "app_debug"})
public enum ResourceType {
    /*public static final*/ ELECTRIC_ENERGY /* = new ELECTRIC_ENERGY(null, null, null) */,
    /*public static final*/ NATURAL_GAS /* = new NATURAL_GAS(null, null, null) */,
    /*public static final*/ HEATING_ENERGY /* = new HEATING_ENERGY(null, null, null) */,
    /*public static final*/ OIL /* = new OIL(null, null, null) */,
    /*public static final*/ RENEWABLE_ENERGY /* = new RENEWABLE_ENERGY(null, null, null) */;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String displayName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String shortName = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<mk.rkeview.resourceComponents.ResourceType.SubType> subTypes = null;
    
    ResourceType(java.lang.String displayName, java.lang.String shortName, java.util.List<? extends mk.rkeview.resourceComponents.ResourceType.SubType> subTypes) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShortName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<mk.rkeview.resourceComponents.ResourceType.SubType> getSubTypes() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.EnumEntries<mk.rkeview.resourceComponents.ResourceType> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-\u00a8\u0006."}, d2 = {"Lmk/rkeview/resourceComponents/ResourceType$SubType;", "", "displayName", "", "measureUnit", "price", "", "validFrom", "Ljava/util/Date;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;DLjava/util/Date;)V", "getDisplayName", "()Ljava/lang/String;", "getMeasureUnit", "getPrice", "()D", "getValidFrom", "()Ljava/util/Date;", "H_HT_VT1", "H_HT_VT2", "H_HT_VT3", "H_HT_VT4", "H_LT_NT", "S_HT_VT", "S_LT_NT", "P_D", "HS_ESM_LLC_H_CHP", "HS_ESM_DOOEL_H_TE", "HS_ESM_LLC_O_ETP", "HS_ESM_LLC_O_TE", "S_SN_H_ETP", "S_SN_H_TE", "S_SN_O_CTP", "SN_O_TE", "ES_95", "ES_98", "ED_BS", "ELFO_1", "M_1HC", "WPP_50MW", "HPP_85kWh", "HEP_85_170kWh", "HEP_170_350kWh", "HPP_350_700kWh", "HPP_700kWh", "BTPP", "BGTPP", "app_debug"})
    public static enum SubType {
        /*public static final*/ H_HT_VT1 /* = new H_HT_VT1(null, null, 0.0, null) */,
        /*public static final*/ H_HT_VT2 /* = new H_HT_VT2(null, null, 0.0, null) */,
        /*public static final*/ H_HT_VT3 /* = new H_HT_VT3(null, null, 0.0, null) */,
        /*public static final*/ H_HT_VT4 /* = new H_HT_VT4(null, null, 0.0, null) */,
        /*public static final*/ H_LT_NT /* = new H_LT_NT(null, null, 0.0, null) */,
        /*public static final*/ S_HT_VT /* = new S_HT_VT(null, null, 0.0, null) */,
        /*public static final*/ S_LT_NT /* = new S_LT_NT(null, null, 0.0, null) */,
        /*public static final*/ P_D /* = new P_D(null, null, 0.0, null) */,
        /*public static final*/ HS_ESM_LLC_H_CHP /* = new HS_ESM_LLC_H_CHP(null, null, 0.0, null) */,
        /*public static final*/ HS_ESM_DOOEL_H_TE /* = new HS_ESM_DOOEL_H_TE(null, null, 0.0, null) */,
        /*public static final*/ HS_ESM_LLC_O_ETP /* = new HS_ESM_LLC_O_ETP(null, null, 0.0, null) */,
        /*public static final*/ HS_ESM_LLC_O_TE /* = new HS_ESM_LLC_O_TE(null, null, 0.0, null) */,
        /*public static final*/ S_SN_H_ETP /* = new S_SN_H_ETP(null, null, 0.0, null) */,
        /*public static final*/ S_SN_H_TE /* = new S_SN_H_TE(null, null, 0.0, null) */,
        /*public static final*/ S_SN_O_CTP /* = new S_SN_O_CTP(null, null, 0.0, null) */,
        /*public static final*/ SN_O_TE /* = new SN_O_TE(null, null, 0.0, null) */,
        /*public static final*/ ES_95 /* = new ES_95(null, null, 0.0, null) */,
        /*public static final*/ ES_98 /* = new ES_98(null, null, 0.0, null) */,
        /*public static final*/ ED_BS /* = new ED_BS(null, null, 0.0, null) */,
        /*public static final*/ ELFO_1 /* = new ELFO_1(null, null, 0.0, null) */,
        /*public static final*/ M_1HC /* = new M_1HC(null, null, 0.0, null) */,
        /*public static final*/ WPP_50MW /* = new WPP_50MW(null, null, 0.0, null) */,
        /*public static final*/ HPP_85kWh /* = new HPP_85kWh(null, null, 0.0, null) */,
        /*public static final*/ HEP_85_170kWh /* = new HEP_85_170kWh(null, null, 0.0, null) */,
        /*public static final*/ HEP_170_350kWh /* = new HEP_170_350kWh(null, null, 0.0, null) */,
        /*public static final*/ HPP_350_700kWh /* = new HPP_350_700kWh(null, null, 0.0, null) */,
        /*public static final*/ HPP_700kWh /* = new HPP_700kWh(null, null, 0.0, null) */,
        /*public static final*/ BTPP /* = new BTPP(null, null, 0.0, null) */,
        /*public static final*/ BGTPP /* = new BGTPP(null, null, 0.0, null) */;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String displayName = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String measureUnit = null;
        private final double price = 0.0;
        @org.jetbrains.annotations.NotNull
        private final java.util.Date validFrom = null;
        
        SubType(java.lang.String displayName, java.lang.String measureUnit, double price, java.util.Date validFrom) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDisplayName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMeasureUnit() {
            return null;
        }
        
        public final double getPrice() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Date getValidFrom() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<mk.rkeview.resourceComponents.ResourceType.SubType> getEntries() {
            return null;
        }
    }
}