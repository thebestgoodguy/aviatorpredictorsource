package androidx.emoji2.text.flatbuffer;

/* loaded from: classes27.dex */
interface ReadWriteBuf extends ReadBuf {
    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    int limit();

    void put(byte b);

    void put(byte[] bArr, int r2, int r3);

    void putBoolean(boolean z);

    void putDouble(double d);

    void putFloat(float f);

    void putInt(int r1);

    void putLong(long j);

    void putShort(short s);

    boolean requestCapacity(int r1);

    void set(int r1, byte b);

    void set(int r1, byte[] bArr, int r3, int r4);

    void setBoolean(int r1, boolean z);

    void setDouble(int r1, double d);

    void setFloat(int r1, float f);

    void setInt(int r1, int r2);

    void setLong(int r1, long j);

    void setShort(int r1, short s);

    int writePosition();
}
