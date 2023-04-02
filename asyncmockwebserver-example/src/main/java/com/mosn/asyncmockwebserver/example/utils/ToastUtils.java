package com.mosn.asyncmockwebserver.example.utils;

import android.content.Context;
import android.widget.Toast;
import androidx.annotation.Nullable;

public class ToastUtils {

  private ToastUtils() {}

  public static void show(@Nullable Context context, String text) {
    if (context == null) return;
    Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
  }

  public static void showLong(@Nullable Context context, String text) {
    if (context == null) return;
    Toast.makeText(context, text, Toast.LENGTH_LONG).show();
  }
}
