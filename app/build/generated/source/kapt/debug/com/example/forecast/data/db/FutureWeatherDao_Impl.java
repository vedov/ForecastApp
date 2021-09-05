package com.example.forecast.data.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.forecast.data.db.entity.Forecast;
import com.example.forecast.data.db.entity.FutureWeatherList;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FutureWeatherDao_Impl implements FutureWeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Forecast> __insertionAdapterOfForecast;

  private final ForecastDatabase.Converters __converters = new ForecastDatabase.Converters();

  public FutureWeatherDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfForecast = new EntityInsertionAdapter<Forecast>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `future_weather` (`id`,`cod`,`message`,`cnt`,`list`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Forecast value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getCod() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCod());
        }
        if (value.getMessage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMessage());
        }
        if (value.getCnt() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCnt());
        }
        final String _tmp;
        _tmp = __converters.forecastListToJson(value.getList());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
      }
    };
  }

  @Override
  public void insert(final Forecast futureWeatherEntries) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfForecast.insert(futureWeatherEntries);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<Forecast> getWeatherMetric() {
    final String _sql = "select * from future_weather";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"future_weather"}, false, new Callable<Forecast>() {
      @Override
      public Forecast call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCod = CursorUtil.getColumnIndexOrThrow(_cursor, "cod");
          final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
          final int _cursorIndexOfCnt = CursorUtil.getColumnIndexOrThrow(_cursor, "cnt");
          final int _cursorIndexOfList = CursorUtil.getColumnIndexOrThrow(_cursor, "list");
          final Forecast _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpCod;
            if (_cursor.isNull(_cursorIndexOfCod)) {
              _tmpCod = null;
            } else {
              _tmpCod = _cursor.getString(_cursorIndexOfCod);
            }
            final String _tmpMessage;
            if (_cursor.isNull(_cursorIndexOfMessage)) {
              _tmpMessage = null;
            } else {
              _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
            }
            final String _tmpCnt;
            if (_cursor.isNull(_cursorIndexOfCnt)) {
              _tmpCnt = null;
            } else {
              _tmpCnt = _cursor.getString(_cursorIndexOfCnt);
            }
            final List<FutureWeatherList> _tmpList;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfList)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfList);
            }
            _tmpList = __converters.forecastJsonToList(_tmp);
            _result = new Forecast(_tmpId,_tmpCod,_tmpMessage,_tmpCnt,_tmpList);
          } else {
            _result = null;
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
