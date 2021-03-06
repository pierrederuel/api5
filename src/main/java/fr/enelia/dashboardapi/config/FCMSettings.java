package fr.enelia.dashboardapi.config;

import de.bytefish.fcmjava.http.options.IFcmClientSettings;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "fcm")
@Component
public class FCMSettings implements IFcmClientSettings {

    private String apiKey;
    private String url;

    @Override
    public String getFcmUrl() {
        return getApiKey();
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
