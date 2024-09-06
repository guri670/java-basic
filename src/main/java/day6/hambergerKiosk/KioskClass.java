package day6.hambergerKiosk;

import java.util.ArrayList;

public class KioskClass {

    int remainder = 0;
    int total = 0;
    ArrayList<Hamburgers> hamlist = new ArrayList<>();
    ArrayList<Hamburgers> burgerCart = new ArrayList<>();

    ArrayList<SideMenu> sidelist = new ArrayList<>();
    ArrayList<SideMenu> sideCart = new ArrayList<>();

    ArrayList<Drink> dlist = new ArrayList<>();
    ArrayList<Drink> dCart = new ArrayList<>();

    public KioskClass() {
        Hamburgers h1 = new Hamburgers("한우불고기버거", 6000);
        Hamburgers h2 = new Hamburgers("치즈버거", 3000);
        Hamburgers h3 = new Hamburgers("치킨버거", 3500);
        Hamburgers h4 = new Hamburgers("새우버거", 3200);
        hamlist.add(h1);
        hamlist.add(h2);
        hamlist.add(h3);
        hamlist.add(h4);

        SideMenu s1 = new SideMenu("감자튀김", 1800);
        SideMenu s2 = new SideMenu("치즈스틱", 2000);
        SideMenu s3 = new SideMenu("치킨너겟", 2500);
        SideMenu s4 = new SideMenu("오징어링", 2700);
        sidelist.add(s1);
        sidelist.add(s2);
        sidelist.add(s3);
        sidelist.add(s4);

        Drink d1 = new Drink("콜라", 1000);
        Drink d2 = new Drink("에이드", 2000);
        Drink d3 = new Drink("커피", 1500);
        Drink d4 = new Drink("쉐이크", 2500);
        dlist.add(d1);
        dlist.add(d2);
        dlist.add(d3);
        dlist.add(d4);
//
//        public int total (hamlist.get(i).price, sidelist.get(j).price, dlist.get(k).price){
//
//            return total;
//        }
    }

}

