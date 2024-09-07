package mk.rkeview.model.service.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mk.rkeview.model.service.EnergyResourceService
import mk.rkeview.model.service.impl.EnergyResourceServiceImpl

// This module connects implementations with interfaces

// In this example: EnergyResourceService -> EnergyResourceServiceImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class ServiceModule {
    @Binds
    abstract fun provideStorageService(impl: EnergyResourceServiceImpl): EnergyResourceService
}