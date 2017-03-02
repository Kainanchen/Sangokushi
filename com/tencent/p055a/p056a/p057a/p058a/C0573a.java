package com.tencent.p055a.p056a.p057a.p058a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.a.a.a.a.a */
final class C0573a {
    static List<String> m1902a(File file) {
        Reader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                arrayList.add(readLine.trim());
            } else {
                fileReader.close();
                bufferedReader.close();
                return arrayList;
            }
        }
    }

    static File m1903d(String str) {
        File file = new File(str);
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                C0573a.m1903d(file.getParentFile().getAbsolutePath());
            }
            file.mkdir();
        }
        return file;
    }
}
