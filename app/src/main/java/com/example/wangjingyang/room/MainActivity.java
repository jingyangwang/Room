package com.example.wangjingyang.room;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.room1.AppDatabase;
import com.room1.UserEntity;

import static android.icu.lang.UProperty.AGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {
//                UserEntity userEntity = new UserEntity("NAME, "AGE");
//                        AppDatabase.getDatabase(getApplicationContext()).getUserEntityDao().addUser(userEntity);

          UserEntity userEntity=new UserEntity("NAME","AGE");
//                UserEntity userEntity=new UserEntity("name","age");
//                userEntity.set_id(1);
                userEntity.setAge("18");
                userEntity.setName("xiaojing");
                AppDatabase.getDatabase(getApplicationContext()).getUserEntityDao().addUser(userEntity);

                UserEntity  userEntity1= AppDatabase.getDatabase(getApplicationContext()).getUserEntityDao().getUserByName("xiaojing");
                Log.i("debug2122112223121","userEntity1 "+userEntity1.get_id());





            }
        }).start();
    }
}
