package model.db.impl;

import es.ies.puerto.config.AppConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.Utilities;

public class AppConfigTest extends Utilities {
    AppConfig appConfig;
    String url = "src/main/resources/usuarios.db";

    @BeforeEach
    public void beforeEach() {
        try {
            appConfig = new AppConfig();
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void obtainUrlBd() {
        try {
            String urlBbFile = appConfig.getUrlDb();
            Assertions.assertEquals(url, urlBbFile, MESSAGE_ERROR);
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }
}
