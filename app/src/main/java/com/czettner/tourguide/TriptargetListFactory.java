package com.czettner.tourguide;

import android.content.Context;

import java.util.ArrayList;

/**
 * Later we can query an XML feed to get the most up to date date from a server
 * For now, let's hard code some visitor attractions here.
 *
 * TODO: translate the Hungarian text to english
 */
public class TriptargetListFactory {
    public static final String ITEMS_EAT_OUT = "eat-out";
    public static final String ITEMS_WALK = "walk";
    public static final String ITEMS_SPORT = "sport";
    public static final String ITEMS_EVENTS = "events";

    public static ArrayList<Triptarget> getTriptargetList(String targetType, Context context) {
        ArrayList<Triptarget> res = new ArrayList<>();
        switch (targetType) {
            case ITEMS_EAT_OUT:
                res = getEatOutList(context);
                break;
            case ITEMS_WALK:
                res = getWalkList(context);
                break;
            case ITEMS_SPORT:
                res = getSportList(context);
                break;
            case ITEMS_EVENTS:
                res = getEventsList(context);
                break;
        }

        return res;
    }

    public static ArrayList<Triptarget> getEatOutList(Context context) {
        ArrayList<Triptarget> res = new ArrayList<>();
        res.add(new Triptarget(context.getString(R.string.paagh), context.getString(R.string.eat_out_paagh), R.drawable.eat_out_paagh));
        res.add(new Triptarget(context.getString(R.string.gastland), context.getString(R.string.eat_out_gastland), R.drawable.eat_out_gastland));
        res.add(new Triptarget(context.getString(R.string.marche), context.getString(R.string.eat_out_marche), R.drawable.eat_out_marche));
        res.add(new Triptarget(context.getString(R.string.cest), context.getString(R.string.eat_out_cest), R.drawable.eat_out_cest));
        return res;
    }

    public static ArrayList<Triptarget> getWalkList(Context context) {
        ArrayList<Triptarget> res = new ArrayList<>();
        res.add(new Triptarget(context.getString(R.string.nagykopasz), context.getString(R.string.walk_nagykopasz), R.drawable.walk_nagykopasz));
        res.add(new Triptarget(context.getString(R.string.pincesor), context.getString(R.string.walk_pincesor), R.drawable.walk_pincesor));
        res.add(new Triptarget(context.getString(R.string.fenyves), context.getString(R.string.walk_fenyves), R.drawable.walk_fenyves));
        return res;
    }

    public static ArrayList<Triptarget> getSportList(Context context) {
        ArrayList<Triptarget> res = new ArrayList<>();
        res.add(new Triptarget(context.getString(R.string.bellador), context.getString(R.string.sport_bellador), R.drawable.sport_lovarda));
        res.add(new Triptarget(context.getString(R.string.sportfield), context.getString(R.string.sport_sportfield), R.drawable.sport_football));
        return res;
    }

    public static ArrayList<Triptarget> getEventsList(Context context) {
        ArrayList<Triptarget> res = new ArrayList<>();
        res.add(new Triptarget(context.getString(R.string.christmas), context.getString(R.string.events_christmas), R.drawable.events_karacsony));
        res.add(new Triptarget(context.getString(R.string.pincenapok), context.getString(R.string.events_pincenapok), R.drawable.events_pincenapok));
        res.add(new Triptarget(context.getString(R.string.kirajzas), context.getString(R.string.events_kirajzas), R.drawable.events_motoros));
        return res;
    }
}
