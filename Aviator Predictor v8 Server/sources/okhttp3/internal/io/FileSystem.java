package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* loaded from: classes59.dex */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() { // from class: okhttp3.internal.io.FileSystem.1
        @Override // okhttp3.internal.io.FileSystem
        public Source source(File file) throws FileNotFoundException {
            return Okio.source(file);
        }

        @Override // okhttp3.internal.io.FileSystem
        public Sink sink(File file) throws FileNotFoundException {
            try {
                return Okio.sink(file);
            } catch (FileNotFoundException e) {
                file.getParentFile().mkdirs();
                return Okio.sink(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public Sink appendingSink(File file) throws FileNotFoundException {
            try {
                return Okio.appendingSink(file);
            } catch (FileNotFoundException e) {
                file.getParentFile().mkdirs();
                return Okio.appendingSink(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public void delete(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // okhttp3.internal.io.FileSystem
        public long size(File file) {
            return file.length();
        }

        @Override // okhttp3.internal.io.FileSystem
        public void rename(File from, File to) throws IOException {
            delete(to);
            if (!from.renameTo(to)) {
                throw new IOException("failed to rename " + from + " to " + to);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public void deleteContents(File directory) throws IOException {
            File[] files = directory.listFiles();
            if (files == null) {
                throw new IOException("not a readable directory: " + directory);
            }
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteContents(file);
                }
                if (!file.delete()) {
                    throw new IOException("failed to delete " + file);
                }
            }
        }
    };

    Sink appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    Sink sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
