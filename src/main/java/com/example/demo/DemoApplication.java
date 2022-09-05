package com.example.demo;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.io.FileInputStream;
import java.io.IOException;

@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
@SpringBootApplication
public class DemoApplication {

    private static void firebaseInit() {
        FileInputStream serviceAccount = null;
        try {
            serviceAccount = new FileInputStream("src/main/resources/firebase_config.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

    public static void main(String[] args) {
        firebaseInit();
        SpringApplication.run(DemoApplication.class, args);
    }


}
