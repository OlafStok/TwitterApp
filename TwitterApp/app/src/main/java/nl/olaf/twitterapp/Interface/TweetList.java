package nl.olaf.twitterapp.Interface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import nl.olaf.twitterapp.Item.Tweet;
import nl.olaf.twitterapp.R;
import nl.olaf.twitterapp.View.TweetAdapter;

public class TweetList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet_list);

        List<Tweet> tweets = new ArrayList<>();
        TweetAdapter adapter = new TweetAdapter(this, R.layout.list_item_tweet, tweets);

        ListView tweetList = (ListView) findViewById(R.id.tweets);



    }
}
