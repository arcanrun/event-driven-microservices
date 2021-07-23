package io.arcanrun.twittertokafka.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Data
@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka")
public class TwitterToKafkaProperties {
    private List<String> twitterKeywords;
}
