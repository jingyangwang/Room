package com.example.wangjingyang.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.sql.Date;
import java.util.UUID;

    @Entity(tableName = "users")
    public class User {

        @PrimaryKey
        @ColumnInfo(name = "userid")
        private String mId;

        @ColumnInfo(name = "username")
        private String mUserName;

        @ColumnInfo(name = "last_update")
        private Date mDate;

        @Ignore
        public User(String userName) {
            mId = UUID.randomUUID().toString();
            mUserName = userName;
            mDate = new Date(System.currentTimeMillis());
        }

        public User(String id, String userName, Date date) {
            this.mId = id;
            this.mUserName = userName;
            this.mDate = date;
        }

    }

