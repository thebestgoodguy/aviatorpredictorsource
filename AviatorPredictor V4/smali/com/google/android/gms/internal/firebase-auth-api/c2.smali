.class public final Lcom/google/android/gms/internal/firebase-auth-api/c2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/jf;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/b2;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/b2;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ie;->b:Lcom/google/android/gms/internal/firebase-auth-api/ie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/c2;->b:Lcom/google/android/gms/internal/firebase-auth-api/b2;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/c2;->a:Lcom/google/android/gms/internal/firebase-auth-api/jf;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/c2;)Lcom/google/android/gms/internal/firebase-auth-api/jf;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/c2;->a:Lcom/google/android/gms/internal/firebase-auth-api/jf;

    return-object p0
.end method

.method public static b(C)Lcom/google/android/gms/internal/firebase-auth-api/c2;
    .locals 2

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/gc;

    const/16 v0, 0x2e

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/gc;-><init>(C)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/c2;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/b;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/b;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/jf;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/c2;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/b2;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/c2;
    .locals 3

    const-string p0, "[.-]"

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/lp;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ki;

    move-result-object p0

    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ki;->a(Ljava/lang/CharSequence;)Lcom/google/android/gms/internal/firebase-auth-api/lh;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/lk;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/lk;->a:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/c2;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/c1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/c1;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ki;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/c2;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/b2;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "The pattern may not match the empty string: %s"

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/d2;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final d(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/c2;->b:Lcom/google/android/gms/internal/firebase-auth-api/b2;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/b2;->a(Lcom/google/android/gms/internal/firebase-auth-api/c2;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
