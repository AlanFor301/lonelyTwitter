package ca.ualberta.cs.lonelytwitter;


import android.test.ActivityInstrumentationTestCase2;
/**
 * Created by qyu4 on 9/30/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }
    public void testDeleteTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        tweetList.add(tweet);
        tweetList.delete(tweet);
        assertFalse(tweetList.hasTweet(tweet));
        /**int tweet_count =  tweetList.getTweetCount();
         * int newTweetCount = tweetList.getTweetCount();
         * assertEquals(0, newTweetCount);
         * assertTrue((tweetCount - 1) == newTweetCount) ;
         **/

    }
    public void testHasTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        assertFalse(tweetList.hasTweet(tweet));
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));

    }
    public void testAddTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        tweetList.add(tweet);
        //assertTrue(tweetList.hasTweet(tweet));
        try {
            tweetList.add(tweet);
        }catch(IllegalArgumentException e){
            System.out.printf("duplicated tweet");

        }
    }
    public void testContainTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        tweetList.add(tweet);
        boolean check = true;
        try {
            tweetList.add(tweet);
        }catch (Exception e){
                check = false;
        }
        assertFalse(check);
    }
    public void testTweetCount(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        tweetList.add(tweet);
        Tweet newTweet = new NormalTweet("hohoho");
        tweetList.add(newTweet);
        try{
            assertEquals(2, tweetList.tweetCount(tweet));
        }catch (Exception e){
            //System.out.println("size of tweet list is "+ String.valueOf(tweetList));
        }


    }
    public void testGetTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        tweetList.add(tweet);
        Tweet returnedTweet = tweetList.getTweet(0);
        //int index = tweetList.tweet
        assertTrue((tweet.date.equals(returnedTweet.date)) &&
                    tweet.getText().equals(returnedTweet.getText()));
    }
    public void testGetTweetType(){

    }

}