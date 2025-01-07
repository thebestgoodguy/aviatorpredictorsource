package m;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f6599f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static a f6600g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6601a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f6602b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f6603c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f6604d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f6605e;

    /* renamed from: m.a$a, reason: collision with other inner class name */
    class HandlerC0066a extends Handler {
        HandlerC0066a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f6607a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f6608b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f6607a = intent;
            this.f6608b = arrayList;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f6609a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f6610b;

        /* renamed from: c, reason: collision with root package name */
        boolean f6611c;

        /* renamed from: d, reason: collision with root package name */
        boolean f6612d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f6609a = intentFilter;
            this.f6610b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f6610b);
            sb.append(" filter=");
            sb.append(this.f6609a);
            if (this.f6612d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private a(Context context) {
        this.f6601a = context;
        this.f6605e = new HandlerC0066a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f6599f) {
            if (f6600g == null) {
                f6600g = new a(context.getApplicationContext());
            }
            aVar = f6600g;
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f6602b) {
                size = this.f6604d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f6604d.toArray(bVarArr);
                this.f6604d.clear();
            }
            for (int r32 = 0; r32 < size; r32++) {
                b bVar = bVarArr[r32];
                int size2 = bVar.f6608b.size();
                for (int r6 = 0; r6 < size2; r6++) {
                    c cVar = bVar.f6608b.get(r6);
                    if (!cVar.f6612d) {
                        cVar.f6610b.onReceive(this.f6601a, bVar.f6607a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f6602b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f6602b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f6602b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int r7 = 0; r7 < intentFilter.countActions(); r7++) {
                String action = intentFilter.getAction(r7);
                ArrayList<c> arrayList2 = this.f6603c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f6603c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(Intent intent) {
        int r17;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f6602b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f6601a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z4 = (intent.getFlags() & 8) != 0;
            if (z4) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f6603c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z4) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int r6 = 0;
                while (r6 < arrayList3.size()) {
                    c cVar = arrayList3.get(r6);
                    if (z4) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f6609a);
                    }
                    if (cVar.f6611c) {
                        if (z4) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        r17 = r6;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        r17 = r6;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = cVar.f6609a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z4) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f6611c = true;
                            r6 = r17 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z4) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    r6 = r17 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int r32 = 0; r32 < arrayList5.size(); r32++) {
                        ((c) arrayList5.get(r32)).f6611c = false;
                    }
                    this.f6604d.add(new b(intent, arrayList5));
                    if (!this.f6605e.hasMessages(1)) {
                        this.f6605e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f6602b) {
            ArrayList<c> remove = this.f6602b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.f6612d = true;
                for (int r5 = 0; r5 < cVar.f6609a.countActions(); r5++) {
                    String action = cVar.f6609a.getAction(r5);
                    ArrayList<c> arrayList = this.f6603c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f6610b == broadcastReceiver) {
                                cVar2.f6612d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f6603c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
