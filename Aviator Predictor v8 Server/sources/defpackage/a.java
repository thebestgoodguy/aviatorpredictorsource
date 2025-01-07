package defpackage;

/* loaded from: classes61.dex */
enum a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11);

    private static final ag o;
    private final int q;

    static {
        af afVar = new af();
        for (a aVar : values()) {
            afVar.a(Integer.valueOf(aVar.q), aVar);
        }
        o = afVar.a();
    }

    a(int r3) {
        this.q = r3;
    }

    static a a(int r2) {
        ag agVar = o;
        Integer valueOf = Integer.valueOf(r2);
        return !agVar.containsKey(valueOf) ? RESPONSE_CODE_UNSPECIFIED : (a) agVar.get(valueOf);
    }
}
