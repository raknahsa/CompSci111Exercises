public class Album{

  private String title;
//  private String artist;
  private int numberOfSongs;
  private int length;
  private Song [] tracks;
  private int index;

  public Album(String title, int numberOfSongs){
    this.title = title;
    this.numberOfSongs = numberOfSongs;
    this.length = 0;
    this.tracks = new Song[numberOfSongs];
    this.index = 0;
  }

  public boolean addSong(String title, String artist, int length, String genre){
    Song toAdd = new Song(title,length,artist,genre);

    addSong(toAdd);
    /*
    for(int i = 0; i < tracks.length; i++){
      if (tracks[i] == null){
        tracks[i] = toAdd;
      //  this.index++;
        this.length += toAdd.getLength()
        return true;
      }
    }
    return false;*/
    return false;
  }

  public boolean addSong(Song toAdd){
    for(int i = 0; i < tracks.length; i++){
      if (tracks[i] == null){
        tracks[i] = toAdd;
        this.index++;
        this.length += toAdd.getLength();
        return true;
      }
    }
    return false;
  }

  public boolean addSong2(Song toAdd){
    //more efficent
    if(index >= numberOfSongs){
      return false;
    }

    tracks[index] = toAdd;
    index++;
    return true;
  }

  /*
  Analysis for AddSong
    1. n = numberOfSongs
    2. i++ , i<tracks.length, tracks[i] = null   //instructions to be run
    3. BC tracks[i] = null; i = 0  //Adding to empty album,
          2 instructions run max,  n:instrucionst -> 1:2, 2:2, 3:2, 4:2, 10:2, 100:2
       WC tracks[i] = null; i = numberOfSongs   //Adding to just before full array
          (3n + 1)run max, n:instructions -> 1:4, 2:7, 3:10, 4:13,
      Theta = WC, Drop all non-leading terms and constants
      drop 3(constant) and 1, non-leading term -> 3n + 1 -> n
  */

  /*
  Analysis for AddSong2
    1. n = numberOfSongs.
    2. All run once, using all [index] = toAdd;
    3. BC Full, 2 operation always
       WC Anything below, full 4 operations always
       Theta = 1, runs in constant time, much better
      
  */



  //findSong,getSong,addSong,removeSong
}
