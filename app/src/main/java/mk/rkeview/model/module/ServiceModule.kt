package mk.rkeview.model.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mk.rkeview.model.EnergyResourceService
import mk.rkeview.model.service.EnergyResourceServiceImpl

// This module connects implementations with interfaces

// In this example: EnergyResourceService -> EnergyResourceServiceImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class ServiceModule {
    @Binds
    abstract fun provideStorageService(impl: EnergyResourceServiceImpl): EnergyResourceService
}