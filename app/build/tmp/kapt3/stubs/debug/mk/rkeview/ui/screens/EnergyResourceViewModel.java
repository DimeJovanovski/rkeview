package mk.rkeview.ui.screens;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lmk/rkeview/ui/screens/EnergyResourceViewModel;", "Lmk/rkeview/ui/screens/BaseViewModel;", "resourceService", "Lmk/rkeview/model/EnergyResourceService;", "(Lmk/rkeview/model/EnergyResourceService;)V", "resources", "Lkotlinx/coroutines/flow/Flow;", "", "Lmk/rkeview/model/EnergyResource;", "getResources", "()Lkotlinx/coroutines/flow/Flow;", "loadResources", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class EnergyResourceViewModel extends mk.rkeview.ui.screens.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final mk.rkeview.model.EnergyResourceService resourceService = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<mk.rkeview.model.EnergyResource>> resources = null;
    
    @javax.inject.Inject
    public EnergyResourceViewModel(@org.jetbrains.annotations.NotNull
    mk.rkeview.model.EnergyResourceService resourceService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<mk.rkeview.model.EnergyResource>> getResources() {
        return null;
    }
    
    public final void loadResources() {
    }
}