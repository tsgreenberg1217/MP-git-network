// Generated by Dagger (https://dagger.dev).
package com.example.api;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherServiceModule_ProvideRetrofitClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideRetrofitClient();
  }

  public static WeatherServiceModule_ProvideRetrofitClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideRetrofitClient() {
    return Preconditions.checkNotNullFromProvides(WeatherServiceModule.INSTANCE.provideRetrofitClient());
  }

  private static final class InstanceHolder {
    private static final WeatherServiceModule_ProvideRetrofitClientFactory INSTANCE = new WeatherServiceModule_ProvideRetrofitClientFactory();
  }
}
