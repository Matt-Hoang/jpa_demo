package model;

import java.util.*;
import java.time.*;
import jakarta.persistence.*;

@Entity(name = "artpieces")
public class ArtPiece {
    @Id
    @Column(name = "artpiece_id")
    private int artpieceID;

    private String title;
    private String artist;
 
    @Column(name = "creationdate") 
    private LocalDate creationDate;

    // Bidirectional many-to-one back to buildings??
    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;

    // Many-to-many with Visitors, via the association (junciton) class Viewing
    @OneToMany(mappedBy = "artPiece")
    private Set<Viewing> viewed;

    public ArtPiece() {
    }

    public ArtPiece(int artpiece_id, String title, String artist, LocalDate creationDate, Building building) {
        this.artpieceID = artpiece_id;
        this.title = title;
        this.artist = artist;
        this.creationDate = creationDate;
        this.building = building;
    }

    // do we need toString() ??
    @Override
    public String toString() {
        return "Title: '" + title + "', Artist: " + artist + ", Creation Date: " + creationDate + ", Building: " + building;
    }

    public int getArtpieceID() {
        return artpieceID;
    }

    public void setArtpieceID(int artpieceID) {
        this.artpieceID = artpieceID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
    
}
