package com.soarsky.policeclient.home;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.soarsky.policeclient.data.local.db.bean.Note;


/**
 * Created by elvissun on 8/19/2016.
 */
public class NotesAdapter extends ArrayAdapter<Note>{


    public NotesAdapter(Context context, int resource) {
        super(context, resource);
    }


}
