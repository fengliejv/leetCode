package hashtable;

/**
 * Created by fengliejv on 2017/9/23.
 */

import java.util.*;


/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
public class DesignTwitter355 {

        private static int timeStamp=0;

        // easy to find if user exist
        private Map<Integer, User> userMap;

        // Tweet link to next Tweet so that we can save a lot of time
        // when we execute getNewsFeed(userId)
        private class Tweet{
            public int id;
            public int time;
            public Tweet next;

            public Tweet(int id){
                this.id = id;
                time = timeStamp++;
                next=null;
            }
        }


        // OO design so User can follow, unfollow and post itself
        public class User{
            public int id;
            public Set<Integer> followed;
            public Tweet tweet_head;

            public User(int id){
                this.id=id;
                followed = new HashSet<>();
                follow(id); // first follow itself
                tweet_head = null;
            }

            public void follow(int id){
                followed.add(id);
            }

            public void unfollow(int id){
                followed.remove(id);
            }


            // everytime user post a new tweet, add it to the head of tweet list.
            public void post(int id){
                Tweet t = new Tweet(id);
                t.next=tweet_head;
                tweet_head=t;
            }
        }




        /** Initialize your data structure here. */
        public DesignTwitter355() {
            userMap = new HashMap<Integer, User>();
        }

        /** Compose a new tweet. */
        public void postTweet(int userId, int tweetId) {
            if(!userMap.containsKey(userId)){
                User u = new User(userId);
                userMap.put(userId, u);
            }
            userMap.get(userId).post(tweetId);

        }



        // Best part of this.
        // first get all tweets lists from one user including itself and all people it followed.
        // Second add all heads into a max heap. Every time we poll a tweet with
        // largest time stamp from the heap, then we add its next tweet into the heap.
        // So after adding all heads we only need to add 9 tweets at most into this
        // heap before we get the 10 most recent tweet.
        public List<Integer> getNewsFeed(int userId) {
            List<Integer> res = new LinkedList<>();

            if(!userMap.containsKey(userId))   return res;

            Set<Integer> users = userMap.get(userId).followed;
            PriorityQueue<Tweet> q = new PriorityQueue<Tweet>(users.size(), (a,b)->(b.time-a.time));
            for(int user: users){
                Tweet t = userMap.get(user).tweet_head;
                // very imporant! If we add null to the head we are screwed.
                if(t!=null){
                    q.add(t);
                }
            }
            int n=0;
            while(!q.isEmpty() && n<10){
                Tweet t = q.poll();
                res.add(t.id);
                n++;
                if(t.next!=null)
                    q.add(t.next);
            }

            return res;

        }

        /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
        public void follow(int followerId, int followeeId) {
            if(!userMap.containsKey(followerId)){
                User u = new User(followerId);
                userMap.put(followerId, u);
            }
            if(!userMap.containsKey(followeeId)){
                User u = new User(followeeId);
                userMap.put(followeeId, u);
            }
            userMap.get(followerId).follow(followeeId);
        }

        /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
        public void unfollow(int followerId, int followeeId) {
            if(!userMap.containsKey(followerId) || followerId==followeeId)
                return;
            userMap.get(followerId).unfollow(followeeId);
        }
    }

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */


//    HashMap<Integer, HashSet<Integer>> followerMap = new HashMap<Integer, HashSet<Integer>>();
//    HashMap<Integer, ArrayList<HashMap<Integer, Long>>> tweetMap = new HashMap<Integer, ArrayList<HashMap<Integer, Long>>>();
//    /**
//     * Compose a new tweet.
//     */
//    public void postTweet(int userId, int tweetId) {
//        if (tweetMap.containsKey(userId)) {
//            ArrayList arrayList = tweetMap.get(userId);
//            arrayList.add(new HashMap<Integer, Long>(tweetId, System.currentTimeMillis()));
//            tweetMap.put(userId, arrayList);
//        }else {
//            tweetMap.put(userId,new ArrayList<HashMap<Integer, Long>>(new HashSet<HashMap<Integer, Long>>(tweetId,System.currentTimeMillis())));
//        }
//    }
//
//    /**
//     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
//     */
//    public List<Integer> getNewsFeed(int userId) {
//        if(!followerMap.containsKey(userId)){
//            return null;
//        }
//        HashSet set = followerMap.get(userId);
//        Iterator it = set.iterator();
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        ArrayList<HashMap<Integer, Long>> a = new ArrayList<HashMap<Integer, Long>>();
//        while (it.hasNext()){
//            a.addAll(tweetMap.get(it.next()));
//        }
//        Collections.sort(a,new Compare());
//        for (int i = 0; i < (10<a.size()?10:a.size()); i++) {
//            arrayList.add(a.get(i).keySet().iterator().next());
//        }
//        return arrayList;
//    }
//
//    /**
//     * Follower follows a followee. If the operation is invalid, it should be a no-op.
//     */
//    public void follow(int followerId, int followeeId) {
//        if(followerMap.containsKey(followerId)){
//            HashSet<Integer> hashMap = followerMap.get(followeeId);
//            hashMap.add(followeeId);
//            followerMap.put(followerId,hashMap);
//        }else {
//            followerMap.put(followerId,new HashSet<Integer>(followeeId));
//        }
//    }
//
//    /**
//     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
//     */
//    public void unfollow(int followerId, int followeeId) {
//        followerMap.get(followerId).remove(followeeId);
//    }
//
//    class Compare implements Comparator {
//
//        public int compare(Object o1, Object o2) {
//            if(((HashMap<Integer,Long>)(o1)).values().iterator().next()>((HashMap<Integer,Long>)(o2)).values().iterator().next()){
//                return 1;
//            }else {
//                return -1;
//            }
//
//        }
//
//
//    }

