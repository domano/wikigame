package de.wikigame;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by domano on 29.11.15.
 */
@RestController
public class ArticleController {

    @RequestMapping("/article/random")
    public String getRandomArticle() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        RequestEntity requestEntity = new RequestEntity(HttpMethod.GET, new URI("https://de.wikipedia.org/w/api.php?action=query&list=random&rnlimit=5&rnnamespace=0"));
        ResponseEntity responseEntity = restTemplate.exchange(requestEntity, String.class);

        return (String) responseEntity.getBody();

    }
}
