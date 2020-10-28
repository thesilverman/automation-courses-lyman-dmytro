package homeworks.homework10;

import java.util.HashMap;

public class HashMap {

    public String protocol;
    public String domain;
    public String port;
    public String path;
    HashMap<String, String> param = new java.util.HashMap<>();

    public static class Builder {
        private TestUrl url;

        public Builder() {
            url = new TestUrl();
        }

        public TestUrl.Builder withProtocol(String protocol) {
            url.protocol = protocol;
            return this;
        }

        public TestUrl.Builder withDomain(String domain) {
            url.domain = domain;
            return this;
        }

        public TestUrl.Builder withPort(String port) {
            url.port = ":" + port;
            return this;
        }

        public TestUrl.Builder withPath(String path) {
            url.path = path;
            return this;
        }


        public TestUrl.Builder withParam(String param) {
            url.param.put("0", "?");
            return this;
        }

        public TestUrl.Builder withParam(String key, String value) {
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
