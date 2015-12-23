package de.wikigame.Entitiy;

import javax.persistence.*;
import java.util.List;

@Entity
public class Game {

    @Id
    @GeneratedValue
    long id;

    @OneToMany
    List<WikiPage> wikiPages;

    @OneToOne
    WikiPage startPage;

    @OneToOne
    WikiPage endPage;

    boolean finished;

    public List<WikiPage> getWikiPages() {
        return wikiPages;
    }

    public void setWikiPages(final List<WikiPage> wikiPages) {
        this.wikiPages = wikiPages;
    }

    public WikiPage getStartPage() {
        return startPage;
    }

    public void setStartPage(final WikiPage startPage) {
        this.startPage = startPage;
    }

    public WikiPage getEndPage() {
        return endPage;
    }

    public void setEndPage(final WikiPage endPage) {
        this.endPage = endPage;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(final boolean finished) {
        this.finished = finished;
    }
}
