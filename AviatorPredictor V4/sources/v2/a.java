package v2;

import com.google.firebase.firestore.u;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x1.x;

/* loaded from: classes.dex */
public class a extends Exception {

    /* renamed from: e, reason: collision with root package name */
    private final String f7851e;

    /* renamed from: f, reason: collision with root package name */
    private final String f7852f;

    /* renamed from: v2.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0099a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7853a;

        static {
            int[] r02 = new int[u.a.values().length];
            f7853a = r02;
            try {
                r02[u.a.ABORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7853a[u.a.ALREADY_EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7853a[u.a.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7853a[u.a.DATA_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7853a[u.a.DEADLINE_EXCEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7853a[u.a.FAILED_PRECONDITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7853a[u.a.INTERNAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7853a[u.a.INVALID_ARGUMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7853a[u.a.NOT_FOUND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7853a[u.a.OUT_OF_RANGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7853a[u.a.PERMISSION_DENIED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7853a[u.a.RESOURCE_EXHAUSTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7853a[u.a.UNAUTHENTICATED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7853a[u.a.UNAVAILABLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7853a[u.a.UNIMPLEMENTED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7853a[u.a.UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a(com.google.firebase.firestore.u uVar, Throwable th) {
        super(uVar != null ? uVar.getMessage() : "", th);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        char c5;
        String str6 = null;
        if (th == null || th.getMessage() == null) {
            str = "Operation was attempted past the valid range.";
        } else {
            str = "Operation was attempted past the valid range.";
            if (th.getMessage().contains(":")) {
                Matcher matcher = Pattern.compile("([A-Z_]{3,25}):\\s(.*)").matcher(th.getMessage());
                if (matcher.find()) {
                    String trim = matcher.group(1).trim();
                    str2 = "out-of-range";
                    str3 = matcher.group(2).trim();
                    trim.hashCode();
                    switch (trim.hashCode()) {
                        case -1842427240:
                            if (trim.equals("DATA_LOSS")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1711692763:
                            if (trim.equals("INVALID_ARGUMENT")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1416305653:
                            if (trim.equals("PERMISSION_DENIED")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1031784143:
                            if (trim.equals("CANCELLED")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1025686472:
                            if (trim.equals("RESOURCE_EXHAUSTED")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -849706474:
                            if (trim.equals("UNAUTHENTICATED")) {
                                c5 = 5;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -476794961:
                            if (trim.equals("ABORTED")) {
                                c5 = 6;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -376214182:
                            if (trim.equals("DEADLINE_EXCEEDED")) {
                                c5 = 7;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 433141802:
                            if (trim.equals("UNKNOWN")) {
                                c5 = '\b';
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 695165606:
                            if (trim.equals("OUT_OF_RANGE")) {
                                c5 = '\t';
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 979228314:
                            if (trim.equals("FAILED_PRECONDITION")) {
                                c5 = '\n';
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1023286998:
                            if (trim.equals("NOT_FOUND")) {
                                c5 = 11;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1353037501:
                            if (trim.equals("INTERNAL")) {
                                c5 = '\f';
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1487498288:
                            if (trim.equals("UNAVAILABLE")) {
                                c5 = '\r';
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1661336131:
                            if (trim.equals("ALREADY_EXISTS")) {
                                c5 = 14;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1854913705:
                            if (trim.equals("UNIMPLEMENTED")) {
                                c5 = 15;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    switch (c5) {
                        case 0:
                            str3 = "Unrecoverable data loss or corruption.";
                            str6 = "data-loss";
                            break;
                        case 1:
                            str3 = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
                            str6 = "invalid-argument";
                            break;
                        case 2:
                            str6 = "permission-denied";
                            str3 = "The caller does not have permission to execute the specified operation.";
                            break;
                        case 3:
                            str3 = "The operation was cancelled (typically by the caller).";
                            str6 = "cancelled";
                            break;
                        case 4:
                            str6 = "resource-exhausted";
                            str3 = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
                            break;
                        case 5:
                            str6 = "unauthenticated";
                            str3 = "The request does not have valid authentication credentials for the operation.";
                            break;
                        case 6:
                            str3 = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
                            str6 = "aborted";
                            break;
                        case 7:
                            str3 = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
                            str6 = "deadline-exceeded";
                            break;
                        case '\b':
                            str6 = "unknown";
                            str3 = "Operation is not implemented or not supported/enabled.";
                            break;
                        case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            str3 = str;
                            str6 = str2;
                            break;
                        case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            if (!str3.contains("query requires an index") && !str3.contains("ensure it has been indexed")) {
                                str3 = "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console.";
                            }
                            str6 = "failed-precondition";
                            break;
                        case 11:
                            str3 = "Some requested document was not found.";
                            str6 = "not-found";
                            break;
                        case '\f':
                            str3 = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
                            str6 = "internal";
                            break;
                        case '\r':
                            str6 = "unavailable";
                            str3 = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
                            break;
                        case 14:
                            str3 = "Some document that we attempted to create already exists.";
                            str6 = "already-exists";
                            break;
                        case 15:
                            str6 = "unimplemented";
                            str3 = "Operation is not implemented or not supported/enabled.";
                            break;
                        default:
                            str3 = null;
                            break;
                    }
                    if (str6 != null && uVar != null) {
                        switch (C0099a.f7853a[uVar.a().ordinal()]) {
                            case 1:
                                str4 = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
                                str5 = "aborted";
                                break;
                            case 2:
                                str4 = "Some document that we attempted to create already exists.";
                                str5 = "already-exists";
                                break;
                            case 3:
                                str4 = "The operation was cancelled (typically by the caller).";
                                str5 = "cancelled";
                                break;
                            case 4:
                                str4 = "Unrecoverable data loss or corruption.";
                                str5 = "data-loss";
                                break;
                            case 5:
                                str4 = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
                                str5 = "deadline-exceeded";
                                break;
                            case 6:
                                str4 = ((uVar.getMessage() == null || !uVar.getMessage().contains("query requires an index")) && !uVar.getMessage().contains("ensure it has been indexed")) ? "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console." : uVar.getMessage();
                                str5 = "failed-precondition";
                                break;
                            case 7:
                                str4 = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
                                str5 = "internal";
                                break;
                            case 8:
                                str4 = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
                                str5 = "invalid-argument";
                                break;
                            case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                                str4 = "Some requested document was not found.";
                                str5 = "not-found";
                                break;
                            case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                                str4 = str;
                                str5 = str2;
                                break;
                            case 11:
                                str5 = "permission-denied";
                                str4 = "The caller does not have permission to execute the specified operation.";
                                break;
                            case 12:
                                str5 = "resource-exhausted";
                                str4 = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
                                break;
                            case 13:
                                str5 = "unauthenticated";
                                str4 = "The request does not have valid authentication credentials for the operation.";
                                break;
                            case 14:
                                str5 = "unavailable";
                                str4 = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
                                break;
                            case 15:
                                str5 = "unimplemented";
                                str4 = "Operation is not implemented or not supported/enabled.";
                                break;
                            case 16:
                                str4 = "Unknown error or an error from a different error domain.";
                                str5 = "unknown";
                                break;
                            default:
                                str4 = "An unknown error occurred";
                                str5 = "unknown";
                                break;
                        }
                    } else {
                        str4 = str3;
                        str5 = str6;
                    }
                    this.f7851e = str5;
                    this.f7852f = str4;
                }
            }
        }
        str2 = "out-of-range";
        str3 = null;
        if (str6 != null) {
        }
        str4 = str3;
        str5 = str6;
        this.f7851e = str5;
        this.f7852f = str4;
    }

    public String a() {
        return this.f7851e;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f7852f;
    }
}
