package com.example.vipul.dailyselfie;

/**
 * Created by vipul on 7/16/2017.
 */

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;

public class ImageHelper {

    private static final String LOG_TAG = ImageHelper.class.getSimpleName();

    public static void setImageFromFilePath(String imagePath, ImageView imageView, int targetW, int targetH) {
        // Get the dimensions of the bitmap
        BitmapFactory.Options bmpOptions = new BitmapFactory.Options();
        bmpOptions.inJustDecodeBounds = true;
        Bitmap bmp = BitmapFactory.decodeFile(imagePath, bmpOptions);
        int photoW = bmpOptions.outWidth;
        int photoH = bmpOptions.outHeight;

        // determine scale factor
        int scaleFactor = Math.max(photoW / targetW, photoH / targetH);

        // decode the image file into a Bitmap
        bmpOptions.inJustDecodeBounds = false;
        bmpOptions.inSampleSize = scaleFactor;

        Bitmap bitmap = BitmapFactory.decodeFile(imagePath, bmpOptions);
        imageView.setImageBitmap(bitmap);
    }

    public static void setImageFromFilePath(String imagePath, ImageView imageView) {
        setImageFromFilePath(imagePath, imageView, 120, 160);
    }

}
