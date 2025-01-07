.class public final synthetic Lcom/google/firebase/auth/d2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb1/h;


# static fields
.field public static final synthetic a:Lcom/google/firebase/auth/d2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/d2;

    invoke-direct {v0}, Lcom/google/firebase/auth/d2;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/d2;->a:Lcom/google/firebase/auth/d2;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb1/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuthRegistrar;->lambda$getComponents$0(Lb1/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    return-object p1
.end method
