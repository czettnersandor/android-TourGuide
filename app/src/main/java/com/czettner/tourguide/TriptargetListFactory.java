package com.czettner.tourguide;

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
                res = getSportList();
                break;
            case ITEMS_EVENTS:
                res = getEventsList();
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
        res.add(new Triptarget("Nagy-Kopasz", "A Budai-hegység legmagasabb pontja, a Nagy-Kopasz (559 m) tetején álló, óriási vitorlára emlékeztető, modern Csergezán Pál-kilátóból parádés panoráma nyílik a környező tájra. A hegy déli oldalában, a Tarnai pihenőnél pedig elragadóan szép dolomitgyepes környéken csodálhatjuk a meseszép kilátást.",
                R.drawable.walk_nagykopasz));
        res.add(new Triptarget("Pincesor", "Több mint száz pince rejtőzik a lombos fák árnyékában, csendes, békés környezetben. A hagyományosan is Pincehegyként nevezett területen a pincesorok egymás alatt egy-két sorban helyezkednek el.", R.drawable.walk_pincesor));
        res.add(new Triptarget("Fenyves", "Van itt tanösvény, parkerdő, kőbánya, minden, ami ahhoz kell, hogy egy kirándulás közben jól érezd magadat.", R.drawable.walk_fenyves));
        return res;
    }

    public static ArrayList<Triptarget> getSportList() {
        ArrayList<Triptarget> res = new ArrayList<>();
        res.add(new Triptarget("Bellandor Lovasközpont", "A \"BELLANDOR\" lovasközpontban, amely a Zsámbéki-medence szívében, Pátyon fekszik megtalálható az ősrégi magyar hármashangzat: ember, ló és a természet egysége. A lovasközpont teljeskörű szolgáltatást kínál azoknak, akik a lovak iránt érdeklődőnek és látványos természetes környezetben keresik a pihenést.", R.drawable.sport_lovarda));
        res.add(new Triptarget("Sport field", "mainly used for footbal events", R.drawable.sport_football));
        return res;
    }

    public static ArrayList<Triptarget> getEventsList() {
        ArrayList<Triptarget> res = new ArrayList<>();
        res.add(new Triptarget("Christmas", "With three beautiful churches, The town gives a warming welcome every Christmas.", R.drawable.events_karacsony));
        res.add(new Triptarget("Pincenapok", "Celebrating the harvest of the grapes with family events and concerts.", R.drawable.events_pincenapok));
        res.add(new Triptarget("Kirajzas", "In every early spring, motorcycles are going out the first time of the year in roaring event celebrating the arrival of the good weather every biker dreamed of.", R.drawable.events_motoros));
        return res;
    }
}
