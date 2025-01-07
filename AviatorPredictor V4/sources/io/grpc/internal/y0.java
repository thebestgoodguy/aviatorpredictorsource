package io.grpc.internal;

import io.grpc.internal.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/* loaded from: classes.dex */
final class y0 implements c0.g {

    /* renamed from: a, reason: collision with root package name */
    private static final Throwable f5776a = d();

    static final class a implements c {
        a() {
        }

        private static void b() {
            if (y0.f5776a != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", y0.f5776a);
            }
        }

        private static void c(NamingEnumeration<?> namingEnumeration, NamingException namingException) {
            try {
                namingEnumeration.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        private static void d(DirContext dirContext, NamingException namingException) {
            try {
                dirContext.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        @Override // io.grpc.internal.y0.c
        public List<String> a(String str, String str2) {
            b();
            String[] strArr = {str};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e5) {
                                c(all2, e5);
                            }
                        }
                        all2.close();
                    } catch (NamingException e6) {
                        c(all, e6);
                    }
                }
                all.close();
            } catch (NamingException e7) {
                d(initialDirContext, e7);
            }
            initialDirContext.close();
            return arrayList;
        }
    }

    static final class b implements c0.f {

        /* renamed from: b, reason: collision with root package name */
        private static final Logger f5777b = Logger.getLogger(b.class.getName());

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f5778c = Pattern.compile("\\s+");

        /* renamed from: a, reason: collision with root package name */
        private final c f5779a;

        public b(c cVar) {
            this.f5779a = cVar;
        }

        static String b(String str) {
            StringBuilder sb = new StringBuilder(str.length());
            int r22 = 0;
            boolean z4 = false;
            while (r22 < str.length()) {
                char charAt = str.charAt(r22);
                if (z4) {
                    if (charAt == '\"') {
                        z4 = false;
                    } else {
                        if (charAt == '\\') {
                            r22++;
                            charAt = str.charAt(r22);
                        }
                        sb.append(charAt);
                    }
                } else if (charAt != ' ') {
                    if (charAt == '\"') {
                        z4 = true;
                    }
                    sb.append(charAt);
                }
                r22++;
            }
            return sb.toString();
        }

        @Override // io.grpc.internal.c0.f
        public List<String> a(String str) {
            Logger logger = f5777b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            List<String> a5 = this.f5779a.a("TXT", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(a5.size())});
            }
            ArrayList arrayList = new ArrayList(a5.size());
            Iterator<String> it = a5.iterator();
            while (it.hasNext()) {
                arrayList.add(b(it.next()));
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    interface c {
        List<String> a(String str, String str2);
    }

    private static Throwable d() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e5) {
            return e5;
        } catch (Error e6) {
            return e6;
        } catch (RuntimeException e7) {
            return e7;
        }
    }

    @Override // io.grpc.internal.c0.g
    public c0.f a() {
        if (b() != null) {
            return null;
        }
        return new b(new a());
    }

    @Override // io.grpc.internal.c0.g
    public Throwable b() {
        return f5776a;
    }
}
