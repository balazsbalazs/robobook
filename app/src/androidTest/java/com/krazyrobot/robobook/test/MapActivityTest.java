package com.krazyrobot.robobook.test;

import android.app.Activity;
import android.app.Fragment;
import android.test.ActivityInstrumentationTestCase2;
import com.krazyrobot.robobook.MapActivity;
import com.krazyrobot.robobook.R;

import java.lang.reflect.InvocationTargetException;

public class MapActivityTest extends ActivityInstrumentationTestCase2<MapActivity> {

    public MapActivityTest() {
        super(MapActivity.class);
    }

    public void testSomething() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Activity activity = getActivity();
//        FragmentManager fragmentManager = activity.getFragmentManager();
//        Method m = fragmentManager.getClass().getMethod("getFragments", new Class[] {});
//        List <Fragment> fragments = (List <Fragment>)m.invoke(fragmentManager, new Object[] {});
//        fail();
//        assertNotSame(0, fragments.size());

        Fragment fragment = activity.getFragmentManager()
                .findFragmentById(R.id.map);
        fail("failure:" + fragment.getTag() + ":");
//        final LatLng sydney = new LatLng(-33.867, 151.206);
//        final GoogleMap map = ((MapFragment) activity.getFragmentManager()
//                .findFragmentById(R.id.map)).getMap();
//
//        activity.runOnUiThread(new Runnable() {
//            public void run() {
//                map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));
//            }
//        });
//        fail();
    }

}