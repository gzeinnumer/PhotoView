package com.gzeinnumer.photoview;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    PhotoViewAttacher attacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.photoVIew);
        Drawable bitmap = getResources().getDrawable(R.drawable.logo_gw2_big);
        imageView.setImageDrawable(bitmap);

        attacher = new PhotoViewAttacher(imageView);
        attacher.update();
    }
}
