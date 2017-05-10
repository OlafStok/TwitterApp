package nl.olaf.twitterapp.View;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import nl.olaf.twitterapp.Item.Tweet;
import nl.olaf.twitterapp.R;

/**
 * Created by Olaf on 7-5-2017.
 */

public class TweetAdapter extends ArrayAdapter<Tweet>{
    List<Tweet> tweets;
    int pos;

    //makes getting position cleaner
    public Tweet getTweet(int position) {
        return tweets.get(position);
    }

    //custom adapter
    public TweetAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Tweet> objects) {
        super(context, resource, objects);
        tweets = objects;
    }

    //custom view
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        pos = position;
        //initialize convertview from custom tweet listitem if convertview is not yet initialized
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_tweet, parent, false);
        }

        //initialize view
        TextView content = (TextView) convertView.findViewById(R.id.textView);
        TextView poster = (TextView) convertView.findViewById(R.id.textView2);
        ImageView avatar = (ImageView) convertView.findViewById(R.id.imageView);

        //set view content
        content.setText(getTweet(pos).getContent());
        poster.setText(getTweet(pos).getAccountName() + " @" + getTweet(pos).getNickName());
        avatar.setImageResource(getTweet(pos).getAvatar());

        //return the new view
        return convertView;
    }
}
