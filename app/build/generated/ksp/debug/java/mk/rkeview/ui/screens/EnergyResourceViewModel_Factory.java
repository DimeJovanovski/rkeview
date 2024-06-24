package mk.rkeview.ui.screens;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import mk.rkeview.model.EnergyResourceService;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class EnergyResourceViewModel_Factory implements Factory<EnergyResourceViewModel> {
  private final Provider<EnergyResourceService> resourceServiceProvider;

  public EnergyResourceViewModel_Factory(Provider<EnergyResourceService> resourceServiceProvider) {
    this.resourceServiceProvider = resourceServiceProvider;
  }

  @Override
  public EnergyResourceViewModel get() {
    return newInstance(resourceServiceProvider.get());
  }

  public static EnergyResourceViewModel_Factory create(
      Provider<EnergyResourceService> resourceServiceProvider) {
    return new EnergyResourceViewModel_Factory(resourceServiceProvider);
  }

  public static EnergyResourceViewModel newInstance(EnergyResourceService resourceService) {
    return new EnergyResourceViewModel(resourceService);
  }
}
