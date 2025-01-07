.class final Li0/k;
.super Li0/j$b;
.source ""


# instance fields
.field private final synthetic t:[B

.field private final synthetic u:Ljava/lang/String;


# direct methods
.method constructor <init>(Lt/f;[BLjava/lang/String;)V
    .locals 0

    iput-object p2, p0, Li0/k;->t:[B

    iput-object p3, p0, Li0/k;->u:Ljava/lang/String;

    invoke-direct {p0, p1}, Li0/j$b;-><init>(Lt/f;)V

    return-void
.end method


# virtual methods
.method protected final synthetic l(Lt/a$b;)V
    .locals 4

    check-cast p1, Li0/m;

    iget-object v0, p0, Li0/j$b;->s:Li0/f;

    iget-object v1, p0, Li0/k;->t:[B

    iget-object v2, p0, Li0/k;->u:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v2, "com.google.android.safetynet.ATTEST_API_KEY"

    invoke-virtual {p1, v2}, Li0/m;->j0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_0
    invoke-virtual {p1}, Lw/c;->C()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Li0/h;

    invoke-interface {p1, v0, v1, v2}, Li0/h;->s(Li0/f;[BLjava/lang/String;)V

    return-void
.end method
