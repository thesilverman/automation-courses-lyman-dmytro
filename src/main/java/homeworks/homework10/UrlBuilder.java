package homeworks.homework10;

import java.util.HashMap;

public class UrlBuilder {

    public class TestUrl {

        public String protocol;
        public String domain;
        public String port;
        public String path;
        HashMap<String, String> param = new HashMap<>();

        public static class Builder {
            private TestUrl url;

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


            public Builder withParam(String param) {
                url.param.put("0", "?");
                return this;
            }

            public Builder withParam(String key, String value) {
                url.protocol = "?" + key + "+" + value;
                return this;
            }

            public String build() {
                String result = "";
                new StringBuilder()
                        .append(url.protocol)
                        .append(url.domain)
                        .append(url.port)
                        .append(url.path)
                        .append(url.param)
                        .toString();
                return result;
            }
        }
    }
}
