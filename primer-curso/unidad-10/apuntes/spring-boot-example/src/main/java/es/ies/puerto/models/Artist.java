package es.ies.puerto.models;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;

public class Artist {
    private String id;
    private String name;

    private List<Song> songs;
    public Artist() {
        songs = new ArrayList<>();
    }

    public Artist(String id) {
        this.id = id;
        songs = new ArrayList<>();
    }

    public Artist(String id, String name) {
        this.id = id;
        this.name = name;
        songs = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Artist artist = (Artist) object;
        return Objects.equals(id, artist.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
