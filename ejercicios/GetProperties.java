package utilities;

import java.io.InputStream;
import java.util.Properties;

public class GetProperties {
    private Properties properties =new Properties();


    public GetProperties (){
        InputStream config = getClass().getResourceAsStream("/config.properties");
        try {
            properties.load(config);
        } catch (Exception ex){
            System.out.println("ha ocurrido una excepcion" + ex.getMessage());

        }
        }
     public String getString(String propName){
        return properties.getProperty(propName);
     }
    }

