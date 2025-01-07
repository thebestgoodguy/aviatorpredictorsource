package com.my.newproject2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes2.dex */
public class SketchwareUtil {
    public static int TOP = 1;
    public static int CENTER = 2;
    public static int BOTTOM = 3;

    public static void CustomToast(Context context, String str, int r11, int r12, int r13, int r14, int r15) {
        Toast makeText = Toast.makeText(context, str, 0);
        View view = makeText.getView();
        TextView textView = (TextView) view.findViewById(android.R.id.message);
        textView.setTextSize(r12);
        textView.setTextColor(r11);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(r13);
        gradientDrawable.setCornerRadius(r14);
        view.setBackgroundDrawable(gradientDrawable);
        view.setPadding(15, 10, 15, 10);
        view.setElevation(10.0f);
        switch (r15) {
            case 1:
                makeText.setGravity(48, 0, 150);
                break;
            case 2:
                makeText.setGravity(17, 0, 0);
                break;
            case 3:
                makeText.setGravity(80, 0, 150);
                break;
        }
        makeText.show();
    }

    public static void CustomToastWithIcon(Context context, String str, int r10, int r11, int r12, int r13, int r14, int r15) {
        Toast makeText = Toast.makeText(context, str, 0);
        View view = makeText.getView();
        TextView textView = (TextView) view.findViewById(android.R.id.message);
        textView.setTextSize(r11);
        textView.setTextColor(r10);
        textView.setCompoundDrawablesWithIntrinsicBounds(r15, 0, 0, 0);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(r12);
        gradientDrawable.setCornerRadius(r13);
        view.setBackgroundDrawable(gradientDrawable);
        view.setPadding(10, 10, 10, 10);
        view.setElevation(10.0f);
        switch (r14) {
            case 1:
                makeText.setGravity(48, 0, 150);
                break;
            case 2:
                makeText.setGravity(17, 0, 0);
                break;
            case 3:
                makeText.setGravity(80, 0, 150);
                break;
        }
        makeText.show();
    }

    public static void sortListMap(ArrayList<HashMap<String, Object>> arrayList, final String str, final boolean z, final boolean z2) {
        Collections.sort(arrayList, new Comparator<HashMap<String, Object>>() { // from class: com.my.newproject2.SketchwareUtil.1
            @Override // java.util.Comparator
            public int compare(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
                if (z) {
                    int intValue = Integer.valueOf(hashMap.get(str).toString()).intValue();
                    int intValue2 = Integer.valueOf(hashMap2.get(str).toString()).intValue();
                    if (z2) {
                        if (intValue < intValue2) {
                            return -1;
                        }
                        return intValue < intValue2 ? 1 : 0;
                    }
                    if (intValue <= intValue2) {
                        return intValue > intValue2 ? 1 : 0;
                    }
                    return -1;
                }
                if (z2) {
                    return hashMap.get(str).toString().compareTo(hashMap2.get(str).toString());
                }
                return hashMap2.get(str).toString().compareTo(hashMap.get(str).toString());
            }
        });
    }

    public static void CropImage(Activity activity, String str, int r6) {
        try {
            Intent intent = new Intent("com.android.camera.action.CROP");
            intent.setDataAndType(Uri.fromFile(new File(str)), "image/*");
            intent.putExtra("crop", "true");
            intent.putExtra("aspectX", 1);
            intent.putExtra("aspectY", 1);
            intent.putExtra("outputX", 280);
            intent.putExtra("outputY", 280);
            intent.putExtra("return-data", false);
            activity.startActivityForResult(intent, r6);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(activity, "Your device doesn't support the crop action!", 0).show();
        }
    }

    public static boolean isConnected(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static String copyFromInputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e) {
            }
        }
        byteArrayOutputStream.close();
        inputStream.close();
        return byteArrayOutputStream.toString();
    }

    public static void hideKeyboard(Context context) {
        ((InputMethodManager) context.getSystemService("input_method")).toggleSoftInput(1, 0);
    }

    public static void showKeyboard(Context context) {
        ((InputMethodManager) context.getSystemService("input_method")).toggleSoftInput(2, 0);
    }

    public static void showMessage(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }

    public static int getLocationX(View view) {
        int[] r0 = new int[2];
        view.getLocationInWindow(r0);
        return r0[0];
    }

    public static int getLocationY(View view) {
        int[] r0 = new int[2];
        view.getLocationInWindow(r0);
        return r0[1];
    }

    public static int getRandom(int r2, int r3) {
        return new Random().nextInt((r3 - r2) + 1) + r2;
    }

    public static ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int r0 = 0; r0 < checkedItemPositions.size(); r0++) {
            if (checkedItemPositions.valueAt(r0)) {
                arrayList.add(Double.valueOf(checkedItemPositions.keyAt(r0)));
            }
        }
        return arrayList;
    }

    public static float getDip(Context context, int r4) {
        return TypedValue.applyDimension(1, r4, context.getResources().getDisplayMetrics());
    }

    public static int getDisplayWidthPixels(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getDisplayHeightPixels(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static void getAllKeysFromMap(Map<String, Object> map, ArrayList<String> arrayList) {
        if (arrayList != null) {
            arrayList.clear();
            if (map != null && map.size() >= 1) {
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getKey());
                }
            }
        }
    }
}
