package com.krazyrobot.robobook.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.krazyrobot.robobook.adapter.FollowAdapter;
import com.krazyrobot.robobook.R;

public class FollowRobotsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.follow_robots);
        ListView listView = (ListView) findViewById(R.id.follow_list);
        FollowAdapter adapter = new FollowAdapter(this);
        listView.setAdapter(adapter);
    }
}
