package com.example.myroom.Adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.example.myroom.Fragment.Frag_Gyeonggi;
import com.example.myroom.Fragment.Frag_Incheon;
import com.example.myroom.Fragment.Frag_Seoul;

public class ContentsPagerAdapter extends FragmentStatePagerAdapter {

    private int mPageCount;
    private String destination;
    private int rushHour;



    public ContentsPagerAdapter(FragmentManager fm, int pageCount, String destination, int rushHour) {

        super(fm);

        this.mPageCount = pageCount;
        this.destination =destination;
        this.rushHour=rushHour;

    }



    @Override

    public Fragment getItem(int position) {

        switch (position) {

            case 0:

                Frag_Seoul seoulFrag = new Frag_Seoul(destination,rushHour);

                return seoulFrag;

            case 1:

                Frag_Gyeonggi gyeonggiFrag = new Frag_Gyeonggi(destination,rushHour);

                return gyeonggiFrag;


            case 2:

                Frag_Incheon inchoenFrag = new Frag_Incheon(destination,rushHour);

                return inchoenFrag;



            default:

                return null;

        }

    }



    @Override

    public int getCount() {

        return mPageCount;

    }

}