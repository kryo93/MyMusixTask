package com.stackroute.services;

import com.stackroute.exception.AlreadyExistsExeption;
import com.stackroute.packet.Music;
import com.stackroute.repository.MyMusicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Primary  //primary and profile and qualifier are redundant over each othere and while using properties you need to mention it in appliaction properties file
//@Profile({"dev" , "prod"})
@Service
public class Serviceimpl implements MusicService {
   MyMusicRepo myMusicRepo;

   @Autowired
    public Serviceimpl(MyMusicRepo myMusicRepo) {
       this.myMusicRepo = myMusicRepo;
    }



    @Override
    public void delTrack(int id) {
       Music delTrack = myMusicRepo.findBytrackId(id);
      myMusicRepo.delete(delTrack);

    }



    @Override
    public Music saveTrack(Music music)throws AlreadyExistsExeption {
       if(myMusicRepo.existsById(music.getTrackId()))
       {
           throw new AlreadyExistsExeption("pehle se hai");
       }
        Music savedTrack = myMusicRepo.save(music);
        return savedTrack;
    }

    @Override
    public List<Music> getAllTracks() {
        return (List<Music>) myMusicRepo.findAll();
    }

    @Override
    public Music updateTrack(Music music)
    {
        Music savedTrack = myMusicRepo.save(music);
        return savedTrack;
    }

    @Override
    public List<Music> getthistrack(String name) {
        return myMusicRepo.findByAlbum(name);
    }



}
