package com.czettner.tourguide;

import java.util.ArrayList;

public class TriptargetListFactory {
    public static final String ITEMS_EAT_OUT = "eat-out";
    public static final String ITEMS_WALK = "walk";

    public static ArrayList<Triptarget> getTriptargetList(String targetType) {
        ArrayList<Triptarget> res = new ArrayList<>();
        switch (targetType) {
            case ITEMS_EAT_OUT:
                res = getEatOutList();
                break;
            case ITEMS_WALK:
                break;
        }

        return res;
    }

    public static ArrayList<Triptarget> getEatOutList() {
        ArrayList<Triptarget> res = new ArrayList<>();
        res.add(new Triptarget("Landora Pizza", R.drawable.ic_local_activity_white_48dp));
        res.add(new Triptarget("Landora Pizza", R.drawable.ic_local_activity_white_48dp));
        res.add(new Triptarget("Landora Pizza", R.drawable.ic_local_activity_white_48dp));
        res.add(new Triptarget("Landora Pizza", R.drawable.ic_local_activity_white_48dp));
        return res;
    }
}
