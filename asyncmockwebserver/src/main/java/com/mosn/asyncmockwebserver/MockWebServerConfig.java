package com.mosn.asyncmockwebserver;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import javax.net.ServerSocketFactory;
import okhttp3.Protocol;

/**
 * Config of MockWebServer. <br>
 *
 * @see okhttp3.mockwebserver.MockWebServer#setBodyLimit(long)
 * @see okhttp3.mockwebserver.MockWebServer#setProtocolNegotiationEnabled(boolean)
 * @see okhttp3.mockwebserver.MockWebServer#setProtocols(List)
 * @see okhttp3.mockwebserver.MockWebServer#setServerSocketFactory(ServerSocketFactory)
 */
public class MockWebServerConfig {

  final long maxBodyLength;
  final boolean protocolNegotiationEnabled;
  @Nullable final ServerSocketFactory serverSocketFactory;
  @NonNull final List<Protocol> protocols;

  MockWebServerConfig(
      long maxBodyLength,
      boolean protocolNegotiationEnabled,
      @Nullable ServerSocketFactory serverSocketFactory,
      @NonNull List<Protocol> protocols) {
    this.maxBodyLength = maxBodyLength;
    this.protocolNegotiationEnabled = protocolNegotiationEnabled;
    this.serverSocketFactory = serverSocketFactory;
    this.protocols = protocols;
  }

  public static class Builder {
    private long maxBodyLength = Long.MAX_VALUE;
    private boolean protocolNegotiationEnabled = true;
    @Nullable private ServerSocketFactory serverSocketFactory;
    @NonNull private List<Protocol> protocols = new ArrayList<>();

    public Builder setMaxBodyLength(long maxBodyLength) {
      this.maxBodyLength = maxBodyLength;
      return this;
    }

    public Builder setProtocolNegotiationEnabled(boolean protocolNegotiationEnabled) {
      this.protocolNegotiationEnabled = protocolNegotiationEnabled;
      return this;
    }

    public Builder setServerSocketFactory(@Nullable ServerSocketFactory serverSocketFactory) {
      this.serverSocketFactory = serverSocketFactory;
      return this;
    }

    public Builder setProtocols(@NonNull List<Protocol> protocols) {
      this.protocols = protocols;
      return this;
    }

    public MockWebServerConfig build() {
      return new MockWebServerConfig(
          maxBodyLength, protocolNegotiationEnabled, serverSocketFactory, protocols);
    }
  }
}
