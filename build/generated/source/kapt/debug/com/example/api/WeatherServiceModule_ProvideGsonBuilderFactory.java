// Generated by Dagger (https://dagger.dev).
package com.example.api;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherServiceModule_ProvideGsonBuilderFactory implements Factory<Gson> {
  @Override
  public Gson get() {
    return provideGsonBuilder();
  }

  public static WeatherServiceModule_ProvideGsonBuilderFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Gson provideGsonBuilder() {
    return Preconditions.checkNotNullFromProvides(WeatherServiceModule.INSTANCE.provideGsonBuilder());
  }

  private static final class InstanceHolder {
    private static final WeatherServiceModule_ProvideGsonBuilderFactory INSTANCE = new WeatherServiceModule_ProvideGsonBuilderFactory();
  }
}
