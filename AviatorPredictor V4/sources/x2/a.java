package x2;

import android.util.Log;
import com.google.firebase.firestore.u;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class a {
    public static Map<String, String> a(Exception exc) {
        HashMap hashMap = new HashMap();
        if (exc == null) {
            return hashMap;
        }
        v2.a aVar = null;
        if (exc instanceof u) {
            aVar = new v2.a((u) exc, exc.getCause());
        } else if (exc.getCause() != null && (exc.getCause() instanceof u)) {
            aVar = new v2.a((u) exc.getCause(), exc.getCause().getCause() != null ? exc.getCause().getCause() : exc.getCause());
        }
        if (aVar != null) {
            hashMap.put("code", aVar.a());
            hashMap.put("message", aVar.getMessage());
        }
        if (hashMap.containsKey("code")) {
            String str = (String) hashMap.get("code");
            Objects.requireNonNull(str);
            if (str.equals("unknown")) {
                Log.e("FLTFirebaseFirestore", "An unknown error occurred", exc);
            }
        }
        return hashMap;
    }
}
