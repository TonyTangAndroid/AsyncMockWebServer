package com.mosn.asyncmockwebserver.example.ui;

import android.view.View;
import androidx.annotation.NonNull;

public interface Presenter {
  void bindView(@NonNull View view);

  void unbindView();

  boolean isBinding();
}
