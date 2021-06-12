package com.example.logcathealth.BottomNav;

import com.example.logcathealth.R;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {
    public static final int DOCCORNER_FRAGMENT=0;
    public static final int MARKETPLACE_FRAGMENT=1;
    public static final int FEED_FRAGMENT= 2;
    public static final int PROFILE_FRAGMENT=3;


    public static List<MenuItem> getMenuList() {

        List<MenuItem> list = new ArrayList<>();
        list.add(new MenuItem(R.drawable.doctorcorner,DOCCORNER_FRAGMENT,false));
        list.add(new MenuItem(R.drawable.marcketplace,MARKETPLACE_FRAGMENT,false));
        list.add(new MenuItem(R.drawable.feed,FEED_FRAGMENT,false));
        list.add(new MenuItem(R.drawable.profile,PROFILE_FRAGMENT,false));
        return list;
    }
}
