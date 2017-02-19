package com.learn2crack.recyclerviewgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String android_version_names[] = {
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop",
            "Marshmallow"
    };

    private final String android_image_urls[] = {
            "http://www.hey.fr/tools/emoji/ios_emoji_smiling_face_with_halo.png",
            "http://pix.iemoji.com/images/emoji/apple/ios-9/256/smiling-face-with-heart-shaped-eyes.png",
            "http://www.hey.fr/tools/emoji/ios_emoji_face_savouring_delicious_food.png",
            "https://hithisisdom.files.wordpress.com/2013/06/screen-shot-2013-06-01-at-11-00-56-pm.png",
            "https://s-media-cache-ak0.pinimg.com/736x/27/19/cf/2719cf678d8e9a83450173dea3ead811.jpg",
            "https://ih0.redbubble.net/image.253614553.0482/sticker,420x460-pad,420x460,f8f8f8.u1.jpg",
            "https://img.clipartfest.com/94a7ac86210704d7e12abbf3b216cff9_186-smiley-face-emoji-emoji-clipart-transparent-background_324-324.jpeg",
            "http://michelle.github.io/css-first/images/grimacing.jpg",
            "https://rlv.zcache.com.pt/cara_de_sorriso_com_oculos_de_sol_emoji_adesivo-r4c002206e6b04dd3a006b0acfbc65435_v9waf_8byvr_512.jpg",
            "https://indyschild.com/wp-content/uploads/2015/12/Ebuckteeth.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<AndroidVersion> androidVersions = prepareData();
        DataAdapter adapter = new DataAdapter(getApplicationContext(), androidVersions);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<AndroidVersion> prepareData() {

        ArrayList<AndroidVersion> android_version = new ArrayList<>();


        for (int i = 1; i <10; i++)
        {
            {
                AndroidVersion androidVersion = new AndroidVersion();
                androidVersion.setAndroid_version_name(android_version_names[i]);
                android_version.add(androidVersion);


            for(int j=1;j<10;j++) {
                AndroidVersion androidVersion2 = new AndroidVersion();
                androidVersion2.setAndroid_image_url(android_image_urls[j]);
                android_version.add(androidVersion2);

            }

            }





        }


        return android_version;

    }
}
