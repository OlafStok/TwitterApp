package nl.olaf.twitterapp.Item;

import java.util.Date;

/**
 * Created by Olaf on 7-5-2017.
 */

public class Tweet {
    //variables
    Profile profile;
    Date posted;
    String content;
    //profile variables
    String accountName, nickName;
    int avatar;

    //get data from profile and set local variables
    public void setProfileVariables() {
        accountName = profile.accountName;
        nickName = profile.nickName;
        avatar = profile.avatar;
    }

    //get tweet data and set variables
    public void setTweetVariables() {
        posted = /*get posted date from twitter*/null;
        content = /*get tweet content from twitter*/null;
    }

    //getters and setters

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
