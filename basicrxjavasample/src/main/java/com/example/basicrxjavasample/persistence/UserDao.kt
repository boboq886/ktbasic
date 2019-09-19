package com.example.basicrxjavasample.persistence

import androidx.room.*
import io.reactivex.Completable
import io.reactivex.Flowable

/**
 * 表操作类
 */
@Dao
interface UserDao {
    //:id 是参数的id
    @Query("SELECT * FROM USERS WHERE userid = :id")
    fun getUserById(id: String): Flowable<User>

    /**
     * 插入数据, 已存在则 replace
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(): Completable   // 不发射数据,Flowable 只处理 onComxxx 和onError 回调

    @Query("DELETE FROM USERS")
    fun delAll()
}