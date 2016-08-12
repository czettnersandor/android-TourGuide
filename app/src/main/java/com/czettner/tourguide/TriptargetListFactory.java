package com.czettner.tourguide;

import java.util.ArrayList;

public class TriptargetListFactory {
    public static final String ITEMS_EAT_OUT = "eat-out";
    public static final String ITEMS_WALK = "walk";
    public static final String ITEMS_SPORT = "sport";
    public static final String ITEMS_EVENTS = "events";

    public static ArrayList<Triptarget> getTriptargetList(String targetType) {
        ArrayList<Triptarget> res = new ArrayList<>();
        switch (targetType) {
            case ITEMS_EAT_OUT:
                res = getEatOutList();
                break;
            case ITEMS_WALK:
                res = getWalkList();
                break;
            case ITEMS_SPORT:
                res = getWalkList();
                break;
            case ITEMS_EVENTS:
                res = getWalkList();
                break;
        }

        return res;
    }

    public static ArrayList<Triptarget> getEatOutList() {
        ArrayList<Triptarget> res = new ArrayList<>();
        res.add(new Triptarget("Paagh étterem", "Szeretettel várjuk vendégeinket éttermünkben és bowling pályánkon. " +
                "Vállalunk esküvőket, céges és családi rendezvényeket. " +
                "Asztalfoglalás: Tel.06-30-948-3102 " +
                "06-30-223-2006 " +
                "Nyitva tartás a hét minden napján  10-22 óráig", R.drawable.eat_out_paagh));
        res.add(new Triptarget("Gastland M1 Hotel", "Informal lodging offering an informal restaurant, a wine cellar & free breakfast, plus a sauna.", R.drawable.eat_out_gastland));
        res.add(new Triptarget("Marché Bistro Páty", "A healty, fresh welcome to you from Marché Bistro " +
                " Páty, your fresh food stop on the M1 from Budapest to Vienna. Come and discover the diverse," +
                " regional and seasonal products and the fresh ingredients at the Marché Natural-Bakery for" +
                " yourself. Enjoy the stop on your journey in our modern indoor area or the sunny outdoor terrace. ",
                R.drawable.eat_out_marche));
        res.add(new Triptarget("C'est La Vie Café", "Prémium kávé, ropogós croissant, francia gourmet sütemények," +
                " csapolt prosecco, házi szörpök, ínyenc lekvárok és csokoládék, ajándéktárgyak, lakásdekor.",
                R.drawable.eat_out_cest));
        return res;
    }

    public static ArrayList<Triptarget> getWalkList() {
        ArrayList<Triptarget> res = new ArrayList<>();
        res.add(new Triptarget("Walk 1", "Test",
                R.drawable.ic_local_activity_white_48dp));
        return res;
    }
}
