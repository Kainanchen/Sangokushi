package com.facebook.common.p009c;

import java.io.File;

/* renamed from: com.facebook.common.c.a */
public final class FileTree {
    public static void m1016a(File file, FileTreeVisitor fileTreeVisitor) {
        fileTreeVisitor.m913a(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    FileTree.m1016a(file2, fileTreeVisitor);
                } else {
                    fileTreeVisitor.m914b(file2);
                }
            }
        }
        fileTreeVisitor.m915c(file);
    }

    public static boolean m1017a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File a : listFiles) {
                    FileTree.m1017a(a);
                }
            }
        }
        return file.delete();
    }
}
