package homeworks.homework10;

import java.util.HashMap;
import java.util.Map;

public class TestUrl {

    public String protocol = "";
    public String domain = "";
    public String port;
    public String path = "";
    public Map<String, String> param = new HashMap<>();

    public static class Builder {
        private TestUrl url;

        public Builder(TestUrl url) {
            this.url = url;
        }

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
            url.port = ":" + port + "?";
            return this;
        }

        public Builder withPath(String path) {
            url.path = path;
            return this;
        }

        public Builder withParam(HashMap<String, String> params) {
            url.param.putAll(params);
            return this;
        }

        public Builder withParam(String key, String value) {
            url.param.put(key, value);
            return this;
        }

        private String convertMapToString(Map<String, String> param){
            StringBuilder result = new StringBuilder();
            for (Map.Entry<String, String> entry: param.entrySet()) {
                result.append(entry.getKey());
                if (!entry.getValue().equals("")){
                    result.append("=");
                    result.append(entry.getValue());
                }
                result.append("&");
            }
            return result.toString().substring(0, result.toString().length() -1);

        }

        public String build() {
            url.domain = url.domain.endsWith(".") ? url.domain.
                    substring(0, url.domain.length() -1 ): url.domain;
            return new StringBuilder()
                    .append(url.protocol)
                    .append(url.domain)
                    .append(url.port)
                    .append(url.path)
                    .append("?" + convertMapToString(url.param))
                    .toString();
        }
    }


}
