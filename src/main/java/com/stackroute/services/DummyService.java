package com.stackroute.services;

import com.stackroute.exception.AlreadyExistsExeption;
import com.stackroute.packet.Music;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Profile("dummy")
@Service
public class DummyService implements MusicService
{

    @Override
    public Music saveTrack(Music music) throws AlreadyExistsExeption {
        return null;
    }

    @Override
    public List<Music> getAllTracks() {
        return null;
    }

    @Override
    public void delTrack(int id) {

    }

    @Override
    public Music updateTrack(Music music) {
        return null;
    }

    @Override
    public List<Music> getthistrack(String name) {
        return null;
    }
}
