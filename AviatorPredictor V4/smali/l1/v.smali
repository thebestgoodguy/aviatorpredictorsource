.class public final Ll1/v;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lx1/x;)Lcom/google/protobuf/t1;
    .locals 1

    invoke-virtual {p0}, Lx1/x;->m0()Lx1/r;

    move-result-object p0

    const-string v0, "__local_write_time__"

    invoke-virtual {p0, v0}, Lx1/r;->Z(Ljava/lang/String;)Lx1/x;

    move-result-object p0

    invoke-virtual {p0}, Lx1/x;->p0()Lcom/google/protobuf/t1;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lx1/x;)Lx1/x;
    .locals 2

    invoke-virtual {p0}, Lx1/x;->m0()Lx1/r;

    move-result-object p0

    const-string v0, "__previous_value__"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lx1/r;->Y(Ljava/lang/String;Lx1/x;)Lx1/x;

    move-result-object p0

    invoke-static {p0}, Ll1/v;->c(Lx1/x;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ll1/v;->b(Lx1/x;)Lx1/x;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static c(Lx1/x;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lx1/x;->m0()Lx1/r;

    move-result-object p0

    const-string v1, "__type__"

    invoke-virtual {p0, v1, v0}, Lx1/r;->Y(Ljava/lang/String;Lx1/x;)Lx1/x;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lx1/x;->o0()Ljava/lang/String;

    move-result-object p0

    const-string v0, "server_timestamp"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static d(Lx0/o;Lx1/x;)Lx1/x;
    .locals 5

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v0

    const-string v1, "server_timestamp"

    invoke-virtual {v0, v1}, Lx1/x$b;->Q(Ljava/lang/String;)Lx1/x$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v0

    check-cast v0, Lx1/x;

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v1

    invoke-static {}, Lcom/google/protobuf/t1;->Z()Lcom/google/protobuf/t1$b;

    move-result-object v2

    invoke-virtual {p0}, Lx0/o;->i()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/protobuf/t1$b;->D(J)Lcom/google/protobuf/t1$b;

    move-result-object v2

    invoke-virtual {p0}, Lx0/o;->g()I

    move-result p0

    invoke-virtual {v2, p0}, Lcom/google/protobuf/t1$b;->B(I)Lcom/google/protobuf/t1$b;

    move-result-object p0

    invoke-virtual {v1, p0}, Lx1/x$b;->R(Lcom/google/protobuf/t1$b;)Lx1/x$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/x;

    invoke-static {}, Lx1/r;->d0()Lx1/r$b;

    move-result-object v1

    const-string v2, "__type__"

    invoke-virtual {v1, v2, v0}, Lx1/r$b;->E(Ljava/lang/String;Lx1/x;)Lx1/r$b;

    move-result-object v0

    const-string v1, "__local_write_time__"

    invoke-virtual {v0, v1, p0}, Lx1/r$b;->E(Ljava/lang/String;Lx1/x;)Lx1/r$b;

    move-result-object p0

    if-eqz p1, :cond_0

    const-string v0, "__previous_value__"

    invoke-virtual {p0, v0, p1}, Lx1/r$b;->E(Ljava/lang/String;Lx1/x;)Lx1/r$b;

    :cond_0
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lx1/x$b;->L(Lx1/r$b;)Lx1/x$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/x;

    return-object p0
.end method
