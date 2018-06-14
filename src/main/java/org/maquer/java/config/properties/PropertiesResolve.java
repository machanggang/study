package org.maquer.java.config.properties;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.maquer.java.config.Resolve;

public class PropertiesResolve implements Resolve {

    public static final String EXTEND_PROP_NAME = "config.ext";

    @Override
    public Map<String, String> resolve() {
        Map<String, String> map = new HashMap<String, String>();
        String fileName = "/config.properties";
        do {
            try {
                Map<String, String> m = this.read(fileName);
                if (m != null) {
                    map.putAll(m);
                }
                fileName = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while ((fileName = map.get(EXTEND_PROP_NAME)) != null);

        return map;
    }

    private Map<String, String> read(String propFileName) throws IOException {
        return this.read(new FileInputStream(propFileName));
    }

    private Map<String, String> read(InputStream is) throws IOException {
        Map<String, String> map = new HashMap<String, String>();
        Properties props = new Properties();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
            props.load(br);
            Enumeration<?> e = props.propertyNames();
            while (e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String value = props.getProperty(key);
                map.put(key, value);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                is.close();
            }
        }

        return map;
    }

    public static void main(String[] args) {

    }
}
