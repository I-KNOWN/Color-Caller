package com.uprisingscallscreen.theme.flashscreen.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.uprisingscallscreen.theme.flashscreen.models.ThemesModel;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ThemesDao_Impl implements ThemesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ThemesModel> __insertionAdapterOfThemesModel;

  private final EntityDeletionOrUpdateAdapter<ThemesModel> __deletionAdapterOfThemesModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllFav;

  public ThemesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfThemesModel = new EntityInsertionAdapter<ThemesModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `themes` (`id`,`date`,`themeId`,`themeJsonName`,`themeDrawableName`,`keysBgName`,`isNeon`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ThemesModel value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getDate());
        stmt.bindLong(3, value.getThemeId());
        if (value.getThemeJsonName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getThemeJsonName());
        }
        if (value.getThemeDrawableName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getThemeDrawableName());
        }
        if (value.getKeysBgName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getKeysBgName());
        }
        final Integer _tmp = value.isNeon() == null ? null : (value.isNeon() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
      }
    };
    this.__deletionAdapterOfThemesModel = new EntityDeletionOrUpdateAdapter<ThemesModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `themes` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ThemesModel value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllFav = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM themes";
        return _query;
      }
    };
  }

  @Override
  public Object insertThemeItem(final ThemesModel note,
      final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfThemesModel.insertAndReturnId(note);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteSingleTheme(final ThemesModel note,
      final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__deletionAdapterOfThemesModel.handle(note);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAllFav(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllFav.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllFav.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object clearThemes(final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllFav.acquire();
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllFav.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object checkIfExist(final int themeId,
      final Continuation<? super List<ThemesModel>> continuation) {
    final String _sql = "SELECT * FROM themes where themeId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, themeId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ThemesModel>>() {
      @Override
      public List<ThemesModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfThemeId = CursorUtil.getColumnIndexOrThrow(_cursor, "themeId");
          final int _cursorIndexOfThemeJsonName = CursorUtil.getColumnIndexOrThrow(_cursor, "themeJsonName");
          final int _cursorIndexOfThemeDrawableName = CursorUtil.getColumnIndexOrThrow(_cursor, "themeDrawableName");
          final int _cursorIndexOfKeysBgName = CursorUtil.getColumnIndexOrThrow(_cursor, "keysBgName");
          final int _cursorIndexOfIsNeon = CursorUtil.getColumnIndexOrThrow(_cursor, "isNeon");
          final List<ThemesModel> _result = new ArrayList<ThemesModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ThemesModel _item;
            _item = new ThemesModel();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            _item.setDate(_tmpDate);
            final int _tmpThemeId;
            _tmpThemeId = _cursor.getInt(_cursorIndexOfThemeId);
            _item.setThemeId(_tmpThemeId);
            final String _tmpThemeJsonName;
            if (_cursor.isNull(_cursorIndexOfThemeJsonName)) {
              _tmpThemeJsonName = null;
            } else {
              _tmpThemeJsonName = _cursor.getString(_cursorIndexOfThemeJsonName);
            }
            _item.setThemeJsonName(_tmpThemeJsonName);
            final String _tmpThemeDrawableName;
            if (_cursor.isNull(_cursorIndexOfThemeDrawableName)) {
              _tmpThemeDrawableName = null;
            } else {
              _tmpThemeDrawableName = _cursor.getString(_cursorIndexOfThemeDrawableName);
            }
            _item.setThemeDrawableName(_tmpThemeDrawableName);
            final String _tmpKeysBgName;
            if (_cursor.isNull(_cursorIndexOfKeysBgName)) {
              _tmpKeysBgName = null;
            } else {
              _tmpKeysBgName = _cursor.getString(_cursorIndexOfKeysBgName);
            }
            _item.setKeysBgName(_tmpKeysBgName);
            final Boolean _tmpIsNeon;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfIsNeon)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfIsNeon);
            }
            _tmpIsNeon = _tmp == null ? null : _tmp != 0;
            _item.setNeon(_tmpIsNeon);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<ThemesModel>> getFavThemes() {
    final String _sql = "SELECT * FROM themes order by date Desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"themes"}, new Callable<List<ThemesModel>>() {
      @Override
      public List<ThemesModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfThemeId = CursorUtil.getColumnIndexOrThrow(_cursor, "themeId");
          final int _cursorIndexOfThemeJsonName = CursorUtil.getColumnIndexOrThrow(_cursor, "themeJsonName");
          final int _cursorIndexOfThemeDrawableName = CursorUtil.getColumnIndexOrThrow(_cursor, "themeDrawableName");
          final int _cursorIndexOfKeysBgName = CursorUtil.getColumnIndexOrThrow(_cursor, "keysBgName");
          final int _cursorIndexOfIsNeon = CursorUtil.getColumnIndexOrThrow(_cursor, "isNeon");
          final List<ThemesModel> _result = new ArrayList<ThemesModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ThemesModel _item;
            _item = new ThemesModel();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            _item.setDate(_tmpDate);
            final int _tmpThemeId;
            _tmpThemeId = _cursor.getInt(_cursorIndexOfThemeId);
            _item.setThemeId(_tmpThemeId);
            final String _tmpThemeJsonName;
            if (_cursor.isNull(_cursorIndexOfThemeJsonName)) {
              _tmpThemeJsonName = null;
            } else {
              _tmpThemeJsonName = _cursor.getString(_cursorIndexOfThemeJsonName);
            }
            _item.setThemeJsonName(_tmpThemeJsonName);
            final String _tmpThemeDrawableName;
            if (_cursor.isNull(_cursorIndexOfThemeDrawableName)) {
              _tmpThemeDrawableName = null;
            } else {
              _tmpThemeDrawableName = _cursor.getString(_cursorIndexOfThemeDrawableName);
            }
            _item.setThemeDrawableName(_tmpThemeDrawableName);
            final String _tmpKeysBgName;
            if (_cursor.isNull(_cursorIndexOfKeysBgName)) {
              _tmpKeysBgName = null;
            } else {
              _tmpKeysBgName = _cursor.getString(_cursorIndexOfKeysBgName);
            }
            _item.setKeysBgName(_tmpKeysBgName);
            final Boolean _tmpIsNeon;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfIsNeon)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfIsNeon);
            }
            _tmpIsNeon = _tmp == null ? null : _tmp != 0;
            _item.setNeon(_tmpIsNeon);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
