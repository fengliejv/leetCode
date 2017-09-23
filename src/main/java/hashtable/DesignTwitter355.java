package hashtable;

/**
 * Created by fengliejv on 2017/9/23.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
//todo
/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
public class DesignTwitter355 {
    HashMap<Integer,HashSet<Integer>> followerMap;
    HashMap<Integer,ArrayList<Integer>> tweetMap;
    /** Initialize your data structure here. */
    public DesignTwitter355() {
        followerMap = new HashMap<Integer, HashSet<Integer>>();
        tweetMap = new HashMap<Integer, ArrayList<Integer>>();
    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        ArrayList<Integer> arrayList;
        if(tweetMap.containsKey(userId)){
            arrayList= tweetMap.get(userId);
            arrayList.add(tweetId);
        }else {
            arrayList = new ArrayList<Integer>(tweetId);
            tweetMap.put(userId,arrayList);
        }
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {

        if(!tweetMap.containsKey(userId)){
            return null;
        }else {
            ArrayList<Integer> arrayList = tweetMap.get(userId);
            int size = arrayList.size();
            ArrayList<Integer> newsFeed = new ArrayList<Integer>();
            for(int i=size-1;i>(size>10?size-11:0);i--){
                newsFeed.add(arrayList.get(i));
            }
            return newsFeed;
        }
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(followerMap.containsKey(followerId)){
            HashSet set = followerMap.get(followerId);
            set.add(followeeId);
        }else {
            HashSet set = new HashSet(followeeId);
            followerMap.put(followerId,set);
        }
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(followerMap.containsKey(followerId)){
            HashSet set = followerMap.get(followerId);
            set.remove(followeeId);
        }else {

        }
    }
}
