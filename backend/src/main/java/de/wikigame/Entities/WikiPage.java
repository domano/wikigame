package de.wikigame.Entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WikiPage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String url;

    public WikiPage(final String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
