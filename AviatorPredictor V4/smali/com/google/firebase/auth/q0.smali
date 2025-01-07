.class public Lcom/google/firebase/auth/q0;
.super Lcom/google/firebase/auth/h0;
.source ""


# instance fields
.field private final a:Lcom/google/firebase/auth/n0;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/n0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/h0;-><init>()V

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/firebase/auth/q0;->a:Lcom/google/firebase/auth/n0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/firebase/auth/n0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/q0;->a:Lcom/google/firebase/auth/n0;

    return-object v0
.end method
