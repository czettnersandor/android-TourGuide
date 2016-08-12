package com.czettner.tourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class ItemTriptargetFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_SECTION_NUMBER = "section-number";
    // TODO: Customize parameters
    private int mSectionNumber = 1;
    private OnListFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemTriptargetFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static ItemTriptargetFragment newInstance(int sectionNumber) {
        ItemTriptargetFragment fragment = new ItemTriptargetFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mSectionNumber = getArguments().getInt(ARG_SECTION_NUMBER);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_itemtriptarget_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            switch (mSectionNumber) {
                case 1:
                    recyclerView.setAdapter(new MyItemTriptargetRecyclerViewAdapter(TriptargetListFactory.getTriptargetList(TriptargetListFactory.ITEMS_EAT_OUT), mListener));
                    break;
                case 2:
                    recyclerView.setAdapter(new MyItemTriptargetRecyclerViewAdapter(TriptargetListFactory.getTriptargetList(TriptargetListFactory.ITEMS_WALK), mListener));
                    break;
                case 3:
                    recyclerView.setAdapter(new MyItemTriptargetRecyclerViewAdapter(TriptargetListFactory.getTriptargetList(TriptargetListFactory.ITEMS_SPORT), mListener));
                    break;
                case 4:
                    recyclerView.setAdapter(new MyItemTriptargetRecyclerViewAdapter(TriptargetListFactory.getTriptargetList(TriptargetListFactory.ITEMS_EVENTS), mListener));
                    break;
            }

        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(Triptarget item);
    }
}
