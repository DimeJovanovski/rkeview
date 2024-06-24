package mk.rkeview.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lmk/rkeview/model/EnergyResourceService;", "", "resources", "Lkotlinx/coroutines/flow/Flow;", "", "Lmk/rkeview/model/EnergyResource;", "getResources", "()Lkotlinx/coroutines/flow/Flow;", "delete", "", "energyResourceId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResource", "loadResources", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "energyResource", "(Lmk/rkeview/model/EnergyResource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public abstract interface EnergyResourceService {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<mk.rkeview.model.EnergyResource>> getResources();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getResource(@org.jetbrains.annotations.NotNull
    java.lang.String energyResourceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super mk.rkeview.model.EnergyResource> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object save(@org.jetbrains.annotations.NotNull
    mk.rkeview.model.EnergyResource energyResource, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull
    mk.rkeview.model.EnergyResource energyResource, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    java.lang.String energyResourceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object loadResources(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<mk.rkeview.model.EnergyResource>> $completion);
}