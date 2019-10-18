package com.stackroute.packet;




import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Music
{

    @Id

    private int trackId;

    private String album;

    private String comment;

//    public Music() {
//    }
//
//    @Override
//    public String toString() {
//        return "Music{" +
//                "trackId=" + trackId +
//                ", album='" + album + '\'' +
//                ", comment='" + comment + '\'' +
//                '}';
//    }
//
//    public int getTrackId() {
//        return trackId;
//    }
//
//    public void setTrackId(int trackId) {
//        this.trackId = trackId;
//    }
//
//    public String getAlbum() {
//        return album;
//    }
//
//    public void setAlbum(String album) {
//        this.album = album;
//    }
//
//    public String getComment() {
//        return comment;
//    }
//
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//
//    public Music(int trackId, String album, String comment) {
//        this.trackId = trackId;
//        this.album = album;
//        this.comment = comment;
//    }
}
