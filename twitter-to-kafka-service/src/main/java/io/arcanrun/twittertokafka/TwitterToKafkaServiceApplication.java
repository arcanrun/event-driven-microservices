package io.arcanrun.twittertokafka;

import io.arcanrun.twittertokafka.config.TwitterToKafkaProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    TwitterToKafkaProperties twitterToKafkaProperties;

    public TwitterToKafkaServiceApplication(TwitterToKafkaProperties twitterToKafkaProperties) {
        this.twitterToKafkaProperties = twitterToKafkaProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("PROPS: {}", twitterToKafkaProperties.getTwitterKeywords());

    }
}
