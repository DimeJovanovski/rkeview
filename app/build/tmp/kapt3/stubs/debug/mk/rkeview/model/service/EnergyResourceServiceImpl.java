package mk.rkeview.model.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lmk/rkeview/model/service/EnergyResourceServiceImpl;", "Lmk/rkeview/model/EnergyResourceService;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "collection", "Lcom/google/firebase/firestore/CollectionReference;", "getCollection", "()Lcom/google/firebase/firestore/CollectionReference;", "resources", "Lkotlinx/coroutines/flow/Flow;", "", "Lmk/rkeview/model/EnergyResource;", "getResources", "()Lkotlinx/coroutines/flow/Flow;", "delete", "", "energyResourceId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResource", "loadResources", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "energyResource", "(Lmk/rkeview/model/EnergyResource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "Companion", "app_debug"})
public final class EnergyResourceServiceImpl implements mk.rkeview.model.EnergyResourceService {
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DISTRICT_HEATING = "district_heating";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ELECTRICITY = "electricity";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String OIL_AND_OIL_DERIVATIVES = "oil_and_oil_derivatives";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String RENEWABLE_SOURCES = "renewable_sources";
    @org.jetbrains.annotations.NotNull
    public static final mk.rkeview.model.service.EnergyResourceServiceImpl.Companion Companion = null;
    
    @javax.inject.Inject
    public EnergyResourceServiceImpl(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore) {
        super();
    }
    
    private final com.google.firebase.firestore.CollectionReference getCollection() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<mk.rkeview.model.EnergyResource>> getResources() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getResource(@org.jetbrains.annotations.NotNull
    java.lang.String energyResourceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super mk.rkeview.model.EnergyResource> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object save(@org.jetbrains.annotations.NotNull
    mk.rkeview.model.EnergyResource energyResource, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object update(@org.jetbrains.annotations.NotNull
    mk.rkeview.model.EnergyResource energyResource, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object delete(@org.jetbrains.annotations.NotNull
    java.lang.String energyResourceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object loadResources(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<mk.rkeview.model.EnergyResource>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lmk/rkeview/model/service/EnergyResourceServiceImpl$Companion;", "", "()V", "DISTRICT_HEATING", "", "ELECTRICITY", "OIL_AND_OIL_DERIVATIVES", "RENEWABLE_SOURCES", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}