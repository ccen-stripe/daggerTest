package com.example.daggertest

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
class ToyModule {
    @Provides
    @Named("someString")
    fun provideSomeString(): String = "stringProvided"
}