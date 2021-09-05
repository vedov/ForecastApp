package com.example.forecast.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ForecastDatabase_Impl extends ForecastDatabase {
  private volatile CurrentWeatherDao _currentWeatherDao;

  private volatile FutureWeatherDao _futureWeatherDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `current_weather` (`base` TEXT NOT NULL, `cod` INTEGER NOT NULL, `dt` INTEGER NOT NULL, `name` TEXT NOT NULL, `timezone` INTEGER NOT NULL, `visibility` INTEGER NOT NULL, `id` INTEGER NOT NULL, `clouds_all` INTEGER NOT NULL, `coord_lat` REAL NOT NULL, `coord_lon` REAL NOT NULL, `main_feelsLike` REAL NOT NULL, `main_humidity` INTEGER NOT NULL, `main_pressure` INTEGER NOT NULL, `main_temp` REAL NOT NULL, `main_tempMax` REAL NOT NULL, `main_tempMin` REAL NOT NULL, `sys_country` TEXT NOT NULL, `sys_idSys` INTEGER NOT NULL, `sys_sunrise` INTEGER NOT NULL, `sys_sunset` INTEGER NOT NULL, `sys_type` INTEGER NOT NULL, `wind_deg` INTEGER NOT NULL, `wind_speed` REAL NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `future_weather` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `cod` TEXT NOT NULL, `message` TEXT NOT NULL, `cnt` TEXT NOT NULL, `list` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7b68489961178c442a7b8db948effe50')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `current_weather`");
        _db.execSQL("DROP TABLE IF EXISTS `future_weather`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCurrentWeather = new HashMap<String, TableInfo.Column>(23);
        _columnsCurrentWeather.put("base", new TableInfo.Column("base", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("cod", new TableInfo.Column("cod", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("dt", new TableInfo.Column("dt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("timezone", new TableInfo.Column("timezone", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("visibility", new TableInfo.Column("visibility", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("clouds_all", new TableInfo.Column("clouds_all", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("coord_lat", new TableInfo.Column("coord_lat", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("coord_lon", new TableInfo.Column("coord_lon", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("main_feelsLike", new TableInfo.Column("main_feelsLike", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("main_humidity", new TableInfo.Column("main_humidity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("main_pressure", new TableInfo.Column("main_pressure", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("main_temp", new TableInfo.Column("main_temp", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("main_tempMax", new TableInfo.Column("main_tempMax", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("main_tempMin", new TableInfo.Column("main_tempMin", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("sys_country", new TableInfo.Column("sys_country", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("sys_idSys", new TableInfo.Column("sys_idSys", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("sys_sunrise", new TableInfo.Column("sys_sunrise", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("sys_sunset", new TableInfo.Column("sys_sunset", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("sys_type", new TableInfo.Column("sys_type", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("wind_deg", new TableInfo.Column("wind_deg", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("wind_speed", new TableInfo.Column("wind_speed", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCurrentWeather = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCurrentWeather = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCurrentWeather = new TableInfo("current_weather", _columnsCurrentWeather, _foreignKeysCurrentWeather, _indicesCurrentWeather);
        final TableInfo _existingCurrentWeather = TableInfo.read(_db, "current_weather");
        if (! _infoCurrentWeather.equals(_existingCurrentWeather)) {
          return new RoomOpenHelper.ValidationResult(false, "current_weather(com.example.forecast.data.db.entity.CurrentWeather).\n"
                  + " Expected:\n" + _infoCurrentWeather + "\n"
                  + " Found:\n" + _existingCurrentWeather);
        }
        final HashMap<String, TableInfo.Column> _columnsFutureWeather = new HashMap<String, TableInfo.Column>(5);
        _columnsFutureWeather.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFutureWeather.put("cod", new TableInfo.Column("cod", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFutureWeather.put("message", new TableInfo.Column("message", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFutureWeather.put("cnt", new TableInfo.Column("cnt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFutureWeather.put("list", new TableInfo.Column("list", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFutureWeather = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFutureWeather = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFutureWeather = new TableInfo("future_weather", _columnsFutureWeather, _foreignKeysFutureWeather, _indicesFutureWeather);
        final TableInfo _existingFutureWeather = TableInfo.read(_db, "future_weather");
        if (! _infoFutureWeather.equals(_existingFutureWeather)) {
          return new RoomOpenHelper.ValidationResult(false, "future_weather(com.example.forecast.data.db.entity.Forecast).\n"
                  + " Expected:\n" + _infoFutureWeather + "\n"
                  + " Found:\n" + _existingFutureWeather);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7b68489961178c442a7b8db948effe50", "8b4a11337f9f34986c60f4485ad6a5c5");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "current_weather","future_weather");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `current_weather`");
      _db.execSQL("DELETE FROM `future_weather`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CurrentWeatherDao.class, CurrentWeatherDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(FutureWeatherDao.class, FutureWeatherDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public CurrentWeatherDao currentWeatherDao() {
    if (_currentWeatherDao != null) {
      return _currentWeatherDao;
    } else {
      synchronized(this) {
        if(_currentWeatherDao == null) {
          _currentWeatherDao = new CurrentWeatherDao_Impl(this);
        }
        return _currentWeatherDao;
      }
    }
  }

  @Override
  public FutureWeatherDao futureWeatherDao() {
    if (_futureWeatherDao != null) {
      return _futureWeatherDao;
    } else {
      synchronized(this) {
        if(_futureWeatherDao == null) {
          _futureWeatherDao = new FutureWeatherDao_Impl(this);
        }
        return _futureWeatherDao;
      }
    }
  }
}
