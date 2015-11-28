package com.ryanarifswana.bioflix.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.ryanarifswana.bioflix.database.model.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ariftopcu on 11/27/15.
 */
public class DatabaseHandler extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "biosessions";
    private static final String TABLE_SESSIONS = "sessions";

    private static final String KEY_ID = "id";
    private static final String KEY_MOVIE_NAME = "movie_name";
    private static final String KEY_START_TIME = "start_time";
    private static final String KEY_END_TIME = "end_time";
    private static final String KEY_VIEWER_NAME = "viewer_name";
    private static final String KEY_COMPLETE = "complete";

    //private static final String KEY_IMDB_ID = "imdb_id";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_SESSIONS + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_MOVIE_NAME + " TEXT,"
                + KEY_START_TIME + " INTEGER," + KEY_END_TIME + " INTEGER,"
                + KEY_VIEWER_NAME + " TEXT," + KEY_COMPLETE + " INTEGER"
                + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SESSIONS);

        // Create tables again
        onCreate(db);
    }

    // Adds a new session, returns the id of the session
    public long newSession(Session session) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_MOVIE_NAME, session.getMovieName());
        values.put(KEY_VIEWER_NAME, session.getViewerName());
        values.put(KEY_COMPLETE, 0);

        long id = db.insert(TABLE_SESSIONS, null, values);
        db.close();
        return id;
    }

    //Return complete sessions only
    public List<Session> getAllSessions() {
        List<Session> sessionList = new ArrayList<>();
        String selectQuery = "SELECT  * FROM " + TABLE_SESSIONS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        Log.d("Cursor count:", "" + cursor.getCount());
        if (cursor.moveToFirst()) {
            do {
                //only return complete sessions
                if(cursor.getInt(cursor.getColumnIndex(KEY_COMPLETE)) == 1) {
                    Session session = new Session();
                    session.setId(cursor.getString(cursor.getColumnIndex(KEY_ID)));
                    session.setMovieName(cursor.getString(cursor.getColumnIndex(KEY_MOVIE_NAME)));
                    session.setStartTime(cursor.getInt(cursor.getColumnIndex(KEY_START_TIME)));
                    session.setEndTime(cursor.getInt(cursor.getColumnIndex(KEY_END_TIME)));
                    session.setViewerName(cursor.getString(cursor.getColumnIndex(KEY_VIEWER_NAME)));
                    session.setComplete(true);
                    sessionList.add(session);
                }
            } while (cursor.moveToNext());
        }
        return sessionList;
    }

//    // Getting single contact
//    public Session getSession(int id) {
//        return null;
//    }
//
//
//    // Getting contacts Count
//    public int getSessionCount() {
//        return 0;
//    }
//    // Updating single contact
//    public int updateSession(Session session) {
//        return 0;
//    }
//
//    // Deleting single contact
//    public void deleteSession(Session session) {
//
//    }
}
