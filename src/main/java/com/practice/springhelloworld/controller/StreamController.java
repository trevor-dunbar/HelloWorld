package com.practice.springhelloworld.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@Slf4j
public class StreamController {

    // Text crawl from Star Wars II: Attack of the Clones
    private final String[] speech = "There is unrest in the Galactic Senate. Several thousand solar systems have declared their intentions to leave the Republic. This separatist movement, under the leadership of the mysterious Count Dooku, has made it difficult for the limited number of Jedi Knights to maintain peace and order in the galaxy. Senator Amidala, the former Queen of Naboo, is returning to the Galactic Senate to vote on the critical issue of creating an ARMY OF THE REPUBLIC to assist the overwhelmed  Jedi...".split(" ");

    @GetMapping(path="/stream-starwars", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> getSpeech() {
        log.info("Streaming initiated");
        return Flux.fromArray(speech)
                .delayElements(Duration.ofSeconds(1))
                .log();
    }
}
