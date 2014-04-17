package com.krazyrobot.robobook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

public class FollowAdapter extends BaseAdapter {
    private final static Robot[] ROBOTS = {
            new Robot("Terminator", R.drawable.terminator),
            new Robot("Optimus Prime", R.drawable.optimus_prime),
            new Robot("Wall-E", R.drawable.walle),
            new Robot("R2D2", R.drawable.r2d2),
            new Robot("Marvin", R.drawable.marvin),
            new Robot("Bumblebee", R.drawable.bumblebee),
            new Robot("C3PO", R.drawable.c3po),
            new Robot("Pixar Lamp", R.drawable.pixar),
            new Robot("Robocop", R.drawable.robocop),
            new Robot("Sonny", R.drawable.sonny)
    };
    private final LayoutInflater mInflater;
    private final Set<Robot> mFollowedRobots = new HashSet<Robot>();

    public FollowAdapter(Context context) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return ROBOTS.length;
    }

    @Override
    public Object getItem(int position) {
        return ROBOTS[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = mInflater.inflate(R.layout.follow_item, parent, false);
        ImageView img = (ImageView) itemView.findViewById(R.id.avatar);
        TextView name = (TextView) itemView.findViewById(R.id.name);
        final Robot robot = ROBOTS[position];
        img.setImageResource(robot.getmImgRes());
        name.setText(robot.getmName());
        final View followButton = itemView.findViewById(R.id.follow_btn);
        final View followTick = itemView.findViewById(R.id.followed_tick);
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFollowedRobots.add(robot);
                refreshButtons(robot, followButton, followTick);
            }
        });
        refreshButtons(robot, followButton, followTick);
        return itemView;
    }

    private void refreshButtons(Robot robot, View followButton, View followTick) {
        if (mFollowedRobots.contains(robot)) {
            followButton.setVisibility(View.GONE);
            followTick.setVisibility(View.VISIBLE);
        } else {
            followButton.setVisibility(View.VISIBLE);
            followTick.setVisibility(View.GONE);
        }
    }
}
