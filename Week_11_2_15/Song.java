public class Song{

  private String title;
  private int length;
  private String artist;
  private String genre;

  public Song(String title, String artist){

    this.title = title;
    this.artist = artist;
    this.length = 0;
    this.genre = "country";

  }

  public Song(String title, int length, String artist, String genre){
    this.title = title;
    this.artist = artist;
    this.length = length;
    this.genre = genre;
  }

  public String getTitle(){
    return this.title;
  }

  public void setTitle(String title){
    if(title != null && title.length() > 0 )
      this.title = title;
  }

  public int getLength(){
    return this.length;
  }

  public void setLength(int length){
    this.length = length;
  }

  public void setGenre(String genre){
    this.genre = genre;
  }

  public String toString(){
    return "The Song is " + title + "\n" + "Artist: " + artist + "\n" +  "Length: " + length  + " minutes" + "\n" + "Genre: " + genre;
  }

  //get/set
  //toString
  //equals
}
