package chapter11_javaFX_8.TweetApp7.src;

import javafx.scene.control.ListCell;

public class TweetCell extends ListCell<Tweet> {

  @Override
  protected void updateItem(Tweet tweet, boolean b) {
    if (tweet != null) {
      super.updateItem(tweet,b);
      StringBuilder sb = new StringBuilder();
      sb.append("[").append(tweet.getTimeStamp()).append("]").
              append(tweet.getAuthor()).append(": ").append(tweet.getTitle());
      setText(sb.toString());
    }
  }
}
