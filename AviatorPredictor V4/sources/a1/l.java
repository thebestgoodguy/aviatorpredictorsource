package a1;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class l {
    public static Status a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        return asList.size() > 1 ? b((String) asList.get(0), (String) asList.get(1)) : b((String) asList.get(0), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Status b(String str, String str2) {
        char c5;
        int r02;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c5 = 'C';
                    break;
                }
                c5 = 65535;
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c5 = 28;
                    break;
                }
                c5 = 65535;
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c5 = '/';
                    break;
                }
                c5 = 65535;
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c5 = '@';
                    break;
                }
                c5 = 65535;
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c5 = '-';
                    break;
                }
                c5 = 65535;
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c5 = '\'';
                    break;
                }
                c5 = 65535;
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c5 = ')';
                    break;
                }
                c5 = 65535;
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c5 = 25;
                    break;
                }
                c5 = 65535;
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c5 = 24;
                    break;
                }
                c5 = 65535;
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c5 = 29;
                    break;
                }
                c5 = 65535;
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c5 = '\"';
                    break;
                }
                c5 = 65535;
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c5 = 23;
                    break;
                }
                c5 = 65535;
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c5 = '2';
                    break;
                }
                c5 = 65535;
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c5 = '$';
                    break;
                }
                c5 = 65535;
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c5 = '<';
                    break;
                }
                c5 = 65535;
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c5 = ':';
                    break;
                }
                c5 = 65535;
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c5 = 'B';
                    break;
                }
                c5 = 65535;
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c5 = '(';
                    break;
                }
                c5 = 65535;
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c5 = '9';
                    break;
                }
                c5 = 65535;
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c5 = 30;
                    break;
                }
                c5 = 65535;
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c5 = 20;
                    break;
                }
                c5 = 65535;
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    c5 = 14;
                    break;
                }
                c5 = 65535;
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c5 = 17;
                    break;
                }
                c5 = 65535;
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c5 = '*';
                    break;
                }
                c5 = 65535;
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c5 = '=';
                    break;
                }
                c5 = 65535;
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c5 = '7';
                    break;
                }
                c5 = 65535;
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c5 = '\t';
                    break;
                }
                c5 = 65535;
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c5 = 16;
                    break;
                }
                c5 = 65535;
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c5 = '>';
                    break;
                }
                c5 = 65535;
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c5 = 27;
                    break;
                }
                c5 = 65535;
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c5 = 31;
                    break;
                }
                c5 = 65535;
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c5 = '3';
                    break;
                }
                c5 = 65535;
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c5 = '6';
                    break;
                }
                c5 = 65535;
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c5 = 'D';
                    break;
                }
                c5 = 65535;
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c5 = '\n';
                    break;
                }
                c5 = 65535;
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c5 = '\r';
                    break;
                }
                c5 = 65535;
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c5 = '+';
                    break;
                }
                c5 = 65535;
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c5 = 18;
                    break;
                }
                c5 = 65535;
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c5 = ';';
                    break;
                }
                c5 = 65535;
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c5 = '4';
                    break;
                }
                c5 = 65535;
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c5 = '8';
                    break;
                }
                c5 = 65535;
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c5 = '%';
                    break;
                }
                c5 = 65535;
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c5 = '.';
                    break;
                }
                c5 = 65535;
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c5 = '0';
                    break;
                }
                c5 = 65535;
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c5 = '5';
                    break;
                }
                c5 = 65535;
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c5 = 'A';
                    break;
                }
                c5 = 65535;
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c5 = 26;
                    break;
                }
                c5 = 65535;
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c5 = 22;
                    break;
                }
                c5 = 65535;
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c5 = 11;
                    break;
                }
                c5 = 65535;
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c5 = 15;
                    break;
                }
                c5 = 65535;
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c5 = '&';
                    break;
                }
                c5 = 65535;
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c5 = '!';
                    break;
                }
                c5 = 65535;
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c5 = '\f';
                    break;
                }
                c5 = 65535;
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c5 = ' ';
                    break;
                }
                c5 = 65535;
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c5 = 19;
                    break;
                }
                c5 = 65535;
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c5 = 21;
                    break;
                }
                c5 = 65535;
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c5 = ',';
                    break;
                }
                c5 = 65535;
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c5 = '#';
                    break;
                }
                c5 = 65535;
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c5 = '?';
                    break;
                }
                c5 = 65535;
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c5 = '1';
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
                r02 = 17016;
                break;
            case 1:
                r02 = 17002;
                break;
            case 2:
                r02 = 17000;
                break;
            case 3:
            case 4:
                r02 = 17004;
                break;
            case 5:
                r02 = 17005;
                break;
            case 6:
            case 7:
                r02 = 17008;
                break;
            case '\b':
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                r02 = 17011;
                break;
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                r02 = 17007;
                break;
            case 11:
                r02 = 17009;
                break;
            case '\f':
                r02 = 17025;
                break;
            case '\r':
                r02 = 17017;
                break;
            case 14:
            case 15:
                r02 = 17020;
                break;
            case 16:
                r02 = 17026;
                break;
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case x1.x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                r02 = 17006;
                break;
            case 19:
                r02 = 17028;
                break;
            case 20:
                r02 = 17014;
                break;
            case 21:
            case 22:
                r02 = 17010;
                break;
            case 23:
                r02 = 17021;
                break;
            case 24:
                r02 = 17030;
                break;
            case 25:
                r02 = 17029;
                break;
            case 26:
                r02 = 17031;
                break;
            case 27:
                r02 = 17032;
                break;
            case 28:
                r02 = 17033;
                break;
            case 29:
                r02 = 17034;
                break;
            case 30:
                r02 = 17035;
                break;
            case 31:
                r02 = 17041;
                break;
            case ' ':
                r02 = 17042;
                break;
            case '!':
                r02 = 17043;
                break;
            case '\"':
                r02 = 17044;
                break;
            case '#':
                r02 = 17045;
                break;
            case '$':
                r02 = 17046;
                break;
            case '%':
                r02 = 17049;
                break;
            case '&':
                r02 = 17051;
                break;
            case '\'':
                r02 = 17052;
                break;
            case '(':
                r02 = 17064;
                break;
            case ')':
                r02 = 17061;
                break;
            case '*':
                r02 = 17062;
                break;
            case '+':
                r02 = 17065;
                break;
            case ',':
                r02 = 17040;
                break;
            case '-':
                r02 = 17068;
                break;
            case '.':
                r02 = 17071;
                break;
            case '/':
                r02 = 17057;
                break;
            case '0':
                r02 = 17058;
                break;
            case '1':
                r02 = 17073;
                break;
            case '2':
                r02 = 17079;
                break;
            case '3':
                r02 = 17074;
                break;
            case '4':
                r02 = 17075;
                break;
            case '5':
                r02 = 17078;
                break;
            case '6':
                r02 = 17081;
                break;
            case '7':
                r02 = 17082;
                break;
            case '8':
                r02 = 17083;
                break;
            case '9':
                r02 = 17084;
                break;
            case ':':
                r02 = 17085;
                break;
            case ';':
                r02 = 17086;
                break;
            case '<':
                r02 = 17087;
                break;
            case '=':
                r02 = 17088;
                break;
            case '>':
                r02 = 17089;
                break;
            case '?':
                r02 = 17090;
                break;
            case '@':
                r02 = 17091;
                break;
            case 'A':
                r02 = 17093;
                break;
            case 'B':
                r02 = 17094;
                break;
            case 'C':
                r02 = 18001;
                break;
            case 'D':
                r02 = 17095;
                break;
            default:
                r02 = 17499;
                break;
        }
        if (r02 != 17499) {
            return new Status(r02, str2);
        }
        if (str2 == null) {
            return new Status(17499, str);
        }
        return new Status(17499, str + ":" + str2);
    }
}
