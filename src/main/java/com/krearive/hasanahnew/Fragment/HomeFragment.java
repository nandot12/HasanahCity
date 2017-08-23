package com.krearive.hasanahnew.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.krearive.hasanahnew.Configuration.Config;
import com.krearive.hasanahnew.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    private static final int RECOVERY_REQUEST = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        YouTubePlayerSupportFragment youTubePlayerFragment = YouTubePlayerSupportFragment.newInstance();
        getChildFragmentManager().beginTransaction()
                .add(R.id.youtube_layout, youTubePlayerFragment)
                .commit();
        youTubePlayerFragment.initialize(Config.YOUTUBE_API_KEY, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if (!b) {
                    youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
                    youTubePlayer.loadVideo("aTj2hgNmbE0");
                    youTubePlayer.play();
                }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                if (youTubeInitializationResult.isUserRecoverableError()) {
                    youTubeInitializationResult.getErrorDialog(getActivity(), RECOVERY_REQUEST).show();
                } else {
                    String error = String.format(getString(R.string.player_error), youTubeInitializationResult.toString());
                    Toast.makeText(getActivity(), error, Toast.LENGTH_LONG).show();
                }
            }
        });
        return view;
    }
    //     https://developers.google.com/youtube/android/player/
    //    https://gist.github.com/takeshiyako2/e776bbaf2966c6501c4f
}
