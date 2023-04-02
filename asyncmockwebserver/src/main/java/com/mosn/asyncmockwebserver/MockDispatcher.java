package com.mosn.asyncmockwebserver;

import okhttp3.mockwebserver.RecordedRequest;

public interface MockDispatcher {
  boolean isDispatch(RecordedRequest request);
}
