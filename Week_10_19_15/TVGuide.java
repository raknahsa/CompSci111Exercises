/*
  This is a program which asks for the channel and returns the network and then asks for the network and then
  returns the channel. Small list of channels have been predetermined. 
*/

public class TVGuide{
  public static void main(String args[]){
    int[] channels = {11, 9, 7, 5, 4, 2};
    String[] networks = {"CW", "My 9", "ABC", "FOX", "NBC", "CBS"};

    System.out.println("Enter channel of network to be found:");
    int x = IO.readInt();
    System.out.println("Network is " + newtworkLookUp(channels, networks, x));

    System.out.println("Enter network of channel to be found:");
    String str = IO.readString();
    System.out.println("Channel is " + channelLookUp(channels, networks, str));

  }

  public static int channelLookUp(int[] ch, String[] net, String network){
    for(int x = 0; x < net.length; x ++){
      System.out.println(net[x]);
      if(net[x].equals(network)){
        return ch[x];
      }
    }
      return -1;
  }

  public static String newtworkLookUp(int[] ch, String[] net, int channel){
    for(int x = 0; x < ch.length; x ++){
      if(ch[x] == channel){
        return net[x];
      }
    }
      return "not a valid channel";
  }

}
