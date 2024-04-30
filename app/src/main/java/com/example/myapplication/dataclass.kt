package com.example.myapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "student_Table")
data class dataclass(
    @PrimaryKey(autoGenerate = true) val id: Int?,


    @ColumnInfo(name = "first_name")val firstname: String?,
    @ColumnInfo(name="last_name")val lastname: String?,
    @ColumnInfo(name="roll_no")val rollno:Int?
)
