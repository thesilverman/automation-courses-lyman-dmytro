package homeworks.homework10;

import java.util.HashMap;
import java.util.Map;

public class TestUrl {

    public String protocol;
    public String domain;
    public String port;
    public String path;
    public HashMap<String, String> params;
    private HashMap<String, String> withParam;

    public static class Builder {
        private final TestUrl url;

        public Builder() {
            url = new TestUrl();
        }

        public Builder withProtocol(String protocol) {
            url.protocol = protocol;
            return this;
        }

        public Builder withDomain(String domain) {
            url.domain = domain;
            return this;
        }

        public Builder withPort(String port) {
            url.port = ":" + port;
            return this;
        }

        public Builder withPath(String path) {
            url.path = path;
            return this;
        }

        public Builder params(HashMap<String, String> param) {
            url.params = param;
            return this;
        }

       public Builder withParam(HashMap<String, String> params) {
           url.withParam = params;
           return this;
        }

    public String build() {
            String result = "";
            new StringBuilder()
                    .append(url.protocol)
                    .append(url.domain)
                    .append(url.port)
                    .append(url.path)
                    .append(url.params)
                    .append(url.withParam)
                    .toString();
            return result;
        }
    }

}
