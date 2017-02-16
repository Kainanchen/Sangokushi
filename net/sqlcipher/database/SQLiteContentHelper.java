package net.sqlcipher.database;

import a.does.not.Exists0;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.MemoryFile;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.ali.fixHelper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

public class SQLiteContentHelper {
    static {
        fixHelper.fixfunc(new int[]{12161, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public static AssetFileDescriptor getBlobColumnAsAssetFile(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            MemoryFile simpleQueryForBlobMemoryFile = simpleQueryForBlobMemoryFile(sQLiteDatabase, str, strArr);
            if (simpleQueryForBlobMemoryFile == null) {
                throw new FileNotFoundException("No results.");
            }
            try {
                Method declaredMethod = simpleQueryForBlobMemoryFile.getClass().getDeclaredMethod("getParcelFileDescriptor", new Class[0]);
                declaredMethod.setAccessible(true);
                parcelFileDescriptor = (ParcelFileDescriptor) declaredMethod.invoke(simpleQueryForBlobMemoryFile, new Object[0]);
            } catch (Exception e) {
                Log.i("SQLiteContentHelper", "SQLiteCursor.java: " + e);
            }
            return new AssetFileDescriptor(parcelFileDescriptor, 0, (long) simpleQueryForBlobMemoryFile.length());
        } catch (IOException e2) {
            throw new FileNotFoundException(e2.toString());
        }
    }

    private static MemoryFile simpleQueryForBlobMemoryFile(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        MemoryFile memoryFile = null;
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    byte[] blob = rawQuery.getBlob(0);
                    if (blob == null) {
                        rawQuery.close();
                    } else {
                        memoryFile = new MemoryFile(null, blob.length);
                        memoryFile.writeBytes(blob, 0, 0, blob.length);
                        rawQuery.close();
                    }
                }
            } finally {
                rawQuery.close();
            }
        }
        return memoryFile;
    }
}
