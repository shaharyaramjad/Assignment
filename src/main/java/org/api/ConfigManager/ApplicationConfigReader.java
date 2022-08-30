package org.api.ConfigManager;


import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource.Classpath;

@Classpath({"config.properties"})
public class ApplicationConfigReader {
    @Property("baseurl")
    private String baseurl;

    public ApplicationConfigReader() {
        PropertyLoader.newInstance().populate(this);
    }

    public String getBaseUrl() {
        return this.baseurl;
    }



}
