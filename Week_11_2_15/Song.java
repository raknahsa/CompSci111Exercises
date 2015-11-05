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
    //fill later if you want
  }

  public String getTitle(){
    return this.title;
  }

  public void setTitle(String title){
    if(title != null && title.length() > 0 )
      this.title = title;
  }

  //get/set
  //toString
  //equals
}
