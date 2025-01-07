package androidx.constraintlayout.core.parser;

/* loaded from: classes40.dex */
public class CLToken extends CLElement {
    int index;
    char[] tokenFalse;
    char[] tokenNull;
    char[] tokenTrue;
    Type type;

    enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public boolean getBoolean() throws CLParsingException {
        if (this.type == Type.TRUE) {
            return true;
        }
        if (this.type == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }

    public boolean isNull() throws CLParsingException {
        if (this.type == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    public CLToken(char[] content) {
        super(content);
        this.index = 0;
        this.type = Type.UNKNOWN;
        this.tokenTrue = "true".toCharArray();
        this.tokenFalse = "false".toCharArray();
        this.tokenNull = "null".toCharArray();
    }

    public static CLElement allocate(char[] content) {
        return new CLToken(content);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        if (CLParser.DEBUG) {
            return "<" + content() + ">";
        }
        return content();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int indent, int forceIndent) {
        StringBuilder json = new StringBuilder();
        addIndent(json, indent);
        json.append(content());
        return json.toString();
    }

    public Type getType() {
        return this.type;
    }

    /* renamed from: androidx.constraintlayout.core.parser.CLToken$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type;

        static {
            int[] r0 = new int[Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type = r0;
            try {
                r0[Type.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[Type.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[Type.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[Type.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public boolean validate(char c, long position) {
        boolean isValid = false;
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[this.type.ordinal()]) {
            case 1:
                char[] cArr = this.tokenTrue;
                int r4 = this.index;
                isValid = cArr[r4] == c;
                if (isValid && r4 + 1 == cArr.length) {
                    setEnd(position);
                    break;
                }
                break;
            case 2:
                char[] cArr2 = this.tokenFalse;
                int r42 = this.index;
                isValid = cArr2[r42] == c;
                if (isValid && r42 + 1 == cArr2.length) {
                    setEnd(position);
                    break;
                }
                break;
            case 3:
                char[] cArr3 = this.tokenNull;
                int r43 = this.index;
                isValid = cArr3[r43] == c;
                if (isValid && r43 + 1 == cArr3.length) {
                    setEnd(position);
                    break;
                }
                break;
            case 4:
                char[] cArr4 = this.tokenTrue;
                int r2 = this.index;
                if (cArr4[r2] == c) {
                    this.type = Type.TRUE;
                    isValid = true;
                    break;
                } else if (this.tokenFalse[r2] == c) {
                    this.type = Type.FALSE;
                    isValid = true;
                    break;
                } else if (this.tokenNull[r2] == c) {
                    this.type = Type.NULL;
                    isValid = true;
                    break;
                }
                break;
        }
        this.index++;
        return isValid;
    }
}
