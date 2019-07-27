package net.rymate.music.activities;

import android.os.Handler;
import android.os.Message;

/**
 * Created by Ryan on 24/03/2018.
 */

class NowPlayingHandler extends Handler {

    private final MediaPlaybackActivity activity;

    NowPlayingHandler(MediaPlaybackActivity mediaPlaybackActivity) {
        this.activity = mediaPlaybackActivity;
    }

    @Override
    public void handleMessage(Message msg) {
        activity.handleMessage(msg);
    }
}