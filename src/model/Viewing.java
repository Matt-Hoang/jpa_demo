package model;

import java.time.*;
import jakarta.persistence.*;

@Entity(name = "viewings")
public class Viewing {
    @Id
    @JoinColumn(name = "artpiece_id")
    @ManyToOne
    private ArtPiece artPiece;

    @Id
    @JoinColumn(name = "visitor_id")
    @ManyToOne
    private Visitor visitor;

    @Id
    @Column(name = "view_date")
    private LocalDate ViewDate;

    private int score;

    public Viewing() {
    }

    public Viewing(ArtPiece artPiece, Visitor visitor, LocalDate ViewDate, int score) {
        this.artPiece = artPiece;
        this.visitor = visitor;
        this.ViewDate = ViewDate;
        this.score = score;
    }

    public ArtPiece getArtPiece() {
        return artPiece;
    }

    public void setArtPiece(ArtPiece artPiece) {
        this.artPiece = artPiece;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public LocalDate getViewDate() {
        return ViewDate;
    }

    public void setViewDate(LocalDate viewDate) {
        ViewDate = viewDate;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}