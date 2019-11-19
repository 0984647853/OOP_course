import java.util.*;
import java.util.stream.Collectors;

public class homework4 {
    public static void main(String[] args) {
        MusicTrack song1 = new MusicTrack("Chay ngay di","MTP",5.03,5);
        MusicTrack song2 = new MusicTrack("Bon chu lam","Truc Nhan",4.16,4);
        MusicTrack song3 = new MusicTrack("Neu anh di","My Tam",6.16,1);
        MusicTrack song4 = new MusicTrack("Em cua ngay hom qua","MTP",3.02,4);
        MusicTrack song5 = new MusicTrack("Con mua ngang qua","MTP",7.03,5);
        ArrayList<MusicTrack> musicTracks = new ArrayList<>();
        musicTracks.add(song1);
        musicTracks.add(song2);
        musicTracks.add(song3);
        musicTracks.add(song4);
        musicTracks.add(song5);
        System.out.println("Sort by title ");
        Collections.sort(musicTracks);
        int i=0;
        for (MusicTrack music:musicTracks
             ) {
            System.out.println(++i);
            System.out.println(music);
        }

        System.out.println("____________________________________________________________________________________\nSort by rating ");
        Collections.sort(musicTracks, new Comparator<MusicTrack>() {
            @Override
            public int compare(MusicTrack o1, MusicTrack o2) {
                return Integer.compare(o2.getRating(), o1.getRating());
            }
        });
        i=0;
        for (MusicTrack music:musicTracks
        ) {
            System.out.println(++i);
            System.out.println(music);
        }

        System.out.println("______________________________________________________________________________________\nSort by artist ");
        musicTracks.sort(Comparator.comparing(MusicTrack::getArtist));
        i=0;
        for (MusicTrack music:musicTracks
        ) {
            System.out.println(++i);
            System.out.println(music);
        }
        System.out.println("__________________________________________________________________\nSort by duration of selected artiss ");


        ArrayList<MusicTrack> filter = (ArrayList<MusicTrack>) musicTracks.stream()
                .filter(p->p.getArtist().equals("MTP"))
                .sorted(Comparator.comparingDouble(MusicTrack::getDuration)).collect(Collectors.toList());
        i=0;
        for (MusicTrack music:filter
        ) {
            System.out.println(++i);
            System.out.println(music);
        }
    }
}
