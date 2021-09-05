package com.example.forecast.data.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.forecast.data.db.entity.Clouds;
import com.example.forecast.data.db.entity.Coord;
import com.example.forecast.data.db.entity.CurrentWeather;
import com.example.forecast.data.db.entity.Main;
import com.example.forecast.data.db.entity.Sys;
import com.example.forecast.data.db.entity.Wind;
import com.example.forecast.data.db.unitlocalized.current.MetricCurrentWeather;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrentWeatherDao_Impl implements CurrentWeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CurrentWeather> __insertionAdapterOfCurrentWeather;

  public CurrentWeatherDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCurrentWeather = new EntityInsertionAdapter<CurrentWeather>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `current_weather` (`base`,`cod`,`dt`,`name`,`timezone`,`visibility`,`id`,`clouds_all`,`coord_lat`,`coord_lon`,`main_feelsLike`,`main_humidity`,`main_pressure`,`main_temp`,`main_tempMax`,`main_tempMin`,`sys_country`,`sys_idSys`,`sys_sunrise`,`sys_sunset`,`sys_type`,`wind_deg`,`wind_speed`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrentWeather value) {
        if (value.getBase() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getBase());
        }
        stmt.bindLong(2, value.getCod());
        stmt.bindLong(3, value.getDt());
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        stmt.bindLong(5, value.getTimezone());
        stmt.bindLong(6, value.getVisibility());
        stmt.bindLong(7, value.getId());
        final Clouds _tmpClouds = value.getClouds();
        if(_tmpClouds != null) {
          stmt.bindLong(8, _tmpClouds.getAll());
        } else {
          stmt.bindNull(8);
        }
        final Coord _tmpCoord = value.getCoord();
        if(_tmpCoord != null) {
          stmt.bindDouble(9, _tmpCoord.getLat());
          stmt.bindDouble(10, _tmpCoord.getLon());
        } else {
          stmt.bindNull(9);
          stmt.bindNull(10);
        }
        final Main _tmpMain = value.getMain();
        if(_tmpMain != null) {
          stmt.bindDouble(11, _tmpMain.getFeelsLike());
          stmt.bindLong(12, _tmpMain.getHumidity());
          stmt.bindLong(13, _tmpMain.getPressure());
          stmt.bindDouble(14, _tmpMain.getTemp());
          stmt.bindDouble(15, _tmpMain.getTempMax());
          stmt.bindDouble(16, _tmpMain.getTempMin());
        } else {
          stmt.bindNull(11);
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
          stmt.bindNull(16);
        }
        final Sys _tmpSys = value.getSys();
        if(_tmpSys != null) {
          if (_tmpSys.getCountry() == null) {
            stmt.bindNull(17);
          } else {
            stmt.bindString(17, _tmpSys.getCountry());
          }
          stmt.bindLong(18, _tmpSys.getIdSys());
          stmt.bindLong(19, _tmpSys.getSunrise());
          stmt.bindLong(20, _tmpSys.getSunset());
          stmt.bindLong(21, _tmpSys.getType());
        } else {
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
          stmt.bindNull(20);
          stmt.bindNull(21);
        }
        final Wind _tmpWind = value.getWind();
        if(_tmpWind != null) {
          stmt.bindLong(22, _tmpWind.getDeg());
          stmt.bindDouble(23, _tmpWind.getSpeed());
        } else {
          stmt.bindNull(22);
          stmt.bindNull(23);
        }
      }
    };
  }

  @Override
  public void upsert(final CurrentWeather weatherEntry) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCurrentWeather.insert(weatherEntry);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<MetricCurrentWeather> getWeatherMetric() {
    final String _sql = "SELECT `base`, `cod`, `dt`, `name`, `timezone`, `visibility`, `clouds_all`, `coord_lat`, `coord_lon`, `main_feelsLike`, `main_humidity`, `main_pressure`, `main_temp`, `main_tempMax`, `main_tempMin`, `sys_country`, `sys_idSys`, `sys_sunrise`, `sys_sunset`, `sys_type`, `wind_deg`, `wind_speed` FROM (select * from current_weather where id = 0)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"current_weather"}, false, new Callable<MetricCurrentWeather>() {
      @Override
      public MetricCurrentWeather call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfBase = CursorUtil.getColumnIndexOrThrow(_cursor, "base");
          final int _cursorIndexOfCod = CursorUtil.getColumnIndexOrThrow(_cursor, "cod");
          final int _cursorIndexOfDt = CursorUtil.getColumnIndexOrThrow(_cursor, "dt");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTimezone = CursorUtil.getColumnIndexOrThrow(_cursor, "timezone");
          final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
          final int _cursorIndexOfAll = CursorUtil.getColumnIndexOrThrow(_cursor, "clouds_all");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "coord_lat");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "coord_lon");
          final int _cursorIndexOfFeelsLike = CursorUtil.getColumnIndexOrThrow(_cursor, "main_feelsLike");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "main_humidity");
          final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "main_pressure");
          final int _cursorIndexOfTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "main_temp");
          final int _cursorIndexOfTempMax = CursorUtil.getColumnIndexOrThrow(_cursor, "main_tempMax");
          final int _cursorIndexOfTempMin = CursorUtil.getColumnIndexOrThrow(_cursor, "main_tempMin");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "sys_country");
          final int _cursorIndexOfIdSys = CursorUtil.getColumnIndexOrThrow(_cursor, "sys_idSys");
          final int _cursorIndexOfSunrise = CursorUtil.getColumnIndexOrThrow(_cursor, "sys_sunrise");
          final int _cursorIndexOfSunset = CursorUtil.getColumnIndexOrThrow(_cursor, "sys_sunset");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "sys_type");
          final int _cursorIndexOfDeg = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_deg");
          final int _cursorIndexOfSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_speed");
          final MetricCurrentWeather _result;
          if(_cursor.moveToFirst()) {
            final String _tmpBase;
            if (_cursor.isNull(_cursorIndexOfBase)) {
              _tmpBase = null;
            } else {
              _tmpBase = _cursor.getString(_cursorIndexOfBase);
            }
            final int _tmpCod;
            _tmpCod = _cursor.getInt(_cursorIndexOfCod);
            final int _tmpDt;
            _tmpDt = _cursor.getInt(_cursorIndexOfDt);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpTimezone;
            _tmpTimezone = _cursor.getInt(_cursorIndexOfTimezone);
            final int _tmpVisibility;
            _tmpVisibility = _cursor.getInt(_cursorIndexOfVisibility);
            final int _tmpAll;
            _tmpAll = _cursor.getInt(_cursorIndexOfAll);
            final double _tmpLat;
            _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
            final double _tmpLon;
            _tmpLon = _cursor.getDouble(_cursorIndexOfLon);
            final double _tmpFeelsLike;
            _tmpFeelsLike = _cursor.getDouble(_cursorIndexOfFeelsLike);
            final int _tmpHumidity;
            _tmpHumidity = _cursor.getInt(_cursorIndexOfHumidity);
            final int _tmpPressure;
            _tmpPressure = _cursor.getInt(_cursorIndexOfPressure);
            final double _tmpTemp;
            _tmpTemp = _cursor.getDouble(_cursorIndexOfTemp);
            final double _tmpTempMax;
            _tmpTempMax = _cursor.getDouble(_cursorIndexOfTempMax);
            final double _tmpTempMin;
            _tmpTempMin = _cursor.getDouble(_cursorIndexOfTempMin);
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final int _tmpIdSys;
            _tmpIdSys = _cursor.getInt(_cursorIndexOfIdSys);
            final int _tmpSunrise;
            _tmpSunrise = _cursor.getInt(_cursorIndexOfSunrise);
            final int _tmpSunset;
            _tmpSunset = _cursor.getInt(_cursorIndexOfSunset);
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final int _tmpDeg;
            _tmpDeg = _cursor.getInt(_cursorIndexOfDeg);
            final double _tmpSpeed;
            _tmpSpeed = _cursor.getDouble(_cursorIndexOfSpeed);
            _result = new MetricCurrentWeather(_tmpBase,_tmpAll,_tmpCod,_tmpLat,_tmpLon,_tmpDt,_tmpFeelsLike,_tmpHumidity,_tmpTemp,_tmpPressure,_tmpTempMax,_tmpTempMin,_tmpName,_tmpCountry,_tmpIdSys,_tmpSunrise,_tmpSunset,_tmpType,_tmpTimezone,_tmpVisibility,_tmpDeg,_tmpSpeed);
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
