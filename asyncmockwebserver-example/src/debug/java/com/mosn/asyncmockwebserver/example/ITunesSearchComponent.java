package com.mosn.asyncmockwebserver.example;

import com.mosn.asyncmockwebserver.example.infrastructure.InfrastructureModule;
import com.mosn.asyncmockwebserver.example.infrastructure.api.search.ContentsRepositoryImpl;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {ITunesSearchModule.class, InfrastructureModule.class})
public interface ITunesSearchComponent {
  void inject(ITunesSearchApplication application);

  void inject(ContentsRepositoryImpl searchApiRepository);
}
