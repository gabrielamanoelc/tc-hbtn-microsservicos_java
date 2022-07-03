package com.song.demo.SongApi; import org.springframework.stereotype.Repository; import java.util.ArrayList; import java.util.List; 
import java.util.stream.Collectors; @Repository public class SongRepository {
    private List<Song> list = new ArrayList<>(); public List<Song> getAllSongs() { return list;
    }
    public Song getSongById(Integer id) { return list.stream().filter(song -> 
        song.getId().equals(id)).collect(Collectors.toList()).get(0);
    }
    public Song addSong(Song s) { list.add(s); return s;
    }
    public Song updateSong(Song s) { list.forEach(song -> { if(song.getId().equals(s.getId())){ song.setId(s.getId()); 
                song.setArtista(s.getArtista()); song.setAlbum(s.getAlbum()); song.setAnoLancamento(s.getAnoLancamento());
            }
        });
        return s;
    }
    public void removeSong(Song s) { list.remove(s);
    }
}
