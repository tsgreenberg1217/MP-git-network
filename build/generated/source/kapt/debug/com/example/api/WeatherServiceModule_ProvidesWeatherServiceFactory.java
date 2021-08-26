// Generated by Dagger (https://dagger.dev).
package com.example.api;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherServiceModule_ProvidesWeatherServiceFactory implements Factory<WeatherService> {
  private final Provider<Retrofit.Builder> retrofitProvider;

  public WeatherServiceModule_ProvidesWeatherServiceFactory(
      Provider<Retrofit.Builder> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public WeatherService get() {
    return providesWeatherService(retrofitProvider.get());
  }

  public static WeatherServiceModule_ProvidesWeatherServiceFactory create(
      Provider<Retrofit.Builder> retrofitProvider) {
    return new WeatherServiceModule_ProvidesWeatherServiceFactory(retrofitProvider);
  }

  public static WeatherService providesWeatherService(Retrofit.Builder retrofit) {
    return Preconditions.checkNotNullFromProvides(WeatherServiceModule.INSTANCE.providesWeatherService(retrofit));
  }
}