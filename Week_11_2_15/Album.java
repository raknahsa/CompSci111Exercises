public class Album{

  private String title;
//  private String artist;
  private int numberOfSongs;
  //private int length;
  private Song [] tracks;
  private int index;

  public Album(String title, int numberOfSongs){
    this.title = title;
    this.numberOfSongs = numberOfSongs;
    //this.length = 0;
    this.tracks = new Song[numberOfSongs];
    this.index = 0;
  }

  public void addSong(String title, String artist, int length, String genre){
    Song s = new Song(title,artist);
    //add later in Song class
//    s.setLength(length);
//    s.setGenre(genre);
    tracks[index] = s;
    index++;
  }

  //findSong,getSong,addSong,removeSong
}
