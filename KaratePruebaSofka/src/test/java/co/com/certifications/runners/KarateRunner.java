package co.com.certifications.runners;

import com.intuit.karate.junit5.Karate;

public class KarateRunner {
    @Karate.Test
    Karate testAll() {
        return Karate.run("classpath:usercases.feature/karate_prueba.feature").relativeTo(getClass());
    }
}
