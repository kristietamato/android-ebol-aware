package org.tamato.ebolaware;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment
{
    private ListView nListView;
    private List<String> nNewsList;

    public NewsFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_news, container, false);
        nListView = (ListView) fragmentView.findViewById(R.id.MyListView);

        // Add items to the list.
        nNewsList = new ArrayList<String>();
        nNewsList.add("My first item on the list");
        nNewsList.add("More items");
        nNewsList.add("More items");
        nNewsList.add("More items");
        nNewsList.add("More items");
        nNewsList.add("More items");
        nNewsList.add("More items");
        nNewsList.add("More items");
        nNewsList.add("More items");
        nNewsList.add("More items");
        nNewsList.add("More items");

        nListView.setAdapter(new MyAdapter());

        return fragmentView;
    }

    // Get views from row.xml.
    private class MyAdapter extends BaseAdapter
    {
        @Override
        public int getCount()
        {
            return nNewsList.size();
        }

        @Override
        public Object getItem(int position)
        {
            return nNewsList.get(position);
        }

        @Override
        public long getItemId(int position)
        {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            View rowView = getActivity().getLayoutInflater().inflate(R.layout.row, null);

            // Get text from nNewsList based on position.
            TextView textViewRow = (TextView) rowView.findViewById(R.id.textView);
            textViewRow.setText(nNewsList.get(position));

            return rowView;
        }
    }

}
