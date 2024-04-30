package com.example.myapplication

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DAO {
    @Query("SELECT * FROM student_table")
    fun getAll(): List<dataclass>

    /* @Query("SELECT * FROM student_table WHERE uid IN (:userIds)")
     fun loadAllByIds(userIds: IntArray): List<Student>*/

    @Query("SELECT * FROM student_table WHERE roll_no = :roll LIMIT 1")
     fun findByRoll(roll : Int): dataclass?

    @Insert(onConflict = OnConflictStrategy.IGNORE  )
     fun insert(student: dataclass)

    @Delete
     fun delete(student: dataclass)

    @Query("DELETE FROM student_table")
     fun  deleteAll()


}