.class public Li1/j$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li1/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lp1/g;

.field private final c:Li1/m;

.field private final d:Lo1/m;

.field private final e:Lg1/j;

.field private final f:I

.field private final g:Lcom/google/firebase/firestore/v;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lp1/g;Li1/m;Lo1/m;Lg1/j;ILcom/google/firebase/firestore/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/j$a;->a:Landroid/content/Context;

    iput-object p2, p0, Li1/j$a;->b:Lp1/g;

    iput-object p3, p0, Li1/j$a;->c:Li1/m;

    iput-object p4, p0, Li1/j$a;->d:Lo1/m;

    iput-object p5, p0, Li1/j$a;->e:Lg1/j;

    iput p6, p0, Li1/j$a;->f:I

    iput-object p7, p0, Li1/j$a;->g:Lcom/google/firebase/firestore/v;

    return-void
.end method


# virtual methods
.method a()Lp1/g;
    .locals 1

    iget-object v0, p0, Li1/j$a;->b:Lp1/g;

    return-object v0
.end method

.method b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Li1/j$a;->a:Landroid/content/Context;

    return-object v0
.end method

.method c()Li1/m;
    .locals 1

    iget-object v0, p0, Li1/j$a;->c:Li1/m;

    return-object v0
.end method

.method d()Lo1/m;
    .locals 1

    iget-object v0, p0, Li1/j$a;->d:Lo1/m;

    return-object v0
.end method

.method e()Lg1/j;
    .locals 1

    iget-object v0, p0, Li1/j$a;->e:Lg1/j;

    return-object v0
.end method

.method f()I
    .locals 1

    iget v0, p0, Li1/j$a;->f:I

    return v0
.end method

.method g()Lcom/google/firebase/firestore/v;
    .locals 1

    iget-object v0, p0, Li1/j$a;->g:Lcom/google/firebase/firestore/v;

    return-object v0
.end method
