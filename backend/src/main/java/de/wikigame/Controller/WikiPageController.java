package de.wikigame.Controller;

import de.wikigame.Entitiy.WikiPage;
import de.wikigame.Repository.WikiPageRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class WikiPageController {

    @Inject
    WikiPageRepository wikiPageRepository;

    @RequestMapping("/page/save")
    public void savePage(@RequestParam String url) {
        wikiPageRepository.save(new WikiPage(url));
    }

    @RequestMapping("/page/show/all")
    public String showPages() {
        StringBuffer pages = new StringBuffer();
        wikiPageRepository.findAll().forEach(n -> {
            pages.append(n.getUrl()+",");
        });
        return String.valueOf(pages);
    }

    @RequestMapping("/")
    public String defaultAnswer() {
        return "I am alive!";
    }
}
