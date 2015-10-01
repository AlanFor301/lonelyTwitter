package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by qyu4 on 9/30/15.

 getTweets() -- sould return a list of tweets in chronological order

 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
   /**
    public void deleteTweet(Tweet tweet){
        //Important code here.

    }
    **/
    public void add(Tweet tweet){
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }else tweets.add(tweet);
    }
    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);

    }
    public Tweet getTweet(int index){
        return tweets.get(index);
    }
    public int tweetCount(Tweet tweet){
        return tweets.size();
    }
}
