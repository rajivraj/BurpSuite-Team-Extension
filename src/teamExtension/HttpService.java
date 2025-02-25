package teamExtension;

import burp.IHttpService;

class HttpService implements IHttpService
{
    private String host;
    private int port;
    private String protocol;

    HttpService(IHttpService copy) {
        this.host = copy.getHost();
        this.port = copy.getPort();
        this.protocol = copy.getProtocol();
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public String getProtocol() {
        return protocol;
    }
}
