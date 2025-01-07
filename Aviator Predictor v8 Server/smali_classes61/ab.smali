.class final Lab;
.super Lx;


# instance fields
.field private final a:Lad;


# direct methods
.method constructor <init>(Lad;I)V
    .locals 1

    invoke-virtual {p1}, Lad;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lx;-><init>(II)V

    iput-object p1, p0, Lab;->a:Lad;

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lab;->a:Lad;

    invoke-virtual {v0, p1}, Lad;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
